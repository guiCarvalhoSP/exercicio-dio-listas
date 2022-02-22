package exercicios.ex2;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Suspeito {

    public void resolucaoExercicio(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Você está sendo investigado por um assassinato, responda as perguntas a seguir com s - sim ou n - nao, para as seguintes perguntas:\n");

        List<String> perguntas = new ArrayList<>();

        System.out.println("Telefonou para a vítima? ");
        perguntas.add(scan.next());

        System.out.println("\nEsteve no local do crime? ");
        perguntas.add(scan.next());

        System.out.println("\nMora perto da vítima? ");
        perguntas.add(scan.next());

        System.out.println("\nDevia para a vítima? ");
        perguntas.add(scan.next());

        System.out.println("\nJá trabalhou com a vítima? ");
        perguntas.add(scan.next());

        Iterator<String> iterator = perguntas.iterator();

        int respostasPositivas = 0;
        while (iterator.hasNext()){
            String resposta = iterator.next();
            if (resposta.contains("s") || resposta.contains("sim"))
                respostasPositivas++;
        }

        switch (respostasPositivas){
            case 2:
                System.out.println("Você é considerado suspeito.");
                break;
            case 3:
            case 4:
                System.out.println("Você é considerado um cúmplice.");
                 break;
            case 5:
                System.out.println("Você é considerado o assassino.");
            default:
                System.out.println("Você é considerado inocente.");
        }
    }
}
