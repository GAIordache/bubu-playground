package com.bubuplayground.bubuplaygroundfirstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BubulinaInfoController {
	
	@RequestMapping(value="/bubuinfo", method = RequestMethod.GET)
	public String obtainBubInfo(ModelMap model) {
		return "bubuInfoForm";
	}
	
	@RequestMapping(value="/bubuinfo", method = RequestMethod.POST)
	public String showBubInfo(ModelMap model,
			@RequestParam String name, 
			@RequestParam String food) {
		
		
		model.put("name", name);
		model.put("food", food);
		return "bubuInfo";
	}
	
	
}
