import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label counterLabel;
    
    private int counter = 0;

    @FXML
    void initialize() {
        
        TimerTask tasks = new TimerTask() {
			
			@Override
			public void run() {
				
				Platform.runLater(() -> {
					
					counter++;
				
					counterLabel.setText(String.valueOf(counter));
				});
			}
		};
		
		new Timer().schedule(tasks, 0, 1000); // 1000 ms => 1 second
 
    }

}

