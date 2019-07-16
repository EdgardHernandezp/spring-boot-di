package com.bolsadeideas.springboot.di.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
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
	
	@Bean
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("dildo", 5000);
		Producto producto2 = new Producto("pistola", 100000);
		
		List<ItemFactura> itemsFactura = new ArrayList<>();
		itemsFactura.add(new ItemFactura(producto1, 2));
		itemsFactura.add(new ItemFactura(producto2, 1));
		
		return itemsFactura;
	}
}
