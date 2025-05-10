import model.Cadastro;

public class Sistema {

    public static void main(String[] args) {

        Cadastro teste = new Cadastro();

        teste.cadastrarProdutos("Smart TV", 243, 999956365);
        teste.cadastrarProdutos("Relogio", 867, 54388865);
        teste.cadastrarProdutos("Maquina", 998, 68394454);

        teste.listarProdutos();

    }

}
