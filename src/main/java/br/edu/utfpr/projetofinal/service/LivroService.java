package br.edu.utfpr.projetofinal.service;

import br.edu.utfpr.projetofinal.model.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface LivroService extends CrudService<Livro, Long>{

    Page<Livro> findAllByAutorId(Long id, Pageable pageable);

}
