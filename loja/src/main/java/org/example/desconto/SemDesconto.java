package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {
    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarCalculo(Orcamento orc) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orc) {
        return true;
    }
}
