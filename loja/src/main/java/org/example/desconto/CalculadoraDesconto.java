package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {
    public BigDecimal calcular(Orcamento orc) {
        Desconto d = new DescontoOrcamentoCincoItens(new DescontoOrcamentoValorMaior500(new SemDesconto()));
        return d.efetuarCalculo(orc);
    }
}
