import javax.swing.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine; 	
class Calculator_main implements ActionListener
{
	JButton b1,b2;
	JFrame f;
	Calculator_main()
	{
		f=new JFrame("Calculator");
		b1=new JButton("Simple Calculator");
        b2=new JButton("Scientific Calculator");
		b1.setBounds(50,50,200,40);
        b2.setBounds(50,100,200,40);
        			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
        f.add(b1);
        f.add(b2);
		f.setLayout(null);
        f.setVisible(true);
        f.setSize(320,230);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocation(new java.awt.Point(500, 170));
	
        b1.addActionListener(this);
        b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
    {
		if(e.getSource()==b1)
        {
			new Calculator1();	
		}
		if(e.getSource()==b2)
        {
			new Calculator2();
		}
	}
	public static void main(String[] args)
	{
		new Calculator_main();
	}
}