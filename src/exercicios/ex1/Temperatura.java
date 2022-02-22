package exercicios.ex1;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {

    public void resolucaoExercicio(){
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();

        System.out.println("Digite as temperaturas dos 6 primeiros mêses do ano");

        int count = 0;
        do{
            System.out.println("Digite a temperatura do mês " + (count + 1) + ":");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;

        }while(count != 3);

        double soma = 0;

        for (Double t : temperaturas) {
            soma += t;
        }

        double media = soma / temperaturas.size();
        System.out.printf("\n A media das temperaturas é: %.1f\n", media);

        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        System.out.println("\nTemperaturas acima da média:");
        while(iterator.hasNext()){
            double temp = iterator.next();
            if(temp > media){
                switch (count){
                    case 0:
                        System.out.printf("1 – Janeiro: %.1f", temp);
                        break;
                    case 1:
                        System.out.printf("2 – Fevereiro: %.1f", temp);
                        break;
                    case 2:
                        System.out.printf("3 – Março: %.1f", temp);
                        break;
                    case 3:
                        System.out.printf("4 – Abril: %.1f", temp);
                        break;
                    case 4:
                        System.out.printf("5 – Maio: %.1f", temp);
                        break;
                    case 5:
                        System.out.printf("1 – Junho: %.1f", temp);
                        break;
                    default:
                        System.out.println("Erro no sistema.");
                }
            }

            count++;
        }
    }

}
