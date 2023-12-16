package org.jf.datastructure;

import java.util.Objects;

public class ArrayLinkedList<T> {
  private Node[] linkedList;
  private int size;
  private int firstIndex;

  public ArrayLinkedList(int size) {
    linkedList = new Node[size];
    firstIndex = 0;
  }

  public void insert(Node<T> node) {
    if (isFull()) {
      throw new IllegalStateException("No more space to insert more nodes!");
    }
    int insertIndex = isEmpty()? 0 : size;

    Node<T> lastNode = gotoTail();
    if (Objects.nonNull(lastNode)) {
      lastNode.nextNodeIndex = size;
    }
    linkedList[size] = node;
    size++;
  }

  public void insertAt(Node<T> node, int index) {
    if (index >= linkedList.length) {
      throw new ArrayIndexOutOfBoundsException("Index["+ index + "] greater than size: " + linkedList.length);
    }
    Node<T> previousNode = index == 0? null : gotoTail();
    if (Objects.nonNull(previousNode)) {
      int previousNodeNextIndex = previousNode.nextNodeIndex;
      previousNode.nextNodeIndex = index;
      node.nextNodeIndex = previousNodeNextIndex;
    } else { //we want to replace the first node... (at index-0)
      node.nextNodeIndex = firstIndex;
      firstIndex = size;
      linkedList[size] = node;
    }
    size++;
  }

  public Node<T> gotoTail() {
    if (isEmpty()) {
      return null;
    }
    int currentIndex = firstIndex;
    Node<T> currentNode = linkedList[firstIndex];
    for (; currentIndex >= 0 && currentIndex < size; currentIndex = linkedList[currentIndex].nextNodeIndex) {
      currentNode = linkedList[currentIndex];
    }
    return currentNode;
  }

  public int getSize() {
    return size;
  }

  public Node<T> elementAt(int index) {
    if (index >= linkedList.length) {
      throw new ArrayIndexOutOfBoundsException("Index["+ index + "] greater than size: " + linkedList.length);
    }
    for (Node node: linkedList) {
      if (node.nextNodeIndex == index) {
        return linkedList[node.nextNodeIndex];
      }
    }
    return this.linkedList[index];
  }

  public boolean isFull() {
    return size == linkedList.length;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public static class Node<T> {
    private T data;
    private int nextNodeIndex = -1;

    public Node(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setNextNodeIndex(int nextNodeIndex) {
      this.nextNodeIndex = nextNodeIndex;
    }

    public int getNextNodeIndex() {
      return nextNodeIndex;
    }
  }
}
