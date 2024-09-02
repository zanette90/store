package br.com.alan.store.model;

import javax.swing.text.html.HTMLEditorKit;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Menu {
    Scanner leitor = new Scanner(System.in);
    public void mostraMenu() throws ParseException{
        int opcao = 0;
        try {
            do {
                System.out.println("1.Cadastrar Usuario");
                System.out.println("2.Registrar Solicitacao de tarefa");
                System.out.println("3.sair");
                System.out.println();
                System.out.println("Digite uma opção: ");

                opcao = leitor.nextInt();
                switch (opcao){
                    case 1:
                        System.out.println("deu certo");

                        break;
                    case 2:
                        System.out.println("deu certo");
                        break;
                    case 3:
                        System.out.println("Até logo!!!");
                        opcao =3;
                    default:
                        System.out.println("Opcao inválida! Verifique.");
                        break;
                }
            } while (opcao != 3);
        }catch (InputMismatchException e){
            System.out.println("Error " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Digite apenas numeros");
        }
        finally {
            leitor.close();
        }
    }
}
