package dao;

public interface DocumentDAO {
	
	Document creer();
	Document recuperer(long ID);
	Document modifier(Document doc);
	boolean delete(Document doc);
	
	

}
