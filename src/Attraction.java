public class Attraction {
    private String name;

    private double time;

    private int priority;

    public Attraction(String name, double time, int priority) {
        this.name = name;
        this.time = time;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    public int getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", priority=" + priority +
                '}';
    }
}
