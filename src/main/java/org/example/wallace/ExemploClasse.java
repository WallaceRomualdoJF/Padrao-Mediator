package org.example.wallace;

class ExemploClasse {
    private MediadorEventos mediadorEventos;

    public ExemploClasse(MediadorEventos mediadorEventos) {
        this.mediadorEventos = mediadorEventos;
    }

    public void fazerAlgo() {
        // Lógica para executar uma ação

        // Publica um evento para o mediador
        mediadorEventos.publicar("eventoExemplo", "dados do evento");
    }
}
