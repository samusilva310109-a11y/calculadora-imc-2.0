package br.senai.sp.jandira.ds1t.calculadoraimc.model;

import java.util.Scanner;

public class Imc {
    String nomeDoAluno;
    double pesoDoPaciente;
    double alturaDoPaciente;
    double resultadoImc;
    String situacaoCorporal;

    public void inserirDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome do paciente: ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Insira o peso do paciente(Kg): ");
        pesoDoPaciente = leitor.nextDouble();

        System.out.print("Insira a altura do paciente(cm): ");
        alturaDoPaciente = leitor.nextDouble();

        leitor.close();
        System.out.println("-----------------------------");
    }
    public void calcularImc(){
        double alturaAoQuadrado = alturaDoPaciente * alturaDoPaciente;
        resultadoImc = pesoDoPaciente / alturaAoQuadrado;

    }
    public void definirSituacaoDoPaciente(){
        if (resultadoImc < 18.5){
            situacaoCorporal = "abaixo do peso";
        } else if (resultadoImc >=18.5) {
            
        }
    }



}
