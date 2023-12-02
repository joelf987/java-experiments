package org.jf.datastructure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  public void shouldBeAbleToInsertIntoEmptyLinkedList() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(linkedList.getSize(), is(1));
  }

  @Test
  public void shouldAddAnotherItem() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(linkedList.getSize(), is(1));
    linkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(linkedList.getSize(), is(2));
  }

}