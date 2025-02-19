package org.dnyanyog.service;

import java.util.Optional;
import org.dnyanyog.dao.ProductDao;
import org.dnyanyog.dto.UpdateProductRequest;
import org.dnyanyog.dto.UpdateProductResponse;
import org.dnyanyog.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateProductService {

	@Autowired
	ProductDao productDao;

	public UpdateProductResponse updateProduct(UpdateProductRequest request) {

		UpdateProductResponse response = new UpdateProductResponse();

		// If user_id not sent in request
		if (request.getProduct_id() == null) {
			response.setErrorCode("911");
			response.setMessage("User_id Not Found");
			return response;
		}

		// If user_id not present in DB
		Optional<Product> productPresentInDb = productDao.findById(request.getProduct_id());

		if (!productPresentInDb.isPresent()) {
			response.setErrorCode("912");
			response.setMessage("Product_id Not Present in DB");
			response.setUpdateProductRequest(request);
			return response;
		}

		Product productTable = new Product();

		productTable.setProductName(request.getPname());
		productTable.setQuantity(request.getPqty());
		productTable.setPrice(request.getPprc());
		productTable.setProduct_id(request.getProduct_id());

		productDao.save(productTable);

		response.setErrorCode("0000");
		response.setMessage("Product updated Successfully");
		response.setUpdateProductRequest(request);

		return response;
	}

}
