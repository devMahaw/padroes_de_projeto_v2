package br.com.mdantas.adapter;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        String file = "teste.txt";
        DropBox dropBox = new DropBox();
        IPersistenciaArquivos arquivos = new DropBoxAdapter(dropBox);
        arquivos.gravar(new File(file));
    }
}
