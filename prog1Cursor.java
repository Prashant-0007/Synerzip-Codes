/*
prog1Cursor :Cursor for Iterating.....
*/
import java.util.*;


class CursorDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		//al.add(1000);
		al.add("Prashant");
		al.add("Abhishek");
		al.add("BHagwat");
		al.add("Hemant");

		//Let suppose i want to print all data over here then
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(al);

	}
}