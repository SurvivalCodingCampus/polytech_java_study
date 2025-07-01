package com.survivalcoding.generic;

public class EnumMain {
    public static void main(String[] args) {
        // 값
        AuthState state = AuthState.AUTHENTICATED;

        switch (state) {
            case AuthState.AUTHENTICATED: {
                System.out.println("AUTHENTICATED");
            }
            case AuthState.UNAUTHENTICATED: {
                System.out.println("UNAUTHENTICATED");
            }
            case AuthState.UNKNOWN: {
                System.out.println("UNKNOWN");
            }
            default: {
                System.out.println("default");
            }
        }
    }
}
