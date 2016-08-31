package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Banco;
import Main.Caixa;

public class CaixaTest {

	 public CaixaTest() {
	    }

	    private Caixa caixa;
	    private Banco banco;

	    @Before
	    public void setUp() throws Exception {
	        banco = new Banco("teste");
	        caixa = new Caixa(1);
	        
	    }

	    @Test
	    public void testGetNumero() {
	        int actual = caixa.getNumero();
	        assertEquals(1, actual);
	    }

	    @Test
	    public void testGetAtendendo() {
	        int actual = caixa.getAtendendo();
	        assertEquals(0, actual);
	    }


}
