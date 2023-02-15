package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoCincoItens extends Desconto {
    public DescontoOrcamentoCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orc) {
        return orc.getValor().multiply(new BigDecimal(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orc) {
        return orc.getQtdItens() >= 5;
    }
}
