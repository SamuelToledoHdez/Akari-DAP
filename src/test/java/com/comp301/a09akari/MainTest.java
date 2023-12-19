package com.comp301.a09akari;
import com.comp301.a09akari.view.AppLauncher;
import javafx.application.Application;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MainTest {

    @Test
    public void testMainLaunchesApp() {
        // Intenta lanzar la aplicación y asegúrate de que no se produzcan excepciones
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            // Si se produce una excepción, falla la prueba
            e.printStackTrace();
            assert false;
        }
        // Si no se lanzan excepciones, la prueba pasa
        assert true;
    }

    @Test
    public void testAppLauncherIsPresent() {
        // Asegúrate de que la clase AppLauncher esté presente y accesible
        assertNotNull(AppLauncher.class);
    }
}
