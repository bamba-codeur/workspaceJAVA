package string;

public class Principal {

	public static void main(String[] args) {
		
		String str="123";
		
		long debut=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			str+="abc";
		
		long fin=System.currentTimeMillis();
		
		System.out.println("String :" +(fin-debut));
		
		
		StringBuilder strb=new StringBuilder("123");
		debut=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			strb.append("abc");
		fin=System.currentTimeMillis();
		
		System.out.println("StringBuilder :" +(fin-debut));
		
		
		String res=strb.toString();
		
		

	}

}
