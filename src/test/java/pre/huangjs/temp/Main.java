package pre.huangjs.temp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Title");

        final Circle circ = new Circle(40, 40, 30);
        final Group root = new Group(circ);

        final Scene scene = new Scene(root, 800, 400, Color.BEIGE);

        final Text text1 = new Text(25, 25, "java2s.com");
        text1.setFill(Color.CHOCOLATE);
        text1.setFont(Font.font(java.awt.Font.SERIF, 25));
        root.getChildren().add(text1);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}