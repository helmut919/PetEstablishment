package es.upm.dit.isst.mascotmercio21.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
@PostMapping("/registro")
public String registrarUsuario(HttpSession session, @RequestParam int id, @RequestParam String nombre, @RequestParam String apellidos, @RequestParam String fechanacimiento, @RequestParam String email, @RequestParam String contraseña) {
    session.setAttribute("id", id);
    session.setAttribute("nombre", nombre);
    session.setAttribute("apellidos", apellidos);
    session.setAttribute("fechanacimiento", fechanacimiento);
    session.setAttribute("email", email);
    session.setAttribute("contraseña", contraseña);
        return "redirect:/";
    }
    @GetMapping("/cliente/perfil")
    public String perfilUsuario(HttpSession session, Model model) {
        Integer id = (Integer) session.getAttribute("id");
        String nombre = (String) session.getAttribute("nombre");
        String apellidos = (String) session.getAttribute("apellidos");
        String fechanacimiento = (String) session.getAttribute("fechanacimiento");
        String email = (String) session.getAttribute("email");
        String contraseña = (String) session.getAttribute("contraseña");

        // Comprobar si el usuario está logueado (p.ej., verificando que hay un id)
        if (id == null) {
            return "redirect:/login";  // Redirige al login si no hay sesión activa
        }

        // Añadir atributos al modelo para pasarlos a la vista
        model.addAttribute("id", id);
        model.addAttribute("nombre", nombre);
        model.addAttribute("apellidos", apellidos);
        model.addAttribute("fechanacimiento", fechanacimiento);
        model.addAttribute("email", email);
        model.addAttribute("contraseña", contraseña);
        return "Cliente/ModificarPerfil.html"; // Nombre del archivo HTML en templates
    }
    
}