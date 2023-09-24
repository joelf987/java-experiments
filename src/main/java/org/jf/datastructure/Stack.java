package org.jf.datastructure;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Stack<T> extends AbstractCollection<T> {
  private final List<T> items;
  private final AtomicInteger top = new AtomicInteger(0);

  public Stack() {
    this.items = new ArrayList<>();
  }

  @Override
  public Iterator<T> iterator() {
    List<T> copy = new ArrayList<>(this.items);
    Collections.reverse(copy);
    return copy.iterator();
  }

  @Override
  public int size() {
    return this.items.size();
  }

  public void push(T item) {
    if (Objects.isNull(item)) {
      throw new IllegalArgumentException("Non null argument expected - but was null");
    }
    int currentTop = top.getAndIncrement();
    items.add(item);
  }

  public T pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Cannot pop value from empty stack");
    }
    return items.get(top.decrementAndGet());
  }

  public boolean isEmpty() {
    return top.get() == 0;
  }

  public int top() {
    return isEmpty() ? 0 : top.get() - 1;
  }
}
