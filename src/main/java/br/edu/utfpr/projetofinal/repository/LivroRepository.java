package br.edu.utfpr.projetofinal.repository;

import br.edu.utfpr.projetofinal.model.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    Page<Livro> findAllByAutorId(Long id, Pageable pageable);

}