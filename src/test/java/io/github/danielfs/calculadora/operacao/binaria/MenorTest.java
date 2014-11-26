/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.danielfs.calculadora.operacao.binaria;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class MenorTest {
    Menor menor;
    
    @Before
    public void initialize()
    {
        menor = new Menor();
    }
    
    @Test
    public void deveriaRetornar5QuandoPassa5e10()
    {
        double esperado = 5;
        double retornado = menor.calcular(5, 10);
        
        assertEquals(esperado,retornado,0);
    }
    
    @Test
    public void deveriaRetornar5QuandoPassa10e5()
    {
        double esperado = 5;
        double retornado = menor.calcular(10, 5);
        
        assertEquals(esperado,retornado,0);
    }
}
