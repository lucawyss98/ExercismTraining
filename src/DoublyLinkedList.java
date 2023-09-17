class DoublyLinkedList<T> {
    private Element<T> head;

    void push(T value) {
        Element<T> newElement = new Element<>(value, head, null);
        if(head != null)
            head.next = newElement;
        head = newElement;
    }

    T pop() {
        if (head != null) {
            T val = head.value;
            head = head.prev;
            if(head != null)
                head.next = null;
            return val;
        }
        return null;
    }

    void unshift(T value) {
        Element<T> firstElement = findFirst();
        Element<T> newElement = new Element<>(value, null, firstElement);
        if (firstElement != null) {
            firstElement.prev = newElement;
        } else {
            head = newElement;
        }
    }

    T shift() {
        Element<T> element = findFirst();
        if(element == null)
            return null;
        if (element.next != null) {
            element.next.prev = null;
        }else{
            head = null;
        }
        return element.value;
    }

    private Element<T> findFirst() {

        if (head == null)
            return null;
        Element<T> temp = head;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        return temp;
    }

    private static final class Element<T> {
        private final T value;
        private Element<T> prev;
        private Element<T> next;

        Element(T value, Element<T> prev, Element<T> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
