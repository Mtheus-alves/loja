package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract
class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orc);

    public BigDecimal calcular(Orcamento orc) {
        var result = proximo.calcular(orc);

        if (deveAplicar(orc))
            return efetuarCalculo(orc);

        return result;
    }

    public abstract boolean deveAplicar(Orcamento orc);
}
