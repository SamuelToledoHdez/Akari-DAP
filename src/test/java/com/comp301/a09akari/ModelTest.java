juandixp
juandixp
En línea

Ayana
BOT
 — 10/12/2023 17:24
:no_entry_sign: Left channel due to inactivity.
Ayana
BOT
 — 11/12/2023 21:11
:white_check_mark: Joined :speaker:clases. 
:notes: METAMORPHOSIS
2 minutes 22 seconds
Ayana
BOT
 — 11/12/2023 21:16
Queued Babydoll X The perfect girl ( full version) to position 13. 
:notes: Babydoll X The perfect girl ( full version)
2 minutes 15 seconds
Ayana
BOT
 — 11/12/2023 21:19
Queued The Perfect Girl to position 14. 
:notes: The Perfect Girl
3 minutes 14 seconds
JΛVIGBΛ — 11/12/2023 21:21
WAIT
Ayana
BOT
 — 11/12/2023 21:24
Queued GigaChad Theme (Phonk House Version) to position 15. 
:notes: GigaChad Theme (Phonk House Version)
2 minutes 26 seconds
Ayana
BOT
 — 11/12/2023 21:27
Queued GENESIS to position 16. 
:notes: GENESIS
2 minutes 42 seconds
Ayana
BOT
 — 11/12/2023 21:27
:stop_button: Playback stopped.
Ayana
BOT
 — 11/12/2023 21:28
Queued BRAVO 1 - 2 - GENESIS [EXTENDED] to position 17. 
:notes: BRAVO 1 - 2 - GENESIS [EXTENDED]
2 minutes 36 seconds
Ayana
BOT
 — 11/12/2023 21:30
Queued After Dark x Sweater Weather to position 18. 
:notes: After Dark x Sweater Weather
4 minutes 48 seconds
Ayana
BOT
 — 11/12/2023 21:46
:no_entry_sign: Left channel due to inactivity.
JΛVIGBΛ — 11/12/2023 22:06
Tipo de archivo adjunto: archive
Practica7.zip
10.03 KB
JΛVIGBΛ — 12/12/2023 17:54
hola
JΛVIGBΛ — 12/12/2023 18:11
https://app.diagrams.net/#G1bPkWoi6SEGCGjA9DZR1NL7mFlP93QURC
JΛVIGBΛ — 12/12/2023 18:48
Unidad de Hematología/Oncología e Inmunología.
Unidad Quirúrgica/Ortopédica Pediátrica.
Unidad de Psiquiatría.
Unidad de Neurología y Neurocirugía.
Unidad de Nefrología/Gastroenterología/Endocrinología.
Unidad Respiratoria.
Unidad Quirúrgica Médica Cardíaca.
juandixp — 13/12/2023 16:36
Imagen
juandixp — 13/12/2023 16:44
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MainTest {

    @Test
Expandir
message.txt
1 KB
try {
    .....
} catch (ExceptionNotToThrow e) {
    Assertions.fail(e)
} catch (Exception e) {
    // this is expected
Expandir
message.txt
1 KB
juandixp — 13/12/2023 16:52
import static org.junit.jupiter.api.Assertions.fail;
JΛVIGBΛ — 13/12/2023 16:54
ExceptionNotToThrow cannot be resolved to a typeJava(16777218)
juandixp — 13/12/2023 16:58
import com.comp301.a09akari.controller.ClassicMvcController;
import com.comp301.a09akari.model.Model;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
Expandir
message.txt
2 KB
import com.comp301.a09akari.controller.ClassicMvcController;
import com.comp301.a09akari.model.Model;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
Expandir
message.txt
3 KB
juandixp — 13/12/2023 17:14
Application.launch(AppLauncher.class);
import javafx.application.Application;
JΛVIGBΛ — 13/12/2023 17:14
Application cannot be resolvedJava(570425394
Errors: 
[ERROR]   ViewTest.render » Runtime No toolkit found
juandixp — 13/12/2023 17:25
import com.comp301.a09akari.view.TimeDisplayViewImpl;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
Expandir
message.txt
2 KB
JΛVIGBΛ — 13/12/2023 17:31
Label cannot be resolved to a typeJava(16777218)
juandixp — 13/12/2023 17:32
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeDisplayViewImplTest {

    @Test
Expandir
message.txt
1 KB
juandixp — 13/12/2023 21:58
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SamplePuzzlesTest {

    @Test
Expandir
message.txt
1 KB
juandixp — 13/12/2023 22:08
<dependency>
        <groupId>org.testfx</groupId>
        <artifactId>testfx-core</artifactId>
        <version>4.1.0</version> <!-- Asegúrate de utilizar la versión más reciente -->
        <scope>test</scope>
    </dependency>
Expandir
message.txt
1 KB
JΛVIGBΛ — 13/12/2023 22:09
Missing artifact org.testfx:testfx-core🫙4.1.0Java(0)
juandixp — 13/12/2023 22:13
@Override
    public void start(Stage stage) {
        // Inicia la aplicaciÃ³n JavaFX
        new Main().main(new String[]{});
    }
message.txt
1 KB
JΛVIGBΛ — 13/12/2023 22:14
The method start(Stage) of type MainTest must override or implement a supertype methodJava(67109498)
juandixp — 13/12/2023 22:15
@Test
    public void testMain() {
        // Espera a que la aplicación se inicie completamente
        sleep(2000);

        // Realiza aserciones en la interfaz de usuario si es necesario
Expandir
message.txt
1 KB
JΛVIGBΛ — 13/12/2023 22:17
The static method main(String[]) from the type Main should be accessed in a static wayJava(603979893)
JΛVIGBΛ — 13/12/2023 22:30
[ERROR] com.comp301.a09akari.MainTest.start(Stage)  Time elapsed: 0.002 s  <<< ERROR!
org.junit.jupiter.api.extension.ParameterResolutionException: No ParameterResolver registered for parameter [javafx.stage.Stage arg0] in method [public void com.comp301.a09akari.MainTest.start(javafx.stage.Stage)].
[ERROR] com.comp301.a09akari.MainTest.start  Time elapsed: 0.093 s  <<< ERROR!
java.lang.RuntimeException: No toolkit found
juandixp — 13/12/2023 22:37
<dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>3.12.4</version>
        <scope>test</scope>
</dependency>
message.txt
1 KB
JΛVIGBΛ — 13/12/2023 22:38
hola?
juandixp — 13/12/2023 22:39
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class TimerTest {
Expandir
message.txt
2 KB
JΛVIGBΛ — 13/12/2023 22:42
[ERROR] com.comp301.a09akari.TimerTest.testTimer  Time elapsed: 0.519 s  <<< ERROR!
java.lang.RuntimeException: No toolkit found
    at com.comp301.a09akari.TimerTest.testTimer(TimerTest.java:19)
juandixp — 13/12/2023 22:46
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.testfx.framework.junit5.ApplicationExtension;
Expandir
message.txt
2 KB
juandixp — hoy a las 21:30
} else if (activePuzzle.getCellType(r, c) != CellType.CLUE) {
      throw new IllegalArgumentException();
    }
JΛVIGBΛ — hoy a las 21:44
package com.comp301.a09akari;
import com.comp301.a09akari.model.*;
import org.junit.jupiter.api.Test;


import com.comp301.a09akari.controller.*;
Expandir
ModelTest.java
3 KB
﻿
package com.comp301.a09akari;
import com.comp301.a09akari.model.*;
import org.junit.jupiter.api.Test;


import com.comp301.a09akari.controller.*;
import com.comp301.a09akari.view.*;
import static org.junit.jupiter.api.Assertions.*;



class ModelTest {

    @Test
    void testAddLamp() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir una lámpara a una celda válida
        model.addLamp(0, 0);

        // Verificar que la lámpara se haya añadido correctamente
        assertTrue(model.isLamp(0, 0));
    }

    @Test
    void testRemoveLamp() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir y luego quitar una lámpara
        model.addLamp(2, 1);
        assertTrue(model.isLamp(2, 1));

        model.removeLamp(2, 1);
        assertFalse(model.isLamp(2, 1));
    }

    @Test
    void testIsLit() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir lámparas para iluminar una celda
        model.addLamp(0, 0);
        model.addLamp(1, 0);
        assertTrue(model.isLit(0, 0));
        assertTrue(model.isLit(1, 0));
    }

    @Test
    void testIsLampIllegal() {
        // Crear una implementación de Model para las pruebas
        PuzzleLibrary library = new PuzzleLibraryImpl();
        Puzzle puzzle = new PuzzleImpl(SamplePuzzles.PUZZLE_05);
        library.addPuzzle(puzzle);

        Model model = new ModelImpl(library);

        // Añadir lámparas y verificar si están ilegalmente colocadas
        model.addLamp(0, 0);
        model.addLamp(1, 0);
        assertTrue(model.isLampIllegal(1, 0));
    }

    // Agregar más pruebas para los demás métodos de la interfaz Model

}
ModelTest.java
3 KB
