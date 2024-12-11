import com.fernando.entities.Filme;
import com.fernando.entities.NotaAluguel;
import com.fernando.services.AluguelService;
import com.fernando.services.AluguelServiceImpl;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;


import java.util.Calendar;
import java.util.Date;

public class AlugarFilme {
    private Filme filme;
    private AluguelService aluguelService = new AluguelServiceImpl();
    private NotaAluguel notaAluguel;

    @Dado("um filme com estoque de {int} unidades")
    public void um_filme_com_estoque_de_unidades(Integer int1) {
        filme = new Filme();
        filme.setEstoque(int1);
    }

    @Dado("que o preço do aluguel seja R$ {int}")
    public void que_o_preço_do_aluguel_seja_r$(Integer int1) {
        this.filme.setAluguel(int1);
    }

    @Quando("alugar")
    public void alugar() {
       notaAluguel = aluguelService.alugar(filme);
    }

    @Então("o preço do aluguel será R$ {int}")
    public void o_preço_do_aluguel_será_r$(int int1) {
        Assert.assertEquals(int1, notaAluguel.getPreco());
    }

    @Então("a data de entrega será no dia seguinte")
    public void a_data_de_entrega_será_no_dia_seguinte() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);

        Date dataRetorno = notaAluguel.getDataEntrega();
        Calendar dataRetornoCalendar = Calendar.getInstance();
        dataRetornoCalendar.setTime(dataRetorno);

        Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), dataRetornoCalendar.get(Calendar.DAY_OF_MONTH));
        Assert.assertEquals(cal.get(Calendar.MONTH), dataRetornoCalendar.get(Calendar.MONTH));
        Assert.assertEquals(cal.get(Calendar.YEAR), dataRetornoCalendar.get(Calendar.YEAR));
    }

    @Então("o estoque do filme será {int} unidade")
    public void o_estoque_do_filme_será_unidade(Integer int1) {

        Assert.assertEquals(filme.getEstoque(), int1);
    }

    @Então("não será possível por falta de estoque")
    public void não_será_possível_por_falta_de_estoque() {

    }



    @Dado("que o tipo de aluguel seja estendido")
    public void que_o_tipo_de_aluguel_seja_estendido() {

    }
    @Então("a data de entrega será em {int} dias")
    public void a_data_de_entrega_será_em_dias(Integer int1) {

    }

    @Então("a pontuação será de {int} pontos")
    public void a_pontuação_será_de_pontos(Integer int1) {

    }


    @Dado("que o tipo de aluguel seja extendido")
    public void que_o_tipo_de_aluguel_seja_extendido() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Dado("que o tipo de aluguel seja comum")
    public void que_o_tipo_de_aluguel_seja_comum() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Dado("que o tipo de aluguel seja semanal")
    public void que_o_tipo_de_aluguel_seja_semanal() {
    }

}
