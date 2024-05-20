package iphone;

import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar(){
        System.out.println("Tocando música...");
    }
    public void pausar(){
        System.out.println("Pausando música...");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música...");
    }

    public void ligar(String numero) {
        System.out.println("ligando...");
    }
    public void atender() {
        System.out.println("atendendo...");
    }
    public void iniciarCorreioVoz(String musica) {
        System.out.println("Iniciando Correio de Voz...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo Página...");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }
}
