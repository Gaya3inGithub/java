package j7_logical_programming;
import java.util.Scanner;
public class Count_vow_and_cons_in_str {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s =scanner.nextLine();
		int count_vowels=0;
		int count_Consonants=0;
		for(int i=0;i<s.length();i++)
		{
		char a=s.toLowerCase().charAt(i);
		 if(a=='a' ||  a=='e' || a=='i' || a=='o' || a=='u')
	      {
			count_vowels++;
					  }
		 else if(a!='a'&& a!='e' && a!='i' && a!='o' && a!='u')
		 {
			 count_Consonants++;
		 }
		}
		System.out.println("Total no of vowels : "+count_vowels);
		 System.out.println("Total no of consonants : "+count_Consonants);


		scanner.close();
	}

}
