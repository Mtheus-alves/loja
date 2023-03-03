package org.example.pedido;

import org.example.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private Orcamento orc;

    public Pedido(String cliente, LocalDateTime data, Orcamento orc) {
        this.cliente = cliente;
        this.data = data;
        this.orc = orc;
    }

    public String getCliente() {return cliente;}

    public LocalDateTime getData() {return data;}

    public Orcamento getOrc() {return orc;}
}
