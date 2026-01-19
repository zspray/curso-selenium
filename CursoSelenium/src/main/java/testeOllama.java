import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testeOllama {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        // Caminho do GeckoDriver
        System.setProperty("webdriver.gecko.driver",
                "C:/Users/marco/Downloads/drivers/geckodriver.exe");

        driver = new FirefoxDriver();
        // Espera explícita (até 10 s)
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void buscaMapaPrimeiraGuerraMundial() {
        // 1. Vai para o site
        driver.get("https://maps4study.com.br");

        // 2. Localiza o campo de busca (ajuste se necessário)
        WebElement campoBusca = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.name("q"))
        );

        // 3. Digita a frase e envia
        campoBusca.sendKeys("mapa da primeira guerra mundial");
        campoBusca.sendKeys(Keys.RETURN);

        // 4. Espera que a lista de resultados esteja visível
        //    (ajuste o seletor de acordo com a estrutura real da página)
        By resultadoPrimeiro = By.cssSelector(".search-result a");
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultadoPrimeiro));

        // 5. Clica no primeiro resultado
        WebElement primeiroResultado = driver.findElement(resultadoPrimeiro);
        primeiroResultado.click();

        // (Opcional) Você pode adicionar asserts aqui para validar algo na página de destino
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
