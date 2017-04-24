package application;

import javafx.event.ActionEvent;
import java.util.Random;

public class Controller {

	public void generateRandom(ActionEvent event) {
		Random myrand = new Random();
		int rand = myrand.nextInt(50);
		System.out.println(rand);
	}	
}
