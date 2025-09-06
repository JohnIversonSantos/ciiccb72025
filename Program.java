import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Program{

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum: " + sum);

		Set<Integer> set = new HashSet<>();
		Set<Integer> setVar = Set.of(1,2,3,4,5);
		set.add(3);
		set.add(6);
		setVar.add(6);
		int sumSet = set.stream().mapToInt(Integer::intValue).sum();
		int sumSetVar = setVar.stream().mapToInt(Integer::intValue).sum();

		System.out.println("Set: " + sumSetVar);
		System.out.println("Sum Set: " + sumSet);
	}

}