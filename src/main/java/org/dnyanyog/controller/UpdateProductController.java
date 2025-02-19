package org.dnyanyog.controller;

import org.dnyanyog.dto.UpdateProductRequest;
import org.dnyanyog.dto.UpdateProductResponse;
import org.dnyanyog.service.UpdateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateProductController {
	@Autowired
	UpdateProductService updateProductService;

	@PostMapping(path = "/api/product/updateProduct")
	public UpdateProductResponse updateUser(@RequestBody UpdateProductRequest updatebody) {
		return updateProductService.updateProduct(updatebody);
	}

}
