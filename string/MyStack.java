package string;

import java.util.LinkedList;

/**
 * @author jili
 *
 * @param <E>
 *            数组的缺点是，当数组长度发生变化时，原有的元素需要经过copy到新的数组中，这样性能有较大的损耗，
 *            而链表最大的优点是插入和删除的性能非常好，Java提供了现成的双向链表类java.util.LinkedList，
 *            通过它可以快速编写自己的Stack程序。
 * 
 *            http://blog.csdn.net/top_code/article/details/8650910
 */
public class MyStack<E> {

	LinkedList<E> list;

	public MyStack() {
		list = new LinkedList();
	}

	public E pop() {

		return list.removeLast();

	}

	public void push(E o) {

		list.add(o);

	}

	public E getTop() {

		return list.getLast();
	}

	public boolean isEmpty() {

		return list.size() == 0;
	}

	public int stackSize() {

		return list.size();

	}

}
