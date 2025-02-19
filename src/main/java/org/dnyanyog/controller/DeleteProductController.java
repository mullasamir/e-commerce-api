package org.dnyanyog.controller;

import org.dnyanyog.service.DeleteProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteProductController {
	
	
	@Autowired
	DeleteProductService deleteProductService;
	
	@DeleteMapping(path = "/api/product/deleteProductById/{product_id}")
	public void delteByProductId(@PathVariable Integer product_id) {
		deleteProductService.deleteProductById(product_id);
	}

}
