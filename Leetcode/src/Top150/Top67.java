package Top150;

import java.util.HashMap;

public class Top67 {
    public class LRUCache {
        class Node {
            int key;
            int value;
            Node prev;
            Node next;
            Node (int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int capacity;
        private final HashMap<Integer, Node> cache;
        private final Node head, tail;

        private void addTo(Node node) {
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void moveTo (Node node) {
            removeNode(node);
            addTo(node);
        }

        private Node removeTail() {
            Node result = tail.prev;
            removeNode(result);
            return result;
        }

        public LRUCache(int capacity) {
            this.capacity = capacity;
            cache = new HashMap<>();
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }
        
        public int get(int key) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                moveTo(node);
                return node.value;
            }
            return -1;
        }
        
        public void put(int key, int value) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                node.value = value;
                moveTo(node);
            }else {
                Node newNode = new Node (key, value);
                cache.put(key, newNode);
                addTo(newNode);
                
                if (cache.size() > capacity) {
                    Node tail = removeTail();
                    cache.remove(tail.key);
                }
            }
        }
    }
}
