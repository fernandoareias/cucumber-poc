import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InserirContaSteps {

    private WebDriver driver = new ChromeDriver();

    @Dado("que estou acessando a aplicação")
    public void queEstouAcessandoAAplicação() {
        this.driver.get("https://seubarriga.wcaquino.me");
    }
    @Quando("informo o usuário {string}")
    public void informoOUsuário(String string) {
        driver.findElement(By.id("email")).sendKeys(string);
    }
    @Quando("a senha {string}")
    public void aSenha(String string) {
        driver.findElement(By.name("senha")).sendKeys(string);
    }
    @Quando("seleciono entrar")
    public void selecionoEntrar() {
        driver.findElement(By.tagName("button")).click();
    }
    @Então("visualizo a página inicial")
    public void visualizoAPáginaInicial() {
        var texto = driver.findElement(By.xpath("//div[@class='alert alert-success'")).getText();
        Assert.assertEquals("Bem vindo, wagner!", texto);
    }
    @Quando("seleciono Contas")
    public void selecionoContas() {
        driver.findElement(By.linkText("Contas")).click();
    }
    @Quando("seleciono Adicionar")
    public void selecionoAdicionar() {
        driver.findElement(By.linkText("Adicionar")).click();
    }
    @Quando("informo a conta {string}")
    public void informoAConta(String string) {
        driver.findElement(By.id("nome")).sendKeys(string);
    }
    @Quando("seleciono Salvar")
    public void selecionoSalvar() {
        driver.findElement(By.tagName("button")).click();
    }
    @Então("a conta é inserida com sucesso")
    public void aContaÉInseridaComSucesso() {
        var texto = driver.findElement(By.xpath("//div[@class='alert alert-success'")).getText();
        Assert.assertEquals("Conta adicionada com sucesso!", texto);
    }
}
