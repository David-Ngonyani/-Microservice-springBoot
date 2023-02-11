package net.javaguides.departmentservice.repository;

import net.javaguides.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacistRepository extends JpaRepository<Department, Long> {
}