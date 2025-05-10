package model;

public class Produto {

    //Atributos da classe
    private String nome;

    private int id;

    private long qrCode;

    //Construtor de produto
    public Produto(String nome, int id, long qrCode) {
        this.nome = nome;
        this.id = id;
        this.qrCode = qrCode;
    }



    //getters
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public long getQrCode() {
        return qrCode;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQrCode(long qrCode) {
        this.qrCode = qrCode;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", qrCode=" + qrCode +
                '}';
    }
}

