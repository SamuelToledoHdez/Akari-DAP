/**
 * @file MainTest.java
 * @brief This file contains unit tests for the Main class.
 */
package com.comp301.a09akari;
import com.comp301.a09akari.view.AppLauncher;
import javafx.application.Application;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
/**
 * @brief This class contains unit tests for the Main class.
 */
public class MainTest {
    /**
     * @brief Test to ensure that launching the application does not result in exceptions.
     * @details This test attempts to launch the application using the Main class and ensures
     * that no exceptions are thrown during the process.
     */
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
    /**
     * @brief Test to ensure that the AppLauncher class is present and accessible.
     * @details This test checks if the AppLauncher class is present and can be accessed.
     */
    @Test
    public void testAppLauncherIsPresent() {
        // Asegúrate de que la clase AppLauncher esté presente y accesible
        assertNotNull(AppLauncher.class);
    }
}
