import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExRegexSenha {
    static void main(String[] args) {

        /*Carla está desenvolvendo um sistema de cadastro de usuários e precisa validar as senhas. A senha deve ter pelo menos:

        8 caracteres
        Uma letra maiúscula
        Uma letra minúscula
        Um número
        Um caractere especial
        Crie um programa que receba uma senha e exiba uma mensagem indicando se a senha é válida ou não.*/


        Scanner sc = new Scanner(System.in);

        String senha;
        System.out.println("Requisitos de senha: 8 caracteres, Uma letra maiúscula, Uma letra minúscula, Um caractere especial, Um número.");
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();

        //REGEX CRIADO COM AUXILIO DO CHAT, N FIQUE QUEBRANDO A CABEÇA PARA MONTAR O PADRÃO SAIBA QUE EXISTE O REGEX E COMO VOCÊ QUER O PADRÃO
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[\\W_])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher matcher = pattern.matcher(senha);

        if( matcher.matches() ) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("Senha fraca de mais!");
        }

    }
}
