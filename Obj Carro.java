package enti;

public class carro {
    private String nome;
    private String modelo;
    private int ano;

    public carro (int x,String y, String z) {
        this.ano=x;
        this.nome=z;
        this.modelo=y;

    }


    public String toString() {
        return "carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String modelo() {
        return this.modelo;

    }

    public String nome() {
        return this.nome;

    }

    public int ano() {
        return this.ano;

    }


}

