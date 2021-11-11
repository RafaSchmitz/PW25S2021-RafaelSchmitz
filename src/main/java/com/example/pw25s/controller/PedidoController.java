package com.example.pw25s.controller;

import com.example.pw25s.model.PedidoSalvarDTO;
import com.example.pw25s.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoRepository pedidoRepository;

    @RequestMapping("/novo")
    public String novoPedido(PedidoSalvarDTO pedidoSalvarDTO){
        return "pedido/formulario";
    }

    @PostMapping(value = "/salvar")
    public String salvarPedido(@Valid PedidoSalvarDTO pedidoSalvarDTO, BindingResult result){
        if(!result.hasErrors()) {
            pedidoRepository.save(pedidoSalvarDTO.toPedido());
        }
        return "pedido/formulario";
    }
}
