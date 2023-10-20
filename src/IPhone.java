import entities.AparelhoTelefonico;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;

public class IPhone {
    public static void main(String[] args) {

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }



}