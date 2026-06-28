@FunctionalInterface
interface Login {
    String login(String userName, String password);
}

public class LoginSystem {
    public static void main(String[] args) {
        Login login = (userName, password) ->
            userName.equals("admin") && password.equals("12345") ? "Login Successful"
            : !userName.equals("admin") ? "Wrong Username"
            : "Wrong Password";

        System.out.println(login.login("admin", "12345"));
        System.out.println(login.login("admin", "11111"));
        System.out.println(login.login("sude", "12345"));
        System.out.println(login.login("java", "00000"));

        
    }
}
