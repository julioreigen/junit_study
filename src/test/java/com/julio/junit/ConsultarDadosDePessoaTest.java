package com.julio.junit;

import org.junit.jupiter.api.*;
import com.julio.junit.BancoDeDados;
import com.julio.junit.Pessoa;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Julio", LocalDate.of(2002, 4, 15)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removeDados(new Pessoa("Julio", LocalDate.of(2002, 4, 15)));
    }


    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }


    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
