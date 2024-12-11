import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AprendendoCucumberTests {


    @Dado("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
    }

    @Quando("executa-lo")
    public void executa_lo() {
    }

    @Então("a especificacao deve finalizar com sucesso")
    public void a_especificacao_deve_finalizar_com_sucesso() {
    }


    private int contador = 0;

    @Dado("que o valor do contador é {int}")
    public void que_o_valor_do_contador_é(Integer int1) {
        contador = int1;

    }
    @Quando("eu incrementar em {int}")
    public void eu_incrementar_em(Integer int1) {
        contador += int1;
    }
    @Então("o valor do contador será {int}")
    public void o_valor_do_contador_será(int int1) {
        Assert.assertEquals(int1, contador);
    }


    private LocalDateTime date;
    private int days = 0;
    @Dado("que a entrega e no dia {int}\\/{int}\\/{int}")
    public void que_a_entrega_e_no_dia(Integer int1, Integer int2, Integer int3) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateString = String.format("%02d/%02d/%04d", int1, int2, int3);
        date = LocalDateTime.parse(dateString + "T00:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy'T'HH:mm:ss"));

    }
    @Quando("a entrega atrasar em {int} dias")
    public void a_entrega_atrasar_em_dias(Integer int1) {
        days = int1;
    }
    @Então("a entrega será efetuada em {int}\\/{int}\\/{int}")
    public void a_entrega_será_efetuada_em(Integer int1, Integer int2, Integer int3) {
        date.plusDays(days);
    }


    @Dado("que o ticket é AB167")
    public void que_o_ticket_é_ab167() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Dado("que o ticket especial é AB167")
    public void que_o_ticket_especial_é_ab167() {
        // Write code here that turns the phrase above into concrete actions
    }


    @Dado("que o ticket é AF345")
    public void que_o_ticket_é_af345() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Dado("que o valor da passagem é R$ {double}")
    public void que_o_valor_da_passagem_é_r$(Double double1) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Dado("que o nome do passageiro é {string}")
    public void que_o_nome_do_passageiro_é(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Dado("que o telefone do passageiro é {int}-{int}")
    public void que_o_telefone_do_passageiro_é(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Quando("criar os steps")
    public void criar_os_steps() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {
        // Write code here that turns the phrase above into concrete actions
    }


}
