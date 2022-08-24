package com.samples.S07SpringORM.DAO;

import com.samples.S07SpringORM.entity.Product;

public interface ProductDAO {

	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
}