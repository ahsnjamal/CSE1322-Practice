package T3Recursion;

public class PowerFactorial {
		public static void main(String[] args) {
			int x = 5, y = 5;
			System.out.println("The "+x+" to the power "+y+" is: "+power(x,y));
		}
		static int power(int x, int y) {
			if(y == 1)
				return x;
			else {
				return x * power(x, y-1);// 5 * 5^4
				}
			}
		}
