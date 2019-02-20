//package GemCrush;
import java.util.*;
import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.paint.Color;

import javafx.stage.Stage;

import javafx.scene.shape.Polygon;

import javafx.scene.shape.Path;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;

/**
 *
 */
public class Main extends Application {

    /**
     * Default constructor
     */
    public Main(){
    }
   public static void main(String[] args) {

        Application.launch(args);

    }



    @Override
    public void start(Stage fenetre) {
  //Creating a Path
      Path path = new Path();

      //Moving to the starting point
      MoveTo moveTo = new MoveTo(108, 71);

      //Creating 1st line
      LineTo line1 = new LineTo(321, 161);

      //Creating 2nd line
      LineTo line2 = new LineTo(126,232);

      //Creating 3rd line
      LineTo line3 = new LineTo(232,52);

      //Creating 4th line
      LineTo line4 = new LineTo(269, 250);

      //Creating 4th line
      LineTo line5 = new LineTo(108, 71);

      //Adding all the elements to the path
      path.getElements().add(moveTo);
      path.getElements().addAll(line1, line2, line3, line4, line5);

      //Creating a Group object
      Group root = new Group(path);

      //Creating a scene object
      Scene scene = new Scene(root, 600, 300);

      //Setting title to the Stage
      fenetre.setTitle("Drawing an arc through a path");

      //Adding scene to the fenetre
      fenetre.setScene(scene);

      //Displaying the contents of the fenetre
      fenetre.show();

    }
}
