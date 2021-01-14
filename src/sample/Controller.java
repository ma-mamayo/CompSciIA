package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
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
        System.out.println("Test");
    }


    @FXML
    private void isPlusGroup(ActionEvent actionEvent){
        Button pressedBtn = (Button) actionEvent.getSource(); // кнопка на которую нажали
        TextFlow textFlow = (TextFlow) pressedBtn.getParent(); // родитель кнопки

        MenuButton groupMenuButton = new MenuButton("Choice Group");

        MenuItem groupMenuItem1 = new MenuItem("test1");
        MenuItem groupMenuItem2 = new MenuItem("test2");
        MenuItem groupMenuItem3 = new MenuItem("test3");

        groupMenuButton.getItems().add(groupMenuItem1);
        groupMenuButton.getItems().add(groupMenuItem2);
        groupMenuButton.getItems().add(groupMenuItem3);


        MenuButton spaceMenuButton = new MenuButton("Choice Space");

        MenuItem spaceMenuItem1 = new MenuItem("test1");
        MenuItem spaceMenuItem2 = new MenuItem("test2");
        MenuItem spaceMenuItem3 = new MenuItem("test3");

        spaceMenuButton.getItems().add(spaceMenuItem1);
        spaceMenuButton.getItems().add(spaceMenuItem2);
        spaceMenuButton.getItems().add(spaceMenuItem3);

        textFlow.getChildren().add(spaceMenuButton); // добавление нового ребенка
        textFlow.getChildren().add(groupMenuButton);
    }

   /* @FXML
    private void buttonClicked() {
        add

        mainButton.setText("Click me again!");

    }

    public void isPlusGroup(ActionEvent actionEvent) {

    }*/
    /* @FXML
    public void isPlusGroup(MouseEvent mouseEvent) {
    System.out.println(1);
    Button button = (Button) mouseEvent.getSource();
    }
    MenuButton menuButton = new MenuButton(); // то что хочу добавить

        MenuItem menuItem1 = new MenuItem("test1");
        MenuItem menuItem2 = new MenuItem("test2");
        MenuItem menuItem3 = new MenuItem("test3");

        menuButton.getItems().add(menuItem1);
        menuButton.getItems().add(menuItem2);
        menuButton.getItems().add(menuItem3);*/

  /* @FXML
    private MenuButton stateGroup;

    @FXML
    private MenuButton stateSpace;
*/


}
