
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

public class PaperRecycleBin<T> implements IBag<T> {

	private Object[] paperList;
	private Random random = new Random();
	private int[] possibleList = { 5, 10, 15 };
	private int index = -1;

	public PaperRecycleBin() {
		this.paperList = new Object[possibleList[random.nextInt(possibleList.length)]];

	}

	@Override
	public boolean add(Object newItem) {
		// TODO Auto-generated method stub

		index++;

		this.paperList[index] = newItem;
		return true;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (paperList.length > 0)
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

		if (index < 0 || index > paperList.length) {
			return null;
		} else {
			paperList[index] = null;
		}
		return null;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		Object[] newList2 = new Object[paperList.length - 1];

		if (paperList.length > 0) {
			for (int i = 0; i < newList2.length; i++) {
				newList2[i] = paperList[i];
			}
		}

		if (newList2[newList2.length - 1] != null) {
			this.paperList = newList2;
		}

		return null;

	}

	@Override
	// Creating new array which the size of
	// that array is 1 size smaller than main
	// array and initialize it's elements from
	// main array without removed item and initialize main array to new array
	public T remove(Object item) {
		// TODO Auto-generated method stub

		Object[] newList2 = new Object[this.paperList.length - 1];

		for (int i = 0; i < paperList.length; i++) {
			if (paperList[i].equals(item)) {
				paperList[i] = null;

			} else
				continue;

		}

		int a = 0;
		for (int i = 0; i < newList2.length; i++) {
			if (paperList[a] != null) {
				newList2[i] = paperList[a];
			} else {
				a++;
				continue;
			}
		}

		if (newList2[newList2.length - 1] != null) {
			this.paperList = newList2;
		}

		return null;
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return paperList.length;
	}

	@Override
	public int getIndexOf(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < paperList.length; i++) {
			if (paperList[i].equals(item)) {
				return i;
			} else
				continue;
		}
		return -1;

	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < paperList.length; i++) {
			if (paperList[i] != null && paperList[i].equals(item)) {
				return true;
			} else if (paperList[i] == null && item == null) {
				return true;
			} else
				continue;
		}

		return false;

	}

	@Override
	public void displayItems() {
		// TODO Auto-generated method stub

		for (Object o : this.paperList) {
			System.out.println(o);

		}

	}

	@Override
	public void dump() {
		// TODO Auto-generated method stub

	}

	public Object[] getPaperList() {
		return this.paperList;
	}

}
