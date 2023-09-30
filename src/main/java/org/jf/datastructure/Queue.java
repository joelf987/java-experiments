package org.jf.datastructure;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Queue<T> extends AbstractCollection<T> {
  private final List<T> items;

  public Queue() {
    this.items = new ArrayList<>();
  }

  @Override
  public Iterator<T> iterator() {
    List<T> copy = new ArrayList<>(this.items);
    return copy.iterator();
  }

  @Override
  public int size() {
    return this.items.size();
  }

  public boolean enqueue(T item) {
    if (Objects.nonNull(item)) {
      items.add(item);
      return true;
    }
    return false;
  }

  @Override
  public boolean add(T t) {
    return enqueue(t);
  }

  public T dequeue() {
    if (isEmpty()) {
      throw new IllegalStateException("Cannot pop value from empty stack");
    }
    return items.remove(0);
  }

  @Override
  public boolean remove(Object o) {
    throw new UnsupportedOperationException("Remove is not supported for Queue.");
  }
}
