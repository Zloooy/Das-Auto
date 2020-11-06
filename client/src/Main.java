import models.Id;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService us = id -> new User(new Id<>(1), "admin", "admin", new Id<>(0));
        System.out.println(us.getById(new Id<>(1)));
    }
}
