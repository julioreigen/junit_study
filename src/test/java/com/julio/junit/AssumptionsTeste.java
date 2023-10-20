package com.julio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioNormal() {
        // Executa o teste apenas se o USER do sistema não for 'root'
        Assumptions.assumeFalse("julio".equalsIgnoreCase(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
