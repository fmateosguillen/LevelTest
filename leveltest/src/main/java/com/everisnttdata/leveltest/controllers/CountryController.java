package com.everisnttdata.leveltest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everisnttdata.leveltest.models.Country;

@RestController
@RequestMapping("/")
public class CountryController {
	
	//menú principal
	@GetMapping("/index")
	public String goToIndex() {
		return "index";
	}
	
	//carga el listado de paises
	@GetMapping("/get-countries")
	public String getCountries() {
		return "countries";
	}
	
	//se redirige la página donde se carga el excel
	@GetMapping("/load-excel")
	public String LoadExcel() {
		return "submit-excel";
	}
	
	//se carga el excel y se redirige al menú principal
	@PostMapping("/submit-excel")
	public String SubmitExcel() {
		return "redirect:/index";
	}
}
