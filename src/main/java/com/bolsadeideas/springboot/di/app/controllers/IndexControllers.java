package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.service.IService;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;

@Controller
public class IndexControllers {
	
	@Autowired
	private IService servicio;
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto",servicio.operacion());
		return "index";
	}
}
