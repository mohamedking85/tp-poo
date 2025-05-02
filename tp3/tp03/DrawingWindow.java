package tp03;
import java.awt.Color;
import javax.swing.*;
public class DrawingWindow extends JFrame {
public DrawingWindow(DrawingArea drawingArea){
 //Fix a title for your Windows
 this.setTitle("Bouira University, CS Dpt, OOP Lab #03, March. 05-06th, 2024 ");
 //Set now your Window Size : Here we use 656 pixels width an 678 pixels Height
 this.setSize(656, 678);
 //Positionner la fenêtre au centre
 this.setLocationRelativeTo(null); 
 //Define how your application ill be terminated through Window's Icon
 //Here the application terminates if a click occurs in the icon containing x
 // located at the Top Right of your window 
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 // Fix the capability to resize or not a window when program is in execution state
 this.setResizable(true); 
 // Put the drawing area into the windows
 this.setContentPane(drawingArea);
 // Now make visible the windows
 this.setVisible(true); 
}


}