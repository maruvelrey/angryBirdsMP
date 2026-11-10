package service;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;

public class BirdTest {

    private Bird bird; // referenciación
    private ByteArrayOutputStream out;

    @Before
    public void before() {
        bird = new Bird() {
            @Override
            public void setObjective() {
                System.out.println("Objetivo de prueba fijado.");
            }

            @Override
            public void activateSpecialAbility() {
                System.out.println("Habilidad de prueba activada.");
            }

            @Override
            public String toString() {
                return "Bird";
            }
        };

        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void testLaunchBird() {
        bird.launchBird();
        boolean esperado = true;
        boolean obtenido = out.toString().toLowerCase().contains("objetivo");
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "Bird";
        String obtenido = bird.toString();
        assertEquals(esperado, obtenido);
    }
}