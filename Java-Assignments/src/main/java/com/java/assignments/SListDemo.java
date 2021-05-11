package com.java.assignments;

class SList<T> {

	Link<T> firstLinkobject = new Link<T>(null);

	public SListIterator<T> iterator() {
		return new SListIterator<T>(firstLinkobject);
	}

	public String toString() {
		if (firstLinkobject == null)
			return "[]";

		SListIterator<T> sll = this.iterator();

		StringBuilder sb = new StringBuilder();

		// To print all links in the single linked list we need to check whether any
		// link is there else we need to stop
		while (sll.hasNext()) {

			sb.append(sll.next() + (sll.hasNext() ? ", " : ""));

		}
		return "[" + sb + "]";
	}

}

class Link<T> {
	T link;
	Link<T> next;

	Link(T link) {
		this(link, null);
	}

	Link(T link, Link<T> next) {
		this.link = link;
		this.next = next;
	}

	public String toString() {
		if (link == null)
			return "null";
		return link.toString();
	}
}

class SListIterator<T> {
	Link<T> current;

	SListIterator(Link<T> link) {
		current = link;
	}

	public Link<T> next() {
		current = current.next;
		return current;
	}

	public boolean hasNext() {
		return (current.next != null);
	}

	public void add(T t) {
		current.next = new Link<T>(t, current.next);
	}

	public void remove() {
		if (current.next != null)
			current.next = current.next.next;
	}
}

public class SListDemo {

	public static void main(String[] args) {
		
	
	SList<String> slist = new SList<String>();
	SListIterator<String> stringIterator = slist.iterator();
	stringIterator.add("hello");
	stringIterator.add("world");
	System.out.println(slist);
	System.out.println(stringIterator.hasNext());
	System.out.println(stringIterator.next());
	
	stringIterator.add("a");
	stringIterator.add("b");
	stringIterator.add("c");
	stringIterator.add("d");
	stringIterator.add("e");
	stringIterator.add("f");
	
	
	System.out.println("Before removing element in the list" +slist);
	stringIterator.remove();
	System.out.println("After removing element in the list" +slist);
	

	System.out.println("Iterating over list");
	while(stringIterator.hasNext()) {
		stringIterator.remove();
	}

	System.out.println(slist);
	
	
	
	SList<Integer> slist3 = new SList<Integer>();
	SListIterator<Integer> iterator3 = slist3.iterator();
	iterator3.add(245);
	iterator3.add(67);
	System.out.println(slist3);
	
	System.out.println(iterator3.hasNext());
	System.out.println(iterator3.next());
	for(int i = 0; i < 10; i++) {
		iterator3.add(i);
		iterator3.next();
	}
	
	System.out.println(slist3);
	iterator3.remove();
	System.out.println(slist3);	
	}

}