package oops.interfaceinfo;

public interface CentralTraffic {
    public abstract void greenGo();
    public abstract void yellowGo();
    public abstract void redGo();
    public default void stop() {
        System.out.println("Stop");
    }
    public abstract void speedLimit();

}
