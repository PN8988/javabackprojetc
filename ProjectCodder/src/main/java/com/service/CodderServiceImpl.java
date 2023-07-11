package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CodderRepository;
import com.model.Codder;

@Service

public class CodderServiceImpl implements CodderService{
	@Autowired
	CodderRepository codderRepo;

	@Override
	public Codder addCodder(Codder c) {
	
		return codderRepo.save(c);
	}

	@Override
	public Codder getCodderById(int id) {
		
		return codderRepo.findById(id).get();
	}

	@Override
	public Codder updateCodderById(Codder c) {
		Codder c1=codderRepo.findById(c.getId()).orElse(null);
		c1.setName(c.getName());
		
		return codderRepo.save(c1)  ;
	}

	@Override
	public String deleteCodder(int id) {
		 codderRepo.deleteById(id);
		return "data deleted";
	}

	
	


	
	

	

	

}
