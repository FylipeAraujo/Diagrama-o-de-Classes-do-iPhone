public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Exemplo de uso das funções
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música A");

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarConversaVoz();

        iphone.exibirPagina("https://www.exemplo.com");
        iphone.adicionarNovaAba("https://www.novapagina.com");
        iphone.atualizarPagina();
    }
}
