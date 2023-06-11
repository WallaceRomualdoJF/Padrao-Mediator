package org.example.wallace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediadorEventos {
    private Map<String, List<OuvinteEvento>> ouvintes;

    public MediadorEventos() {
        this.ouvintes = new HashMap<>();
    }

    public void inscrever(String tipoEvento, OuvinteEvento ouvinte) {
        List<OuvinteEvento> listaOuvintes = ouvintes.getOrDefault(tipoEvento, new ArrayList<>());
        listaOuvintes.add(ouvinte);
        ouvintes.put(tipoEvento, listaOuvintes);
    }

    public void cancelarInscricao(String tipoEvento, OuvinteEvento ouvinte) {
        List<OuvinteEvento> listaOuvintes = ouvintes.getOrDefault(tipoEvento, new ArrayList<>());
        listaOuvintes.remove(ouvinte);
        ouvintes.put(tipoEvento, listaOuvintes);
    }

    public void publicar(String tipoEvento, Object dados) {
        List<OuvinteEvento> listaOuvintes = ouvintes.getOrDefault(tipoEvento, new ArrayList<>());
        for (OuvinteEvento ouvinte : listaOuvintes) {
            ouvinte.onEvento(tipoEvento, dados);
        }
    }
}
