package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.REP_VENTA_DETAL_COL_PRUE_VW;



public interface REP_VENTA_DETAL_Repo extends JpaRepository<REP_VENTA_DETAL_COL_PRUE_VW, Long>{
	
	List<REP_VENTA_DETAL_COL_PRUE_VW> findByConPlataforma(String cON_PLATAFORMA);
	
	List<REP_VENTA_DETAL_COL_PRUE_VW> findByConSegmentacion(String cON_SEGEMENTACION);
	
	List<REP_VENTA_DETAL_COL_PRUE_VW> findByConNomEmpresa(String cON_NOM_EMPRESA);
	
}
