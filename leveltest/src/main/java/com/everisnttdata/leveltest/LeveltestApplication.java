package com.everisnttdata.leveltest;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everisnttdata.leveltest.models.Country;
import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;
import com.poiji.option.PoijiOptions;


@SpringBootApplication
public class LeveltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeveltestApplication.class, args);
		
		//skip y settings tienen la misma funcionalidad. Saltar filas contando una primera como cabecera.
		PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings(3)
				.addListDelimiter(";")
				.build();
		/*
		InputStream stream;
		try {
			stream = new FileInputStream(new File("C:/Users/fmateosg/Desktop/Plantilla límites.xlsx"));
			List<Country> countries = Poiji.fromExcel(stream, PoijiExcelType.XLSX, Country.class, options);
			System.out.println(countries.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		List<Country> countries = Poiji.fromExcel(new File("C:/Users/fmateosg/Desktop/Plantilla límites.xlsx"), Country.class, options);
		System.out.println(countries.size());
	}

}
