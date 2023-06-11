package org.example.wallace;

// Classe que representa um componente do sistema
class Componente {
    private String nome;
    private MediadorEventos mediadorEventos;

    public Componente(String nome, MediadorEventos mediadorEventos) {
        this.nome = nome;
        this.mediadorEventos = mediadorEventos;
    }

    public void inscreverEvento(String tipoEvento, OuvinteEvento ouvinte) {
        mediadorEventos.inscrever(tipoEvento, ouvinte);
    }


    public void cancelarInscricaoEvento(String tipoEvento, OuvinteEvento ouvinte) {
        mediadorEventos.cancelarInscricao(tipoEvento, ouvinte);
    }

    public void publicarEvento(String tipoEvento, Object dados) {
        mediadorEventos.publicar(tipoEvento, dados);
    }
}
