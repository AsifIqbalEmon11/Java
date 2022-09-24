
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form7 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		
		
		
		public Form7()
	{
		super(" Page-5 ");
		this.setSize(750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(750,650));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l1 = new JLabel(" Thank you  " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,250,300,50);
		p1.add(l1);
		
		l2 = new JLabel("You will find your report in the Report section  " );
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.white);
		l2.setBounds(100,350,750,50);
		p1.add(l2);
		
		b1 = new JButton("Exit");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(300,500,100,50);
                b1.addActionListener(this);
		p1.add(b1);
		
		
			this.add(p1);
	}
	public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==b1)
			{
				Form1 f = new Form1();
				this.setVisible(false);
				f.setVisible(true);
			}
		
			
}

   
}
