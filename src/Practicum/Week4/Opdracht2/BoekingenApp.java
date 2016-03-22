package Practicum.Week4.Opdracht2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class BoekingenApp extends Application {

    private Hotel hotel = new Hotel("Avondrust");

    @Override
    public void start(Stage primaryStage) {
        // Setup the elements

        // Mededelingen
        Label info = new Label("Voer uw gegevens in!");
        info.setPrefWidth(440);

        // Naam
        TextField fieldNaam = new TextField();
        fieldNaam.setPrefSize(300,20);

        Label labelNaam = new Label("Naam:");
        labelNaam.setPrefSize(130,20);
        labelNaam.setLabelFor(fieldNaam);

        // Adres
        TextField fieldAdres = new TextField();
        fieldAdres.setPrefSize(300,20);

        Label labelAdres = new Label("Adres:");
        labelAdres.setPrefSize(130,20);
        labelAdres.setLabelFor(fieldAdres);

        // Aankomstdatum
        DatePicker fieldAankomst = new DatePicker();
        fieldAankomst.setPrefSize(300,20);
        fieldAankomst.setValue(LocalDate.now());

        Label labelAankomst = new Label("Aankomstdatum:");
        labelAankomst.setPrefSize(130,20);
        labelAankomst.setLabelFor(fieldAankomst);

        // Vertrekdatum
        DatePicker fieldVertrek = new DatePicker();
        fieldVertrek.setPrefSize(300,20);
        fieldVertrek.setValue(LocalDate.now().plusDays(1));

        Label labelVertrek = new Label("Vertrekdatum:");
        labelVertrek.setPrefSize(130,20);
        labelVertrek.setLabelFor(fieldVertrek);

        // Kamertype
        ComboBox fieldKamertype = new ComboBox();
        fieldKamertype.setPrefSize(300,20);
        fieldKamertype.getItems().addAll(hotel.getAlleKamerTypen());

        Label labelKamertype = new Label("Kamertype:");
        labelKamertype.setPrefSize(130,20);
        labelKamertype.setLabelFor(fieldKamertype);

        // Form Acties
        Button reset = new Button();
        reset.setText("reset");
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                fieldNaam.setText("");
                fieldAdres.setText("");
                fieldAankomst.setValue(LocalDate.now());
                fieldVertrek.setValue(LocalDate.now().plusDays(1));
                fieldKamertype.setValue(null);
            }
        });

        Button submit = new Button();
        submit.setText("boek");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StringBuilder response = new StringBuilder();
                if (fieldNaam.getText().isEmpty()) {
                    response.append("Voer een naam in. ");
                }
                if (fieldAdres.getText().isEmpty()) {
                    response.append("Voer een adres in. ");
                }
                if (fieldAankomst.getValue().isBefore(LocalDate.now()) || fieldVertrek.getValue().isBefore(LocalDate.now())) {
                    response.append("Selecteer een datum in de toekomst. ");
                }
                if (fieldVertrek.getValue().isBefore(fieldAankomst.getValue())) {
                    response.append("Selecteer een vertrekdatum na de aankomstdatum. ");
                }
                if (fieldKamertype.getValue() == null) {
                    response.append("Selecteer een kamertype. ");
                }
                if (!fieldNaam.getText().isEmpty() &&
                    !fieldAdres.getText().isEmpty() &&
                    !(fieldAankomst.getValue().isBefore(LocalDate.now()) || fieldVertrek.getValue().isBefore(LocalDate.now())) &&
                    !fieldVertrek.getValue().isBefore(fieldAankomst.getValue()) &&
                    fieldKamertype != null) {
                    hotel.voegBoekingToe(fieldAankomst.getValue(), fieldVertrek.getValue(), fieldNaam.getText(), fieldAdres.getText(), (KamerType)fieldKamertype.getValue());
                    response.append("Boeking succesvol!");

                    fieldNaam.setText("");
                    fieldAdres.setText("");
                    fieldAankomst.setValue(LocalDate.now());
                    fieldVertrek.setValue(LocalDate.now().plusDays(1));
                    fieldKamertype.setValue(null);

                    System.out.println(hotel);

                }
                info.setText(response.toString());
            }
        });

        // Setup the panes
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.TOP_RIGHT);
        root.setPadding(new Insets(20));
        root.setPrefWrapLength(440);
        root.setVgap(20);
        root.setHgap(10);

        // Add the elements to the pane
        root.getChildren().addAll(info,
                labelNaam, fieldNaam,
                labelAdres, fieldAdres,
                labelAankomst, fieldAankomst,
                labelVertrek, fieldVertrek,
                labelKamertype, fieldKamertype,
                reset, submit
        );


        // Setup the scene
        Scene scene = new Scene(root, 480, 360);

        primaryStage.setTitle("Tweepersoonsboekingen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}