import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Polygon;

public class MyPanelClass  extends JPanel
{
	
	            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

				public void paintComponent(Graphics g)
	            {
	                        super.paintComponent(g);
	 
	                        //Compute interior coordinates
	                        Insets myInsets = this.getInsets();
	                        int x1 = myInsets.left;
	                        int y1 = myInsets.top;
	                        int x2 = getWidth() - myInsets.right - 1;
	                        int y2 = getHeight() - myInsets.bottom - 1;
	                        int width = x2 - x1;
	                        int height = y2 - y1;
	                        
	                       
	                        
	                        Insets myInsets2 = this.getInsets();
	                        int x21 = myInsets.left+10;
	                        int y21 = myInsets.top+10;
	                        int x3 = getWidth() - myInsets.right - 10;
	                        int y3 = getHeight() - myInsets.bottom - 10;
	                        int width2 = x3 - x21;
	                        int height2 = y3 - y21;
	                        
	                        
	                        //Paint the background
	                        g.setColor(Color.WHITE);
	                        g.fillRect(x1, y1, width + 1, height + 1);
	                        
	                        //Draw a border
	                        // g.setColor(Color.blue);
	                        //g.drawRect(x1, y1, width, height);
	                        
	                        //g.setColor(Color.LIGHT_GRAY);
	                        //g.fillOval(x1+(width-55)/2, y1+(height-55)/2, 55, 55);
	                    
	                        
							//Draw border #2
	                        //g.setColor(Color.RED);
	                        //g.drawRect(x21, y21, width2, height2);
	                        
	                        
	                        //g.setColor(Color.WHITE);
	                        //g.drawLine(x1, y1, x2, y2);
	                        
	                        //g.setColor(Color.magenta);
	                        //g.drawLine(x1, y2, x2, y1);
	                        
	                        //Polygon p = new Polygon();
	                        //p.addPoint(x1 + 5, y1 + 25);
	                        //p.addPoint(x1 + 20, y1 + 10);
	                        //p.addPoint(x1 + 35, y1 + 25);
	                        //p.addPoint(x1 + 25, y1 + 25);
	                        //p.addPoint(x1 + 25, y1 + 45);
	                        //p.addPoint(x1 + 15, y1 + 45);
	                        //p.addPoint(x1 + 15, y1 + 25);
	                        //g.setColor(Color.YELLOW);
	                        //g.drawPolygon(p);
	                        
	                    
	                        Rectangle myRectangle1 = new Rectangle(x1+10,y1+10,200,140);
	                        g.setColor(Color.RED);
	                        g.fillRect(x1+10,y1+10,210,28);
	                        
	                        Rectangle myRectangle2 = new Rectangle(x1+10,y1+66,200,140);
	                        g.setColor(Color.RED);
	                        g.fillRect(x1+10,y1+66,210,28);
	                        
	                        Rectangle myRectangle3 = new Rectangle(x1+10,y1+122,200,140);
	                        g.setColor(Color.RED);
	                        g.fillRect(x1+10,y1+122,210,28);
	                        
	                        Polygon p = new Polygon();
	                        p.addPoint(x1 + 10, y1 + 10);
	                        p.addPoint(x1 + 120, y1 + 80);
	                        p.addPoint(x1 + 10, y1 + 150);
	                        g.setColor(Color.BLUE);
	                        g.fillPolygon(p);
	                        
	                        
	                        Polygon p2 = new Polygon();
	                        p2.addPoint(x1 + 25, y1 + 73);
	                        p2.addPoint(x1 + 41, y1 + 73);
	                        p2.addPoint(x1 + 47, y1 + 58);
	                        p2.addPoint(x1 + 53, y1 + 73);
	                        p2.addPoint(x1 + 69, y1 + 73);
	                        p2.addPoint(x1 + 56, y1 + 83);
	                        p2.addPoint(x1 + 61, y1 + 98);
	                        p2.addPoint(x1 + 47, y1 + 88);
	                        p2.addPoint(x1 + 34, y1 + 98);
	                        p2.addPoint(x1 + 38, y1 + 83);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p2);
	                        
	                        Rectangle myBigRectangle = new Rectangle(x1+10,y1+10,x1+210,y1+150);
	                        g.setColor(Color.black);
	                        g.drawRect(x1+10,y1+10,x1+210,y1+140);
	            }
	}

