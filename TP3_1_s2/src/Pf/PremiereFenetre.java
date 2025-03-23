package Pf;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {
	@Override
	public void start(Stage primaryStage) {
		Rectangle r=new Rectangle(5.8, 7.9, 200, 100);
		Circle c=new Circle(400, 50, 50.5);
		Group root = new Group();
		ObservableList<Node> l = root.getChildren();
		l.add(r);
		l.add(c);
		Scene scene = new Scene(root, 300, 250, Color.WHITE);
		primaryStage.setTitle("Ma première fenêtre");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
