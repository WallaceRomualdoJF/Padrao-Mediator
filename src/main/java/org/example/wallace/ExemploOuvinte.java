package org.example.wallace;

public class ExemploOuvinte implements OuvinteEvento {
    private String nome;
    private boolean foiChamado;

    public ExemploOuvinte(String nome) {
        this.nome = nome;
    }

    @Override
    public void onEvento(String tipoEvento, Object dados) {
        if (tipoEvento.equals("eventoExemplo")) {
            // Lógica específica para lidar com o evento "eventoExemplo"

            String mensagem = String.format("Ouvinte %s recebeu evento %s com dados: %s", nome, tipoEvento, dados);
        } else if (tipoEvento.equals("eventoAcaoRealizada")) {
            // Lógica específica para lidar com o evento "eventoAcaoRealizada"

            String mensagem = String.format("Ouvinte %s recebeu evento %s com dados: %s", nome, tipoEvento, dados);
        } else {
            // Lógica para lidar com outros eventos não especificados

            String mensagem = String.format("Ouvinte %s recebeu evento não reconhecido: %s", nome, tipoEvento);
        }
    }

    public boolean foiChamado() {
        return this.foiChamado;
    }
}
