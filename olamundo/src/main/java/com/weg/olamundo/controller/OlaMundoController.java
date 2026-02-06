package com.weg.olamundo.controller;

import com.weg.olamundo.model.Usuario;
import com.weg.olamundo.repository.UserRepo;
import com.weg.olamundo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class OlaMundoController {

    private final UserService usuarioService;
    public OlaMundoController(UserService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/id-teste")
    public List<Usuario> buscarIDTeste () throws SQLException {
        List<Usuario> lista = new ArrayList<>();

        try {
            lista = usuarioService.obterUsuarios();
            return lista;

        } catch (SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    @PostMapping("/cadastro")
    public Usuario postUser (@RequestBody Usuario user) throws SQLException {
        return usuarioService.salvarUser(user);
    }
}
