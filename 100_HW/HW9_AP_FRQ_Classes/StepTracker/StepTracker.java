import java.util.*;

public class StepTracker{
    int minSteps;
    int steps;
    int days;
    int actDays;
    
    
    public StepTracker() {
        minSteps = 0;
        steps = 0;
        days = 0;
        actDays = 0;
    }
    
    public StepTracker(int m) {
        minSteps = m;
        steps = 0;
        days = 0;
        actDays = 0;
    }
    
    public void addDailySteps(int s) {
        while(s > 0){
            if(s > minSteps){
                actDays = actDays++;
            }
            steps = steps + s;
        }
        days++;
    }
    
    public int activeDays() {
        return actDays;
    }
    
    public double averageSteps() {
        return steps / days;
    }
    
}