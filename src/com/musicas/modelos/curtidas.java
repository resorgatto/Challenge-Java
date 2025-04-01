package com.musicas.modelos;

public class curtidas {

    public void inclui(audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " preferido no momento");
        }else{
            System.out.println(audio.getTitulo() + " também em alta");
        }
    }
}
