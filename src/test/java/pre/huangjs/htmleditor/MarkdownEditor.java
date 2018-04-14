package pre.huangjs.htmleditor;

import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class MarkdownEditor {
    private TextFlow markdownEditor;

    public TextFlow getMarkdownEditor() {
        return markdownEditor;
    }

    public MarkdownEditor() {
        this.markdownEditor = new TextFlow();
        create();
    }

    public void create(){
        Text text1 = new Text("Big italic red text");
        text1.setFill(Color.RED);
        text1.setFont(Font.font("Helvetica", FontPosture.ITALIC, 40));
        Text text2 = new Text(" little bold blue text");
        text2.setFill(Color.BLUE);
        text2.setFont(Font.font("Helvetica", FontWeight.BOLD, 10));
        markdownEditor.getChildren().addAll(text1, text2);
    }
}
