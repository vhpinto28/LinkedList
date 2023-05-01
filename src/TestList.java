
public class TestList {

	public static void main(String[] args) {
		TDAList <Integer> l1 = new ListArray<Integer>(5);
		
		System.out.println("-------------------------------ListArray-----------------------------------------");
		l1.insertLast(10);
		System.out.println(l1);
		l1.insertFirst(20);
		System.out.println(l1);
		l1.insertLast(30);
		System.out.println(l1);
		System.out.println("Buscando el 20? "+ l1.search(20));
		System.out.println("Nueva Longitud: "+ l1.length());
		l1.remove(20);
		System.out.println("Nueva Longitud: "+ l1.length());
		System.out.println(l1);
		l1.insertFirst(50);
		l1.insertLast(23);
		l1.insertLast(21);
		System.out.println(l1);
		System.out.println("Buscando el 23? "+ l1.search(23));
		
		System.out.println("---------------------------------ListLinked---------------------------------------------");
		TDAList <Integer> lp = new ListLinked <Integer>();
		lp.insertLast(10);
		System.out.println(lp);
		lp.insertFirst(20);
		System.out.println(lp);
		lp.insertLast(30);
		System.out.println(lp);
		System.out.println("Buscando el 20? "+ lp.search(20));
		System.out.println("Nueva Longitud: "+ lp.length());
		lp.remove(20);
		System.out.println("Nueva Longitud: "+ lp.length());
		System.out.println(lp);
		lp.insertFirst(50);
		lp.insertLast(23);
		lp.insertLast(21);
		System.out.println(lp);
		System.out.println("Buscando el 23? "+ l1.search(23));
		
		System.out.println("----------------------------ListArray_Person------------------------------------------");

		Person pers1 = new Person("Victor", "Hinojosa", 23);
		Person pers2 = new Person("Adriana", "Linares", 24);
		Person pers3 = new Person("Juan", "Rodriguez", 27);
		Person pers4 = new Person("Jackeline", "Peña", 29);
		Person pers5 = new Person("Alvaro", "Suarez",30);
		
		//The ListArray was used
		TDAList <Person> p = new ListArray<Person>(5);
		p.insertFirst(pers1);
		p.insertFirst(pers2);
		p.insertLast(pers3);
		System.out.println(p);
		System.out.println("Buscando el a Adriana "+ p.search(pers2));
		p.remove(pers3);
		System.out.println(p);
		System.out.println("Nueva Longitud: "+ p.length());
		p.insertLast(pers4);
		p.insertFirst(pers5);
		System.out.println(p);
		System.out.println("Nueva Longitud: "+ p.length());
		System.out.println("-------------------------ListLinked_Person--------------------------------------------");
		
		//The ListLinked was used
		TDAList <Person> pl = new ListLinked <Person>();
		pl.insertFirst(pers1);
		pl.insertFirst(pers2);
		pl.insertLast(pers3);
		System.out.println(pl);
		System.out.println("Buscando el a Adriana "+ pl.search(pers2));
		pl.remove(pers3);
		System.out.println(pl);
		System.out.println("Nueva Longitud: "+ pl.length());
		pl.insertLast(pers4);
		pl.insertFirst(pers5);
		System.out.println(pl);
		System.out.println("Nueva Longitud: "+ pl.length());
		System.out.println("-------------------------------OrderListLinked-------------------------------------------");
		
		OrderListLinked <Integer> Lp = new OrderListLinked<Integer>();
		Lp.insert(10);
		System.out.println(l1);
		Lp.insert(20);
		System.out.println(l1);
		Lp.insert(30);
		System.out.println(l1);
		System.out.println("Buscando el 20? "+ Lp.search(20));
		System.out.println("Nueva Longitud: "+ Lp.length());
		Lp.remove(20);
		System.out.println("Nueva Longitud: "+ Lp.length());
		System.out.println(Lp);
		Lp.insert(50);
		Lp.insert(23);
		Lp.insert(21);
		System.out.println(Lp);
		System.out.println("Buscando el 23? "+ Lp.search(23));
		System.out.println("Nueva Longitud: "+ Lp.length());
		System.out.println("-------------------------OrderListLinked--------------------------------------------------");
		
		OrderListLinked <Person> ol = new OrderListLinked <Person>();
		ol.insert(pers1);
		ol.insert(pers2);
		ol.insert(pers3);
		System.out.println(ol);
		System.out.println("Buscando el a Adriana "+ ol.search(pers2));
		ol.remove(pers3);
		System.out.println(ol);
		System.out.println("Nueva Longitud: "+ ol.length());
		ol.insert(pers4);
		ol.insert(pers5);
		System.out.println(ol);
		System.out.println("Nueva Longitud: "+ pl.length());
	}

}

