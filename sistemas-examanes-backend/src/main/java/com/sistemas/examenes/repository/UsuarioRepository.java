package com.sistemas.examenes.repository;

import com.sistemas.examenes.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public abstract Usuario findByUsername(String username);

}
