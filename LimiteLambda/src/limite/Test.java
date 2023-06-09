package limite;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test extends JFrame {
	//JTextField text;
	
	Test(){
		setLayout(new FlowLayout());
		JTextField text=new JTextField("Bonjour tout le monde !");
		add(text);
		
		JButton click=new JButton("clic");
		add(click);
		
		click.addActionListener(ae->text.setText("Bonjour Bamba"));
		
	}
	

	public static void main(String[] args) {
		
		Test f=new Test();
		f.setVisible(true);

	}

}
