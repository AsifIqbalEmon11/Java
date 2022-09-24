

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Form12 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		JTable j1;
		
		
		public Form12()
	{
		super(" Page-5 ");
		this.setSize(830,750);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(830,325));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel(" Report of the patient " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,10,750,50);
		p1.add(l1);
                
                l3 = new JLabel();
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l3.setForeground(Color.white);
		l3.setBounds(50,60,650,300);
		p1.add(l3);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(830,750));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		l4 = new JLabel(" Doctors Precribtion " );
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l4.setForeground(Color.white);
		l4.setBounds(100,340,750,50);
		p2.add(l4);
		
		l2 = new JLabel();
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.white);
		l2.setBounds(50,440,700,250);
		p2.add(l2);

		
		b1 = new JButton("Exit");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(600,650,80,50);
                b1.addActionListener(this);
		p2.add(b1);
		
	        
		b2 = new JButton("Result");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(500,650,80,50);
                b2.addActionListener(this);
		p2.add(b2);
	
		this.add(p1);
		this.add(p2);
	}public void actionPerformed(ActionEvent ae){
            
		 if(ae.getSource()==b1)
			{
				System.exit(0);
			}
                 if(ae.getSource()==b2)
			{
                            	
			}
		
}
}

