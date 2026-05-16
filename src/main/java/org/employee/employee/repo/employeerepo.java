package org.employee.employee.repo;

import org.employee.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeerepo extends JpaRepository<Employee,Long> {
}
