package org.jf.datastructure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
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

  @Test
  public void shouldInsertItemInbetweenTwoExistingItems() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(linkedList.getSize(), is(1));
    linkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(linkedList.getSize(), is(2));
    linkedList.insertAt(new LinkedList.Node<>("ijkl"), 1);
    assertThat(linkedList.getSize(), is(3));
    assertThat(linkedList.elementAt(0).getData(), is(equalTo("abcd")));
    assertThat(linkedList.elementAt(1).getData(), is(equalTo("ijkl")));
    assertThat(linkedList.elementAt(2).getData(), is(equalTo("efgh")));
  }

  @Test
  public void shouldInsertAtEnd() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(linkedList.getSize(), is(1));
    linkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(linkedList.getSize(), is(2));
    linkedList.insertAt(new LinkedList.Node<>("ijkl"), 2);
    assertThat(linkedList.getSize(), is(3));
    assertThat(linkedList.elementAt(0).getData(), is(equalTo("abcd")));
    assertThat(linkedList.elementAt(1).getData(), is(equalTo("efgh")));
    assertThat(linkedList.elementAt(2).getData(), is(equalTo("ijkl")));
  }

  @Test
  public void shouldInsertAtBeginning() {
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(linkedList.getSize(), is(1));
    linkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(linkedList.getSize(), is(2));
    linkedList.insertAt(new LinkedList.Node<>("ijkl"), 0);
    assertThat(linkedList.getSize(), is(3));
    assertThat(linkedList.elementAt(0).getData(), is(equalTo("ijkl")));
    assertThat(linkedList.elementAt(1).getData(), is(equalTo("abcd")));
    assertThat(linkedList.elementAt(2).getData(), is(equalTo("efgh")));
  }

}