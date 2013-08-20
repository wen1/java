
public interface QueueInterface {
	public Object dequeue();
	public void enqueue(Object item);
	public boolean isEmpty();
	public Object getFront();
	public void clear();
}
