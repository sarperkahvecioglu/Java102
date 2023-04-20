
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

public class MetalRecycleBin<T> implements IBag<T> {

	private Object[] metalList;
	private Random random = new Random();
	private int[] possibleArray = { 5, 10, 15 };
	private int index = -1;

	public MetalRecycleBin() {
		this.metalList = new Object[possibleArray[random.nextInt(possibleArray.length)]];
	}

	@Override
	public boolean add(Object newItem) {
		// TODO Auto-generated method stub

		index++;

		this.metalList[index] = newItem;
		return true;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (metalList.length > 0)
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

		if (index < 0 || index > metalList.length) {
			return null;
		} else {
			metalList[index] = null;
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
		Object[] newList2 = new Object[metalList.length - 1];

		if (metalList.length > 0) {
			for (int i = 0; i < newList2.length; i++) {
				newList2[i] = metalList[i];
			}
		}

		if (newList2[newList2.length - 1] != null) {
			this.metalList = newList2;
		}

		return null;

	}

	@Override
	public T remove(Object item) {
		// TODO Auto-generated method stub

		Object[] newObjectList = new Object[this.metalList.length - 1];

		Garbage g = (Garbage) item;

		boolean getInIf = false;
		int a = 0;
		for (int i = 0; i < this.metalList.length - 1; i++) {
			if (metalList[i].equals(g) && getInIf == false) {
				getInIf = true;
				continue;
			} else {
				newObjectList[a] = metalList[i];
				a++;
			}
		}

		metalList = newObjectList;

		return null;
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return metalList.length;
	}

	@Override
	public int getIndexOf(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < metalList.length; i++) {
			if (metalList[i].equals(item)) {
				return i;
			} else
				continue;
		}
		return -1;

	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < metalList.length; i++) {
			if (metalList[i] != null && metalList[i].equals(item)) {
				return true;
			} else if (metalList[i] == null && item == null) {
				return true;
			} else
				continue;
		}

		return false;

	}

	@Override
	public void displayItems() {
		// TODO Auto-generated method stub

		for (Object o : this.metalList) {
			System.out.println(o);

		}

	}

	@Override
	public void dump() {
		// TODO Auto-generated method stub

	}

	public Object[] getMetalList() {
		return this.metalList;
	}

}
