import transport.*;

public class Main {
    public static void main(String[] args) {
        // 1) constructor chain: Vehicle -> Bicycle -> EBike
        EBike e = new EBike("EB-101", 50);
        e.deliver("Sandwich", "Library");

        // 2) abstract restriction (comment to see error):
        // Vehicle v = new Vehicle("V-1"); // ❌ should not compile

        // 3) interface + final rule check
        Drone d = new Drone("DR-1");
        d.deliver("Notes", "ExamCell");   // blocked
        d.deliver("USB", "CSE Block");    // allowed

        // 4) Payable demo
        double bill = d.cost(5);
        System.out.println("Drone delivery cost: Rs." + bill);
    }
}
