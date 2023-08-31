package com.sistemas.examenes.service;

import com.sistemas.examenes.entity.Usuario;
import com.sistemas.examenes.entity.UsuarioRol;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

}
