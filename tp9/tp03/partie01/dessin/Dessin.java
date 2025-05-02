package tp03.partie01.dessin;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Dessin extends JPanel {
public int x=0;
public int y=0;
int tailleCase =80;
int largeurZoneDessin;
int huateurZoneDessin; 

public void paintComponent(Graphics g) {



largeurZoneDessin=this.getWidth();
huateurZoneDessin=this.getHeight();

g.setColor(Color.black);
g.fillRect(0, 0, largeurZoneDessin, huateurZoneDessin);

int n1=largeurZoneDessin/tailleCase;

boolean fill=true;

for(int i=0;i<n1;i++){

fill=!fill;
g.setColor(Color.yellow);
for(int j=0;j<n1;j++)
if(fill) {
g.fillRect(i*tailleCase, j*tailleCase, tailleCase, tailleCase);
fill=false;
}
else {
g.drawRect(i*tailleCase, j*tailleCase, tailleCase, tailleCase);
fill=true;
}
}


// Calculate the top-left corner of the square the piece is in
int pieceX = (x / tailleCase) * tailleCase;
int pieceY = (y / tailleCase) * tailleCase;

// Calculate the center of the square
int centerX = pieceX + tailleCase / 2;
int centerY = pieceY + tailleCase / 2;

int outerRadius = tailleCase /2 ; // Adjust size as needed
int innerRadius = outerRadius/2; // Adjust inner points

// Define the points of a 5-pointed star relative to the center
// These arrays hold the x and y coordinates of the vertices
int[] starX = new int[10];
int[] starY = new int[10];

// Calculate the points - This part is necessary for a star shape
for (int i = 0; i < 10; i++) {
    double angle = Math.PI / 2 - i * Math.PI / 5;
    double radius = (i % 2 == 0) ? outerRadius : innerRadius;
    starX[i] = (int) (centerX + radius * Math.cos(angle));
    starY[i] = (int) (centerY - radius * Math.sin(angle));
}

// Set the color for the star (change Color.blue to any color you want)
g.setColor(Color.blue);

// Draw and fill the star using the calculated points
//g.fillPolygon(starX, starY, 10);
g.setColor(Color.red);
int xc=x/tailleCase+1;
int yc=y/tailleCase+1;
int pieceX1 = (x / tailleCase) * tailleCase;
int pieceY1 = (y / tailleCase) * tailleCase;

// Calculate the center of the square
int centerX1 = pieceX1 + tailleCase / 2;
int centerY1 = pieceY1 + tailleCase / 2;

g.setColor(Color.green);
//g.fillOval((x/tailleCase)*tailleCase, (y/tailleCase)*tailleCase,tailleCase, tailleCase);
g.fillRect((x/tailleCase)*tailleCase, (y/tailleCase)*tailleCase, tailleCase, tailleCase);
g.setColor(Color.red);
g.drawString(xc+","+yc, centerX, centerY);

}
}