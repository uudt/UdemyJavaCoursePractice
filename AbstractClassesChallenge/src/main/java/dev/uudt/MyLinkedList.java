package dev.uudt;

import org.w3c.dom.NodeList;

public class MyLinkedList implements NodeList {
    // write code here
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem current = root;

        while (current != null) {

            int comparison = current.compareTo(newItem);

            if (comparison < 0) {
                // newItem is bigger, insert after current
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(newItem);
                    newItem.setPrevious(current);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less than current, insert before current
                if (current.previous() != null) {
                    current.previous().setNext(newItem);
                    newItem.setPrevious(current.previous());
                    newItem.setNext(current);
                    current.setPrevious(newItem);
                } else {
                    newItem.setNext(current);
                    current.setPrevious(newItem);
                    root = newItem;
                }
                return true;

            } else {
                // already exist
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (root == null) {
            return false;
        }

        ListItem current = root;

        while (current != null) {
            int comparison = current.compareTo(item);

            if (comparison == 0) {
                // item is found

                if (current == root) {
                    root = current.next();
                    if (root != null) {
                        root.setPrevious(null);
                    }
                } else {
                    current.previous().setNext(current.next());

                    if (current.next() != null) {
                        current.next().setPrevious(current.previous());
                    }
                }

                return true;

            } else if (comparison < 0) {
                current = current.next();
            } else {
                return false;
            }
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }

        ListItem current = root;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.next();
        }
    }
}
