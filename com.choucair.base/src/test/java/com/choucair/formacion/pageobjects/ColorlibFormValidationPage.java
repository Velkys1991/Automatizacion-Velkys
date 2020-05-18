package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ColorlibFormValidationPage extends PageObject{
	
	        // Campo Required
				@FindBy(xpath= "//*[@id='req']")   
				public WebElementFacade txtRequired;

			// Campo Seleccion de deporte 1
			   @FindBy(xpath="//*[@id='sport']")
				public WebElementFacade txtCmbSport1;
			   
			// Campo Seleccion Multiple de deporte 2
			   @FindBy(xpath="//*[@id='sport2']")  
				public WebElementFacade txtCmbSport2;
			   
			// Campo Url
				@FindBy(xpath="//*[@id='url1']")
				public WebElementFacade txtUrl;
				
			// Campo Email
				@FindBy(xpath= "//*[@id='email1']")
				public WebElementFacade txtEmail;
				
			// Campo Password 1
				@FindBy(xpath= "//*[@id='pass1']")
				public WebElementFacade txtPass1;
				
			// Campo Password 2
				@FindBy(xpath= "//*[@id='pass2']")
				public WebElementFacade txtPass2;
				
			// Campo Minsize
				@FindBy(xpath= "//*[@id='minsize1']")
				public WebElementFacade txtMinsize;
				
			// Campo Maxsize
				@FindBy(xpath= "//*[@id='maxsize1']")
				public WebElementFacade txtMaxsize;
				
			// Campo Number
				@FindBy(xpath= "//*[@id='number2']")
				public WebElementFacade txtNumber;
				
			// Campo IP
				@FindBy(xpath= "//*[@id='ip']")
				public WebElementFacade txtIp;
				
			// Campo Date
				@FindBy(xpath= "//*[@id='date3']")
				public WebElementFacade txtDate;
				
			// Campo Date Earlier
				@FindBy(xpath= "//*[@id='past']")
				public WebElementFacade txtDateEarlier;
				
			// Boton Validate
				@FindBy(xpath= "//*[@id='popup-validation']/div[14]/input")
				public WebElementFacade BtnValidate;
				
		    // Globo Informativo
				@FindBy(xpath= "(//DIV[@class='formErrorContent'])[1]")
				public WebElementFacade GloboInformativo;
				
				
		public void Required(String datoPrueba) {
			txtRequired.click();
			txtRequired.clear();
			txtRequired.sendKeys(datoPrueba);
		}
		
		public void Select_Sport(String datoPrueba) {
			txtCmbSport1.click();
			txtCmbSport1.selectByVisibleText(datoPrueba);
			
		}
		
		public void Multiple_Select(String datoPrueba) {
			txtCmbSport2.selectByVisibleText(datoPrueba);
			
		}
		
		public void Url(String datoPrueba) {
			txtUrl.click();
			txtUrl.clear();
			txtUrl.sendKeys(datoPrueba);
		}
		
		public void Email(String datoPrueba) {
			txtEmail.click();
			txtEmail.clear();
			txtEmail.sendKeys(datoPrueba);
		}
		
		public void Password1(String datoPrueba) {
			txtPass1.click();
			txtPass1.clear();
			txtPass1.sendKeys(datoPrueba);
		}
		
		public void Password2(String datoPrueba) {
			txtPass2.click();
			txtPass2.clear();
			txtPass2.sendKeys(datoPrueba);
		}
		
		public void Minsize(String datoPrueba) {
			txtMinsize.click();
			txtMinsize.clear();
			txtMinsize.sendKeys(datoPrueba);
		}
		
		public void Maxsize(String datoPrueba) {
			txtMaxsize.click();
			txtMaxsize.clear();
			txtMaxsize.sendKeys(datoPrueba);
		}
		
		public void Number(String datoPrueba) {
			txtNumber.click();
			txtNumber.clear();
			txtNumber.sendKeys(datoPrueba);
		}
		
		public void Ip(String datoPrueba) {
			txtIp.click();
			txtIp.clear();
			txtIp.sendKeys(datoPrueba);
		}
		
		public void Date(String datoPrueba) {
			txtDate.click();
			txtDate.clear();
			txtDate.sendKeys(datoPrueba);
		}
		
		public void Date_Earlier(String datoPrueba) {
			txtDateEarlier.click();
			txtDateEarlier.clear();
			txtDateEarlier.sendKeys(datoPrueba);
		}
		
		public void Boton_Validate() {
			BtnValidate.click();
			
		}
		
		
			
		public void form_sin_errores() {
			assertThat(GloboInformativo.isCurrentlyVisible(), is(false));
		}
		
		public void form_con_errores() {
		assertThat(GloboInformativo.isCurrentlyVisible(), is(true));
			
		}
				

}
