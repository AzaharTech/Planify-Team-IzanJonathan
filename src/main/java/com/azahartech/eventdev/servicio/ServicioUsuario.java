package com.azahartech.eventdev.servicio;

import com.azahartech.eventdev.modelo.Usuario;

import java.util.ArrayList;

public class ServicioUsuario {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        boolean banderita = false;
        Usuario usuarioTemporal = null;
        for (Usuario listaUsuario : listaUsuarios) {
            if (listaUsuario.consultarEmail().equals(email)) {
                banderita = true;
                usuarioTemporal = listaUsuario;
            }
        }
        if (banderita) {
            return usuarioTemporal;
        } else {
            return null;
        }
    }

}



