
import java.util.Random;

/***
 * 
 * CENG 112 - Homework1
 * 
 * @author Mehmet Sarper Kahvecioğlu  270201035
 * 
 * @author Umut Baris Urem   270201049
 * 
 * 
 */

public class GlassRecycleBin<T> implements IBag<T> {

	private Object[] glassList;
	private Random random = new Random();
	private int[] possibleList = { 5, 10, 15 };
	private int index = -1;

	public GlassRecycleBin() {
		this.glassList = new Object[possibleList[random.nextInt(possibleList.length)]];
	}

	@Override
	public boolean add(Object newItem) {
		// TODO Auto-generated method stub

		index++;

		this.glassList[index] = newItem;
		return true;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (glassList.length > 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T removeByIndex(int index) {
		// TODO Auto-generated method stub

		if (index < 0 || index > glassList.length) {
			return null;
		} else {
			glassList[index] = null;
		}
		return null;
	}

	@Override

	// Creating new array which the size of
	// that array is 1 size smaller than main
	// array and initialize it's elements from
	// main array without removed item and initialize main array to new array
	public T remove() {
		// TODO Auto-generated method stub
		Object[] newList2 = new Object[glassList.length - 1];

		if (glassList.length > 0) {
			for (int i = 0; i < newList2.length; i++) {
				newList2[i] = glassList[i];
			}
		}

		if (newList2[newList2.length - 1] != null) {
			this.glassList = newList2;
		}

		return null;

	}

	@Override
	public T remove(Object item) {
		// TODO Auto-generated method stub

		Object[] newObjectList = new Object[this.glassList.length - 1];

		Garbage g = (Garbage) item;

		boolean getInIf = false;
		int a = 0;
		for (int i = 0; i < this.glassList.length - 1; i++) {
			if (glassList[i].equals(g) && getInIf == false) {
				getInIf = true;
				continue;
			} else {
				newObjectList[a] = glassList[i];
				a++;
			}
		}

		glassList = newObjectList;

		return null;
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return glassList.length;
	}

	@Override
	public int getIndexOf(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < glassList.length; i++) {
			if (glassList[i].equals(item)) {
				return i;
			} else
				continue;
		}
		return -1;

	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < glassList.length; i++) {
			if (glassList[i] != null && glassList[i].equals(item)) {
				return true;
			} else if (glassList[i] == null && item == null) {
				return true;
			} else
				continue;
		}

		return false;

	}

	@Override
	public void displayItems() {
		// TODO Auto-generated method stub

		for (Object o : this.glassList) {
			System.out.println(o);

		}

	}

	@Override
	public void dump() {
		// TODO Auto-generated method stub

	}

	public Object[] getGlassList() {
		return this.glassList;
	}

}
