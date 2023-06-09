import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test2 extends JFrame{
	
	public Test2() {
		JButton monBoutton=new JButton("Cliquez-moi");
		add(monBoutton);
//		MaClasseDeListener monListener=new MaClasseDeListener();
		
	
		monBoutton.addActionListener(e->System.out.println("cliquez-moi a fonctionne !"));//fonction anonyme
		
		pack();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test f=new Test();
		
		f.setVisible(true);
	
	}

}
