import javax.swing.JFrame;

public class Lab3Exercises 
{
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Maria Celeste");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(900,450);
		myFrame.setSize(300, 300);

		myFrame.setVisible(true);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
	}
}