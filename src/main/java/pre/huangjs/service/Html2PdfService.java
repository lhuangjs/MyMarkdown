package pre.huangjs.service;

import com.vladsch.flexmark.pdf.converter.PdfConverterExtension;
import com.vladsch.flexmark.profiles.pegdown.Extensions;
import com.vladsch.flexmark.profiles.pegdown.PegdownOptionsAdapter;
import com.vladsch.flexmark.util.options.MutableDataHolder;
import org.apache.pdfbox.io.IOUtils;

import java.io.*;


public class Html2PdfService {

    static final MutableDataHolder OPTIONS = PegdownOptionsAdapter.flexmarkOptions(
            Extensions.ALL & ~(Extensions.ANCHORLINKS | Extensions.EXTANCHORLINKS_WRAP)
    ).toMutable();

    public static void html2pdf(String filePath, String htmlContent) {
        File file = new File(filePath);
        System.out.println(file.getPath() + ": " + file.exists());
        try {
            file.createNewFile();
            OutputStream os = new FileOutputStream(file);
            PdfConverterExtension.exportToPdf(os, htmlContent, "", OPTIONS);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
