package demo;

public class StringRemoveAllOccurance {

	public static void main(String[] args) {
		String str="testleaf";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='t') {
				System.out.println(ch[i]+" ");
			}
		
			
		}
}
}