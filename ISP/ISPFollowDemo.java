package ISP;
//  Follows ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working...");
    }
    public void eat() {
        System.out.println("Human is eating lunch...");
    }
}

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot is working...");
    }
}

public class ISPFollowDemo {
    public static void main(String[] args) {
        Workable humanWorker = new HumanWorker();
        humanWorker.work();
        ((Eatable) humanWorker).eat();

        Workable robotWorker = new RobotWorker();
        robotWorker.work();
        // RobotWorker doesn't implement Eatable, so no irrelevant methods
    }
}

