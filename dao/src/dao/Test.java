package dao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DocumentDAO doc=FabriquePersistance.createDocumentDAO();
		
		Document d= doc.creer();

	}

}
