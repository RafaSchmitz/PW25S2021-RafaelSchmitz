package com.example.pw25s.controller;


import com.example.pw25s.model.PedidoSalvarDTO;
import com.example.pw25s.model.Produtos;
import com.example.pw25s.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


@Controller
@RequestMapping(value="/produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping(value = "")
    public String produto(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produtos/produtos";

    }

    @GetMapping(value = {"novo"})
    public String form(Model model) {
        model.addAttribute("produto", new Produtos());
        return "produtos/formulario";
    }

    @PostMapping
    public String save(Produtos produto,
                       BindingResult result,
                       Model model,
                       RedirectAttributes attributes) {
        if ( result.hasErrors() ) {
            model.addAttribute("produto", produto);
            return "produto/formulario";
        }

        produtoRepository.save(produto);
        attributes.addFlashAttribute("sucesso",
                "Registro salvo com sucesso!");
        return "redirect:/produto";
    }
}
