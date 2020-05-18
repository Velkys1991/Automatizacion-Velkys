package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.ColorlibFormValidationSteps;
import com.choucair.formacion.steps.PopupValidationSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class PopupValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;
	@Steps
	ColorlibFormValidationSteps colorlibFormvalidationSteps;
	
	@Given("^Auntentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void auntentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave)  {
		popupValidationSteps.login_colorlib(Usuario, Clave);
	    
	}

	@Given("^Ingreso a funcionalidad Forms Validation$")
	public void ingreso_a_funcionalidad_Forms_Validation() {
		popupValidationSteps.ingresar_form_validation();
	    
	} 

	@When("^Diligencio Formulario Popup Validation$")
	public void diligencio_Formulario_Popup_Validation(DataTable dtDatosForm) throws Throwable {
		List<List<String>> data = dtDatosForm.raw();
		for(int i=1; i<data.size();i++) {
		  ColorlibFormValidationSteps.diligenciar_popup_datos_tabla(data,i);
		  try {
			  Thread.sleep(5000);
		  
		  }catch(InterruptedException e) {}
		}
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso()  {
		ColorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	    
	}
	
	@Then("^Verifico que se presente Globo informativo de validación\\.$")
	public void verifico_que_se_presente_Globo_informativo_de_validación() {
		ColorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
		
	}



}
