import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test
    void testeRegistrarPagamento() {
        Personal personal = new Personal("Ana", "P001");
        double pagamento = personal.registrarPagamento();
        assertEquals(3627.0, pagamento);
    }

    @Test
    void testeaddAulaAvulsa() {
        Personal personal2 = new Personal("Ricardo", "P002");
        double aulas = personal2.addAulaAvulsa(3.0);
        assertEquals(3.0, aulas);
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento (FEITO)
}
