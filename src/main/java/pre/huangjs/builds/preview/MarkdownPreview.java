package pre.huangjs.builds.preview;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.fxmisc.richtext.CodeArea;
import pre.huangjs.service.Markdown2HtmlService;

public class MarkdownPreview {

	private static WebView markdownPreview = new WebView();
	private static WebEngine webEngine = markdownPreview.getEngine();

	public static WebView display(CodeArea codeArea){
		String markdownContent = codeArea.getText();
		String htmlContent = Markdown2HtmlService.markdown2Html(markdownContent);
		webEngine.loadContent(htmlContent);
		return markdownPreview;
	}
}
