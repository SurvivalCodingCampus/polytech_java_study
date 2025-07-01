# 열거형 enum

## 정해둔 값만을 넣어둘 수 있는 타입

```Java
public enum AuthState {
    AUTHENTICATED,
    UNAUTHENTICATED,
    AUTHENTICATING
}

public class Main {
    public static void main(String[] args) {
        AuthState state = AuthState.UNAUTHENTICATED;

        switch (state) {
            case AUTHENTICATED: {
                System.out.println("Good to go.");
            }
            
            case UNAUTHENTICATED: {
                System.out.println("No.");
            }
            
            case AUTHENTICATING: {
                System.out.println("Checking..");
            }
            
            default: {
                System.out.println("Unexpected Access.");
            }
        }
        
    }
}
```

가장 익숙한 예: RGB Color