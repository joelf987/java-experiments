package org.jf.datastructure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class StackTest {

  private final Stack<String> stringStack = new Stack<>();

  @Test
  public void shouldPushItemToStack() {
    String item1 = "item1";
    String item2 = "item2";

    assertThat(stringStack.top(), is(0));

    stringStack.push(item1);
    assertThat(stringStack.top(), is(0));

    stringStack.push(item2);
    assertThat(stringStack.top(), is(1));
  }

  @Test
  public void shouldRejectNullValues() {
    assertThat(stringStack.push(null), is(false));
  }

  @Test
  public void shouldTrackPoppedItems() {
    String item1 = "item1";
    String item2 = "item2";

    stringStack.push(item1);
    stringStack.push(item2);

    assertThat(stringStack.top(), is(1));
    String item = stringStack.pop();
    assertThat(item, equalTo(item2));
    assertThat(stringStack.top(), is(0));

    item = stringStack.pop();
    assertThat(item, equalTo(item1));
    assertThat(stringStack.top(), is(0));
  }

  @Test
  public void shouldSupportIteration() {
    String item1 = "item1";
    String item2 = "item2";

    stringStack.push(item1);
    stringStack.push(item2);

    int loopIndex = 0;
    for (String item: stringStack) {
      if (loopIndex == 0) {
        assertThat(item, equalTo(item2));
      } else {
        assertThat(item, equalTo(item1));
      }
      loopIndex++;
    }
  }

  @Test
  public void shouldFailToPopIfStackIsEmpty() {
    Exception e = assertThrows(IllegalStateException.class, stringStack::pop);

    assertThat(e.getMessage(), is("Cannot pop value from empty stack"));
  }

  @Test
  public void shouldAddItemsInLIFOOrder() {
    String item1 = "item1";
    String item2 = "item2";

    assertThat(stringStack.top(), is(0));
    assertThat(stringStack.isEmpty(), is(true));
    stringStack.add(item1);
    assertThat(stringStack.top(), equalTo(stringStack.size() - 1));
    assertThat(stringStack.isEmpty(), is(false));
    assertThat(stringStack.size(), is(1));

    stringStack.add(item2);
    assertThat(stringStack.top(), equalTo(stringStack.size() - 1));
    assertThat(stringStack.isEmpty(), is(false));

    assertThat(stringStack.top(), is(1));
    assertThat(stringStack.pop(), is(item2));
    assertThat(stringStack.top(), is(0));

    assertThat(stringStack.pop(), is(item1));
    assertThat(stringStack.top(), is(0));
    assertThat(stringStack.isEmpty(), is(true));

  }


}