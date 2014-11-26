package io.github.danielfs.calculadora.operacao.binaria;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class AdicaoIncrementadaTest {
    AdicaoIncrementada addInc;

    @Before
    public void initialize()
    {
        addInc = new AdicaoIncrementada();
    }
    @Test
    public void deveriaRetornar6QuandoInformar3e2() {
        double esperado = 6;
        double retornado = addInc.calcular(3, 2);
        
        assertEquals(esperado, retornado,0);
    }
    @Test
    public void deveriaRetornarMenos2QuandoInformaMenos2eMenos1()
    {
        double esperado = -2;
        double retornado = addInc.calcular(-2, -1);
        assertEquals(esperado, retornado,0);
    }
}
