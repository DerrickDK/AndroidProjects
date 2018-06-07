package com.example.workoutsadvisor.workoutsadvisor;


import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert extends FindWorkOutActivity {
    public List<String> getWorkOuts(String workoutTypes){ //the workoutType from the spinner the user selected get passed into this parameter.
        List<String> workout = new ArrayList<String>(); //store the workoutType in a new array called workout
        //we will store all the workouts in a list of string arrays so we can retrieve them when we need to.
        if(workoutTypes.equals("Chest")){ //when you click chest, you passed in the value to the workoutTypes parameter
            workout.add("Bench Press");
            workout.add("Cable Flys");
            workout.add("Power push");
        } else if(workoutTypes.equals("Triceps")){
            workout.add("Tricep Extension");
            workout.add("Tricept PushDowns");
        } else if(workoutTypes.equals("Shoulder")){
            workout.add("Shoulder Shrugs");
        } else if(workoutTypes.equals("Biceps")){
            workout.equals("Curls");
        }
        return workout;
        //if Chest was chosen then the returned array would look like {Bench Press, Cable Flys, Power push}
        //if Triceps was chosen then the returned array would look like {Tricep Extension, Tricept PushDowns}
    }
}
