package org.jf.datastructure;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class LinkedListTest {

    @Test
    public void shouldBeAbleToInsertIntoEmptyLinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("abcd");
        assertThat(linkedList.getSize(), is(1));
    }

    @Test
    public void shouldAddAnotherItem() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("abcd");
        assertThat(linkedList.getSize(), is(1));
        linkedList.insert("efgh");
        assertThat(linkedList.getSize(), is(2));
    }

    @Test
    public void shouldInsertItemInbetweenTwoExistingItems() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("abcd");
        assertThat(linkedList.getSize(), is(1));
        linkedList.insert("efgh");
        assertThat(linkedList.getSize(), is(2));
        linkedList.insertAt("ijkl", 1);
        assertThat(linkedList.getSize(), is(3));
        assertThat(linkedList.elementAt(0), is(equalTo("abcd")));
        assertThat(linkedList.elementAt(1), is(equalTo("ijkl")));
        assertThat(linkedList.elementAt(2), is(equalTo("efgh")));
    }

    @Test
    public void shouldIterate() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("abcd");
        assertThat(linkedList.getSize(), is(1));
        linkedList.insert("efgh");
        assertThat(linkedList.getSize(), is(2));
        linkedList.insertAt("ijkl", 1);
        for (String data : linkedList) {
            assertThat(data, is(oneOf("abcd", "ijkl", "efgh")));
        }

    }

    @Test
    public void shouldSupportIndexIteration() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("abcd");
        assertThat(linkedList.getSize(), is(1));
        linkedList.insert("efgh");
        assertThat(linkedList.getSize(), is(2));
        linkedList.insertAt("ijkl", 1);
        assertThat(linkedList.size(), equalTo(3));
        List<String> dataList = linkedList.stream()
                .toList();
        assertThat(dataList, is(equalTo(List.of("abcd", "ijkl", "efgh"))));

    }

    @Test
    public void shouldInsertAtEnd() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("abcd");
        assertThat(linkedList.getSize(), is(1));
        linkedList.insert("efgh");
        assertThat(linkedList.getSize(), is(2));
        linkedList.insertAt("ijkl", 2);
        assertThat(linkedList.getSize(), is(3));
        assertThat(linkedList.elementAt(0), is(equalTo("abcd")));
        assertThat(linkedList.elementAt(1), is(equalTo("efgh")));
        assertThat(linkedList.elementAt(2), is(equalTo("ijkl")));
    }

    @Test
    public void shouldInsertAtBeginning() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.insert("abcd");
        assertThat(linkedList.getSize(), is(1));
        linkedList.insert("efgh");
        assertThat(linkedList.getSize(), is(2));
        linkedList.insertAt("ijkl", 0);
        assertThat(linkedList.getSize(), is(3));
        assertThat(linkedList.elementAt(0), is(equalTo("ijkl")));
        assertThat(linkedList.elementAt(1), is(equalTo("abcd")));
        assertThat(linkedList.elementAt(2), is(equalTo("efgh")));
    }

    @Test
    public void shouldSupportIndexIterationWithCustomTypeS() {
        Person p1 = new Person("Bob", "1 road");
        Person p2 = new Person("J", "2 road");
        Person p3 = new Person("A", "3 road");
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.insert(p1);
        assertThat(linkedList.getSize(), is(1));
        linkedList.insert(p2);
        assertThat(linkedList.getSize(), is(2));
        linkedList.insertAt(p3, 1);
        assertThat(linkedList.size(), equalTo(3));
        List<Person> dataList = linkedList.stream()
                .toList();
        assertThat(dataList, is(equalTo(List.of(p1, p3, p2))));

    }

    private record Person (String name, String address){}
}