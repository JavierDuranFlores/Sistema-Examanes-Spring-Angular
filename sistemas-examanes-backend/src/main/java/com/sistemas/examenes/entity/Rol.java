package com.sistemas.examenes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
public class Rol {

    @Id
    @Getter @Setter
    private Long rolId;

    @Getter @Setter
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    @Getter @Setter
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();

}
