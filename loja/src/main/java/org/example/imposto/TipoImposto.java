package org.example.imposto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {
    BigDecimal calcular(Orcamento o);
}
