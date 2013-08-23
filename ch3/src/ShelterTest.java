import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

	@Test
	public void test() {
		Shelter.Dog[] dogs = new Shelter.Dog[5];
		String[] dogsName = {"a","b","c","d","e"};
		for(int i=0; i<dogsName.length; i++){
			dogs[i] = new Shelter.Dog(dogsName[i]);
		}
		Shelter.Cat[] cats = new Shelter.Cat[5];
		String[] catsName = {"1","2","3","4","5"};
		for(int i=0; i<catsName.length; i++){
			cats[i] = new Shelter.Cat(catsName[i]);
		}
		
		Shelter sl = new Shelter();
		for (int i=0; i<dogs.length; i++){
			sl.enqueue(dogs[i]);
			sl.enqueue(cats[i]);
		}
		assertEquals(dogs[0],sl.dequeue());
		assertEquals(cats[0],sl.dequeue());
		assertEquals(dogs[1],sl.dequeueDog());
		assertEquals(cats[1],sl.dequeueCat());
	}

}
