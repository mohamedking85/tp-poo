package tp03.partie01.dessin;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

public class GestionnaireDeSouris implements MouseListener {

Dessin d;
private GestionnaireDeSouris(){}

public GestionnaireDeSouris (Dessin d) {
    this.d=d;
}


public void mouseClicked (MouseEvent ev) {
    int x=ev.getX(), y=ev.getY();
    d.x=x;d.y=y;  
    d.repaint();
}



public void mousePressed (MouseEvent e) {}

public void mouseReleased (MouseEvent e) {}
public void mouseEntered (MouseEvent e) {}
public void mouseExited (MouseEvent e) {}
}