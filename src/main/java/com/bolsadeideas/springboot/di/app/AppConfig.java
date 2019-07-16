package com.bolsadeideas.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.service.IService;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplex;

@Configuration
public class AppConfig {
	
	@Primary
	@Bean("MiServicioSimple")
	public IService registraServicio() {
		return new MiServicio();
	}
	
	@Bean("MiServicioComplex")
	public IService registraServicioComplejo() {
		return new MiServicioComplex();
	}
}
