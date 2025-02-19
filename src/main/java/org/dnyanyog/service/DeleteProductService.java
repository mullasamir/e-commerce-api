package org.dnyanyog.service;

import org.dnyanyog.dao.ProductDao;
import org.dnyanyog.dto.DeleteProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteProductService {

	@Autowired
	ProductDao productDao;

	@Autowired
	DeleteProductResponse deleteProductResponse;

	public DeleteProductResponse deleteProductById(Integer product_id) {

		productDao.deleteById(product_id);
		deleteProductResponse.setResponseCode("000");
		deleteProductResponse.setResponseMsg("Product Deleted Successfullyy..");

		return deleteProductResponse;

	}

}
