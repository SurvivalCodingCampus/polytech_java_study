package com.survivalcoding.generic;

public class EnumMain {
    public static void main(String[] args) {
        AuthState State = AuthState.AUTHENTICATED;

        switch (State) {
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
                System.out.println("DEFAULT");
            }
        }
    }
}
