package br.senai.sp.jandira.ds1t.calculadoraimc;

import br.senai.sp.jandira.ds1t.calculadoraimc.model.Imc;

public class ImcApp {
    public static void main(String[] args) {
        System.out.println("Inicializando o aplicativo...");

        Imc starter = new Imc();

        starter.inserirDados();

    }
}
