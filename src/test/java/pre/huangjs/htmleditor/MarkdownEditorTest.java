package pre.huangjs.htmleditor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MarkdownEditorTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MarkdownEditor markdownEditor = new MarkdownEditor();

        Scene scene = new Scene(markdownEditor.getMarkdownEditor(), 900, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Markdown MarkdownEditor");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
