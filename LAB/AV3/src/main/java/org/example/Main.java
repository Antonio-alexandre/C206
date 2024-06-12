package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produtos> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        int op = 0;

        do{
            System.out.println("Escolha a operação a ser realizada: ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Listar produtos por preço (mais alto ao mais barato)");
            System.out.println("4 - Mostrar a quantidade de produtos existentes de cada tipo");
            System.out.println("0 - Sair " + "\n");

            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    Produtos produto = new Produtos();
                    System.out.println("Digite o nome do produto: ");
                    produto.setNome(sc.nextLine());

                    System.out.println("Digite o preco do produto: ");
                    double preco = sc.nextDouble();
                    try{
                        if(preco <= 0){
                            throw new InfoInvalidaException("Nenhum produto pode ter preço menor ou igual a 0!");
                        }
                        else {
                            produto.setPreco(preco);
                            sc.nextLine();
                        }
                    } catch(InfoInvalidaException e){
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.println("Digite o tipo do produto: ");
                    String tipo = sc.nextLine();
                    try{
                        if(!tipo.equals("Comida") && !tipo.equals("Higiene") && !tipo.equals("Decoração")){
                            throw new InfoInvalidaException("Os produtos só podem ter os seguintes tipos: Comida, Higine ou Decoração!");
                        }
                        else{
                            produto.setTipo(tipo);
                        }
                    }catch(InfoInvalidaException e){
                        System.out.println(e.getMessage());
                        break;
                    }

                    arquivo.escrever(produto);
                    break;
                case 2:
                    produtos = arquivo.ler();
                    for(Produtos p : produtos){
                        p.mostrarInfo();
                    }
                    break;
                case 3:
                    produtos = arquivo.ler();

                    Collections.reverse(produtos);

                    for(Produtos p : produtos){
                        p.mostrarInfo();
                    }
                    break;
                case 4:
                    produtos = arquivo.ler();

                    int totalComida = 0;
                    int totalHigiene = 0;
                    int totalDeco = 0;

                    for(Produtos p : produtos){
                        if(p.getTipo().equals("Comida"))
                            totalComida++;
                        else if(p.getTipo().equals("Higiene"))
                            totalHigiene++;
                        else
                            totalDeco++;
                    }

                    System.out.println("Quantidade de produtos do tipo Comida: " + totalComida);
                    System.out.println("Quantidade de produtos do tipo Higiene: " + totalHigiene);
                    System.out.println("Quantidade de produtos do tipo Decoração: " + totalDeco + "\n");
                    break;
                case 0:
                    System.out.println("Finalizando menu...");
                    break;
            }
        }while(op != 0);
    }
}