// Amanda Mesquita Cirino da Silva RM559177
import org.example.Apdex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {
    private Apdex apdex;
    private static final double TOTAL = 559177; // Total de amostras utilizadas nos testes já fornecido

    @BeforeEach
    void init() {
        apdex = new Apdex();
    }

    @Test
    void deveRetornarExcelente() {
        double result = apdex.validarApdex(TOTAL,0,TOTAL);
        assertEquals(1, result, 0.01);
    }

    @Test
    void deveRetornarBom() {
        double result = apdex.validarApdex(490000,69177,TOTAL);
        assertEquals(0.93, result, 0.01);
    }

    @Test
    void deveRetornarRazoavel() {
        double result = apdex.validarApdex(330000,229177,TOTAL);
        assertEquals(0.79, result, 0.01);
    }

    @Test
    void deveRetornarRuim() {
        double result = apdex.validarApdex(200000,359177,TOTAL);
        assertEquals(0.67, result, 0.01);
    }

    @Test
    void deveRetornarInaceitavel() {
        double result = apdex.validarApdex(0,500000,TOTAL);
        assertEquals(0.44, result, 0.01);
    }
}
