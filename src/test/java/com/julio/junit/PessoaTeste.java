package com.julio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        // Cria um cenário
        Pessoa julio = new Pessoa("Julio", LocalDate.of(2014, 1, 1));
        // Executa as validações
        Assertions.assertEquals(9, julio.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa julio = new Pessoa("Julio", LocalDate.of(2020, 1, 1));
        Assertions.assertFalse(julio.maiorDeIdade());

        Pessoa ana = new Pessoa("Ana", LocalDate.of(2002, 4, 15));
        Assertions.assertTrue(ana.maiorDeIdade());
    }
}
