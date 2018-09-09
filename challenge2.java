import java.io.BufferedReader;
import java.io.InputStreamReader;
//for scanner
import java.util.*;
import java.lang.*;

class challenge2{
	public static void main(String[] args) throws Exception {
		challenge2 ca = new challenge2();
		Scanner s1 = new Scanner(System.in);
		//System.out.println("Enter the no. of test cases");
		int noOfCases = s1.nextInt();
		List<Character> vowels = Arrays. asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		List<Integer> counts = new ArrayList<Integer>();
		String designOfChocolate="";
		//System.out.println("Enter the design of chocolate");
		for(int i =0;i<noOfCases;i++){
			designOfChocolate = s1.next();
		}
		if(designOfChocolate.length()<=100000 && noOfCases<=10){
			for(int i=0;i<designOfChocolate.length();i++){
				for(int j=i;j<designOfChocolate.length()+1;j++){
					String str = designOfChocolate.substring(i,j);
					//System.out.println(str);
					int sum1 =0;
					for(int k=0;k<str.length();k++){
						if(vowels.contains(str.charAt(k))){
							sum1++;
						}		
					}
					counts.add(sum1);
				}
			}
			//System.out.println(counts);
			int totalWays =0;
			for(int count : counts){
				totalWays+=count;
			}
			System.out.println(totalWays);
		}
		else
			System.exit(0);
	}
}
