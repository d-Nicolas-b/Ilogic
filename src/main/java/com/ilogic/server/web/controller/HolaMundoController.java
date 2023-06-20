package com.ilogic.server.web.controller;

import com.ilogic.server.domain.dto.UserLoginRequest;
import com.ilogic.server.persistence.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {


    @GetMapping("/hola")
    public String saludar() {
        return "Hola mundo";
    }

}
