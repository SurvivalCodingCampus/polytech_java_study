package com.survivalcoding.generic;

public class EnumMain {
    public static void main(String[] args) {
        AuthState state = AuthState.AUTHENTICATED;


    }

    public static void func(AuthState state) {
        switch (state) {
            case AUTHENTICATED: {
                System.out.println("AUTHENTICATED");
                break;
            }
            case UNAUTHENTICATED: {
                System.out.println("UNAUTHENTICATED");
                break;
            }
            case UNKNOWN: {
                System.out.println("UNKNOWN");
                break;
            }

        }
    }
}
