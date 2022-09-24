

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form21 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2,t3;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		JTable j1;
		
		
		public Form21()
	{
		super(" Page-2(1) ");
		this.setSize(750,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(750,150));
		p1.setBackground(Color.blue);
		p1.setLayout(null);
		
		l1 = new JLabel(" Account Creation " );
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l1.setForeground(Color.white);
		l1.setBounds(100,50,750,50);
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(750,650));
		p2.setBackground(Color.black);
		p2.setLayout(null);
		
		l2 = new JLabel("Email id : " );
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l2.setForeground(Color.red);
		l2.setBounds(75,200,150,50);
		p2.add(l2);
		
		l3 = new JLabel("User name " );
		l3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l3.setForeground(Color.red);
		l3.setBounds(75,285,150,50);
		p2.add(l3);
                
                l4 = new JLabel("Password " );
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		l4.setForeground(Color.red);
		l4.setBounds(75,370,150,50);
		p2.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(220,200,200,50);
		p2.add(t1);

		t2 = new JTextField();
		t2.setBounds(220,285,150,50);
		p2.add(t2);
                
                t3 = new JTextField();
		t3.setBounds(220,370,150,50);
		p2.add(t3);
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.white);
		b1.setBackground(Color.green);
		b1.setBounds(300,450,100,50);
                b1.addActionListener(this);
		p2.add(b1);
                this.add(p1);
                 this.add(p2);
        }public void actionPerformed(ActionEvent ae){
		 if(ae.getSource()==b1)
			{
				Form3 f = new Form3();
				this.setVisible(false);
				f.setVisible(true);
			}
                
                
}
}
		
