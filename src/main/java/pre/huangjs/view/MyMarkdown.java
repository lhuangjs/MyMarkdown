package pre.huangjs.view;

import javafx.application.Application;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

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

        // editor area

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
