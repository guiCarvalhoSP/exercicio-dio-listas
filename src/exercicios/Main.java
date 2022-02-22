package exercicios;

import exercicios.ex1.Temperatura;
import exercicios.ex2.Suspeito;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String opcaoSelecionada = JOptionPane.showInputDialog(null,
                "Escolha qual exercicio você deseja ver a resolução? 1 - (Temperatura), 2 - (Suspeito), para sair digite qualquer outro valor.", "Resolução do exercicio",
                JOptionPane.INFORMATION_MESSAGE);

        switch(opcaoSelecionada){
            case "1":
                Temperatura exercicio1 = new Temperatura();
                exercicio1.resolucaoExercicio();
                break;
            case "2":
                Suspeito exercicio2 = new Suspeito();
                exercicio2.resolucaoExercicio();
                break;
            default:
                System.out.println("Programa encerrado"); break;

        }

    }
}
