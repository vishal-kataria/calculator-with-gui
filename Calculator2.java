import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine; 	
import javax.swing.SwingUtilities;
import java.util.*;

class Calculator2 implements ActionListener
{
	JFrame f;
    JTextField t,t1,t2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bsin,bcos,btan,blog,bsq,bpie,asin,sinh,acos,cosh,atan,tanh,bsqrt,bper,babs,bo,bc;
    JRadioButton r1,r2,r3,r4;
	ButtonGroup bg;
	int incre =50;
	ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
	String data;
	boolean flag = false,sc=false,equal=false,chk= false;
	char a=' ';
	int count =0; 

	Calculator2()
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
		bo=new JButton("(");
		bc=new JButton(")");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");
		bsin=new JButton("sin");
		bcos=new JButton("cos");
		btan=new JButton("tan");
		blog=new JButton("log");
		bsq=new JButton("^2");
		bpie=new JButton("pie");
		asin=new JButton("asin");
		sinh=new JButton("sinh");
		acos=new JButton("acos");
		cosh=new JButton("cosh");
		atan=new JButton("atan");
		tanh=new JButton("tanh");
		bper=new JButton("reminder");
		babs=new JButton("abs");
		bsqrt= new JButton("sqrt");
		r1=new JRadioButton("ON");
        r2=new JRadioButton("OFF");
		r3=new JRadioButton("Radian",true);    
		r4=new JRadioButton("Degree"); 
		bg=new ButtonGroup(); 
		
		bg.add(r3);
		bg.add(r4);
		r1.setBounds(20,20,80,10);
		r2.setBounds(100,20,80,10);
		r3.setBounds(360,50,100,10);
		r4.setBounds(360,100,100,10);
		t.setBounds(30,40,280,30);
        t1.setBounds(170, 100, 140, 30);
        t2.setBounds(30, 100, 140, 30);
		bo.setBounds(474, 30, 69,40);
		bc.setBounds(474, 90, 69,40);
        b7.setBounds(40,100+incre,50,40);
        b8.setBounds(110,100+incre,50,40);
        b9.setBounds(180,100+incre,50,40);
        bdiv.setBounds(250,100+incre,50,40);
		bsin.setBounds(320,100+incre,55,40);
		asin.setBounds(395,100+incre,62,40);
        sinh.setBounds(474,100+incre,69,40);
        
        b4.setBounds(40,170+incre,50,40);
        b5.setBounds(110,170+incre,50,40);
        b6.setBounds(180,170+incre,50,40);
        bmul.setBounds(250,170+incre,50,40);
        bcos.setBounds(320,170+incre,55,40);
        acos.setBounds(395,170+incre,62,40);
        cosh.setBounds(474,170+incre,69,40);
		
        b1.setBounds(40,240+incre,50,40);
        b2.setBounds(110,240+incre,50,40);
        b3.setBounds(180,240+incre,50,40);
        bsub.setBounds(250,240+incre,50,40);
        btan.setBounds(320,240+incre,55,40);
        atan.setBounds(395,240+incre,62,40);
        tanh.setBounds(474,240+incre,69,40);
		
        bdec.setBounds(40,310+incre,50,40);
        b0.setBounds(110,310+incre,50,40);
        beq.setBounds(180,310+incre,50,40);
        badd.setBounds(250,310+incre,50,40);
        blog.setBounds(320,310+incre,55,40);
        bpie.setBounds(395,310+incre,62,40);
		bsqrt.setBounds(474,310+incre,69,40);
        
		
        bdel.setBounds(60,380+incre,100,40);
        bclr.setBounds(180,380+incre,100,40);
		bper.setBounds(300,380+incre,100,40);
		babs.setBounds(420,380+incre,100,40);
		//bsqrt.setBounds(474,380+incre,69,40);
		//adding on frame
		f.add(t);
		f.add(r1);
		f.add(r2);
        f.add(t1);
        f.add(t2);
        f.add(b7);
        f.add(b8);
        f.add(b9);
		f.add(bo);
		f.add(bc);
        f.add(bdiv);
		f.add(bsin);
		f.add(asin);
		f.add(sinh);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
		f.add(bcos);
		f.add(acos);
		f.add(cosh);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
		f.add(btan);
		f.add(atan);
		f.add(tanh);
        f.add(bdec);
        f.add(b0);
		f.add(babs);
        f.add(beq);
		f.add(bo);
		f.add(bc);
		f.add(blog);
		f.add(bpie);
        f.add(badd);
        f.add(bdel);
		f.add(bsqrt);
        f.add(bclr);
		f.add(bper);
		f.add(r3);
		f.add(r4);
		
		f.setLayout(null);
        f.setVisible(true);
        f.setSize(570,525);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );
        f.setResizable(false);
        f.setLocation(new java.awt.Point(500, 170));
	
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
		r3.addActionListener(this);
		r4.addActionListener(this);
		bsin.addActionListener(this);
        bcos.addActionListener(this);
        btan.addActionListener(this);
        bsq.addActionListener(this);
		blog.addActionListener(this);
		bpie.addActionListener(this);
		asin.addActionListener(this);
		sinh.addActionListener(this);
		acos.addActionListener(this);
		cosh.addActionListener(this);
		atan.addActionListener(this);
		tanh.addActionListener(this);
		bsqrt.addActionListener(this);
		babs.addActionListener(this);
		bper.addActionListener(this);
		bo.addActionListener(this);
		bc.addActionListener(this);
	
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
		r3.setEnabled(false);
		r4.setEnabled(false);
		bsin.setEnabled(false);
		bcos.setEnabled(false);
		btan.setEnabled(false);
		bsq.setEnabled(false);
		blog.setEnabled(false);
		bpie.setEnabled(false);
		asin.setEnabled(false);
		sinh.setEnabled(false);
		acos.setEnabled(false);
		cosh.setEnabled(false);
		atan.setEnabled(false);
		tanh.setEnabled(false);
		bper.setEnabled(false);
		babs.setEnabled(false);
		bsqrt.setEnabled(false);
		bo.setEnabled(false);
		bc.setEnabled(false);
		
	}
	public void enableall()
	{
		bo.setEnabled(true);
		bc.setEnabled(true);
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
		r3.setEnabled(true);
		r4.setEnabled(true);
		beq.setEnabled(true);
		bdel.setEnabled(true);
		bsin.setEnabled(true);
		bcos.setEnabled(true);
		btan.setEnabled(true);
		bsq.setEnabled(true);
		blog.setEnabled(true);
		bpie.setEnabled(true);
		asin.setEnabled(true);
		sinh.setEnabled(true);
		acos.setEnabled(true);
		cosh.setEnabled(true);
		atan.setEnabled(true);
		tanh.setEnabled(true);
		bper.setEnabled(true);
		babs.setEnabled(true);
		bsqrt.setEnabled(true);
		
	
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
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
        }
        if(e.getSource()==b2)
        {
            t.setText(t.getText().concat("2"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
        }
        if(e.getSource()==b3)
        {
            t.setText(t.getText().concat("3"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        if(e.getSource()==b4)
        {
            t.setText(t.getText().concat("4"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        if(e.getSource()==b5)
        {
            t.setText(t.getText().concat("5"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        if(e.getSource()==b6)
        {
            t.setText(t.getText().concat("6"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        if(e.getSource()==b7)
        {
            t.setText(t.getText().concat("7"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        if(e.getSource()==b8)
        {
            t.setText(t.getText().concat("8"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        if(e.getSource()==b9)
        {
            t.setText(t.getText().concat("9"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
        if(e.getSource()==b0)
        {
            t.setText(t.getText().concat("0"));
			if (flag == true || sc == true)
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
			//a='/';
		}
		if(e.getSource()==beq)
        {
				equal= true;
				brackets();
				data= t.getText();
				calcu(data);
				
		}
        if(e.getSource()==bclr)
        {
			data=null;
			t.setText("");
			t1.setText("");
			t2.setText("");
			flag = false;
			sc=false;
			equal=false;
			chk= false;
        }
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }
		if(e.getSource()==bsin)
        {
			t.setText(t.getText().concat("(sin("));
			sc = true;
		}
		if(e.getSource()==bcos)
        {	
			t.setText(t.getText().concat("(cos("));
			sc = true;
		}
		if(e.getSource()==btan)
        {
			t.setText(t.getText().concat("(tan("));
			sc = true;
		}
		if(e.getSource()==blog)
        {
			t.setText(t.getText().concat("log("));
			sc = true;
		}
		if(e.getSource()==bpie)
        {
			t.setText(t.getText().concat("22/7"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
        }
		if(e.getSource()==asin)
        {
			t.setText(t.getText().concat("(asin("));
			sc = true;
		}
		if(e.getSource()==sinh)
        {	
			t.setText(t.getText().concat("(sinh("));
			sc = true;
		}
		if(e.getSource()==acos)
        {
			t.setText(t.getText().concat("(acos("));
			sc = true;
		}
		if(e.getSource()==cosh)
        {
			t.setText(t.getText().concat("(cosh("));
			sc = true;
		}
		if(e.getSource()==atan)
        {
			t.setText(t.getText().concat("(atan("));
			sc = true;
		}
		if(e.getSource()==tanh)
        {
			t.setText(t.getText().concat("(tanh("));
			sc = true;
		}
		if(e.getSource()==bsqrt)
        {
			
			t.setText(t.getText().concat("sqrt("));
			sc = true;
		}
		if(e.getSource()==babs)
        {
			String vk = null;
			int a;
			vk = t2.getText();
			a=Integer.parseInt(vk);
			if(a<0)
				a=-a;
			vk= Integer.toString(a);
			t2.setText(vk);
		}
		if(e.getSource()==bper)
		{
			t.setText(t.getText().concat("%"));
			if (flag == true || sc == true)
			{
				data= t.getText();
				calcu(data);
			}
		}
	}
	public void calcu(String cal)
	{
		if((sc== false )||(sc == true && equal == true))
		{
			if(equal==true)
			{
				cal=math(cal);
				if(r4.isSelected()==true)
				{
				cal =degree(cal);	
				}
			}
			try
			{
				String infix = cal;
				t2.setText(String.valueOf(engine.eval(infix)));
				//t2.setText(infix);
			}
			catch(Exception e)
			{
				t2.setText("WRONG INPUT");
			}
		}
	}
	public static String math(String vk)
	{
		StringBuffer buf = new StringBuffer(vk);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<=buf.length()-2;i++)
		{
			if(buf.charAt(i)=='s' && buf.charAt(i+1)=='i' && buf.charAt(i+2)=='n')
			{
				if(buf.charAt(i-1)=='a')
				{
				}
				else
				{
					list.add(i);
				}
			}
			if(buf.charAt(i)=='c' && buf.charAt(i+1)=='o' && buf.charAt(i+2)=='s')
			{
				if(buf.charAt(i-1)=='a')
				{
				}
				else
				{
					list.add(i);
				}
			}
			if(buf.charAt(i)=='t' && buf.charAt(i+1)=='a' && buf.charAt(i+2)=='n')
			{
				if(buf.charAt(i-1)=='a')
				{
				}
				else
				{
					list.add(i);
				}	
			}
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='s' && buf.charAt(i+2)=='i' && buf.charAt(i+3)=='n')
			{
				list.add(i);
			}
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='c' && buf.charAt(i+2)=='o' && buf.charAt(i+3)=='s')
			{
				list.add(i);
			}
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='t' && buf.charAt(i+2)=='a' && buf.charAt(i+3)=='n')
			{
				list.add(i);
			}
			if(buf.charAt(i)=='l' && buf.charAt(i+1)=='o' && buf.charAt(i+2)=='g')
			{
				list.add(i);
			}
			if(buf.charAt(i)=='s' && buf.charAt(i+1)=='q' && buf.charAt(i+2)=='r' && buf.charAt(i+3)=='t')
			{
				list.add(i);
			}
		}

//System.out.println("Contents of al:"+list);
		for(int i=(list.size()-1);i>=0;i--)
		{
			buf.insert(list.get(i), "Math.");
			vk = buf.toString();
		}
		
		return vk;
	}
	public void brackets()
	{
		count=0;
			data= t.getText();
			if(sc == true)
			{
				for(int i=0; i<data.length(); i++)
				{
					if(data.charAt(i)=='(')
					{
						count = count+1;
					}
				}
				for(int i=0; i<data.length(); i++)
				{
					if(data.charAt(i)==')')
					{
						count = count-1;
					}	
				}
				if(count!=0)
				{
					for(int i=1;i<=count;i++)
					{
						t.setText(t.getText().concat(")"));
					}
				}
				sc=false;
			}	
	}
	public static String degree(String vk)
	{
		StringBuffer buf = new StringBuffer(vk);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<=buf.length()-2;i++)
		{
			if(buf.charAt(i)=='s' && buf.charAt(i+1)=='i' && buf.charAt(i+2)=='n')
			{
				if(buf.charAt(i-1)=='a')
				{
				}
				else
				{
					list.add(i+4);
				}
			}
			if(buf.charAt(i)=='c' && buf.charAt(i+1)=='o' && buf.charAt(i+2)=='s')
			{
				if(buf.charAt(i-1)=='a')
				{
				}
				else
				{
					list.add(i+4);
				}
			}
			if(buf.charAt(i)=='t' && buf.charAt(i+1)=='a' && buf.charAt(i+2)=='n')
			{	
				if(buf.charAt(i-1)=='a')
				{
				}
				else
				{
					list.add(i+4);
				}
			}
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='s' && buf.charAt(i+2)=='i' && buf.charAt(i+3)=='n')
			{	
				list.add(i+5);
			}
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='c' && buf.charAt(i+2)=='o' && buf.charAt(i+3)=='s')
			{
				list.add(i+5);
			}	
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='t' && buf.charAt(i+2)=='a' && buf.charAt(i+3)=='n')
			{
				list.add(i+5);
			}
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='s' && buf.charAt(i+2)=='i' && buf.charAt(i+3)=='n' && buf.charAt(i+4)=='h')
			{	
				list.add(i+6);
			}
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='c' && buf.charAt(i+2)=='o' && buf.charAt(i+3)=='s' && buf.charAt(i+4)=='h')
			{
				list.add(i+6);
			}	
			if(buf.charAt(i)=='a' && buf.charAt(i+1)=='t' && buf.charAt(i+2)=='a' && buf.charAt(i+3)=='n' && buf.charAt(i+4)=='h')
			{
				list.add(i+6);
			}
		}
		for(int i=(list.size()-1);i>=0;i--)
		{
			buf.insert(list.get(i), "(Math.PI/180)*");
			vk = buf.toString();
		}
		return vk;
	}
	public static void main(String[] args)
	{
		new Calculator2();
	}
} 