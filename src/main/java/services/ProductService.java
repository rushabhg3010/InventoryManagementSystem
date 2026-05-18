package services;

import org.springframework.web.multipart.MultipartFile;

import dtos.ProductDTO;
import dtos.Response;

public interface ProductService {

	Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

	Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

	Response getAllProducts();

	Response getProductById(Long id);

	Response deleteProduct(Long id);

	Response searchProduct(String input);
}
