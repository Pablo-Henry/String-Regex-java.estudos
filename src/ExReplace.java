import java.util.Scanner;

public class ExReplace {
    static void main(String[] args) {


        /*
            Ana está desenvolvendo um sistema de edição de textos e precisa substituir uma palavra específica por outra em um texto. Crie um programa que:

            Receba um texto, uma palavra a ser substituída e uma nova palavra, exiba o texto com as substituições realizadas.
            Se a palavra a ser substituída não for encontrada no texto, o programa deve informar ao usuário que a palavra não foi encontrada e encerrar a execução.
        */



        //  REPLACE -> SUBSTITUI UMA PALAVRA ESCOLHIDA DA FRASE POR OUTRA Q DESEJAR.

        /*
            EX DE SAÍDA:
                Digite uma frase:
                O gato caça o rato.

                Digite a palavra da frase que deseja substituir:
                gato

                Digite a nova palavra que deseja colocar no lugar da substituida:
                cachorro

                Saída:
                O cachorro caça o rato.
        */


        Scanner sc = new Scanner(System.in);
        String frase, palavraSubstituida, palavraNova;
        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        System.out.println("Digite a palavra da frase que deseja substituir: ");
        palavraSubstituida = sc.nextLine();

        System.out.println("Digite a nova palavra que deseja colocar no lugar da substituida: ");
        palavraNova = sc.nextLine();

        System.out.println(frase.replace(palavraSubstituida, palavraNova));

    }
}
