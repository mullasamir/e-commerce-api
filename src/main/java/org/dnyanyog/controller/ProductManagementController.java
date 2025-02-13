package org.dnyanyog.controller;

import java.sql.SQLException;
import java.util.List;

import org.dnyanyog.entity.Product;
import org.dnyanyog.service.ProductManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductManagementController {

	@Autowired
	ProductManagementService productManagementService;

	@GetMapping(path = "/api/product/getAllProducts")
	public List<Product> getAllProduct() throws SQLException {
		return productManagementService.getAllProduct();
	}

	@GetMapping(path = "/api/product/getProductById/{product_id}")
	public Product getProductById(@PathVariable Integer product_id) {
		return productManagementService.getProductById(product_id);
	}

}
