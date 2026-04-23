package dev.uudt;

public class SearchTree implements NodeList {
    // write code here
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

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
                // newItem больше current → идём вправо
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem меньше current → идём влево
                if (current.previous() != null) {
                    current = current.previous();
                } else {
                    current.setPrevious(newItem);
                    return true;
                }
            } else {
                // уже существует
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
        ListItem parent = current;

        while (current != null) {
            int comparison = current.compareTo(item);

            if (comparison < 0) {
                parent = current;
                current = current.next();
            } else if (comparison > 0) {
                parent = current;
                current = current.previous();
            } else {
                performRemoval(current, parent);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {

        // case 1: no right child
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                root = item.previous();
            }

            // case 2: no left child
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.next());
            } else {
                root = item.next();
            }

            // case 3: two children
        } else {
            ListItem current = item.next();
            ListItem leftmostParent = item;

            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }

            item.setValue(current.getValue());

            if (leftmostParent == item) {
                leftmostParent.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
