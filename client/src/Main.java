import models.UserRoleView;
import models.UserView;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService us = id -> new UserView(1, "admin", "admin", new UserRoleView(1, "ADMIN"));
        System.out.println(us.getById(1));
    }
}
