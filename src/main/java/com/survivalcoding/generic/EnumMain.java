package com.survivalcoding.generic;

public class EnumMain {
    public static void main(String[] args) {
        // 값
        AuthState state = AuthState.AUTHENTICATED;

        switch (state) {
            case AUTHENTICATED: {
                System.out.println("AUTHENTICATED");
            }
            case UNAUTHENTICATED: {
                System.out.println("UNAUTHENTICATED");
            }
            case UNKNOWN: {
                System.out.println("UNKNOWN");
            }
            default: {
                System.out.println("default");
            }
        }
    }
}
