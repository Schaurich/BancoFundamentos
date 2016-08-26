package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Cliente;

public class ClienteTest {

private Cliente cli;   
    
    @Before
    public void setUp()throws Exception {
        cli = new Cliente("Kim", 25);
        }
    
    @Test
    public void testNome(){
    String actual = cli.getNome();
    assertEquals("Kim",actual);    
    }
    
    @Test
    public void testIdade(){
    int actual = cli.getIdade();
    assertEquals(25,actual);    
    }
}
