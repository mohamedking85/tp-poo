import java.awt.Color;
import tp03.*;
public class Main {

    public static void main(String[] args) {
        // Create the drawing ..... انشاء الرسم
        Drawings drawings = new Drawings();

        // Add some basic figure, such as Rectangle and Circle to the drawing
        // اضافة بعض الرسومات القاعدية الى الرسم //
      drawings.addRectangle(200, 200, 100, 100, Color.RED);
      drawings.addRectangle(230, 230, 100, 100, Color.BLUE);
     drawings.addRectangle(250, 250, 100, 100, Color.BLACK);
        drawings.addRectangle(150, 150, 150, 150, Color.green);
      drawings.addCircle(200, 200, 50, Color.BLUE);
      drawings.addCircle(230, 230, 50, Color.BLACK);
     drawings.addCircle(250, 250, 50, Color.RED);
        // Create the drawing area on which the drawing will be made
        // انشاء مساحة الرسم (او منطقة الرسم) التي فيها يرسم الرسم قطها //
        DrawingArea drawingArea = new DrawingArea(drawings);
        // Create the window in which the drawing area will be placed
        // انشاء النافذة التي ستوضع فيها مساحة الرسم او منطقة الرسم //
        new DrawingWindow(drawingArea);

        // adding a new basic figure, a circle, to the drawing
        // to actually see the new figure in the drawing area you should
        // activate the repaint method of drawingArea
        // اضافة دائرة الى الرسم. حتى يظهر الرسم على الشاشة يجب ان تطلب من منطقة الرسم تحديث محتوى الرسم //
        drawings.addCircle(250, 250, 250, Color.YELLOW);
        // activate the repaint method of drawingArea
        // نطلب من منطقة الرسم تحديث محتوى الرسم//
        drawingArea.repaint();

    drawings.deleteRectangle(200, 200, 100, 100);
    drawings.deleteRectangle(230, 230, 100, 100);

        drawingArea.repaint();

    }

}