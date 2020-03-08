import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<Integer> values=new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(2);
		Collections.sort(values);
		Collections.reverse(values);
		Collections.shuffle(values);
		for(Integer o :values)
		{
			System.out.println(o);
		}
		
	}

}
