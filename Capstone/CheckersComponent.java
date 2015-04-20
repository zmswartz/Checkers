import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;


/**
 * Write a description of class RectangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckersComponent extends JComponent
{
    int[] locationSelected;
    CheckersBoard board;
    int currentPlayer;
    public CheckersComponent()
    {
        board = new CheckersBoard();
        MouseListener l = new MousePressListener();
        currentPlayer = 1;
        addMouseListener(l);
        
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
         
        board.draw(g2);
    }
    
        class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event){}
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) 
        {
            
            int x = event.getX()/100;
            int y = event.getY()/100;
            
            board.actionAt(x,y, currentPlayer);
            
            repaint();
            
            changePlayer();
            
            while(board.forcedMove(currentPlayer) 
        }
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    
    private void changePlayer()
    {
        if (currentPlayer == -1)
        {
            currentPlayer = 1;
            return;
        }
        currentPlayer = -1;
    }
}