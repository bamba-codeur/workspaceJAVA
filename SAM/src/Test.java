import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame{
	
	Test(){
		
		JButton button=new JButton("click");
		add(button);
		
		button.addActionListener(ae->System.out.println("coucou !"));
		
		pack();
	}
	
	public static  void appelInterfaceSAM(MonInterfaceSAM i) {
		i.execute();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appelInterfaceSAM(()->System.out.println("execution !"));

	}

}
