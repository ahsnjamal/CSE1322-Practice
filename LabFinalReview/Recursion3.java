package LabFinalReview;

public class Recursion3 {
	static public String Reverse(String s){
		if (s.length()==1) 
			return s;
		else return Reverse(s.substring(1)) + s.charAt(0);
}

	public static void main(String[]args) {
		System.out.println(Reverse("batman"));
	}
}
