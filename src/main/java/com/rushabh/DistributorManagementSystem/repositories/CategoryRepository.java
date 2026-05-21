package com.rushabh.DistributorManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushabh.DistributorManagementSystem.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
