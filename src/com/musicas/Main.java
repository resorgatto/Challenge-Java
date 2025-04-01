package com.musicas;

import com.musicas.modelos.curtidas;
import com.musicas.modelos.musica;
import com.musicas.modelos.podcast;

public class Main {
    public static void main(String[] args) {
        musica BetterNow = new musica();
        BetterNow.setTitulo("Better Now");
        BetterNow.setArtista("Post Malone");
        BetterNow.setAlbum("beerbongs & bentleys");

        for (int i = 0; i < 1000; i++) {
            BetterNow.reproduz();
            
        }
        for (int i = 0; i < 50; i++) {
            BetterNow.curte();

        }

        podcast exp = new podcast();
        exp.setTitulo("Curso em Vídeo Experience");
        exp.setHost("Gustavo Guanabara");

        for (int i = 0; i < 5000; i++) {
            exp.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            exp.curte();
        }

        curtidas like = new curtidas();
        like.inclui(exp);
        like.inclui(BetterNow );
    }
}