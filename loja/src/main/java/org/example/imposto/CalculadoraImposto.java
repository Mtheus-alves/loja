package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento o, TipoImposto t) {
        return t.calcular(o);
    }
}
