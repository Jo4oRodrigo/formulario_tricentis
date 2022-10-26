package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodoPage;
import metodos.Utils;

public class FormularioStepAutomobile {

	MetodoPage metodo = new MetodoPage();
	Elementos elemento = new Elementos();

	@Given("que eu esteja no site automobile")
	public void que_eu_esteja_no_site() throws IOException {
		metodo.abrirNavegador("http://sampleapp.tricentis.com/101/app.php");
		metodo.print("que eu esteja no site automobile");
	}

	@Given("preencho enter vehicle data automobile")
	public void preencho_enter_vehicle_data() throws IOException {
		metodo.clicar(elemento.AutomobileInsurance);
		metodo.print("enter vehicle data automobile");
		metodo.clicar(elemento.Audi);
		metodo.escrever(elemento.EnginePerformance, "500");
		metodo.escrever(elemento.DateOfManufacture, "07/18/2022");
		metodo.clicar(elemento.NumberOfSeatsFour);
		metodo.clicar(elemento.FuelType);
		metodo.escrever(elemento.ListPrice, "25000");
		metodo.escrever(elemento.LicensePlateNumber, "1A2B3398GH");
		metodo.escrever(elemento.AnnualMileage, "100000");
		metodo.clicar(elemento.NextInsurantData);
		metodo.print("preencho enter vehicle data automobile");

	}

	@Given("preencho enter insurant data automobile")
	public void preencho_enter_insurant_data() throws IOException {
		metodo.validarTitle("Enter Insurant Data");
		metodo.escrever(elemento.FirstName, "Joao");
		metodo.escrever(elemento.LastName, "Santana");
		metodo.escrever(elemento.DateOfBirth, "12/06/1981");
		metodo.clicar(elemento.Gender);
		metodo.escrever(elemento.StreetAddress, "738, Quinze de Novembro Street");
		metodo.clicar(elemento.Country);
		metodo.escrever(elemento.ZipCode, "08840110");
		metodo.escrever(elemento.City, "Mogi das Cruzes");
		metodo.clicar(elemento.Occupation);
		metodo.clicar(elemento.Hobbies);
		metodo.escrever(elemento.WebSite, "joaosantana.com");
		metodo.clicar(elemento.NextEnterProductData);
		metodo.print("preencho enter insurant data automobile");
		
	}

	@Given("preencho enter product data automobile")
	public void preencho_enter_product_data() {
		metodo.validarTitle("Enter Product Data");
		metodo.escrever(elemento.StarDate, Utils.dataFutura(2, 1, 0));
		metodo.clicar(elemento.InsuranceSum);
		metodo.clicar(elemento.MeritRating);
		metodo.clicar(elemento.DamageInsurance);
		metodo.clicar(elemento.OptionalProducts);
		metodo.clicar(elemento.CourtesyCar);
		metodo.clicar(elemento.NextSelectPriceOption);

	}

	@Given("preencho select price option automobile")
	public void preencho_select_price_option() throws InterruptedException {
		metodo.validarTitle("Select Price Option");
		metodo.clicar(elemento.SelectPriceOption);
		Thread.sleep(2000);
		metodo.clicar(elemento.NextSendQuote);

	}

	@When("preencho send quote automobile")
	public void preencho_send_quote() {
		metodo.validarTitle("Send Quote");
		metodo.escrever(elemento.Email, "joao@gmail.com");
		metodo.escrever(elemento.Phone, "01198743216");
		metodo.escrever(elemento.Username, "joao.santana");
		metodo.escrever(elemento.Password, "Aa123456");
		metodo.escrever(elemento.ConfirmPassword, "Aa123456");
		metodo.escrever(elemento.Comments, "Test");
		metodo.clicar(elemento.Sendemail);

	}

	@Then("valido a mensagem de sucesso automobile")
	public void valido_a_mensagem_de_sucesso() throws InterruptedException {
		Thread.sleep(10000);
		metodo.validarMensagem(elemento.Sendemailsuccess, "Sending e-mail success!");
		metodo.fecharNavegador();
	}

}
