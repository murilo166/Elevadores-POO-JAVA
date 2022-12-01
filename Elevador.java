import java.util.Scanner;

public class Elevador {

    String cor;


    int capacidadeelevador;


    int andaratual=0;


    int andares;


    int quantidadepessoas;



    public static void funcoes(){
        System.out.println("o que voce quer fazer: aperte 1:para entrar   2:para sair    3.para subir   4.para descer");

        Scanner em= new Scanner(System.in);
        int escolha= em.nextInt();

        int abertura=escolha;

        switch (abertura){

            case 1:
                entrar();
                break;

            case 2:
                sair();
                break;


            case 3:
                sobe();
                break;

            case 4:
                desce();
                break;
        }



    }







    public static void entrar(){

        System.out.println("ENTRAAAAANNNNNNNDOOOOO");


    }





    public static void sair(){

        System.out.println("Saindooooooooooo");

    }




    public static void sobe(){

        System.out.println("Subiiiinnnndooooooooooooooo");

    }



    public static void desce(){

        System.out.println("desceeennnnnnndooooo");


    }









    }









