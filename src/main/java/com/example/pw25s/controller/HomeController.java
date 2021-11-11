package com.example.pw25s.controller;

import com.example.pw25s.model.enums.StatusPedido;
import com.example.pw25s.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping(value = "")
    public String home(Model model) {
        model.addAttribute("pedidos", pedidoRepository.findAll());
        return "home";
    }

    @GetMapping("/{status}")
    public String filtra(Model model, @PathVariable String status) {
        model.addAttribute("pedidos", pedidoRepository.findAllByStatus(StatusPedido.valueOf(status.toUpperCase())));
        model.addAttribute("status", status);
        return "home";
    }
}
