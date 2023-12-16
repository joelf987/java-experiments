package org.jf.datastructure;

import java.util.Objects;

public class LinkedList<T> {
  private Node<T> first;
  private int size;

  public int getSize() {
    return size;
  }

  public void insert(Node<T> node) {
    Node<T> tail = goToTail();
    if (Objects.isNull(tail)) {
      first = node;
      size++;
      return;
    }
    tail.next = node;
    if (Objects.nonNull(node.next)) {
      throw new IllegalStateException("New node should not be connected!");
    }
    size++;
  }

  private Node<T> goToTail() {
    if (first == null) {
      return null;
    }
    Node<T> currentNode = first;
    while (Objects.nonNull(currentNode.next)) {
      currentNode = currentNode.next;
    }
    return currentNode;
  }

  public void insertAt(Node<T> node, int index) {
    if (index > size) {
      throw new IndexOutOfBoundsException("Index[" + index + "] >= size[" + size + "]");
    }
    if (index == size) {
      insert(node);
      return;
    }
    Node<T> currentNode = first;
    int currentIndex = 0;
    for(; currentIndex < index - 1; currentIndex++) {
      currentNode = currentNode.next;
    }

    if(index == 0) {
      node.next = first;
      first = node;
      size ++;
    }
    if (currentIndex == index - 1) {
      Node<T> temp = currentNode.next;
      currentNode.next = node;
      node.next = temp;
      size++;
    }
  }

  public Node<T> elementAt(int index) {
    if (index >= size) {
      throw new IndexOutOfBoundsException("Index[" + index + "] >= size[" + size + "]");
    }
    int currentIndex = 0;
    Node<T> currentNode = first;
    for(; currentIndex < index; currentIndex++) {
      currentNode = currentNode.next;
    }
    return currentNode;
  }


  public static class Node<T> {
    final private T data;
    private Node<T> next;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }

    public Node(T data, Node<T> next) {
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
