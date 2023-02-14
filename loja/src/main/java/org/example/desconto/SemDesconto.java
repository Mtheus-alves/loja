package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orc) {
        return BigDecimal.ZERO;
    }
}
