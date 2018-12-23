package Lab09_01;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

	//GridLayout 5X2
	public MainFrame() {
		this.setTitle("5X2 BUTTON");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cP = this.getContentPane();
		GridLayout grid = new GridLayout(5,2);
		
		grid.setVgap(5);
		grid.setHgap(5);
		
		cP.setLayout(grid);
		
		cP.add(new JButton("0"));
		cP.add(new JButton("1"));
		cP.add(new JButton("2"));
		cP.add(new JButton("3"));
		cP.add(new JButton("4"));
		cP.add(new JButton("5"));
		cP.add(new JButton("6"));
		cP.add(new JButton("7"));
		cP.add(new JButton("8"));
		cP.add(new JButton("9"));
		
		this.setSize(300,200);
		this.setVisible(true);
		
		
		
	}

	
	
	
}
