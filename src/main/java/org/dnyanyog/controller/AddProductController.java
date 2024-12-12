package org.dnyanyog.controller;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.RestController;
import org.dnyanyog.dto.AddProductRequest;
import org.dnyanyog.dto.AddProductResponse;
import org.dnyanyog.service.AddProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class AddProductController {
	@PostMapping("/addproduct")
	public AddProductResponse addproduct(@RequestBody AddProductRequest addproductbody) throws SQLException {

		System.out.println(addproductbody.pid);
		System.out.println(addproductbody.pname);
		System.out.println(addproductbody.pqty);
		System.out.println(addproductbody.pprc);

		return new AddProductService().addProduct(addproductbody);

	}

}
