package Testes;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import Main.Banco;
import Main.Caixa;
import Main.Cliente;

public class BancoTest {

	private Banco banco;
	private Cliente cliente;
	private Caixa caixa;

	@Before
	public void setUp() {
		banco = new Banco();
	}

//	@Test
//	public void testGetAtendimento1() {
//		banco.cadastrar("Kim", 65);
//		banco.proximoCliente();
//		int actual = caixa.getAtendendo();
//		assertEquals(1, actual);
//	}

	@Test
	public void testAddCaixas() {
		banco.addCaixas(5);
		assertEquals(5, banco.getCaixas().size());
	}

	@Test
	public void testCadastrar() {
		cliente = new Cliente("Camila", 23);
		String clienteNome = cliente.getNome();
		int idadeCliente = cliente.getIdade();
		assertEquals("Camila", clienteNome);
		assertEquals(23, idadeCliente);
	}

}
