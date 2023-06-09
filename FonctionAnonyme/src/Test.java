import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//class MaClasseDeListener implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("cliquez-moi a fonctionne !");
//		
//	}
	
	
//}
public class Test  extends JFrame{
	
	public Test() {
		JButton monBoutton=new JButton("Cliquez-moi");
		add(monBoutton);
//		MaClasseDeListener monListener=new MaClasseDeListener();
		
	
		monBoutton.addActionListener(new ActionListener(){//classe  anonyme

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("cliquez-moi a fonctionne !");
				
			}});
		
		pack();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test f=new Test();
		
		f.setVisible(true);
	
	}

}
