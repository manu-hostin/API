package com.weg.olamundo.service;

import com.weg.olamundo.model.Usuario;
import com.weg.olamundo.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public List<Usuario> obterUsuarios() throws SQLException {
        return userRepo.listarUser();
    }
}
