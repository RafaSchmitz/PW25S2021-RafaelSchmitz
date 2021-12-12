package br.edu.utfpr.projetofinal.service.impl;

import br.edu.utfpr.projetofinal.model.Livro;
import br.edu.utfpr.projetofinal.repository.LivroRepository;
import br.edu.utfpr.projetofinal.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroServiceImpl extends CrudServiceImpl<Livro, Long>  implements LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    protected JpaRepository<Livro, Long> getRepository() {
        return livroRepository;
    }

    @Override
    public Page<Livro> findAllByAutorId(Long id, Pageable pageable) {
        return livroRepository.findAllByAutorId(id, pageable);
    }
}

