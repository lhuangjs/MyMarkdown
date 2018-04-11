package pre.huangjs.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;

/**
 * Created by huangjs on 2018/4/11.
 */
public class MyMenuBar {
    public static MenuBar create() {
        MenuBar menuBar = new MenuBar();

        // menu: File
        Menu fileMenu = new Menu("File");

        // menu item: add project folder
        MenuItem addProject = new MenuItem("Add Project Folder");
        addProject.setAccelerator(KeyCombination.keyCombination("Ctrl + Shift + A"));

        // menu item: new folder
        MenuItem newFolder = new MenuItem("New Folder");
        newFolder.setAccelerator(KeyCombination.keyCombination("Ctrl + Shift + N"));

        // menu item: new file
        MenuItem newFile = new MenuItem("New File");
        newFile.setAccelerator(KeyCombination.keyCombination("Ctrl + N"));



        // menu item: exit
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(event -> {
            System.exit(0);
        });

        // add menu items into menu
        fileMenu.getItems().addAll(addProject, newFolder, newFile, exit);

        // add menu into menu bar
        menuBar.getMenus().add(fileMenu);

        return menuBar;
    }
}
