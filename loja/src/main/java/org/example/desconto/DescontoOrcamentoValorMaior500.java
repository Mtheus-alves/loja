package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoValorMaior500 extends Desconto {
    public DescontoOrcamentoValorMaior500(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orc) {
        var result = proximo.calcular(orc);

        if (orc.getValor().compareTo(new BigDecimal(500)) > 0)
            result = orc.getValor().multiply(new BigDecimal("0.05"));

        return result;
    }
}
