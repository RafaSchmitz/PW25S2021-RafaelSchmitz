package br.edu.utfpr.projetofinal.controller;

import br.edu.utfpr.projetofinal.model.Livro;
import br.edu.utfpr.projetofinal.service.AutorService;
import br.edu.utfpr.projetofinal.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping(value = "catalog", method = RequestMethod.POST)
public class CatalogController {

    @Autowired
    private LivroService livroService;

    @Autowired
    private AutorService autorService;

    private void carregarCombos(Model model) {
        model.addAttribute("autores", autorService.findAll());

    }

    @GetMapping() // /produto?page=1&size=6
    public String list(
            @RequestParam("page") Optional<Integer> page,
            @RequestParam("size") Optional<Integer> size,
            Model model) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(6);

        Page<Livro> list = this.livroService.findAll(PageRequest.of(currentPage - 1, pageSize));

        model.addAttribute("livros", list);


        if (list.getTotalPages() > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, list.getTotalPages())
                    .boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        carregarCombos(model);

        return "catalog/index";
    }

    @GetMapping("{id}")
    public String list(
            @RequestParam("page") Optional<Integer> page,
            @RequestParam("size") Optional<Integer> size,
            @PathVariable Long id,
            Model model) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(6);

        Page<Livro> list = this.livroService.findAllByAutorId(id, PageRequest.of(currentPage - 1, pageSize));

        model.addAttribute("livros", list);


        if (list.getTotalPages() > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, list.getTotalPages())
                    .boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        carregarCombos(model);

        return "catalog/index";
    }


}
