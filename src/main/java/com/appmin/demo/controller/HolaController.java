package com.appmin.demo.controller;

import com.appmin.demo.model.Usuario;
import com.appmin.demo.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
@Controller
public class HolaController {

    private final UsuarioService usuarioService;

    // Inyección de dependencias por constructor (forma correcta)
    public HolaController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping("/")
    public String inicio(Model model) {

        List<Usuario> usuarios = usuarioService.obtenerUsuarios();
        model.addAttribute("usuarios", usuarios);

        return "hola";
    }

    // Procesar el formulario
    @PostMapping("/saludar")
    public String saludar(@RequestParam String nombre, Model model) {

        Usuario usuario = usuarioService.crearUsuario(nombre);

        model.addAttribute("respuesta", "Hola " + usuario.getNombre() + ", bienvenido 🚀");

        return "hola";
    }
}

