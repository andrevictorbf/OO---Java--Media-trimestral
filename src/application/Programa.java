package application;

import entities.*;
import java.util.*;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("<---------Calculadora de media trimestral--------->");
        Aluno discente;
        discente = new Aluno();
        System.out.println("Insira o nome do aluno: ");
        discente.setNome(input.nextLine());

        System.out.println("Insira a nota do 1º trimestre: ");
        discente.setNota1(input.nextFloat());
        System.out.println("Insira a nota do 2º trimestre: ");
        discente.setNota2(input.nextFloat());
        System.out.println("Insira a nota do 3º trimestre: ");
        discente.setNota3(input.nextFloat());

        System.out.printf("A nota final do aluno %s foi: %.2f.\n", discente.getNome(), discente.mediaTrime());
        System.out.println();

        if (discente.mediaTrime() < 21.0) {
            System.out.printf("O aluno %s está retido.\n", discente.getNome());
            System.out.printf("É preciso %.2f na avaliacao final%n", discente.veriPassou());
        } else {
            System.out.printf("Aluno %s aprovado.\n", discente.getNome());
        }

        input.close();

    }

}
