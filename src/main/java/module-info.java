module org.example.javafxhibernatehello {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires static lombok;
    requires jakarta.persistence;
    requires java.naming;

    opens org.example.javafxhibernatehello.models;

    opens org.example.javafxhibernatehello to javafx.fxml;
    exports org.example.javafxhibernatehello;
}