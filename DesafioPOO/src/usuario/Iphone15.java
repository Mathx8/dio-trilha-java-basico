package usuario;

import iphone.Iphone;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone15 {
    public static void main(String[] args) {
        Iphone ip = new Iphone();

        ReprodutorMusical tocar = ip;
        ReprodutorMusical pausar = ip;
        ReprodutorMusical selecionarMusica = ip;

        tocar.tocar();
        pausar.pausar();
        selecionarMusica.selecionarMusica(null);

        AparelhoTelefonico ligar = ip;
        AparelhoTelefonico atender = ip;
        AparelhoTelefonico iniciarCorreioVoz = ip;

        ligar.ligar(null);
        atender.atender();
        iniciarCorreioVoz.iniciarCorreioVoz(null);

        NavegadorInternet exibirPagina = ip;
        NavegadorInternet adicionarAba = ip;
        NavegadorInternet atualizarPagina = ip;

        exibirPagina.exibirPagina(null);
        adicionarAba.adicionarNovaAba();
        atualizarPagina.atualizarPagina();
    }
}
