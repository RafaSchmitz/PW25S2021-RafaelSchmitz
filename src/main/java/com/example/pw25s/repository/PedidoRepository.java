package com.example.pw25s.repository;

import com.example.pw25s.model.Pedido;
import com.example.pw25s.model.enums.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    public List<Pedido> findAllByStatus(StatusPedido status);

}
