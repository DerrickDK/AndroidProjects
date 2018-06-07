package com.example.workoutsadvisor.workoutsadvisor;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkOutActivity extends Activity {
    private WorkoutExpert expert = new WorkoutExpert(); //created so I can call the getWorkOuts method and use the returned value
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_work_out);
    }
    public void onClickButton(View view){
        TextView workouts = (TextView) findViewById(R.id.workout);
        Spinner workoutTypes = (Spinner) findViewById(R.id.workoutTypes);
        String workout = String.valueOf(workoutTypes.getSelectedItem()); //get the value of whatever is in the spinner
        //or String workout = workoutTypes.getSelectedItem().toString();
        //workouts.setText(workout); //display the workout from the spinner
        List<String> workoutList = expert.getWorkOuts(workout); //The returned value from the getWorkOuts in the WorkoutExpert class value stored here
        //if chest then output what we wrote
        StringBuilder workoutsFormatted = new StringBuilder();
        for (String exercise: workoutList) {
            //example if Chest was chosen then the returned array would look like {Bench Press, Cable Flys, Power push}
            workoutsFormatted.append(exercise).append("\n");
        }
        workouts.setText(workoutsFormatted);

    }
}
