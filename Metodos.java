import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Metodos
{

     public Scanner leitor = new Scanner(System.in);
     private Random aleatorio = new Random();
     private ArrayList<String> cadastrados = new ArrayList<String>();
     private ArrayList<Integer> senhas = new ArrayList<Integer>();
     private String nome;
     private int idade, id=aleatorio.nextInt(100000000);

    private void criarConta()
    {

        System.out.println("Informe o seu nome2: ");
        nome=leitor.nextLine();

        
        while(nome.matches("[0-9]") || nome.contains("0") || nome.contains("1")  || nome.contains("2") || nome.contains("3") || nome.contains("4")  || nome.contains("5") || nome.contains("6") || nome.contains("7") || nome.contains("8")  || nome.contains("9")) {

            System.err.println("O NOME NÃO PODE CONTER NÚMEROS!");
            System.out.println("Informe o seu nome: ");
            nome=leitor.nextLine();

        }

        System.out.println("Informe a sua idade: ");
        idade=leitor.nextInt();

        while(idade<18){

            System.err.println("VOCÊ NÃO PODE CRIAR UMA CONTA SENDO MENOR DE IDADE ("+idade+")");
            System.out.println("Informe a sua idade: ");
            idade=leitor.nextInt();

        }

        for(int i=0; i<=3; i++){

            System.out.println(".");

        try{

            Thread.sleep(1000);

        }catch(InterruptedException goku){

        }
    }
      
        cadastrados.add(nome); 

        System.out.println("CONTA CADASTRADA COM SUCESSO! \nNome: "+nome+" \nidade: "+idade+" \n ID: "+id);

        leitor.close();

    }

    public void action()
    {

        this.criarConta();

    }

    public void verMenu(){

        System.out.println("--------MENU--------- \n 1 - ver contas cadastradas \n 2 - ver senhas cadastradas ");


    }


}