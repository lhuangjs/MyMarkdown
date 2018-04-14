package pre.huangjs.temp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.List;

public class FontFamaiyTest extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        List<String> fontFamilies = Font.getFamilies();
        TextFlow tf = new TextFlow();
        for(String family : fontFamilies){

            Text text0 = new Text(family + "\t");
            text0.setFont(Font.font(family, 16));

            Text text1 = new Text("默认\t");
            text1.setFont(Font.font(family, 16));

            Text text2 = new Text("粗体\t");
            text2.setFont(Font.font(family, FontWeight.BOLD, 16));

            Text text3 = new Text("斜体\n");
            text3.setFont(Font.font(family, FontPosture.ITALIC, 16));

            tf.getChildren().addAll(text0, text1, text2, text3);
        }

        Scene scene = new Scene(new ScrollPane(tf), 800, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
