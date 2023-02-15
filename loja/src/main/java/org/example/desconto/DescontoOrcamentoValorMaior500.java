package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoValorMaior500 extends Desconto {
    public DescontoOrcamentoValorMaior500(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orc) {
        return orc.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orc) {
        return orc.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
