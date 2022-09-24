

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form8 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		
		
		
		public Form8()
	{
		super(" Page-3 ");
		this.setSize(750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(750,150));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel(" Online Health Consulter " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,50,750,50);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(750,650));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		
		
		b1 = new JButton("Patients of BMI Check Up");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(250,180,300,50);
                b1.addActionListener(this);
		p2.add(b1);
		
		
		b2 = new JButton("Patients of Corona Virus Check Up");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.blue);
		b2.setBackground(Color.green);
		b2.setBounds(250,250,400,50);
                b2.addActionListener(this);
		p2.add(b2);
		
		b3 = new JButton("Patients of Diabetes Check Up");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setBounds(250,330,350,50);
                b3.addActionListener(this);
		p2.add(b3);
		
		
		b4 = new JButton("Reports of patients ");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.blue);
		b4.setBackground(Color.green);
		b4.setBounds(250,410,300,50);
                b4.addActionListener(this);
		p2.add(b4);
		
		
		
	
		this.add(p1);
		this.add(p2);
		
		}public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==b1)
			{
				Form9 f = new Form9();
				this.setVisible(false);
				f.setVisible(true);
			}
			 if(ae.getSource()==b4)
			{
				Form12 f = new Form12();
				this.setVisible(false);
				f.setVisible(true);
			}
			
}
}