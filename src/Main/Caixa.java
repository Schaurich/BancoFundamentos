package Main;

public class Caixa {
	int numero;
    int atendendo;
    int aux;

    public int getAtendendo() {
        return atendendo;
    }

    public void setAtendendo(int atendendo) {
        this.atendendo = atendendo;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Caixa(int n) {
        this.numero = n;
        aux = 0;
        atendendo = 0;
    }
}
