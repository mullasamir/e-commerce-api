package org.dnyanyog.service;

import java.sql.SQLException;
import java.util.List;

import org.dnyanyog.dao.ProductDao;
import org.dnyanyog.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductManagementService {

	@Autowired
	ProductDao product;

	public List<Product>getAllProduct() throws SQLException {
		return product.findAll();
	}

	public Product getProductById(Integer product_id) {
		return product.findById(product_id).get();
	}

}
