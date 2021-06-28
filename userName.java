import java.io.*;
import java.util.*;

class UserName {
	
	
	static void containsUsername(HashSet v ) {
		
	}
										//br.readLine throws an exception
	public static void main(String[] args) throws IOException {
			
			//to make stream with keyboard for user input
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//static UserName obj = new UserName();
			
			HashSet v = new HashSet();
			//Assume this list of username are there in 
			v.add("prashant.paulbudhe@excellarate.com");
			v.add("Aditi306sak@outlook.com");
			v.add("Heema670@gmail.com");
			
		
            String name = "";
            while (!"q".equalsIgnoreCase(name)) {

                System.out.print("Enter something (q to quite): ");

                name = br.readLine();
                System.out.println("input : " + name);
            
			
			if(v.contains(name)) {
				System.out.println("Already Present....");
				System.out.println("Enter another one:"); 
				name=br.readLine();
				v.add(name);
				System.out.println("New Username Added Successfully.");
				System.out.println(v);
				
							
			} else if(!(v.contains(name))) {
				v.add(name);
				System.out.println("New Username Added Successfully.");
				System.out.println(v);				
			}
			}
		
			
			
			
	}
}

/*Output:
C:\Users\hp\Desktop\Synerzip\Codes>javac userName.java
Note: userName.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

C:\Users\hp\Desktop\Synerzip\Codes>java UserName
Enter something (q to quite): q
input : q
New Username Added Successfully.
[Heema670@gmail.com, q, prashant.paulbudhe@excellarate.com, Aditi306sak@outlook.com]

C:\Users\hp\Desktop\Synerzip\Codes>java UserName
Enter something (q to quite): prashant.paulbudhe@excellarate.com
input : prashant.paulbudhe@excellarate.com
Already Present....
Enter another one:
prashant.paulbudhe@gmail.com
New Username Added Successfully.
[Heema670@gmail.com, prashant.paulbudhe@excellarate.com, Aditi306sak@outlook.com, prashant.paulbudhe@gmail.com]
Enter something (q to quite): prashant.paulbudhe@gmail.com
input : prashant.paulbudhe@gmail.com
Already Present....
Enter another one:
q
New Username Added Successfully.
[Heema670@gmail.com, q, prashant.paulbudhe@excellarate.com, Aditi306sak@outlook.com, prashant.paulbudhe@gmail.com]

C:\Users\hp\Desktop\Synerzip\Codes>





*/