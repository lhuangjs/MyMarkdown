package pre.huangjs.old;

import javafx.scene.control.TextArea;

public class MarkdownEditor{
	private TextArea editor;
	
	public TextArea getEditor() {
		return editor;
	}

	public MarkdownEditor() {
		super();
		this.editor = new TextArea();
		this.editor.setPrefSize(800, 900);
		this.editor.setWrapText(true);
	}
	
	public void addChangeListener(HtmlPreview preview) {
	this.editor.textProperty().addListener((obs, oldValue, newValue) -> {
			preview.setMarkdownContent(this.editor.getText());
		});
	}
	
}
