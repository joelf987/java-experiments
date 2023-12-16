package org.jf.datastructure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  public void shouldBeAbleToInsertIntoEmptyLinkedList() {
    LinkedList<String> LinkedList = new LinkedList<>();
    LinkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(LinkedList.getSize(), is(1));
  }

  @Test
  public void shouldAddAnotherItem() {
    LinkedList<String> LinkedList = new LinkedList<>();
    LinkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(LinkedList.getSize(), is(1));
    LinkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(LinkedList.getSize(), is(2));
  }

  @Test
  public void shouldAInsertItemInbetweenTwoExistingItems() {
    LinkedList<String> LinkedList = new LinkedList<>();
    LinkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(LinkedList.getSize(), is(1));
    LinkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(LinkedList.getSize(), is(2));
    LinkedList.insertAt(new LinkedList.Node<>("ijkl"), 1);
    assertThat(LinkedList.getSize(), is(3));
    assertThat(LinkedList.elementAt(0).getData(), is(equalTo("abcd")));
    assertThat(LinkedList.elementAt(1).getData(), is(equalTo("ijkl")));
    assertThat(LinkedList.elementAt(2).getData(), is(equalTo("efgh")));
  }

  @Test
  public void shouldInsertAtEnd() {
    LinkedList<String> LinkedList = new LinkedList<>();
    LinkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(LinkedList.getSize(), is(1));
    LinkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(LinkedList.getSize(), is(2));
    LinkedList.insertAt(new LinkedList.Node<>("ijkl"), 2);
    assertThat(LinkedList.getSize(), is(3));
    assertThat(LinkedList.elementAt(0).getData(), is(equalTo("abcd")));
    assertThat(LinkedList.elementAt(1).getData(), is(equalTo("efgh")));
    assertThat(LinkedList.elementAt(2).getData(), is(equalTo("ijkl")));
  }

  @Test
  public void shouldInsertAtBeginning() {
    LinkedList<String> LinkedList = new LinkedList<>();
    LinkedList.insert(new LinkedList.Node<>("abcd"));
    assertThat(LinkedList.getSize(), is(1));
    LinkedList.insert(new LinkedList.Node<>("efgh"));
    assertThat(LinkedList.getSize(), is(2));
    LinkedList.insertAt(new LinkedList.Node<>("ijkl"), 0);
    assertThat(LinkedList.getSize(), is(3));
    assertThat(LinkedList.elementAt(0).getData(), is(equalTo("ijkl")));
    assertThat(LinkedList.elementAt(1).getData(), is(equalTo("abcd")));
    assertThat(LinkedList.elementAt(2).getData(), is(equalTo("efgh")));
  }

}