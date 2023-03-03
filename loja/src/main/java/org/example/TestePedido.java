package org.example;

import org.example.orcamento.Orcamento;
import org.example.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {
    public static void main(String[] args) {
        Orcamento orc = new Orcamento(new BigDecimal("600"), 4);

        String cliente = "Matheus";
        LocalDateTime data = LocalDateTime.now();

        Pedido ped = new Pedido(cliente, data, orc);

        System.out.println("Salvar pedido no banco");
        System.out.println("Enviar email com dados");
    }
}
