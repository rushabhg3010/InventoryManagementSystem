package com.rushabh.DistributorManagementSystem.services;

import org.springframework.web.multipart.MultipartFile;

import com.rushabh.DistributorManagementSystem.dtos.ProductDTO;
import com.rushabh.DistributorManagementSystem.dtos.Response;

public interface ProductService {

	Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

	Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

	Response getAllProducts();

	Response getProductById(Long id);

	Response deleteProduct(Long id);

	Response searchProduct(String input);
}
