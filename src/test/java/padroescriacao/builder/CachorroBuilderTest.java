package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CachorroBuilderTest {



    @Test
    void deveRetornarExcecaoParaCachorroSemNome() {
        try {
            CachorroBuilder cachorroBuilder = new CachorroBuilder();
            Cachorro cachorro = cachorroBuilder
                    .setIdade(20)
                    .setNome("")
                    .setRaca("Caramelo")
                    .setCor("Amarelo")
                    .setPorte("Comprido")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarCachorroCadastrado() {
        CachorroBuilder cachorroBuilder = new CachorroBuilder();
        Cachorro cachorro = cachorroBuilder
                .setIdade(20)
                .setNome("Slinky")
                .setRaca("Caramelo")
                .setCor("Amarelo")
                .setPorte("Comprido")
                .build();

        assertNotNull(cachorro);
    }






}