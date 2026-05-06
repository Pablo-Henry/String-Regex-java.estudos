import java.util.Scanner;

public class ExContains {
    static void main(String[] args) {
        /*
        Laura está desenvolvendo um sistema de busca e precisa verificar se uma palavra específica está presente em um texto.
        Crie um programa que receba um texto e uma palavra, e exiba uma mensagem indicando se a palavra está presente no texto.
        */



        //CONTAINS VERIFICA SE A STRING POSSUI UMA PALAVRA ESPECIFICA.



        Scanner sc = new Scanner(System.in);

        String palavraContida, frase;

        System.out.println("Digite o texto: ");
        frase = sc.nextLine();

        System.out.println("Digite a palavra: ");
        palavraContida = sc.nextLine();

        if( frase.contains(palavraContida) ){
            System.out.println("A palavra: " + palavraContida + ", está presente no texto." );
        } else {
            System.out.println("A palavra: " + palavraContida + ", não está presente no texto." );
        }




    }
}
