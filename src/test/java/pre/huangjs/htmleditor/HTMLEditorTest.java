package pre.huangjs.htmleditor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class HTMLEditorTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        HTMLEditor htmlEditor = new HTMLEditor();

        Scene scene = new Scene(htmlEditor);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
