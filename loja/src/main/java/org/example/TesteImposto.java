package org.example;

import org.example.imposto.CalculadoraImposto;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orc = new Orcamento(new BigDecimal(100),1);

        CalculadoraImposto calculadora = new CalculadoraImposto();
        System.out.println(calculadora.calcular(orc, new ISS()));
        System.out.println(calculadora.calcular(orc, new ICMS()));
    }
}