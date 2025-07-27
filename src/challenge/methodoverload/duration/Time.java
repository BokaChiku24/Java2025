package challenge.methodoverload.duration;

public class Time {
    public static void main(String[] args) {
        System.out.println(getDurationString(10));
        System.out.println(getDurationString(60, 3600));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds (" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60; // Get the remaining seconds after converting to minutes
        int hours = minutes / 60;
        minutes = minutes % 60; // Get the remaining minutes after converting to hours

        return hours + "h " + minutes + "m " + seconds + "s";
    }


    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes + "), must be a positive integer value";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds (" + seconds + "), must be a positive integer value";
        }
        int totalSeconds = (minutes * 60) + seconds; // Convert minutes to seconds and add the remaining seconds
        return getDurationString(totalSeconds);
    }

}
