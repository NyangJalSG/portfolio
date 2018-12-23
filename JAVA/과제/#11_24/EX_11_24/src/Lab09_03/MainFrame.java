package Lab09_03;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	JTextField textnum = new JTextField("0");
	
	JButton btnAC = new JButton("AC");
	JButton btnM1 = new JButton("+/-");
	JButton btnRem = new JButton("%");
	JButton btnDi = new JButton("/");
	JButton btnMu = new JButton("X");
	JButton btnSu = new JButton("-");
	JButton btnAd = new JButton("+");
	JButton btnRes = new JButton("=");
	
	JButton btn012 = new JButton("1");
	JButton btn01 = new JButton("1");
	JButton btn02 = new JButton("2");
	JButton btn03 = new JButton("3");
	JButton btn04 = new JButton("4");
	JButton btn05 = new JButton("5");
	JButton btn06 = new JButton("6");
	JButton btn07 = new JButton("7");
	JButton btn08 = new JButton("8");
	JButton btn09 = new JButton("9");
	JButton btn00 = new JButton("0");
	
	Panel panel1 = new Panel();
	Panel panel2 = new Panel();
	Panel panel3 = new Panel();
	Panel panel4 = new Panel();
	Panel panel5 = new Panel();
	Panel panel6 = new Panel();
	Panel panel62 = new Panel();
	
	
	public MainFrame() {
		this.setTitle("°è»ê±â");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cP = this.getContentPane();
		cP.setLayout(new GridLayout(6,1));
		panel1.setLayout(new GridLayout(1,1));
		textnum.setHorizontalAlignment(JTextField.RIGHT);
		panel1.add(textnum);
		
		panel2.setLayout(new GridLayout(1,4));
		panel2.add(btnAC);
		panel2.add(btnM1);
		panel2.add(btnRem);
		panel2.add(btnDi);
		panel3.setLayout(new GridLayout(1,4));
		panel3.add(btn07);
		panel3.add(btn08);
		panel3.add(btn09);
		panel3.add(btnMu);
		panel4.setLayout(new GridLayout(1,4));
		panel4.add(btn04);
		panel4.add(btn05);
		panel4.add(btn06);
		panel4.add(btnSu);
		panel5.setLayout(new GridLayout(1,4));
		panel5.add(btn01);
		panel5.add(btn02);
		panel5.add(btn03);
		panel5.add(btnAd);		
		
		panel6.setLayout(new GridLayout(1,2));		
		panel6.add(btn00);		
		
		panel62.setLayout(new GridLayout(1,2));
		panel62.add(btn012);
		panel62.add(btnRes);
				
		panel6.add(panel62);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);
		this.add(panel5);
		this.add(panel6);
		
		
		
		this.setSize(300,200);
		this.setVisible(true);
		
	}
}
