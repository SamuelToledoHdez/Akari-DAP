// package com.comp301.a09akari;
// import javafx.stage.Stage;
// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import static org.junit.jupiter.api.Assertions.*;
// import com.comp301.a09akari.controller.*;
// import com.comp301.a09akari.*;
// import com.comp301.a09akari.model.*;
// import com.comp301.a09akari.view.*;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.testfx.framework.junit5.ApplicationExtension;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// @ExtendWith(ApplicationExtension.class)
// public class TimerTest {

//     @Test
//     public void testTimer(Stage primaryStage) {
        
//         // Crea una instancia de Timer con el Stage simulado
//         Timer timer = new Timer(primaryStage);

//         // Inicia el timer simulado
//         timer.start();

//         // Espera un tiempo simulado (por ejemplo, 3 segundos)
//         sleep(3000);

//         // Detén el timer simulado
//         timer.stop();

//         // Verifica que el tiempo transcurrido sea aproximadamente 3 segundos
//         assertEquals(3.0, timer.getElapsedTime(), 0.1);
//     }

//     @Test
//     public void testShowTimeFinal(Stage primaryStage) {
//         // Crea una instancia de Timer con el Stage simulado
//         Timer timer = new Timer(primaryStage);

//         // Muestra el tiempo final simulado
//         timer.showTimeFinal();
//     }

//     // Método para simular la espera (sleep)
//     private void sleep(long milliseconds) {
//         try {
//             Thread.sleep(milliseconds);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }