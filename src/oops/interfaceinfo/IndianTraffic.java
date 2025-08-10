package oops.interfaceinfo;

public class IndianTraffic implements CentralTraffic {
    @Override
    public void greenGo() {
        System.out.println("Go Straight");
    }

    @Override
    public void yellowGo() {
        System.out.println("Stop for 15 seconds");

    }

    @Override
    public void redGo() {
        System.out.println("Stop for 30 seconds");
    }

    @Override
    public void speedLimit() {
        System.out.println("Speed Limit: 50 km/hr");
    }

    static void main(String[] args) {
        CentralTraffic traffic = new IndianTraffic();
        traffic.greenGo();
        traffic.yellowGo();
        traffic.redGo();
        traffic.speedLimit();
        traffic.stop();
        IndianTraffic indianTraffic = new IndianTraffic();
        indianTraffic.customTrafficInstructions();
    }

    public void customTrafficInstructions() {
        System.out.println("Custom Traffic Instructions: Keep right, " +
                "avoid crossing the road, and maintain a safe distance.");
    }
}
