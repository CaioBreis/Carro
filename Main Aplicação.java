package Aplicaçao;
import anti.carro;
import java.util.Scanner;

public class Aplicaçao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do carro");
        String nome=sc.next();

        System.out.println("Modelo do carro");
        String modelo=sc.next();

        System.out.println("Ano do carro");
        int ano=sc.nextInt();


        carro carro1 = new carro(ano,modelo,nome);



        System.out.println(carro1.nome());
        System.out.println(carro1.modelo());
        System.out.println(carro1.ano());


        System.out.println("==========");

        System.out.println(carro1.toString());

        System.out.println(" ");

//=================================================================

        System.out.println(" ");

        System.out.println("Nome do carro2");
        nome=sc.next();

        System.out.println("Modelo do carro2");
        modelo=sc.next();

        System.out.println("Ano do carro2");
        ano=sc.nextInt();


        carro carro2 = new carro(ano,modelo,nome);



        System.out.println(carro2.nome());
        System.out.println(carro2.modelo());
        System.out.println(carro2.ano());

        System.out.println("==========");

        System.out.println(carro2.toString());



    }


}



