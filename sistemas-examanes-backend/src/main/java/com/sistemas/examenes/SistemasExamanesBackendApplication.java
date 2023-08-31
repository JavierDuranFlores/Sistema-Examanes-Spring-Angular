package com.sistemas.examenes;

import com.sistemas.examenes.entity.Rol;
import com.sistemas.examenes.entity.Usuario;
import com.sistemas.examenes.entity.UsuarioRol;
import com.sistemas.examenes.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemasExamanesBackendApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("usuarioService")
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemasExamanesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setNombre("Javier");
		usuario.setApellido("Duran");
		usuario.setUsername("javier");
		usuario.setPassword("1234");
		usuario.setEmail("duranfloresj7@gmail.com");
		usuario.setTelefono("73825391021");
		usuario.setPerfil("foto.png");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);

		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());

	}
}
