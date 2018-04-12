package pre.huangjs.view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * Created by huangjs on 2018/4/12.
 */
public class PreviewTest extends Application{
    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Preview preview = new Preview();
        BorderPane pane = new BorderPane(preview.browserNode());
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>(){

            @Override
            public void handle(WindowEvent event) {
                preview.close();
                System.exit(0);
            }
        } );
        primaryStage.show();
    }
}
