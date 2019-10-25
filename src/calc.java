import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class calc extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	
		Group root = new Group();
		Scene scene = new Scene(root,500,500,Color.WHITE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Button ett = new Button("1");
		ett.setTranslateX(0);
		ett.setTranslateY(0);
		root.getChildren().add(ett);
		
		Button tva = new Button("2");
		tva.setTranslateX(40);
		tva.setTranslateY(0);
		root.getChildren().add(tva);
		
		Button tre = new Button("3");
		tre.setTranslateX(80);
		tre.setTranslateY(0);
		root.getChildren().add(tre);
		
		Button fyra = new Button("4");
		fyra.setTranslateX(0);
		fyra.setTranslateY(40);
		root.getChildren().add(fyra);
		
		Button fem = new Button("5");
		fem.setTranslateX(40);
		fem.setTranslateY(40);
		root.getChildren().add(fem);
		
		Button sex = new Button("6");
		sex.setTranslateX(80);
		sex.setTranslateY(40);
		root.getChildren().add(sex);
		
		Button sju = new Button("7");
		sju.setTranslateX(0);
		sju.setTranslateY(80);
		root.getChildren().add(sju);
		
		Button atta = new Button("8");
		atta.setTranslateX(40);
		atta.setTranslateY(80);
		root.getChildren().add(atta);
		
		Button nio = new Button("9");
		nio.setTranslateX(80);
		nio.setTranslateY(80);
		root.getChildren().add(nio);
		
		Button plus = new Button("+");
		plus.setTranslateX(0);
		plus.setTranslateY(120);
		root.getChildren().add(plus);
		
		Button noll = new Button("0");
		noll.setTranslateX(40);
		noll.setTranslateY(120);
		root.getChildren().add(noll);
		
		Button lika = new Button("=");
		lika.setTranslateX(80);
		lika.setTranslateY(120);
		root.getChildren().add(lika);
		
		
	}

	public static void main(String[] args) {
		launch();
	}
	
}
