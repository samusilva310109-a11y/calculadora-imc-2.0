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

        System.out.print("Insira a altura do paciente(m): ");
        alturaDoPaciente = leitor.nextDouble();

        leitor.close();
        System.out.println("-----------------------------");

        calcularImc();
    }
    public void calcularImc(){
        double alturaAoQuadrado = alturaDoPaciente * alturaDoPaciente;
        resultadoImc = pesoDoPaciente / alturaAoQuadrado;

        definirSituacaoDoPaciente();

    }
    public void definirSituacaoDoPaciente(){
        if (resultadoImc < 18.5){
            situacaoCorporal = "abaixo do peso";
        } else if (resultadoImc >=18.5 && resultadoImc <= 24.9) {
            situacaoCorporal = "peso ideal (parabéns)";
        } else if (resultadoImc >= 25.0 && resultadoImc <= 29.9) {
            situacaoCorporal = "levemente acima do peso";
        } else if (resultadoImc >= 30.0 && resultadoImc <= 34.9) {
            situacaoCorporal = "obesidade grau I";
        } else if (resultadoImc >= 35.0 && resultadoImc <= 39.9) {
            situacaoCorporal = "obesidade grau II";
        }else{
            situacaoCorporal = "obesidade grau III";
        }

        exibirResultados();
    }
    public void exibirResultados(){
        System.out.println("---RESULTADO---");
        String resultadoFormatado = String.format ("%.2f", resultadoImc);
        System.out.println("Nome do aluno: " + nomeDoAluno);
        System.out.println("Imc calculado: " + resultadoFormatado);
        System.out.println("Status: " + situacaoCorporal);
        System.out.println("-----------------------------");
    }



}
