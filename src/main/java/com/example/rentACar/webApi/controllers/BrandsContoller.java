package com.example.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentACar.business.abstracts.IBrandService;
import com.example.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsContoller  {
	private IBrandService brandService;
	@Autowired
	public BrandsContoller(IBrandService brandService){
		this.brandService =brandService;
	}
	
	@GetMapping("/getall")
	public List<Brand> getAll(){		
		return brandService.getAll();	}
}
