package br.com.mdantas.adapter;

import java.io.File;

public interface IPersistenciaArquivos {

    public void gravar(File file);

    public File ler(String caminho);
}
