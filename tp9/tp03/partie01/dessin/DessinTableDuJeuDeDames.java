package tp03.partie01.dessin;

import javax.swing.*;

public class DessinTableDuJeuDeDames {

static Dessin d;
public static void main(String[] args) {



JFrame f=new JFrame();

f.setTitle("Un Jeu de dames");


f.setSize (656, 678);


f.setLocationRelativeTo(null);


f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

f.setResizable (false);

d=new Dessin();
f.setContentPane(d);



GestionnaireDeSouris gs=new GestionnaireDeSouris (d);


d.addMouseListener(gs);
f.setVisible(true);

}

}