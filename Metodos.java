import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Metodos
{

     //Objetos das classes Scanner e Leitor
     public Scanner leitor = new Scanner(System.in);
     private Random aleatorio = new Random();

     //ArrayLists para armazenarem dados do usuário
     private ArrayList<String> cadastrados = new ArrayList<String>();
     private ArrayList<String> senhas = new ArrayList<String>();

     //Variáveis características do usuário
     private String nome;
     private int idade, id=aleatorio.nextInt(100000000);
     private String senha;
     public String resposta;
     public String actionMenu;
     public double deposito;
     public double saldo=0;

     
    private void criarConta()
    {
             
            System.out.println("Informe o seu nome: ");
            nome=leitor.nextLine();
        
        while(nome.matches("[0-9]") || nome.contains("0") || nome.contains("1")  || nome.contains("2") || nome.contains("3") || nome.contains("4")  || nome.contains("5") || nome.contains("6") || nome.contains("7") || nome.contains("8")  || nome.contains("9")) {

            System.err.println("O NOME NÃO PODE CONTER NÚMEROS!");
            System.out.println("Informe o seu nome: ");
            nome=leitor.nextLine();

        }

            System.out.println("Informe a sua idade: ");
            idade=leitor.nextInt();

        while(idade<18){

            System.err.println("VOCÊ NÃO PODE CRIAR UMA CONTA SENDO MENOR DE IDADE (" +idade+ ")");
            System.out.println("Informe a sua idade: ");
            idade=leitor.nextInt();

        }

            System.out.println("Informe uma senha de no mínimo 6 caracteres e sem espaços (Os espaços seram ignorados): ");
            senha=leitor.next();

        while(senha.length()<6){

            System.err.println("SUA SENHA É MENOR QUE 6 CARACTERES! (" +senha.length()+ ")!");
            System.out.println("Informe uma senha de no mínimo 6 caracteres");
            senha=leitor.next();

        }

        for(int i=0; i<3; i++){

            System.out.println(".");

        try{

            Thread.sleep(1000);

        }catch(InterruptedException goku){

        }
    }
      
        cadastrados.add(nome); 
        senhas.add(senha);

            System.out.println("CONTA CADASTRADA COM SUCESSO! \nNome: " +nome+ " \nidade: " +idade+ " \nSaldo: " +saldo+ "  \n ID: " +id);


    }
    public void verMenu(){
      
          System.out.println("--------MENU--------- \n 1 - ver contas cadastradas \n 2 - ver senhas cadastradas \n 3 - Fazer Depósito \n 4 - Criar novo cadastro ");
          actionMenu=leitor.next();
          
            if(actionMenu.equalsIgnoreCase("1") || actionMenu.equalsIgnoreCase("um") || actionMenu.equalsIgnoreCase("one")){

                System.out.println("Usuários: ");

             for (String goku : cadastrados) {
                
                System.out.println(goku+ ", ");

             }

            }else if(actionMenu.equalsIgnoreCase("2") || actionMenu.equalsIgnoreCase("dois") || actionMenu.equalsIgnoreCase("two") || actionMenu.equalsIgnoreCase("dos")){

                System.out.println("Senhas: ");

            for (String senha : senhas) {
                
                System.out.println(senha+ ",");

            }

            }else if(actionMenu.equalsIgnoreCase("3") || actionMenu.equalsIgnoreCase("tres") || actionMenu.equalsIgnoreCase("três") || actionMenu.equalsIgnoreCase("three")){

                System.out.println("Informe o valor do depósito: ");
                deposito=leitor.nextDouble();
                saldo = saldo+deposito;
                System.out.println("Depositando...");

                try{

                    Thread.sleep(2000);

                }catch (InterruptedException depositando){

                }

                System.out.println("Seu saldo atual é de: R$" + saldo);

            }else if(actionMenu.equalsIgnoreCase("4") || actionMenu.equalsIgnoreCase("quatro") || actionMenu.equalsIgnoreCase("four")){

                action();

            }

            this.verMenu();

    }

    public void action()
    {

        this.criarConta();

           System.out.println("Deseja ver o menu?");
           resposta=leitor.next();

        if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("yes") || resposta.equalsIgnoreCase("yeah") || resposta.equalsIgnoreCase("si")){

            this.verMenu();

        }else if(resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("no")){

            this.criarConta();

        }else{

            while(true){

            System.out.println("Deseja ver o menu?");
            resposta=leitor.next();

            if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("yes") || resposta.equalsIgnoreCase("yeah") || resposta.equalsIgnoreCase("si")){

                this.verMenu();
    
            }else if(resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("no")){
    
                this.criarConta();
    


            }
        }


    }

    
    leitor.close();

}
}