package com.everisnttdata.leveltest.models;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;
import com.poiji.annotation.ExcelSheet;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
@ExcelSheet("Plantilla límite por país")
public class Country {
	
	@ExcelRow
	private int rowIndex;
	
	//@ExcelCell(0)
	@ExcelCellName("Código país")
	private String codpa;
	
	//@ExcelCell(1)
	@ExcelCellName("Importe Límite en millones")
	private int implim;
	
	//@ExcelCell(2)
	@ExcelCellName("Tipo de moneda")
	private String tipmon;
	
	//@ExcelCell(3)
	@ExcelCellName("Código divisa")
	private String coddiv;
	
	//@ExcelCell(4)
	@ExcelCellName("Comentario")
	private String coment;
	
	//@ExcelCell(5)
	@ExcelCellName("Agrupación")
	private String agrup;
	
	//@ExcelCell(6)
	@ExcelCellName("Sociedad Agrupada")
	private String socag;
}
