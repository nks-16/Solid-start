package ISP;
//  Violates ISP
interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human is working...");
    }
    public void eat() {
        System.out.println("Human is eating lunch...");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot is working...");
    }
    public void eat() {
        // Robots don't eat — meaningless implementation
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}

public class ISPViolationDemo {
    public static void main(String[] args) {
        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();
        // robot.eat(); // Would throw exception at runtime
    }
}