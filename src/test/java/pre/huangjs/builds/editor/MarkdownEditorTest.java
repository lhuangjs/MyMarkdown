package pre.huangjs.builds.editor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import pre.huangjs.builds.editor.MarkdownEditor;

public class MarkdownEditorTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MarkdownEditor markdownEditor = new MarkdownEditor();
        CodeArea editor = markdownEditor.getMarkdownEditor();
        editor.setWrapText(true);

        // scroll pane
        VirtualizedScrollPane vsPane = new VirtualizedScrollPane(editor);
        VBox parent = new VBox(vsPane);
        VBox.setVgrow(vsPane, Priority.ALWAYS);

        Scene scene = new Scene(parent, 900, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
