package com.choucair.formacion.steps;
import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormValidationPage;

import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {
	
	static ColorlibFormValidationPage colorlibFormValidationPage;
	
	@Step
	
	public static void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
		
		colorlibFormValidationPage.Required(data.get(id).get(0).trim());
		colorlibFormValidationPage.Select_Sport(data.get(id).get(1).trim());
		colorlibFormValidationPage.Multiple_Select(data.get(id).get(2).trim());
		colorlibFormValidationPage.Multiple_Select(data.get(id).get(3).trim());
		colorlibFormValidationPage.Url(data.get(id).get(4).trim());
		colorlibFormValidationPage.Email(data.get(id).get(5).trim());
		colorlibFormValidationPage.Password1(data.get(id).get(6).trim());
		colorlibFormValidationPage.Password2(data.get(id).get(7).trim());
		colorlibFormValidationPage.Minsize(data.get(id).get(8).trim());
		colorlibFormValidationPage.Maxsize(data.get(id).get(9).trim());
		colorlibFormValidationPage.Number(data.get(id).get(10).trim());
		colorlibFormValidationPage.Ip(data.get(id).get(11).trim());
		colorlibFormValidationPage.Date(data.get(id).get(12).trim());
		colorlibFormValidationPage.Date_Earlier(data.get(id).get(13).trim());
		colorlibFormValidationPage.Boton_Validate();
		
	}
	
	@Step
	
	public static void verificar_ingreso_datos_formulario_exitoso() {
		colorlibFormValidationPage.form_sin_errores();
	}
	

	
	@Step
	
	public static void verificar_ingreso_datos_formulario_con_errores() {
		colorlibFormValidationPage.form_con_errores();
	}

	
}
