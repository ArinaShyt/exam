package com.example.exam;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    public PasswordField password;
    public TextField loginF;
    @FXML
    public String login;

    public void authorization(ActionEvent actionEvent) throws IOException {
//        Interface userCRUD = new Interface();
//        if (!loginF.getText().equals("") && !password.getText().equals("")) {
//            try {
//
//                if(loginF.getText().equals(user.getName()) && password.getText().equals(user.getPassword())) {
        HelloApplication.setRoot("Nav");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return user;
//    }

    }

}