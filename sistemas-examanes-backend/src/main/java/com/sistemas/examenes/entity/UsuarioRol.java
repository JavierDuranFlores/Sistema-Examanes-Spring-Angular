package com.sistemas.examenes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    @Getter @Setter
    private Usuario usuario;

    @ManyToOne
    @Getter @Setter
    private Rol rol;

}
