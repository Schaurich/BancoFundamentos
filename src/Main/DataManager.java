package Main;

import java.util.ArrayList;

public class DataManager {
	private static DataManager instance = new DataManager();
	ArrayList<Cliente> clientes;
    ArrayList<Caixa> caixas;
    String [] aux;
    
    public DataManager() {
        clientes = new ArrayList<>();
        caixas = new ArrayList<>();
        aux = new String[2];
        
    }
    
    public String[] getAux() {
		return aux;
	}
	public void setAux(String[] aux) {
		this.aux = aux;
	}
	public static DataManager getInstance() {
        return instance;
    }   
    public ArrayList<Caixa> getCaixas() {
		return caixas;
	}
	public void setCaixas(ArrayList<Caixa> caixas) {
		this.caixas = caixas;
	}
	public ArrayList<Cliente> getClientes() {
        for (Cliente c : clientes) {
            System.out.println("Nome:" + c.getNome());
        }
        return clientes;
    }
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    public void tempoAtendimento() {
        for (Caixa c : caixas) {
            if (c.getAux() >= 0) {
                c.setAux(c.getAux() + 1);
            }
            if (c.getAux() > 5) {
                c.setAux(0);
                c.setAtendendo(0);
            }
        }
    }
    public void proximoCliente() {
       aux[0]=null;
       aux[1]=null;
    	int verificar = 0;
        tempoAtendimento();
        for (Caixa c : caixas) {
        	aux[1]= Integer.toString(c.getNumero());
            System.out.println("Caixa:" + c.getNumero() + "  Atendendo:" + c.getAtendendo() + "  Aux:" + c.getAux());

            if (c.getAtendendo() == 1) {
            } else 
            if ((c.getAtendendo() == 0) && (c.getNumero() <= 5)) {
            	
                for (Cliente cli : clientes) {
                    if (cli.getIdade() >= 65) {
                        clientes.remove(cli);
                           c.setAtendendo(1);
                                                verificar = 1;
                                                          
                                                aux[0] = cli.getNome();
                        break;
                    }
                }
            } else {
                for (Cliente clie : clientes) {
                    clientes.remove(clie);
                    c.setAtendendo(1);
                    verificar = 1;
                    
                    aux[0] = (clie.getNome());
                    break;
                }
            }
            
            if (verificar == 1) {
                System.out.println("Proximo cliente chamado");
                break;
                
            } else {
                System.out.println("Nenhum caixa disponivel");
                
                
            }
        } 
    }
    public void cadastrar(String nome, int idade){
Cliente cliente = new Cliente(nome, idade);
clientes.add(cliente);
}
    public void addCaixas(int n) {
        int aux = 1;
        while (aux <= n) {
            Caixa caixa = new Caixa(aux);
            caixas.add(caixa);
            aux++;
        }

    }
	
}
