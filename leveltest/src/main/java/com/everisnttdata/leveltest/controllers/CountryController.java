package com.everisnttdata.leveltest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everisnttdata.leveltest.models.Country;

@RestController
public class CountryController {

	@GetMapping("/countries")
	public String countries() {
		return "countries";
	}
	
	@PostMapping("/submit-excel")
	public String submitex() {
		return "subex";
	}
}
