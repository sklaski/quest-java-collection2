import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Thanos {

	public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)


        System.out.println("\nOrder by name:");
        Collections.sort(heroes);
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        Comparator<Hero> heroesByAge = new Comparator<Hero>() {
    		@Override
    		public int compare(Hero h1, Hero h2) {
    			if (h1.getAge() > h2.getAge()) {
    				return -1;
    			} else if (h1.getAge() < h2.getAge()) {
    				return 1;
    			} else {
    				return 0;
    			}
//    			Integer age1 = h1.getAge();
//    			Integer age2 = h2.getAge();
//    			return age1.compareTo(age2);
    		}
    	};

        System.out.println("\nOrder by age:");
        Collections.sort(heroes, heroesByAge);
        showList(heroes);
    }

	private static void showList(List<Hero> heroes) {
		for (Hero heroe : heroes) {
			System.out.println(heroe.getName() + ", " + heroe.getAge());
		}
	}
}