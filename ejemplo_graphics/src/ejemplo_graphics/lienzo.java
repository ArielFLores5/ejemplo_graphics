package ejemplo_graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class lienzo extends JPanel {

    private static final long serialVersionUID = 1L;
    private Image mario;
    private Image bloque; 
    private Image bloque2;
    private Image suelo;
    private Image goomba;
    private Image tuberia;

    public lienzo() {
        // Cargar la imagen de Mario usando Toolkit
        Toolkit t = Toolkit.getDefaultToolkit();
        mario = t.getImage("src/Resources/mario.png");
        bloque = t.getImage("src/Resources/bloque.png");
        bloque2 = t.getImage("src/Resources/bloque2.png");
        suelo = t.getImage("src/Resources/suelo.png");
        goomba = t.getImage("src/Resources/goomba.png");
        tuberia = t.getImage("src/Resources/tuberia.png");
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Suelo y fondo
        g.setColor(new Color(11, 177, 219));
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(new Color(192, 159, 48));
        g.fillRect(0, 190, getWidth(), getHeight() - 170);
        // Bloques
        g.drawImage(bloque, 220, 70, this);
        g.drawImage(bloque, 260, 70, this);
        g.drawImage(bloque, 300, 70, this);
        g.drawImage(bloque2, 120, 70, this);
        g.drawImage(bloque2, 240, 70, this);
        g.drawImage(bloque2, 280, 70, this);
        g.drawImage(suelo, -40, 186, this);
        g.drawImage(suelo, 0, 186, this);
        g.drawImage(suelo, 40, 186, this);
        g.drawImage(suelo, 80, 186, this);
        g.drawImage(suelo, 120, 186, this);
        g.drawImage(suelo, 160, 186, this);
        g.drawImage(suelo, 200, 186, this);
        g.drawImage(suelo, 240, 186, this);
        g.drawImage(suelo, 280, 186, this);
        g.drawImage(suelo, 320, 186, this);
        g.drawImage(suelo, 360, 186, this);
        g.drawImage(suelo, 400, 186, this);
        
        //Goomba
        g.drawImage(goomba, 200, 162, this);
        //tuberia
        g.drawImage(tuberia, 360, 120, this);
        

        // Arbustos
        g.setColor(Color.GREEN);
        g.fillOval(30, 151, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(0, 151, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(15, 130, 40, 40);
        g.setColor(Color.GREEN);
        g.fillOval(400, 151, 40, 40);
        // Montaña
        g.setColor(new Color(16, 160, 16));
        g.fillArc(100, 130, 80, 120, 0, 180);

        // Dibujar la imagen de Mario
        if (mario != null) {
            g.drawImage(mario, 80, 90, this);
        } else {
            System.out.println("Imagen de Mario es null");
        }
    }
}
