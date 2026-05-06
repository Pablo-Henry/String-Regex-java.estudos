import java.util.Scanner;

public class ExTrim {
    static void main(String[] args) {

        /*
         Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que muitos nomes estão sendo cadastrados
         com espaços em branco no início ou no final. Ela quer um programa que remova esses espaços automaticamente.
         Crie um programa que receba um nome e exiba o nome sem espaços em branco no início ou no final.
        * */


        Scanner sc = new Scanner(System.in);

    //TRIM -> METODO DE STRING QUE REMOVE ESPAÇOS INDESEJADOS ( ESPAÇOS QUE ESTÃO NO COMEÇO E NO FINAL DA STRING )
        System.out.println( "Digite seu nome: " );
        String nome = sc.nextLine().trim();


        System.out.println(nome);

    }
}
