package Main;

public class Cliente {
	int idade;
    String nome;

    
    public Cliente(String n, int i){
    this.nome = n;
    this.idade = i;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
