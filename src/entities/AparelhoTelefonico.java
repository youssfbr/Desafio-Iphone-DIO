package entities;

import interfaces.IAparelhoTelefonico;

public class AparelhoTelefonico implements IAparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo mensagem");
    }
}
