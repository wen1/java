import java.util.LinkedList;

/*
 * 3.7 An animal shelter holds only dogs and cats, and operates on a strictly
 *  “first in, first out” basis. People must adopt either the “oldest” (based 
 *  on arrival time) of all animals at the shelter, or they can select whether 
 *  they would prefer a dog or a cat (and will receive the oldest animal of that
 *  type). They cannot select which specific animal they would like. Create the 
 *  data structures to maintain this system and implement operations such as 
 *  enqueue, dequeueAny, dequeueDog and dequeueCat.You may use the built-in 
 *  LinkedList data structure.
 */
public class Shelter {
	// inner class
	public static class Dog{
		String name;
		public int id;
		Dog(String _name) {
			name = _name;
		}
	}
	
	public static class Cat{
		String name;
		public int id;
		Cat(String _name) {
			name = _name;
		}
	}
	//field
	LinkedList<Dog> dogs;
	LinkedList<Cat> cats;
	public static int num = 0;
	
	// interface
	public Shelter() {
		dogs = new LinkedList<Dog>();
		cats = new LinkedList<Cat>();
	}
	
	void enqueue(Object animal){
		if (animal.getClass() == Dog.class){
			Dog d = (Dog)animal;
			d.id = num; 
			num++;
			dogs.add(d);
		} else if(animal.getClass() == Cat.class){
			Cat c =(Cat)animal;
			c.id = num; 
			num++;
			cats.add(c);
		}
	}
	
	Object dequeue(){
		Object ob = null;
		if (dogs.getFirst()==null){
			ob = cats.getFirst();
			cats.removeFirst();
		}else if(cats.getFirst()==null){
			ob = dogs.getFirst();
			dogs.removeFirst();
		}else if(dogs.getFirst().id < cats.getFirst().id){
			ob = dogs.getFirst();
			dogs.removeFirst();
		} else {
			ob = cats.getFirst();
			cats.removeFirst();
		}
		return ob;
	}
	
	Object dequeueDog(){
		if(dogs.isEmpty()){
			return null;
		} else {
			Object ob = dogs.getFirst();
			dogs.removeFirst();
			return ob;
		}
	}
	
	Object dequeueCat(){
		if(cats.isEmpty()){
			return null;
		} else {
			Object ob = cats.getFirst();
			cats.removeFirst();
			return ob;
		}
	}
}