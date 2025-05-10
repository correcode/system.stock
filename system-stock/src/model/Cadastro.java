package model;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    List<Produto> listStock;

    public Cadastro() {
        this.listStock = new ArrayList<>();
    }

    public void cadastrarProdutos(String nome, int id, long qrCode) {
        this.listStock.add(new Produto(nome, id, qrCode));
    }

    public List<Produto> listarProdutos() {
        if (listStock.isEmpty()) {
            throw new RuntimeException("A lista esta vazia");
        }
        return listStock;
    }

    public List<Produto> removerProdutos(int id) {
        boolean encontrado = false;

        for (Produto p : listStock){
            if (p.getId() == id) {
                listStock.remove(p);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new RuntimeException("O produto nao foi encontrado.");
        }
        return listStock;
    }

    public List<Produto> buscarPorId(int id) {
        boolean econtrado = false;

        for (Produto p : listStock) {
            if (p.getId() == id) {
                System.out.println(p);
                econtrado = true;
                break;
            }
        }
        if (!econtrado) {
            throw new RuntimeException("Nao econtrado");
        }
        return listStock;
    }
}
