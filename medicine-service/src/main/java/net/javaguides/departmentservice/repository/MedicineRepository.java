package net.javaguides.departmentservice.repository;




import net.javaguides.departmentservice.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}