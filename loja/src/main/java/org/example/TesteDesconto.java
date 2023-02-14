package org.example;

import org.example.desconto.CalculadoraDesconto;
import org.example.imposto.CalculadoraImposto;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento orc1 = new Orcamento(new BigDecimal(200),6);
        Orcamento orc2 = new Orcamento(new BigDecimal(1000),1);
        Orcamento orc3 = new Orcamento(new BigDecimal(100),1);

        CalculadoraDesconto calculadora = new CalculadoraDesconto();


        System.out.println(calculadora.calcular(orc1));
        System.out.println(calculadora.calcular(orc2));
        System.out.println(calculadora.calcular(orc3));
    }
}
