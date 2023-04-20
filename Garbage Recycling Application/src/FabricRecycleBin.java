
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

public class FabricRecycleBin<T> implements IBag<T> {

	private Object[] fabricList;
	private Random random = new Random();
	private int[] possibleList = { 5, 10, 15 };
	private int index = -1;

	public FabricRecycleBin() {
		this.fabricList = new Object[possibleList[random.nextInt(possibleList.length)]];
	}

	@Override
	public boolean add(Object newItem) {
		// TODO Auto-generated method stub

		index++;

		this.fabricList[index] = newItem;
		return true;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (fabricList.length > 0)
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

		if (index < 0 || index > fabricList.length) {
			return null;
		} else {
			fabricList[index] = null;
		}
		return null;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		Object[] newList2 = new Object[fabricList.length - 1];

		if (fabricList.length > 0) {
			for (int i = 0; i < newList2.length; i++) {
				newList2[i] = fabricList[i];
			}
		}

		if (newList2[newList2.length - 1] != null) {
			this.fabricList = newList2;
		}

		return null;

	}

	@Override
	//Creating new array which the size of 
	//that array is 1 size smaller than main 
	//array and initialize it's elements from 
	//main array without removed item and initialize main array to new array
	public T remove(Object item) {
		// TODO Auto-generated method stub

		Object[] newObjectList = new Object[this.fabricList.length - 1];

		Garbage g = (Garbage) item;

		boolean getInIf = false;
		int a = 0;
		for (int i = 0; i < this.fabricList.length - 1; i++) {
			if (fabricList[i].equals(g) && getInIf == false) {
				getInIf = true;
				continue;
			} else {
				newObjectList[a] = fabricList[i];
				a++;
			}
		}

		fabricList = newObjectList;

		return null;
	}

	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub

		return fabricList.length;
	}

	@Override
	public int getIndexOf(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < fabricList.length; i++) {
			if (fabricList[i].equals(item)) {
				return i;
			} else
				continue;
		}
		return -1;

	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub

		for (int i = 0; i < fabricList.length; i++) {
			if (fabricList[i] != null && fabricList[i].equals(item)) {
				return true;
			} else if (fabricList[i] == null && item == null) {
				return true;
			} else
				continue;
		}

		return false;

	}

	@Override
	public void displayItems() {
		// TODO Auto-generated method stub

		for (Object o : this.fabricList) {
			System.out.println(o);

		}

	}

	@Override
	public void dump() {
		// TODO Auto-generated method stub

	}

	public Object[] getFabricList() {
		return this.fabricList;
	}
}
