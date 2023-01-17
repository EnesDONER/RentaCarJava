package com.example.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rentACar.business.abstracts.IBrandService;
import com.example.rentACar.dataAccess.abstracts.IBrandRepoository;
import com.example.rentACar.entities.concretes.Brand;
@Service
public class BrandManager implements IBrandService {
	
	private IBrandRepoository _brandRepository;
	@Autowired
	public BrandManager(IBrandRepoository brandRepository ) {
		_brandRepository = brandRepository;
	
	}

	@Override
	public List<Brand> getAll() {
		
		return _brandRepository.getAll();
	}

}
