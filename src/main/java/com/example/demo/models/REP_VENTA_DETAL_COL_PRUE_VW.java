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
	
	@Column(name = "CON_SEGMENTACION")
	private String conSegmentacion;
	
	@Column(name = "CON_PLATAFORMA")
	private String conPlataforma;
	
	@Column(name = "CON_NOM_EMPRESA")
	private String conNomEmpresa;
	
	@Column(name = "CON_NOM_ALMACEN")
	private String conNomAlmacen;
	
	@Column
	private String CON_NOM_CIUDAD_ALMACEN;
	
	@Column(name = "CON_NOM_ESTADO_COMPLO_FACT")
	private String conNomEstadoComploFact;
	
	@Column(name = "VEN_COD_EST_COMPLETO")
	private String venCodEstCompleto;
	
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

	public String getConSegmentacion() {
		return conSegmentacion;
	}
	
	public void setConSegmentacion(String conSegmentacion) {
		this.conSegmentacion = conSegmentacion;
	}
	
	
	public String getConPlataforma() {
		return conPlataforma;
	}
	
	public void setConPlataforma(String conPlataforma) {
		this.conPlataforma = conPlataforma;
	}

	public void setConNomEmpresa(String conNomEmpresa) {
		this.conNomEmpresa = conNomEmpresa;
	}
	
	public String getConNomEmpresa() {
		return conNomEmpresa;
	}

	public String getConNomAlmacen() {
		return conNomAlmacen;
	}
	
	public void setConNomAlmacen(String conNomAlmacen) {
		this.conNomAlmacen = conNomAlmacen;
	}

	public String getCON_NOM_CIUDAD_ALMACEN() {
		return CON_NOM_CIUDAD_ALMACEN;
	}

	public void setCON_NOM_CIUDAD_ALMACEN(String cON_NOM_CIUDAD_ALMACEN) {
		CON_NOM_CIUDAD_ALMACEN = cON_NOM_CIUDAD_ALMACEN;
	}

	public String getConNomEstadoComploFact() {
		return conNomEstadoComploFact;
	}

	public void setConNomEstadoComploFact(String conNomEstadoComploFact) {
		this.conNomEstadoComploFact = conNomEstadoComploFact;
	}

	public String getVenCodEstCompleto() {
		return venCodEstCompleto;
	}

	public void setVenCodEstCompleto(String venCodEstCompleto) {
		this.venCodEstCompleto = venCodEstCompleto;
	}

	
	
	
}
