package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("MiServicioSimple")
public class MiServicio implements IService{
	
	@Override
	public String operacion() {
		return "MAMENLO... simplemente";
	}
}
