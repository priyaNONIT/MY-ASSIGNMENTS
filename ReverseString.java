package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String companyName="Test Leaf";
		System.out.println(companyName);
		char[] charArray = companyName.toCharArray();
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
			
		}
		// TODO Auto-generated method stub

	}

}
