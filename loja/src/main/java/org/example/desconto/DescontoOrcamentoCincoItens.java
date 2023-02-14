package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoCincoItens extends Desconto {
    public DescontoOrcamentoCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orc) {
        var result = proximo.calcular(orc);

        if (orc.getQtdItens() > 5)
            result = orc.getValor().multiply(new BigDecimal("0.1"));

        return result;
    }
}
