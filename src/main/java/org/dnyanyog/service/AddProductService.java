package org.dnyanyog.service;

import java.sql.SQLException;

import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponse;

public class AddProductService {
	public AddProductResponse addProduct(AddProductRequest addproductbody) throws SQLException {

		AddProductResponse response = new AddProductResponse();
		if (addproductbody.addProductIntoDb()) {
			response.errorCode = "0000";
			response.msg = "success";
			return response;
		} else {
			response.errorCode = "0001";
			response.msg = "failed !!!!";
			return response;
		}

	}
	

}
