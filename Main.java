import javax.swing.*;


public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new Display());
		frame.setVisible(true);
	}
}
