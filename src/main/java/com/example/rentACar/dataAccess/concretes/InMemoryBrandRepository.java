package com.example.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.rentACar.dataAccess.abstracts.IBrandRepoository;
import com.example.rentACar.entities.concretes.Brand;
@Repository
public class InMemoryBrandRepository implements IBrandRepoository{

	List<Brand> brands;
	public InMemoryBrandRepository() {
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"FIAT"));
		brands.add(new Brand(3,"AUDI"));
	}
	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

	
}
