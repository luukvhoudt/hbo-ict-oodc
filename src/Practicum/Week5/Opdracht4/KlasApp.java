package Practicum.Week5.Opdracht4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KlasApp extends Application {
	private KlasManager manager = new KlasManager();
	private Klas deKlas = new Klas("V1X");

	public void start(Stage stage) {
		FlowPane pane = new FlowPane(10, 10);
		pane.setPadding(new Insets(10));

		Label meldingen = new Label("Kies een actie!");
		ListView<Leerling> lijst = new ListView<Leerling>();
		Label naamLabel = new Label("naam:");
		TextField naam = new TextField();
		Label cijferLabel = new Label("cijfer:");
		TextField cijfer = new TextField();
		Button toevoegen = new Button("toevoegen");
		Button inladen = new Button("klas inladen");
		Button opslaan = new Button("klas opslaan");
		Button wissen = new Button("lijst wissen");

		meldingen.setPrefWidth(300);
		naam.setPrefWidth(115);
		cijfer.setPrefWidth(42);
		toevoegen.setPrefWidth(90);
		lijst.setPrefHeight(100);
		inladen.setPrefWidth(90);
		opslaan.setPrefWidth(90);
		wissen.setPrefWidth(90);

		HBox toevoegenBox = new HBox(10, naamLabel, naam, cijferLabel, cijfer, toevoegen);
		VBox buttonBox = new VBox(10, inladen, opslaan, wissen);
		pane.getChildren().addAll(meldingen, lijst, buttonBox, toevoegenBox);
		Scene scene = new Scene(pane, 360, 180);

		inladen.setOnAction(event -> {
			Klas tmp = null;

			try {
				tmp = manager.klasInladen();

				if (tmp != null) {
					deKlas = tmp;
					lijst.getItems().clear();
					lijst.getItems().addAll(deKlas.getLeerlingen());
					meldingen.setText("Klas ingeladen!");
				} else meldingen.setText("Geen klas gevonden!");
			} catch (Exception e) {
				meldingen.setText(e.getMessage());
				System.out.println(e.getMessage());
			}
		});

		opslaan.setOnAction(event -> {
			meldingen.setText("");
			try {
				manager.klasOpslaan(deKlas);
			} catch (Exception ioe) {
				meldingen.setText(ioe.getMessage());
			}

		});

		wissen.setOnAction(event -> {
			lijst.getItems().clear();
			deKlas = new Klas("V1X");
			meldingen.setText("Kies actie!");
		});

		toevoegen.setOnAction(event -> {
			if (!cijfer.getText().isEmpty() && !naam.getText().isEmpty()) {
				Leerling nwL = new Leerling(naam.getText());
				try {
					nwL.setCijfer(Double.parseDouble(cijfer.getText()));
					deKlas.voegLeerlingToe(nwL);
					lijst.getItems().add(nwL);
					meldingen.setText("Leerling toegevoegd");
				} catch (NumberFormatException nfe) {
					meldingen.setText("Geen geldig cijfer!");
				}
			} else meldingen.setText("Ontbekende invoer!");
		});

		stage.setScene(scene);
		stage.setTitle("KlasApp 1.0");
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
