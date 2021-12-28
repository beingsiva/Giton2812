

public class ReverseOrder {

	public static void main(String[] args) {
		String str="siva";
		int count=1;
		char[] ch=str.toCharArray();
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}	
	}

}
