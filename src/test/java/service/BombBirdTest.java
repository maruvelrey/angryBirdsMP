package service;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;

public class BombBirdTest {

    private Bird bird; // referenciación
    private ByteArrayOutputStream out;

    @Before
    public void before() {
        bird = new BombBird(); // instanciación
        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void testLaunchBird() {
        bird.launchBird();
        boolean esperado = true;
        boolean obtenido = out.toString().toLowerCase().contains("bombbird");
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "BombBird";
        String obtenido = bird.toString();
        assertEquals(esperado, obtenido);
    }
}