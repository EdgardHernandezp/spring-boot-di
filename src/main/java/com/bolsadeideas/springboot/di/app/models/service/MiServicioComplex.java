package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

//@Component("MiServicioComplex")
public class MiServicioComplex implements IService{
	
	@Override
	public String operacion() {
		return "MAMENLO... complejamente";
	}
}
