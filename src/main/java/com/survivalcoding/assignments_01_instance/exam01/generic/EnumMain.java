package com.survivalcoding.assignments_01_instance.exam01.generic;

public class EnumMain {
    public static void main(String[] args){
        AuthState state=AuthState.AUTHENTICATED;

        switch (state){
            case AUTHENTICATED:{
                System.out.println("AUTHENTICATED");
            }
            case UNAUTHENTICATED:{
                System.out.println("UNAUTHENTICATED");
            }
            case UNKNOWN:{
                System.out.println("UNKNOWN");
            }
            default:{
                System.out.println("default");
            }
        }
    }
}
