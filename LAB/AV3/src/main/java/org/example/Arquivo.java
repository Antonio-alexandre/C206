package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escrever(Produtos produto){
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do arquivo
            os = new FileOutputStream("Produtos.txt",true); // Arquivo
            // Mostra em qual arquivo será escrito
            osw = new OutputStreamWriter(os);
            // Permite que edite o arquivo
            bw = new BufferedWriter(osw);

            // Escrevendo os dados no arquivo
            bw.write("****PRODUTOS****" + "\n");
            bw.write(produto.getNome() + "\n");
            bw.write(produto.getPreco() + "\n");
            bw.write(produto.getTipo() + "\n");

        } catch (IOException e) {
            System.out.println("ERRO: "+e);
        }finally{
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public ArrayList<Produtos> ler(){
        // Criando array list que armazena os produtos encontrados no arquivo
        ArrayList<Produtos> encontrou = new ArrayList<>();

        // Estruturas para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para o arquivo

        try{
            is = new FileInputStream("Produtos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e executando enquanto tiver informações no txt
            while(linhaLer!=null){
                // Verificando se encontramos a flag que indica um produto
                if(linhaLer.contains("****PRODUTOS****")){
                    // Criando um produto auxiliar
                    Produtos aux = new Produtos();

                    // Lendo as informações do produto
                    aux.setNome(br.readLine());
                    aux.setPreco(Double.parseDouble(br.readLine()));
                    aux.setTipo(br.readLine());


                    // Adicionando o produto na lista de produtos encontrados no arquivo
                    encontrou.add(aux);
                }
                linhaLer = br.readLine();
            }
        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }
        return encontrou;
    }
}