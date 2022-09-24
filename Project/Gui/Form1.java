

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form1 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		
		
		
		public Form1()
	{
		super(" Page-1 ");
		this.setSize(750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(750,150));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel("Welcome to Online Health Consulter " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,50,750,50);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(750,650));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		b1 = new JButton("Patient");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(100,300,100,100);
                b1.addActionListener(this);
		p2.add(b1);
		
		
		b2 = new JButton("Doctor");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.blue);
		b2.setBackground(Color.green);
		b2.setBounds(300,300,100,100);
                b2.addActionListener(this);
		p2.add(b2);
		
		
		b3 = new JButton("Admin");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.red);
		b3.setBackground(Color.green);
		b3.setBounds(500,300,100,100);
                b3.addActionListener(this);
		p2.add(b3);
		this.add(p1);
		this.add(p2);
		
	}
	public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==b1)
			{
				Form2 f = new Form2();
				this.setVisible(false);
				f.setVisible(true);
			}
                  if(ae.getSource()==b2)
			{
				Form10 f = new Form10();
				this.setVisible(false);
				f.setVisible(true);
			}
                   if(ae.getSource()==b3)
			{
				
			}
			
}

   
}	
		
		
