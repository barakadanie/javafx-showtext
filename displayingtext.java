package straightline;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class displayingtext extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Creating a Text object
        Text text=new Text();
        //Setting font to the text
        text.setFont(new Font(45));
        //Setting font to the text
        text.setX(50);
        text.setY(150);
        Group root=new Group();
        Scene scene=new Scene(root,600,300);
        //Setting the text to be added.
        text.setText("hello world!!!");
        primaryStage.setScene(scene);

        //Retrieving the observable list object
        ObservableList list=root.getChildren();
        //Setting the text object as a node to the group object
        list.add(text);

        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
