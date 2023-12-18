// import com.comp301.a09akari.controller.ClassicMvcController;
// import com.comp301.a09akari.model.Model;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.stage.Stage;
// import org.junit.jupiter.api.Test;
// import org.testfx.framework.junit5.ApplicationTest;
// import static org.junit.jupiter.api.Assertions.*;
// import static org.hamcrest.MatcherAssert.assertThat;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.testfx.matcher.control.LabeledMatchers.hasText;
// import com.comp301.a09akari.controller.*;
// import com.comp301.a09akari.model.*;
// import com.comp301.a09akari.view.*;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// class MessageViewTest extends ApplicationTest {

//     private ClassicMvcController controller;
//     private Model model;
//     private MessageView messageView;

//     @Override
//     public void start(Stage stage) {
//         controller = new ClassicMvcController() {
//             @Override
//             public double getElapsedTime() {
//                 return 0; // Implement as needed for testing
//             }

//             // Implement other methods as needed for testing
//         };

//         model = new Model() {
//             // Implement as needed for testing
//         };

//         messageView = new MessageView(controller, model);
//         Scene scene = new Scene(messageView.render(), 400, 400);
//         stage.setScene(scene);
//         stage.show();
//     }

//     @Test
//     void renderSolved() {
//         // Test the render method when the puzzle is solved
//         model.setActivePuzzleIndex(0); // Set the active puzzle index for testing
//         assertTrue(model.isSolved());

//         Label message = lookup("#messageLabel").query();
//         assertNotNull(message);
//         assertThat(message, hasText("Congrats! You solved Puzzle 1 out of 1 "));
//     }

//     @Test
//     void renderNotSolved() {
//         // Test the render method when the puzzle is not solved
//         model.setActivePuzzleIndex(0); // Set the active puzzle index for testing
//         assertFalse(model.isSolved());

//         Label message = lookup("#messageLabel").query();
//         assertNotNull(message);
//         assertThat(message, hasText("Sorry, Puzzle 1 out of 1 has not been solved."));
//     }


// }