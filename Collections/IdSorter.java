package Collections;

import java.util.Comparator;

public class IdSorter implements Comparator<Employee> {
static int j=0;
	@Override
	public int compare(Employee o1, Employee o2) {
		j++;
//		System.out.println("Comparator:"+j);
		if (o1.id < o2.id)
			return -1;
		else if (o1.id > o2.id)
			return 1;
		return 0;
	}

}