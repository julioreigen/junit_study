package com.julio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("18542-6", 100);
        Conta contaDestino = new Conta("46521-5", 100);

        TransferenciaEntreContas transferenciaEntreContas =
                new TransferenciaEntreContas();

        // Verifica se lançou exceção com dados inválidos
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

        // Verifica se não lançou exceção com dados corretos
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));

    }
}
