import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Desafio {
	@Test
	public void Desafio(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/marco/Downloads/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Marcos");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Bandeira");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(element);
		combo.selectByIndex(4);
		WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
		Select combo2 = new Select(elemento);
		combo2.selectByVisibleText("Corrida");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Colocar mais comidas favoritas pq to com fome");
		WebElement botao = driver.findElement(By.id("elementosForm:cadastrar"));
		botao.click();
		// Assert.assertEquals("Cadastrado!", driver.findElement(By.id("resultado")).getText());
		Assert.assertEquals("Nome: Marcos", driver.findElement(By.id("descNome")).getText());
		Assert.assertEquals("Sobrenome: Bandeira", driver.findElement(By.id("descSobrenome")).getText());
		Assert.assertEquals("Sexo: Masculino", driver.findElement(By.id("descSexo")).getText());
		Assert.assertEquals("Comida: Pizza", driver.findElement(By.id("descComida")).getText());
	}
}
