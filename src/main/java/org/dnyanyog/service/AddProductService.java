package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dao.ProductDao;
import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponse;
import org.dnyanyog.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddProductService {
	@Autowired
	ProductDao productDao;

	public AddProductResponse addProduct(AddProductRequest addproductbody) throws SQLException {

		Product product = new Product();

		product.setProductName(addproductbody.getPname());
		product.setPrice(addproductbody.getPprc());
		product.setQuantity(addproductbody.getPqty());

		Product productInsertInDb = productDao.save(product);

		AddProductResponse response = new AddProductResponse();

		response.setErrorCode("000");
		response.setMessage("Product Inserted Successfully...");
		response.setPid(productInsertInDb.getProduct_id());
		response.setRequest(addproductbody);

		return response;

//		AddProductResponse response = new AddProductResponse();
//		if (addproductbody.addProductIntoDb()) {
//			response.errorCode = "0000";
//			response.msg = "success";
//			return response;
//		} else {
//			response.errorCode = "0001";
//			response.msg = "failed !!!!";
//			return response;
//		}

	}

}
