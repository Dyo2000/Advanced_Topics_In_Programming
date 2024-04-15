package panes;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import static javafx.application.Platform.exit;
/**
 * This is the ErrorPane Class
 * This class has the ErrorPane constructor that creates a vbox  with a center alignment with a button
 * when the button is pressed the application closes
 */
public class ErrorPane extends VBox {

    /**
     * This is the ErrorPane constructor that displays an errorMessage in a VBox
     * It also has an Ok button that when pressed closes the application
     * @param errorMessage
     */
    public ErrorPane(String errorMessage) {

        Button button1 = new Button("Ok");
        Label label = new Label(errorMessage);
        this.setAlignment(Pos.CENTER);
        this.getChildren().add(label);
        this.getChildren().add(button1);

        button1.setOnAction((ActionEvent event) -> {
            exit(); //exits the application when the button is pressed
        });



    }
}
