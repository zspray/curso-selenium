import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert;

public class TesteCampoTreinamento {
	
	
	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/marco/Downloads/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(800, 600));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste de Escritaaaa");
		Assert.assertEquals("Teste de Escritaaaa", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		driver.close();
	}
	
	
	@Test
	public void deveInteragirComTextArea() {
		System.setProperty("webdriver.gecko.driver", "C:/Users/marco/Downloads/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(800, 600));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Teste de Escritaaaa");
		Assert.assertEquals("Teste de Escritaaaa", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		driver.close();
	}
	
}
