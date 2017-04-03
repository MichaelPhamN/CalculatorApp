package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Calculator extends JFrame implements ActionListener, KeyListener{
	private int x = 400, y = 100;
	private int width = 300, height = 380; 
	
	public Calculator() {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("Calculator - Basic");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(false);
		jf.setBounds(x,y,width,height);
		jf.setJMenuBar(createMenuBar());
		
		
		jf.setVisible(true);
	}

	//============== Sub Functions ==============
	public JMenuBar createMenuBar(){
		JMenuBar jmb = new JMenuBar();	
		
		JMenu jm1 = createMenu("Mode", KeyEvent.VK_M);		
		jm1.add(createMenuItem("Basic", KeyEvent.VK_B));
		jm1.add(createMenuItem("Advanced", KeyEvent.VK_A));
		jm1.add(createMenuItem("Program", KeyEvent.VK_P));
		jm1.addSeparator();
		jm1.add(createMenuItem("Exit", KeyEvent.VK_X));
		
		JMenu jm2 = createMenu("Help", KeyEvent.VK_H);
		jm2.add(createMenuItem("Help", KeyEvent.VK_H));
		jm2.add(createMenuItem("About", KeyEvent.VK_A));
		
		jmb.add(jm1);
		jmb.add(jm2);
		
		return jmb;
		
	}
	
	public JMenu createMenu(String title, int key){
		JMenu jm = new JMenu(title);		
		jm.setMnemonic(key);
		return jm;
		
	}
	
	public JMenuItem createMenuItem(String title, int key){
		JMenuItem jmi = new JMenuItem(title, key);
		jmi.addActionListener(this);
		return jmi;
	}
	
	
	//============== Actions Event ==============
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
