package com.rushabh.DistributorManagementSystem.services;

import com.rushabh.DistributorManagementSystem.dtos.CategoryDTO;
import com.rushabh.DistributorManagementSystem.dtos.Response;

public interface CategoryService {
	
	Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);

}
