package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Load;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {
	
	@Autowired
	private LoadService loadService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application";
	}
	
	
	@GetMapping("/load")
	public List<Load> getLoad(){
		return this.loadService.getLoad();
	}
	
	@GetMapping("/load/{shippperId}")
	public Load getLoadById(@PathVariable String shipperId) {
		return this.loadService.getLoadById(Long.parseLong(shipperId));
	}
	
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load) {
		return this.loadService.addLoad(load);
	}
	
	@PutMapping("/load/{shipperId}")
	public Load updateLoad(@RequestBody Load load) {
		return this.loadService.updateLoad(load);
	}
	
	@DeleteMapping("/load/{shipperId}")
	public Load deleteLoad(@PathVariable String shipperId) {
		return this.loadService.deleteLoadById(Long.parseLong(shipperId));
	}
	
	
}
