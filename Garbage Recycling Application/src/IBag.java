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

public interface IBag <T>{
	
	public boolean add(T newItem);
	public boolean isEmpty();
	public boolean isFull();
	public T removeByIndex(int index);
	public T remove();
	public T remove(T item);
	public int getItemCount();
	public int getIndexOf(T item);
	public boolean contains(T item);
	public void displayItems();
	public void dump(); //Removes all items from the bag
//	public boolean transferTo(Bag<I> targetBag, T item);

}
