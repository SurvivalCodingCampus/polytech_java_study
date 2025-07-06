package com.survivalcoding.Box;

public class StrongBox<E> {
    private E data;
    private final KeyType key;

    public enum KeyKind {
        PADLOCK(new PADLOCK()),
        BUTTON(new BUTTON()),
        DIAL(new DIAL()),
        FINGER(new FINGER());

        private final KeyType key;

        KeyKind(KeyType key) {
            this.key = key;
        }

        public KeyType getKey() {
            return key;
        }
    }

    public StrongBox(KeyKind kind) {
        this.key = kind.getKey();
    }

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        key.use();

        if(key.unlock()) {
            return data;
        }
        else {
            return null;
        }
    }

    public int getUseCnt() {
        return key.getUseCnt();
    }

    public static void main(String[] args) {
        StrongBox<String> box = new StrongBox<>(StrongBox.KeyKind.PADLOCK);
        box.put("TOP SECRET");
    }
}
