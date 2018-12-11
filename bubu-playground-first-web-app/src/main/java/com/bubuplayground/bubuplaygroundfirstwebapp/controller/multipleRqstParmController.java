package com.bubuplayground.bubuplaygroundfirstwebapp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class multipleRqstParmController {
	
	@RequestMapping("/multipleparam")
	public String obtainParamList(@RequestParam Map<String,String> requestParams,
			ModelMap model) {
		for(String key: requestParams.keySet()) {
			model.put(key, requestParams.get(key));
		}
		return "multipleParam";
	}
	
}
