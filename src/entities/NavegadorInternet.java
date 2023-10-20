package entities;

import interfaces.INavegadorInternet;

public class NavegadorInternet implements INavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na Internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página");
    }
}
