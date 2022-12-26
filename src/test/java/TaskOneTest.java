import org.example.singleton_task1.User;
import org.junit.jupiter.api.Test;

public class TaskOneTest {

    @Test
    public void testAddingUserToDatabase() {
        User user = new User("Nazar", "nazar@gmail.com", 18);
        user.save();
    }
}