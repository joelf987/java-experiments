package org.jf.datastructure;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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

  public boolean push(T item) {
    if (Objects.nonNull(item)) {
      top.getAndIncrement();
      items.add(item);
      return true;
    }
    return false;
  }

  @Override
  public boolean add(T t) {
    return push(t);
  }

  public T pop() {
    if (isEmpty()) {
      throw new IllegalStateException("Cannot pop value from empty stack");
    }
    return items.remove(top.decrementAndGet());
  }

  @Override
  public boolean remove(Object o) {
    throw new UnsupportedOperationException("Remove is not supported for Stack.");
  }

  @Override
  public boolean isEmpty() {
    return top.get() == 0;
  }

  public int top() {
    return isEmpty() ? 0 : top.get() - 1;
  }
}
