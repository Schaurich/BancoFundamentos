package Testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Main.Banco;
import Main.Caixa;
import Main.Cliente;

public class BancoTest {

	private Banco banco;
	   private Cliente cli;
	   private Caixa caixa;
	    
	    @Before
	    public void setUp() {
	        banco = new Banco();
	    }
	    
	     /*@Test
	    public void testGetAtendimento1() {
	        banco.cadastrar("Kim", 65);
	        banco.proximoCliente();
	        int actual = caixa.getAtendendo();
	        assertEquals(1, actual);
	    }*/
	    
	    @Test
	    public void testAddCaixas(){
	    banco.addCaixas(5);
	    }
	    
	    @Test
	    public void testCadastrar(){
	    
	    }

}
