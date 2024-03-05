package comportamentoArrayListMemoria;


import java.util.Scanner;

class Produto{
    String nome;
    double preco;
    Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
}
public class vetorProduto {
    public static void main(String[] args){
        int n;
        double preco;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        String nome;
        Produto[] produtos = new Produto[n];
        for(int i = 0; i<n; i++){
            nome = scan.next();
            preco = scan.nextDouble();

            Produto newProduto = new Produto(nome, preco);
            produtos[i] = newProduto;
        }
        double soma = 0;
        for(int j =0; j<n; j++){
            soma += produtos[j].preco;

        }

        System.out.printf("A media dos produtos %.2f ", soma/n);

    }
}
