package com.rushabh.DistributorManagementSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushabh.DistributorManagementSystem.models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
