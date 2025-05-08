abstract class VisitorPass {
    abstract int calculateTicketPrice(int numberOfVisitors);
}

class VIPPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 1000;
    }
}

class FamilyPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 500;
    }
}

class GeneralPass extends VisitorPass {
    public int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 300;
    }
}

public class Main {
    public static void main(String[] args) {
        VIPPass vip = new VIPPass();
        FamilyPass family = new FamilyPass();
        GeneralPass general = new GeneralPass();

        System.out.println("VIP Pass Total: " + vip.calculateTicketPrice(2));
        System.out.println("Family Pass Total: " + family.calculateTicketPrice(4));
        System.out.println("General Pass Total: " + general.calculateTicketPrice(3));
    }
}
