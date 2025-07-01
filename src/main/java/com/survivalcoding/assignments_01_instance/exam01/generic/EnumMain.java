package com.survivalcoding.assignments_01_instance.exam01.generic;

public class EnumMain {
    public static void main(String[] args){
        AuthState state=AuthState.AUTHENTICATED;

        switch (state){
            case AuthState.AUTHENTICATED:{
                System.out.println("AUTHENTICATED");
            }
        }
    }
}
