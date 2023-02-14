package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements TipoImposto {
    public BigDecimal calcular(Orcamento orc) {
        return orc.getValor().multiply(new BigDecimal("0.06"));
    }
}
