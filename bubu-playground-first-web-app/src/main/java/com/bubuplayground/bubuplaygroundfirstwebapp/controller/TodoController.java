package com.bubuplayground.bubuplaygroundfirstwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bubuplayground.bubuplaygroundfirstwebapp.Service.TodoService;

@Controller
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String showListTodo(ModelMap model) {
		model.put("todos", service.retriveTodos("gigi"));
		return "list-todos";
	}
}
