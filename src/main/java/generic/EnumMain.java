package generic;

public class EnumMain {
    public static void main(String[] args) {
        AuthState state = AuthState.AUTHENTICATED;

        switch (state) {
            case AuthState.AUTHENTICATED: {
                System.out.println("AUTHENTICATED");
            }
            case AuthState.UNAUTHENTICATED: {
                System.out.println("UNAUTHENTICATED");
            }
            case AuthState.AUTHENTICATING: {
                System.out.println("AUTHENTICATING");
            }
        }
    }
}
