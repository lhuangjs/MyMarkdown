package pre.huangjs.service;

import com.vladsch.flexmark.ast.Node;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.profiles.pegdown.Extensions;
import com.vladsch.flexmark.profiles.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.options.DataHolder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Markdown2HtmlService {
    private static String style = "";

    static {
        InputStream is = Markdown2HtmlService.class.getResourceAsStream("basic-markdown.css");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String record = null;
        try {
            while ((record = br.readLine()) != null) {
                style += record + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String markdown2Html(String markdownStr) {
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

        DataHolder option = PegdownOptionsAdapter.flexmarkOptions(true, Extensions.ALL);

        final Parser parser = Parser.builder(option).build();
        final HtmlRenderer renderer = HtmlRenderer.builder(option).build();
        Node document = parser.parse(markdownStr);
        String markdownContent = renderer.render(document);
        String htmlContent = setStyle(markdownContent);
        System.out.println(htmlContent);
        return htmlContent;
    }

    private static String setStyle(String markdownStr) {
        String result = String.join("\n", new String[]{
                "<html>",
                "<head>",
                    "<style>",
                    style,
                    "</style>",
                "</head>",
                "<body>",
                    markdownStr,
                "</body>",
                "</html>"
        });
        return result;
    }

}
