import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void notificacaoAceleracaoAlta(){
        Acelerar aceleracaoAlta = new aceleracaoAlta();
        String resultado = aceleracaoAlta.acelerar();
        assertEquals("Cuidado!!! você está acima de 120 km/h", resultado);
    }

}
