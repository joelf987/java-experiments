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
      Node<T> currentNode = first;
      int currentIndex = 0;
      while (Objects.nonNull(currentNode.next)) {
        currentIndex ++;
        if (currentIndex == index) {
          break;
        }
      }
      if (currentIndex < index) {
        throw new IllegalStateException("Specified index out of range - maximum index can be "+currentIndex+"!");
      } else if (currentIndex == index) {
        insert(node);
      } else {
        Node<T> temp = currentNode.next;
        currentNode.next = node;
        node.next = temp;
      }
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
  }
}
