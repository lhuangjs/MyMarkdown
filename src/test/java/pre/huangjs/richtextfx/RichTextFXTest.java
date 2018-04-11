package pre.huangjs.richtextfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.InlineCssTextArea;

/**
 * Created by huangjs on 2018/4/11.
 */
public class RichTextFXTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        InlineCssTextArea InlineCssTextAreaarea = new InlineCssTextArea();
        CodeArea area = new CodeArea();
        VBox vbox = new VBox(area);
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));

        primaryStage.setScene(new Scene(vbox, 700, 350));
        primaryStage.show();
        primaryStage.setTitle("RichTextFXTest");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
