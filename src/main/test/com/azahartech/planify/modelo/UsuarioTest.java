package com.azahartech.planify.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.azahartech.planify.modelo.Usuario;

class UsuarioTest {

    @Test
    void testCrearUsuarioYGetters() {
        Usuario u = new Usuario("Pepe", "Admin");

        assertEquals("Pepe", u.getNombre());
        assertEquals("Admin", u.getRol());
    }

    @Test
    void testEquals() {
        Usuario u1 = new Usuario("Ana", "User");
        Usuario u2 = new Usuario("Ana", "User");
        Usuario u3 = new Usuario("Luis", "User");

        assertEquals(u1, u2);
        assertNotEquals(u1, u3);
    }
}