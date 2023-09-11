package com.sistemas.examenes.controller;

import com.sistemas.examenes.entity.Rol;
import com.sistemas.examenes.entity.Usuario;
import com.sistemas.examenes.entity.UsuarioRol;
import com.sistemas.examenes.service.impl.UsuarioServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    @Qualifier("usuarioServiceImpl")
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception {
        usuario.setPerfil("default.png");
        Set<UsuarioRol> usuarioRoles = new HashSet<>();

        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setNombre("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        usuarioRoles.add(usuarioRol);

        return usuarioServiceImpl.guardarUsuario(usuario, usuarioRoles);

    }
    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username) {
        return usuarioServiceImpl.obtenerUsuario(username);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioI) {
        usuarioServiceImpl.eliminarUsuario(usuarioI);
    }



}
