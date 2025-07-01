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
                break;
            }
            
            case UNAUTHENTICATED: {
                System.out.println("No.");
                break;
            }
            
            case AUTHENTICATING: {
                System.out.println("Checking..");
                break;
            }
            
            default: {
                System.out.println("Unexpected Access.");
            }
        }
        
    }
}
```
