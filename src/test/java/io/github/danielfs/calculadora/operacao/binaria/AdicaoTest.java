package io.github.danielfs.calculadora.operacao.binaria;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdicaoTest {
    private Adicao adicao;
    
    @Before
    public void inicializar()
    {
        adicao = new Adicao();
    }
    
    @Test
    public void deveriaRetornar8QuandoPassa5e3() {
        
        double valorEsperado = 8;
        double valorRetornado = adicao.calcular(3, 5);
        
        // 0 e delta - diferença aceitável
        assertEquals(valorEsperado,valorRetornado,0);
        
    }
    
    
}
