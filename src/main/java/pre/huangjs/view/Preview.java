package pre.huangjs.view;

import javafx.embed.swing.SwingNode;
import org.panda_lang.pandomium.Pandomium;
import org.panda_lang.pandomium.settings.PandomiumSettings;
import org.panda_lang.pandomium.wrapper.PandomiumBrowser;
import org.panda_lang.pandomium.wrapper.PandomiumClient;

import javax.swing.*;
import java.awt.*;

/**
 * Created by huangjs on 2018/4/12.
 */
public class Preview {

    private Pandomium pandomium;

    public SwingNode browserNode(){
        SwingNode swingNode = new SwingNode();
        SwingUtilities.invokeLater(() -> initializeSwing(swingNode));

        return swingNode;
    }

    private void initializeSwing(SwingNode swingNode){
        PandomiumSettings settings = PandomiumSettings.getDefaultSettings();

        pandomium = new Pandomium(settings);
        pandomium.initialize();

        PandomiumClient client = pandomium.createClient();
        PandomiumBrowser browser = client.loadURL("https://www.baidu.com/");
        Component awtComponent = browser.toAWTComponent();
        JPanel jpane = new JPanel();
        jpane.add(awtComponent);
        swingNode.setContent(jpane);
    }

    public void close(){
        pandomium.dispose();
    }
}
