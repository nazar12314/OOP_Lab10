import org.example.singleton_task1.User;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void testAddingUserToDatabase() {
        User user = new User("Nazar", "nazar@gmail.com", 18);
        user.save();
    }
}