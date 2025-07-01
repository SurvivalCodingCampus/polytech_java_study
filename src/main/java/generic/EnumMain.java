package generic;

import com.survivalcoding.generic.AuthState;

public class EnumMain {
    public static void main(String[] args) {
        // 값
        com.survivalcoding.generic.AuthState state = AuthState.AUTHENTICATED;

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
