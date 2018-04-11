package pre.huangjs.old;

import pre.huangjs.service.Markdown2HtmlService;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class HtmlPreview {
	private WebView htmlPreview;
	private String markdownContent;
	private String htmlContent;

	public WebView getHtmlPreview() {
		return htmlPreview;
	}

	public String getMarkdownContent() {
		return markdownContent;
	}

	public String getHtmlContent() {
		return htmlContent;
	}

	public void setMarkdownContent(String markdownContent) {
		this.markdownContent = markdownContent;
		markdown2Html();
	}

	public HtmlPreview() {
		super();
		this.htmlPreview = new WebView();
	}

	public HtmlPreview(String markdownContent) {
		this.markdownContent = markdownContent;
		this.htmlPreview = new WebView();
		markdown2Html();
	}

	private void markdown2Html() {

		// link style sheet
		this.htmlContent = "<html>\n";
		this.htmlContent += "<head>\n"+
				"<meta charset=\"UTF-8\">\n" + 
				"<link rel=\"stylesheet\" href=\"github-markdown.css\">\n" + 
				"<style>\n" + 
				"	.markdown-body {\n" + 
				"		box-sizing: border-box;\n" + 
				"		min-width: 200px;\n" + 
				"		max-width: 980px;\n" + 
				"		margin: 0 auto;\n" + 
				"		padding: 45px;\n" + 
				"	}\n" + 
				"	@media (max-width: 767px) {\n" + 
				"		.markdown-body {\n" + 
				"			padding: 15px;\n" + 
				"		}\n" + 
				"	}\n" + 
				"</style>\n" + 
				"</head>\n" +
				"<body>\n" + 
				"<article class=\"markdown-body\">\n"; 

		// input markdwon
		this.htmlContent += Markdown2HtmlService.markdown2Html(this.markdownContent);
		this.htmlContent += "</article>\n" +
							"<script src=\"http://cdn.bootcss.com/highlight.js/8.0/highlight.min.js\"></script>" +
							"</body>\n" +
							"</html>";

		System.out.println(this.htmlContent);

		// put html into web old
		WebEngine webEngine = this.htmlPreview.getEngine();
		webEngine.loadContent(this.htmlContent);
		webEngine.executeScript("hljs.initHighlightingOnLoad()");
//		webEngine.load(this.htmlContent);
	}
}
