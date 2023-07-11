package com.service;

import com.model.Codder;

public interface CodderService {

	Codder addCodder(Codder c);
	Codder getCodderById(int id);
	Codder updateCodderById(Codder c);
	String deleteCodder(int id);
	//List getAllCodder(Codder)
}
