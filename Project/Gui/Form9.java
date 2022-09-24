

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Form9 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		JTable j1;
		
		
		public Form9()
	{
		super(" Page-4 ");
		this.setSize(750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(750,120));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel(" List of BMI patients  " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,40,750,50);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(750,650));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		l2 = new JLabel("Press on the serial no of the patient to check the report " );
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.red);
		l2.setBounds(15,150,750,50);
		p2.add(l2);
		
		l3 = new JLabel("1.no Patient  " );
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l3.setForeground(Color.white);
		l3.setBounds(175,220,250,50);
		p2.add(l3);
                
                l4 = new JLabel();
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l4.setForeground(Color.white);
		l4.setBounds(50,230,450,350);
		p2.add(l2);
                
                b1 = new JButton("1");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(100,220,40,40);
                b1.addActionListener(this);
		p2.add(b1);
                
                  b2 = new JButton("Pescribe");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(450,550,100,50);
                b2.addActionListener(this);
		p2.add(b2);
                this.add(p1);
                  this.add(p2);
                
        }
                public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==b1)
			{
				
			}
                 if(ae.getSource()==b2)
			{
				Form13 f = new Form13();
				this.setVisible(false);
				f.setVisible(true);
			}
                
                
}
}