package com.julio.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        // fez algo
        LOGGER.info("Iniciou conexão");
    }
    public static void finalizarConexao() {
        // fez algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        // insere pessoas no DB
        LOGGER.info("Inseriu dados");
    }
    public static void removeDados(Pessoa pessoa) {
        // remove pessoas no DB
        LOGGER.info("Removeu dados");
    }
}
