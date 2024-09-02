package lab06;;public class gradereport {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);double[] Scores = new double[10];
		for(int i=0;i<10;i++){
			System.out.println("Enter score " + (i+1));scores[i]=in.nextdouble();
		}
		
		for(int i=0;i<10;i++){
			if (scores[i] >=80)
				System.out.println("Score " + (i+1) + " receives a grade of HD");
			else if (scores[i]>=70)
				System.out.println("Score " + (i+1) + " receives a grade of D");
			else if (scores[i] >=60)
				System.out.println("Score "+ (i+1) + " receives a grade of C");
			else if (scores[i] >=50)
				System.out.println("Score " + (i+1) + " receives a grade of P");
			else if (scores[i] >=40)
				System.out.println("Score " + (i+1) + " receives a grade of MF");
			else if (scores[i] >=0)
				System.out.println("Score " + (i+1) + " receives a grade of F");
			else 
				System.out.println("Score " + (i+1) + " was invalid!");
		}}}
