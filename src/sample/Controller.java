package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.text.TextFlow;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void isRain(MouseEvent event)
    {
        CheckBox checkbox = (CheckBox) event.getSource();

        System.out.println(checkbox.isSelected());
    }

    @FXML
    private void somefunc(MouseEvent mouseEvent){
        Button pressedBtn = (Button) mouseEvent.getSource(); // кнопка на которую нажали
        TextFlow textFlow = (TextFlow) pressedBtn.getParent(); // родитель кнопки

        MenuButton menuButton = new MenuButton(); // то что хочу добавить

        MenuItem menuItem1 = new MenuItem("test1");
        MenuItem menuItem2 = new MenuItem("test2");
        MenuItem menuItem3 = new MenuItem("test3");

        menuButton.getItems().add(menuItem1);
        menuButton.getItems().add(menuItem2);
        menuButton.getItems().add(menuItem3);

        textFlow.getChildren().add(menuButton); // добавление нового ребенка
    }
}
