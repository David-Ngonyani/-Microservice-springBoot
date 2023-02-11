package net.javaguides.departmentservice.repository;


import net.javaguides.departmentservice.entity.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}