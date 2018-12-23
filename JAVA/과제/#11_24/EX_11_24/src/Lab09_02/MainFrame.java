package Lab09_02;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	public MainFrame() {
		
		this.setTitle("Border Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout b1= new BorderLayout(5,5);
		Container cP1 = this.getContentPane();
		cP1.setLayout(b1);

	    cP1.add(new JButton("E"),   BorderLayout.EAST);  
	    cP1.add(new JButton("W "),   BorderLayout.WEST);  
	    cP1.add(new JButton("N "),  BorderLayout.NORTH); 
	    cP1.add(new JButton("S"),  BorderLayout.SOUTH);
		
		
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout(5,5));
		p.add(new JButton("e"),   BorderLayout.EAST);  
		p.add(new JButton("w "),   BorderLayout.WEST);  
		p.add(new JButton("n "),  BorderLayout.NORTH); 
		p.add(new JButton("s"),  BorderLayout.SOUTH);
		
		//cP1.add(p, BorderLayout.CENTER);
		p.add(new JButton("c"),  BorderLayout.CENTER);		
		cP1.add(p, BorderLayout.CENTER);
		
		this.setSize(300,200);
		this.setVisible(true);
	}

}
