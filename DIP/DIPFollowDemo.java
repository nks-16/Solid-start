package DIP;

//  Follows DIP

// Abstraction
interface Database {
    void saveData(String data);
}

// Low-level module 1
class MySQLDatabase implements Database {
    public void saveData(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}

// Low-level module 2
class PostgreSQLDatabase implements Database {
    public void saveData(String data) {
        System.out.println("Saving data to PostgreSQL: " + data);
    }
}

// High-level module depends on abstraction, not concrete
class UserService {
    private Database database;

    // Inject dependency through constructor
    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser(String user) {
        database.saveData(user);
    }
}

public class DIPFollowDemo {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        UserService service1 = new UserService(mysql);
        service1.saveUser("John Doe");

        Database postgres = new PostgreSQLDatabase();
        UserService service2 = new UserService(postgres);
        service2.saveUser("Jane Smith");
    }
}