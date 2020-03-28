import javax.swing.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import java.awt.*; 	
import java.lang.Object.*;

class Calculator1 implements ActionListener
{
	JFrame f;
    JTextField t,t1,t2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
    JRadioButton r1,r2;
	int incre =50;
	String data;
	boolean flag = false;
	char a=' ';
	ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
	Calculator1()
	{
		//initialize
		f=new JFrame("Calculator");
        t=new JTextField();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");
		r1=new JRadioButton("ON");
        r2=new JRadioButton("OFF");
		r1.setBounds(20,20,80,10);
		r2.setBounds(100,20,80,10);
		t.setBounds(30,40,280,30);
        t1.setBounds(170, 100, 140, 30);
        t2.setBounds(30, 100, 140, 30);
        b7.setBounds(40,100+incre,50,40);
        b8.setBounds(110,100+incre,50,40);
        b9.setBounds(180,100+incre,50,40);
        bdiv.setBounds(250,100+incre,50,40);
        
        b4.setBounds(40,170+incre,50,40);
        b5.setBounds(110,170+incre,50,40);
        b6.setBounds(180,170+incre,50,40);
        bmul.setBounds(250,170+incre,50,40);
        
        b1.setBounds(40,240+incre,50,40);
        b2.setBounds(110,240+incre,50,40);
        b3.setBounds(180,240+incre,50,40);
        bsub.setBounds(250,240+incre,50,40);
        
        bdec.setBounds(40,310+incre,50,40);
        b0.setBounds(110,310+incre,50,40);
        beq.setBounds(180,310+incre,50,40);
        badd.setBounds(250,310+incre,50,40);
        
        bdel.setBounds(60,380+incre,100,40);
        bclr.setBounds(180,380+incre,100,40);
		
		

		f.add(t);
		f.add(r1);
		f.add(r2);
        f.add(t1);
        f.add(t2);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);
		
		
		f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
        f.setResizable(false);
        f.setLocation(new java.awt.Point(500, 170));
	
		//style
		
		
		
		
		//actionlistener call
		b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
		r1.addActionListener(this);
		r2.addActionListener(this);
		disableall();
		
			
	}
	public void disableall()
	{
		t.setEnabled(false);
		t1.setEnabled(false);
		t2.setEnabled(false);
		b1.setEnabled(false);
		beq.setEnabled(false);
		bdel.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b0.setEnabled(false);
		badd.setEnabled(false);
		bdiv.setEnabled(false);
		bmul.setEnabled(false);
		bsub.setEnabled(false);
		bdec.setEnabled(false);
		bclr.setEnabled(false);
		r1.setEnabled(true);
		r2.setEnabled(false);
		
	}
	public void enableall()
	{
		t.setEnabled(true);
		t1.setEnabled(true);
		t2.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b0.setEnabled(true);
		badd.setEnabled(true);
		bdiv.setEnabled(true);
		bmul.setEnabled(true);
		bsub.setEnabled(true);
		bdec.setEnabled(true);
		bclr.setEnabled(true);
		r1.setEnabled(false);
		r2.setEnabled(true);
		beq.setEnabled(true);
		bdel.setEnabled(true);
	}
	public void actionPerformed(ActionEvent e)
    {	
		if(e.getSource()==r1)
		{
			enableall();
			
			r2.setSelected(false) ;
		}
		if(e.getSource()==r2)
		{
			disableall();
			r1.setSelected(false) ;
		}
        if(e.getSource()==b1)
        {
            t.setText(t.getText().concat("1"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
        }
        
        if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
        }
        
        if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        
        if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        
        if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        
        if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        
        if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        
        if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        
        if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        
        if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
		if(e.getSource()==bdec)
        {
            t.setText(t.getText().concat("."));
        
		}
		if(e.getSource()==badd)
        {
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
			
			if(flag==true)
			{
				a =data.charAt(data.length() - 1);
				if(a=='+' || a=='-' || a=='*' || a=='/') 
				{
					data = data.substring(0,data.length() - 1);
					t.setText(data);
				}
			}
			
			t.setText(t.getText().concat("+"));
			t1.setText("+");
			flag = true;
			//a='+';
        } 
        if(e.getSource()==bsub)
        {
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
			if(flag==true)
			{
				char a =data.charAt(data.length() - 1);
				if(a=='+' || a=='-' || a=='*' || a=='/') 
				{
					data = data.substring(0,data.length() - 1);
					t.setText(data);
				}
			}
			t.setText(t.getText().concat("-"));
			t1.setText("-");
			flag = true;
			//a='-';
		}
		if(e.getSource()==bmul)
        {
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
  			if(flag==true)
			{
				char a =data.charAt(data.length() - 1);
				if(a=='+' || a=='-' || a=='*' || a=='/') 
				{
					data = data.substring(0,data.length() - 1);
					t.setText(data);
				}
			}
			t.setText(t.getText().concat("*"));
			t1.setText("*");
			flag = true;
			//a='*';
        }
        if(e.getSource()==bdiv)
        {
			if (flag == true)
			{
				data= t.getText();
				calcu(data);
			}
			if(flag==true)
			{
				char a =data.charAt(data.length() - 1);
				if(a=='+' || a=='-' || a=='*' || a=='/') 
				{	
					data = data.substring(0,data.length() - 1);
					t.setText(data);
				}
			}
			t.setText(t.getText().concat("/"));
			t1.setText("/");
			flag = true;
			
		}
		if(e.getSource()==beq)
        {
			data= t.getText();
			calcu(data);
        }
        
        if(e.getSource()==bclr)
        {
			t.setText("");
			t1.setText("");
			t2.setText("");
			flag=false;
			
        }
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }        
	}
	
	public void calcu(String cal)
	{
		try
		{
			String infix = cal;
			t2.setText(String.valueOf(engine.eval(infix)));
		}
		catch(Exception e)
		{
			t2.setText("WRONG INPUT");
		}
	}
	public static void main(String[] args)
	{
		new Calculator1();
	}
} 