package j20_Collection;
import java.util.Scanner;
import java.util.TreeMap;
public class Country_with_TreeMap {
public static void main(String[] args) {
	TreeMap<String,String> tm = new TreeMap<>();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the number of elements: ");
	int n = scanner.nextInt();
	scanner.nextLine();
	System.out.println();
	
	System.out.println("Enter "+n+" elements:");
	
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter country "+(i+1)+" name: ");
		String country = scanner.nextLine();
		System.out.print("Enter capital of " + country + ": ");
		String capital = scanner.nextLine();
		System.out.println();
		tm.put(country, capital);
	}
	System.out.println();
	
	  System.out.print("Enter the country name to find its capital: ");
      String countryLookup = scanner.nextLine();
      
      if (tm.containsKey(countryLookup)) {
          System.out.println("The capital of " + countryLookup + " is " + tm.get(countryLookup));
      } else {
          System.out.println("Country not found in the map.");
      }

scanner.close();
	}

}


