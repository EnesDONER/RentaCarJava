package com.example.rentACar.business.abstracts;

import java.util.List;

import com.example.rentACar.entities.concretes.Brand;

public interface IBrandService {

	public List<Brand> getAll();
}
