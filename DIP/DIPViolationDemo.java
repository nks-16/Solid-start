package DIP;

//  Violates DIP
class MySQLDatabase {
    public void saveData(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}

class UserService {
    private MySQLDatabase database; // Depends on concrete class

    public UserService() {
        this.database = new MySQLDatabase();
    }

    public void saveUser(String user) {
        database.saveData(user);
    }
}

public class DIPViolationDemo {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.saveUser("John Doe");
    }
}
