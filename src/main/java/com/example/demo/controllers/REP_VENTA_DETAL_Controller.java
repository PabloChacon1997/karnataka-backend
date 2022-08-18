package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.REP_VENTA_DETAL_COL_PRUE_VW;
import com.example.demo.repository.REP_VENTA_DETAL_Repo;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class REP_VENTA_DETAL_Controller {
	
	
	@Autowired
	private REP_VENTA_DETAL_Repo rep_VENTA_DETAL_Repo;
	
	@GetMapping("/reports")
	public ResponseEntity<List<REP_VENTA_DETAL_COL_PRUE_VW>> findAll() {
		try {
			List<REP_VENTA_DETAL_COL_PRUE_VW> reports = new ArrayList<>();
			rep_VENTA_DETAL_Repo.findAll().forEach(reports::add);
			return new ResponseEntity<>(reports, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/reports/plataforma/{plataforma}")
	public ResponseEntity<List<REP_VENTA_DETAL_COL_PRUE_VW>> findByPlataforma(@PathVariable String plataforma) {
		try {
			List<REP_VENTA_DETAL_COL_PRUE_VW> reports = new ArrayList<>();
			rep_VENTA_DETAL_Repo.findByConPlataforma(plataforma).forEach(reports::add);
			return new ResponseEntity<>(reports, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/reports/origen/{origen}")
	public ResponseEntity<List<REP_VENTA_DETAL_COL_PRUE_VW>> findByOrigen(@PathVariable String origen) {
		try {
			List<REP_VENTA_DETAL_COL_PRUE_VW> reports = new ArrayList<>();
			rep_VENTA_DETAL_Repo.findByConSegmentacion(origen).forEach(reports::add);
			return new ResponseEntity<>(reports, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/reports/empresa/{nombre}")
	public ResponseEntity<List<REP_VENTA_DETAL_COL_PRUE_VW>> findByEmpresa(@PathVariable String nombre) {
		try {
			List<REP_VENTA_DETAL_COL_PRUE_VW> reports = new ArrayList<>();
			rep_VENTA_DETAL_Repo.findByConNomEmpresa(nombre).forEach(reports::add);
			return new ResponseEntity<>(reports, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
