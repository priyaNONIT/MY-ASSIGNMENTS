package week4.day1;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		String companyName="google";
		char[] set = companyName.toCharArray();
		String empty="";
		Set<Character>unique=new LinkedHashSet<Character>();
		for (Character setoutput : set) {
			unique.add(setoutput);
			
		}
		// TODO Auto-generated method stub
		for (Character output : unique) {
			empty=empty+output;
			
		}
		System.out.println(empty);
	}

}
