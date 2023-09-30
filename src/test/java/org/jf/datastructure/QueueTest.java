package org.jf.datastructure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class QueueTest {

  private final Queue<String> stringQ = new Queue<>();

  @Test
  public void shouldPushItemToStack() {
    String item1 = "item1";
    String item2 = "item2";

    assertThat(stringQ.size(), is(0));

    stringQ.enqueue(item1);
    assertThat(stringQ.size(), is(1));

    stringQ.enqueue(item2);
    assertThat(stringQ.size(), is(2));
  }

  @Test
  public void shouldRejectNullValues() {
    assertThat(stringQ.enqueue(null), is(false));
  }

  @Test
  public void shouldTrackDequeuedItems() {
    String item1 = "item1";
    String item2 = "item2";

    stringQ.enqueue(item1);
    stringQ.enqueue(item2);

    assertThat(stringQ.size(), is(2));
    String item = stringQ.dequeue();
    assertThat(item, equalTo(item1));
    assertThat(stringQ.size(), is(1));

    item = stringQ.dequeue();
    assertThat(item, equalTo(item2));
    assertThat(stringQ.size(), is(0));
  }

  @Test
  public void shouldSupportIteration() {
    String item1 = "item1";
    String item2 = "item2";

    stringQ.enqueue(item1);
    stringQ.enqueue(item2);

    assertThat(stringQ, contains(item1, item2));
  }

  @Test
  public void shouldFailToDequeueIfStackIsEmpty() {
    Exception e = assertThrows(IllegalStateException.class, stringQ::dequeue);

    assertThat(e.getMessage(), is("Cannot pop value from empty stack"));
  }

  @Test
  public void shouldAddItemsInFIFOOrder() {
    String item1 = "item1";
    String item2 = "item2";

    assertThat(stringQ.isEmpty(), is(true));
    stringQ.add(item1);
    assertThat(stringQ.isEmpty(), is(false));
    assertThat(stringQ.size(), is(1));

    stringQ.add(item2);
    assertThat(stringQ.isEmpty(), is(false));

    assertThat(stringQ.size(), is(2));
    assertThat(stringQ.dequeue(), is(item1));
    assertThat(stringQ.size(), is(1));

    assertThat(stringQ.dequeue(), is(item2));
    assertThat(stringQ.size(), is(0));
    assertThat(stringQ.isEmpty(), is(true));

  }


}