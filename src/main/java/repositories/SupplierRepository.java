package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {

}
