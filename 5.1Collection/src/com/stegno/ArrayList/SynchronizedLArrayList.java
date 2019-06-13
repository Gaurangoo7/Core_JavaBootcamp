/*ArrayList is non-synchronized and should not be used in multi-thread environment without explicit synchronization*/

package com.stegno.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedLArrayList {

	public static void main(String a[]) {
		
		//Using Collections.synchronizedList() method
		List<String> sync = Collections.synchronizedList(new ArrayList<String>());

		/*Using CopyOnWriteArrayList
		 CopyOnWriteArrayList<String> sync = new CopyOnWriteArrayList<String>();
*/

		// Adding elements to synchronized ArrayList
		sync.add("GulabJaam");
		sync.add("Bangali Mithai");
		sync.add("Rasgulla");

		System.out.println("Iterating synchronized ArrayList:");
		synchronized (sync) {
			Iterator<String> iterator = sync.iterator();
			while (iterator.hasNext())
				System.out.println(iterator.next());
		}
	}

}
