package pre.huangjs.service;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.parser.ParserEmulationProfile;
import com.vladsch.flexmark.profiles.pegdown.Extensions;
import com.vladsch.flexmark.profiles.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.options.MutableDataHolder;
import com.vladsch.flexmark.util.options.MutableDataSet;

public class Markdown2HtmlService {

	public static String markdown2Html(String markdownContent) {
		// MutableDataSet options = new MutableDataSet();
		//
		// Parser parser = Parser.builder(options).build();
		// Node node = parser.parse(markdownContent);
		// HtmlRenderer render = HtmlRenderer.builder(options).build();
		//
		// String htmlContent = render.render(node);

		// kMarkdown
		// MutableDataSet options = new MutableDataSet();
		// options.setFrom(ParserEmulationProfile.KRAMDOWN);
		// options.set(Parser.EXTENSIONS, Arrays.asList(AbbreviationExtension.create(),
		// DefinitionExtension.create(),
		// FootnoteExtension.create(), TablesExtension.create(),
		// TypographicExtension.create()));
		//
		// Parser parser = Parser.builder(options).build();
		// HtmlRenderer renderer = HtmlRenderer.builder(options).build();
		//
		// Node document = parser.parse(markdownContent);
		// String htmlContent = renderer.render(document);

		// multiMarkdown
//		MutableDataHolder options = new MutableDataSet();
//		options.setFrom(ParserEmulationProfile.MULTI_MARKDOWN);
//
//		Parser parser = Parser.builder(options).build();
//		HtmlRenderer renderer = HtmlRenderer.builder(options).build();
//
//		Node document = parser.parse(markdownContent);
//		String htmlContent = renderer.render(document); 
		
	    DataHolder option = PegdownOptionsAdapter.flexmarkOptions(true,
	            Extensions.ALL
	    );

	    final Parser parser = Parser.builder(option).build();
	    final HtmlRenderer renderer = HtmlRenderer.builder(option).build();
	    Node document =  parser.parse(markdownContent);
		
		return renderer.render(document);

		
		
	}

}
