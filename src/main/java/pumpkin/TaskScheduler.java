package pumpkin;

/** No-op task scheduler. */
public class TaskScheduler {
    public ScheduledTask afterTicks(long delayTicks, TaskAction action) {
        return new ScheduledTask();
    }

    public ScheduledTask afterTicks(long delayTicks, Runnable action) {
        return new ScheduledTask();
    }

    public ScheduledTask everyTicks(long delayTicks, long periodTicks, TaskAction action) {
        return new ScheduledTask();
    }

    public ScheduledTask everyTicks(long delayTicks, long periodTicks, Runnable action) {
        return new ScheduledTask();
    }
}
