
package signupform;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Signupform extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane signup =new GridPane();
        signup.setAlignment(Pos.CENTER);
        signup.setHgap(15);
        signup.setVgap(15);
        
        Scene scene=new Scene(signup);
        
        Label fnameL=new Label("Your First Name");
        signup.add(fnameL,0,0);// position at 0 coloumn 0 row
        TextField fname =new TextField();
        signup.add(fname,1,0);//position at 1 coloumn 0 row
        
        Label lnameL=new Label("Your Last Name");
        signup.add(lnameL,0,1);
        TextField lname=new TextField();
        signup.add(lname,1,1);
        
        Label emailL=new Label("Email address");
        signup.add(emailL,0,3);
        TextField email=new TextField();
        signup.add(email,1,3); 
        
        Label passwordL=new Label("Password");
        signup.add(passwordL,0,4);
        PasswordField password=new PasswordField();
        signup.add(password,1,4);
        
        Button btn=new Button("Sign Up");
        HBox hbtn=new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().add(btn);
        signup.add(hbtn,1,6);
        
        
       
        primaryStage.setTitle("SignUp Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
