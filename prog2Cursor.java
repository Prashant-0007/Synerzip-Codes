/*
prog2Cursor Demo :
Enumerator
Iterator 
ListIterator
SplitIterator..

*/
import java.util.*;

class CursorEnumDemo {

	public static void main(String[] args) {
			
			Vector v = new Vector();
			v.addElement(10);
			v.addElement("Aditi");
			
			Enumeration e = v.elements();
			
			while(e.hasMoreElements()) {
				System.out.println(e.nextElement());
			}
	}
}
