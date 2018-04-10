package pre.huangjs.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MarkdownApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane root = new GridPane();
		
		// markdown editor
		MarkdownEditor editor = new MarkdownEditor();
		root.add(editor.getEditor(), 0, 1);
		
		// html preview
		HtmlPreview preview = new HtmlPreview();
		root.add(preview.getHtmlPreview(), 1, 1);
		
		// link preview to editor
		editor.addChangeListener(preview);
		
		// scene
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
