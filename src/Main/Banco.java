package Main;

import java.util.ArrayList;

public class Banco {
	ArrayList<Cliente> clientes;
    ArrayList<Cliente> clientes65;
    ArrayList<Caixa> caixas;
    String nome;

    public Banco(String n) {
    	this.nome = n;
        clientes = new ArrayList<Cliente>();
        caixas = new ArrayList<Caixa>();
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

    public ArrayList<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(ArrayList<Caixa> caixas) {
        this.caixas = caixas;
    }

    

    public void tempoAtendimento() {
        for (Caixa c : caixas) {
            if (c.getAux() > 0) {
                c.setAux(c.getAux() + 1);
            }
            if (c.getAux() > 5) {
                c.setAux(0);
                c.setAtendendo(0);
            }
        }
    }

  

    public void proximoCliente() {
        int verificar = 0;
        tempoAtendimento();
        for (Caixa c : caixas) {

            System.out.println("Caixa:" + c.getNumero() + "  Atendendo:" + c.getAtendendo() + "  Aux:" + c.getAux());

            if (c.getAtendendo() == 1) {
            } else if ((c.getAtendendo() == 0) && (c.getNumero() <= 5)) {

                for (Cliente cli : clientes) {
                    if (cli.getIdade() >= 65) {
                        clientes.remove(cli);
                        System.out.println("removendo");
                        c.setAtendendo(1);
                        System.out.println("setando atendendo 1");
                        verificar = 1;
                        System.out.println("verificando 1");
                        c.setAux(c.getAux() + 1);
                        break;
                    }
                }
            } else {
                for (Cliente clie : clientes) {
                    clientes.remove(clie);
                    System.out.println("Removendo cliente");
                    c.setAtendendo(1);
                    System.out.println("Setando atendimento 1");
                    verificar = 1;
                    System.out.println("Verificar 1");
                    c.setAux(c.getAux() + 1);
                    break;
                }
            }

            if (verificar == 1) {
                System.out.println("Proximo cliente chamado");
                for (Cliente sd : clientes) {
                    System.out.println("Cliente:" + sd.getNome() +"  "+ sd.getIdade());
                }
            } else {
                System.out.println("Nenhum caixa disponivel");
                for (Cliente sd : clientes) {
                    System.out.println("Clientes:" + sd.getNome() +"  "+ sd.getIdade());
                }
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
