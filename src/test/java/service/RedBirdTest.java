package service;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;

public class RedBirdTest {

    private Bird bird; // referenciación
    private ByteArrayOutputStream out;

    @Before
    public void before() {
        bird = new RedBird(); // instanciación
        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void testLaunchBird() {
        bird.launchBird();
        boolean esperado = true;
        boolean obtenido = out.toString().toLowerCase().contains("redbird");
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "RedBird";
        String obtenido = bird.toString();
        assertEquals(esperado, obtenido);
    }
}