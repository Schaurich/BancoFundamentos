package Testes;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import Main.Banco;
import Main.Caixa;
import Main.Cliente;
import Main.DataManager;

public class BancoTest {

	private Banco banco;
	private Cliente cliente;
	private Caixa caixa;
	private DataManager dm;

	@Before
	public void setUp() {
		dm = new DataManager();
		banco = new Banco("teste");
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
		dm.addCaixas(5);
		assertEquals(5, dm.getCaixas().size());
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
