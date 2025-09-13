package org.jf.datastructure;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class LinkedList<T> extends AbstractList<T> {
  private Node<T> first;
  private int size;

  public int getSize() {
    return size;
  }

  public void insert(T data) {
    Node<T> tail = goToTail();
    Node<T> newNode = new Node<>(data);
    if (isNull(tail)) {
      first = newNode;
      size++;
      return;
    }
    tail.next = newNode;
    if (nonNull(newNode.next)) {
      throw new IllegalStateException("New node should not be connected!");
    }
    size++;
  }

  private Node<T> goToTail() {
    if (isNull(first)) {
      return null;
    }
    Node<T> currentNode = first;
    while (nonNull(currentNode.next)) {
      currentNode = currentNode.next;
    }
    return currentNode;
  }

  public void insertAt(T data, int index) {
      Node<T> newNode = new Node<>(data);
    if (index > size) {
      throw new IndexOutOfBoundsException("Index[" + index + "] >= size[" + size + "]");
    }
    if (index == size) {
      insert(data);
      return;
    }
    Node<T> currentNode = first;
    int currentIndex = 0;
    for(; currentIndex < index - 1; currentIndex++) {
      currentNode = currentNode.next;
    }

    if(index == 0) {
      newNode.next = first;
      first = newNode;
      size ++;
    }
    if (currentIndex == index - 1) {
      Node<T> temp = currentNode.next;
      currentNode.next = newNode;
      newNode.next = temp;
      size++;
    }
  }

  public T elementAt(int index) {
    if (index >= size) {
      throw new IndexOutOfBoundsException("Index[" + index + "] >= size[" + size + "]");
    }
    int currentIndex = 0;
    Node<T> currentNode = first;
    for(; currentIndex < index; currentIndex++) {
      currentNode = currentNode.next;
    }
    return currentNode.getData();
  }

    @Override
    public T get(int i) {
        return elementAt(i);
    }

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator();
    }

    @Override
    public int size() {
        return size;
    }


    private class NodeIterator implements Iterator<T> {
        private Node<T> currentNode = first;
        @Override
        public boolean hasNext() {
            return nonNull(currentNode);
        }

        @Override
        public T next() {
            if(hasNext()) {
                Node<T> thisNode = currentNode;
                currentNode = currentNode.next;
                return thisNode.getData();
            }
            throw new NoSuchElementException();
        }
    }

    private static class Node<T> {
        final private T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }
    }
}
