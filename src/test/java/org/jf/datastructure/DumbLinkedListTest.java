package org.jf.datastructure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class DumbLinkedListTest {

  @Test
  public void shouldBeAbleToInsertIntoEmptyArrayLinkedList() {
    ArrayLinkedList<String> arrayLinkedList = new ArrayLinkedList<>(10);
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("abcd"));
    assertThat(arrayLinkedList.getSize(), is(1));
  }

  @Test
  public void shouldAddAnotherItem() {
    ArrayLinkedList<String> arrayLinkedList = new ArrayLinkedList<>(10);
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("abcd"));
    assertThat(arrayLinkedList.getSize(), is(1));
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("efgh"));
    assertThat(arrayLinkedList.getSize(), is(2));
  }

  @Test
  public void shouldInsertItemInbetweenTwoExistingItems() {
    ArrayLinkedList<String> arrayLinkedList = new ArrayLinkedList<>(10);
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("abcd"));
    assertThat(arrayLinkedList.getSize(), is(1));
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("efgh"));
    assertThat(arrayLinkedList.getSize(), is(2));
    arrayLinkedList.insertAt(new ArrayLinkedList.Node<>("ijkl"), 1);
    assertThat(arrayLinkedList.getSize(), is(3));
    assertThat(arrayLinkedList.elementAt(0).getData(), is(equalTo("abcd")));
    assertThat(arrayLinkedList.elementAt(1).getData(), is(equalTo("ijkl")));
    assertThat(arrayLinkedList.elementAt(2).getData(), is(equalTo("efgh")));
  }

  @Test
  public void shouldInsertAtEnd() {
    ArrayLinkedList<String> arrayLinkedList = new ArrayLinkedList<>(10);
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("abcd"));
    assertThat(arrayLinkedList.getSize(), is(1));
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("efgh"));
    assertThat(arrayLinkedList.getSize(), is(2));
    arrayLinkedList.insertAt(new ArrayLinkedList.Node<>("ijkl"), 2);
    assertThat(arrayLinkedList.getSize(), is(3));
    assertThat(arrayLinkedList.elementAt(0).getData(), is(equalTo("abcd")));
    assertThat(arrayLinkedList.elementAt(1).getData(), is(equalTo("efgh")));
    assertThat(arrayLinkedList.elementAt(2).getData(), is(equalTo("ijkl")));
  }

  @Test
  public void shouldInsertAtBeginning() {
    ArrayLinkedList<String> arrayLinkedList = new ArrayLinkedList<>(10);
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("abcd"));
    assertThat(arrayLinkedList.getSize(), is(1));
    arrayLinkedList.insert(new ArrayLinkedList.Node<>("efgh"));
    assertThat(arrayLinkedList.getSize(), is(2));
    arrayLinkedList.insertAt(new ArrayLinkedList.Node<>("ijkl"), 0);
    assertThat(arrayLinkedList.getSize(), is(3));
    assertThat(arrayLinkedList.elementAt(0).getData(), is(equalTo("ijkl")));
    assertThat(arrayLinkedList.elementAt(1).getData(), is(equalTo("abcd")));
    assertThat(arrayLinkedList.elementAt(2).getData(), is(equalTo("efgh")));
  }

}