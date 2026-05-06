import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExRegexHashtag {
    public static void main(String[] args) {

        /*Patrícia está desenvolvendo um sistema de análise de redes sociais e precisa extrair todas as hashtags de um texto. Ela quer um programa que encontre todas as palavras que começam com "#".

        Crie um programa que receba um texto e exiba todas as hashtags encontradas.*/



        String texto = "Olá #mundo! Estou aprendendo #Java e #programação.";
        Pattern pattern = Pattern.compile("#[a-zA-Záàâãéèêíïóôõöúç]+");
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find() ){
            System.out.println(matcher.group());
        }



        // SEGUNDA FORMA, EXTRAIDO O SIMBOLO DE CERQUILHA E IMPRIMINDO APENAS A PALAVRA

        String texto2 = "Olá #mundo! Estou aprendendo #Java e #programação.";

        // Adicionamos parênteses ( ) em volta da parte do texto
        Pattern pattern2 = Pattern.compile("#([a-zA-Záàâãéèêíïóôõöúç]+)");
        Matcher matcher2 = pattern2.matcher(texto);

        System.out.println("Hashtags encontradas:");

        while (matcher2.find()) {
            // matcher.group(0) -> traz o texto completo: "#mundo"
            // matcher.group(1) -> traz apenas o que está nos parênteses: "mundo"
            System.out.println("Palavra isolada: " + matcher2.group(1));
        }

    }
}
