package com.survivalcoding.eight;

public class Pocket<E extends Character> {
    private E data;

    public void put(E data) {
        this.data = data;
    }

    public E get() {
        return this.data;
    }

    public static void main(String[] args) {
        AuthState authState = AuthState.AUTHENTICATED;
        switch (authState) {
            case AUTHENTICATED:
                System.out.println(authState.toString());
                break;
            case UNAUTHENTICATED:
                System.out.println(authState.toString());
                break;
            case UNKNOWN:
                System.out.println(authState.toString());
                break;
            default:
                System.out.println(authState.toString());
                break;
        }
    }
}
