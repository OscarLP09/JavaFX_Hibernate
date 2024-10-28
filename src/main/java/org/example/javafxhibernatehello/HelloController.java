package org.example.javafxhibernatehello;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.javafxhibernatehello.dao.GameDAO;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView lista;

    @FXML
    protected void onHelloButtonClick() {

        new GameDAO(HibernateUtil.getSessionFactory()).findAll().forEach(
                (e)->{
                    lista.getItems().add(e.getTitle());
                }
        );

    }
}