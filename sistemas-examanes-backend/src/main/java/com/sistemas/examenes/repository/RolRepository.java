package com.sistemas.examenes.repository;

import com.sistemas.examenes.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("rolRepository")
public interface RolRepository extends JpaRepository<Rol, Long> {
}
