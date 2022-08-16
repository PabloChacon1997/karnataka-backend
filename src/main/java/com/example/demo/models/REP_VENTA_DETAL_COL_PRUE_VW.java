package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class REP_VENTA_DETAL_COL_PRUE_VW {
	
	@Id
	private Long CON_PRC_CODIGO;
	
	@Column
	private Long VEN_CANTIDAD_SUGERIDA;
	
	@Column
	private String CON_LEAD_ORIGEN;
	
	@Column
	private String CON_PLATAFORMA;
	
	@Column
	private String CON_NOM_EMPRESA;
	
	@Column
	private String CON_NOM_ALMACEN;
	
	
	public REP_VENTA_DETAL_COL_PRUE_VW() {}

	public Long getCON_PRC_CODIGO() {
		return CON_PRC_CODIGO;
	}

	public void setCON_PRC_CODIGO(Long cON_PRC_CODIGO) {
		CON_PRC_CODIGO = cON_PRC_CODIGO;
	}

	public Long getVEN_CANTIDAD_SUGERIDA() {
		return VEN_CANTIDAD_SUGERIDA;
	}

	public void setVEN_CANTIDAD_SUGERIDA(Long vEN_CANTIDAD_SUGERIDA) {
		VEN_CANTIDAD_SUGERIDA = vEN_CANTIDAD_SUGERIDA;
	}

	public String getCON_LEAD_ORIGEN() {
		return CON_LEAD_ORIGEN;
	}

	public void setCON_LEAD_ORIGEN(String cON_LEAD_ORIGEN) {
		CON_LEAD_ORIGEN = cON_LEAD_ORIGEN;
	}

	public String getCON_PLATAFORMA() {
		return CON_PLATAFORMA;
	}

	public void setCON_PLATAFORMA(String cON_PLATAFORMA) {
		CON_PLATAFORMA = cON_PLATAFORMA;
	}

	public String getCON_NOM_EMPRESA() {
		return CON_NOM_EMPRESA;
	}

	public void setCON_NOM_EMPRESA(String cON_NOM_EMPRESA) {
		CON_NOM_EMPRESA = cON_NOM_EMPRESA;
	}

	public String getCON_NOM_ALMACEN() {
		return CON_NOM_ALMACEN;
	}

	public void setCON_NOM_ALMACEN(String cON_NOM_ALMACEN) {
		CON_NOM_ALMACEN = cON_NOM_ALMACEN;
	}

	
	
	
}
