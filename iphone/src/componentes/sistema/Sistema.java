package componentes.sistema;

import componentes.navegador.NavegadorInternet;
import componentes.reprodutormusical.ReprodutorMusical;
import componentes.telefonico.AparelhoTelefonico;

public class Sistema implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    private boolean estaTocando;
    private String musicaSelecionada;

    // Construtor da classe Sistema para inicializar os atributos
    public Sistema () {
        this.musicaSelecionada = "";
        this.estaTocando = false;

    }
    // Navegador de Internet
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    public void exibirPagina(String url) {
        System.out.println("URL inserido. Carregando '" + url + "'");
        System.out.println("Página carregada.");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Reprodutor de Músicas
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada '" + musica + "'");
        this.musicaSelecionada = musica;
    }
    public void tocar() {
        if (musicaSelecionada.isEmpty()) {
            System.out.println("Música não selecionada.");
            return;
        }
        else if (estaTocando) {
            System.out.println("Música já está sendo tocada.");
            return;
        }
        System.out.println("Tocando música.");
        this.estaTocando = true;
    }
    public void pausar() {
        if (musicaSelecionada.isEmpty()) {
            System.out.println("Música não selecionada.");
            return;
        }
        else if (!estaTocando) {
            System.out.println("Música já está pausada.");
            return;
        }
        System.out.println("Música pausada.");
        this.estaTocando = false;
    }

    // Telefone
    public void ligar(String numero) {
        System.out.println("Ligando para '" + numero + "'");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado.");
    }
    public void atender() {
        System.out.println("Chamada atendida.");
    }
}
