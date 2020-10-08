import models.Id;
import models.User;
import models.UserRole;

public class Main {

    public static void main(String[] args) {
    UserRole admin = new UserRole(new Id<UserRole>(1),"admin");
	User u = new User(new Id<User>(1),"login","password", admin.getId());
	System.out.println(u.getId().getValue());
    }
}
