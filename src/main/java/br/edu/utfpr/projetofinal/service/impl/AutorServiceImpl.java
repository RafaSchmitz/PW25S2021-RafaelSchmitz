package br.edu.utfpr.projetofinal.service.impl;

import br.edu.utfpr.projetofinal.model.Autor;
import br.edu.utfpr.projetofinal.repository.AutorRepository;
import br.edu.utfpr.projetofinal.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends CrudServiceImpl<Autor, Long>  implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    @Override
    protected JpaRepository<Autor, Long> getRepository() {
        return autorRepository;
    }

}
