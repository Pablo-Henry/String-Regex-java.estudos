import java.util.Scanner;

public class ExLastIndexOf_Substring {
    public static void main(String[] args) {

        /*Pedro está desenvolvendo um sistema de processamento de arquivos e precisa extrair o nome do arquivo sem a extensão.
         Crie um programa que receba o nome de um arquivo e exiba o nome sem a extensão.*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String arquivo = scanner.nextLine();

        int posicaoPonto = arquivo.lastIndexOf(".");
        if (posicaoPonto != -1) {
            String nomeSemExtensao = arquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }

        scanner.close();
    }
}
