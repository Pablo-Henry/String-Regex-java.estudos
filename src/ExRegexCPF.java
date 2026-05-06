import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExRegexCPF {
    public static void main(String[] args) {
        /*Roberto está desenvolvendo um sistema de cadastro de clientes e precisa validar os números de CPF fornecidos. Ele quer um programa que verifique se o CPF está no formato correto (XXX.XXX.XXX-XX).
         Crie um programa que receba um CPF e exiba uma mensagem indicando se o CPF está no formato válido.*/

        String CPF;
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite seu CPF no formato - (XXX.XXX.XXX-XX)");
        CPF = sc.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(CPF);

        if( matcher.matches() ){
            System.out.println("CPF - " + CPF + " - formato válido");
        } else {
            System.out.println("Formato inválido");
        }

    }
}
