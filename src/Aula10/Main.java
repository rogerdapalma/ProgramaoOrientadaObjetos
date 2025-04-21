package Aula10;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.setNome("fusca");
        c.exibirMensagem();
       // c.nome = "fuica";

        Onibus o = new Onibus();
        o.setNome("expresso");
        o.setModelo("OF-345");
        o.exibirMensagem();

        System.out.println("o nome do carro: " + c.getNome());

        System.out.printf("nome do onibus :" + o.getNome());
        System.out.println("o modelo do onibus: " + o.getModelo());

    }
}
