package pre.huangjs.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import org.fxmisc.flowless.VirtualizedScrollPane;

/**
 * Created by huangjs on 2018/4/11.
 */
public class MyMarkdown extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        setGridPane(root);

        // menu bar
        MenuBar menuBar = MyMenuBar.create();
        root.add(menuBar, 0, 0, 3, 1);

        // helper

        // file navigation


        // editor area
        Editor editor = new Editor();
        root.add(new VirtualizedScrollPane(editor.getCodeArea()), 1, 2);

        // preview area
        Preview preview = new Preview();
        root.add(preview.browserNode(), 2, 2);
        Scene scene = new Scene(root);
        scene.getStylesheets().add(MyMarkdown.class.getResource("/java-keywords.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Markdown");
        primaryStage.show();

    }

    private void setGridPane(GridPane gridPane){
        RowConstraints menuRow = new RowConstraints(20, 20, 20);
        RowConstraints helperRow = new RowConstraints(30, 30, 30);
        RowConstraints editorRow = new RowConstraints(800, 800, 800);
        gridPane.getRowConstraints().addAll(menuRow, helperRow, editorRow);

        ColumnConstraints fileNavigationCol = new ColumnConstraints(40, 40, 40);
        ColumnConstraints editorCol = new ColumnConstraints(400, 400, 400);
        ColumnConstraints previewCol = new ColumnConstraints(400, 400, 400);
        gridPane.getColumnConstraints().addAll(fileNavigationCol, editorCol, previewCol);
    }


}
