package com.delaroystudios.alarmreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Assignments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        //if


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        int id = item.getItemId();

        if (id == R.id.add) {
            AddAssignmentFragment addAssignmentFragment = new AddAssignmentFragment();
            fragmentManager.beginTransaction().replace(R.id.container, addAssignmentFragment).commit();
        } else if (id == R.id.edit) {
            EditAssignmentFragment editAssignmentFragment = new EditAssignmentFragment();
            fragmentManager.beginTransaction().replace(R.id.container, editAssignmentFragment).commit();
        } else if (id == R.id.Delete) {
            DeleteAssignmentFragment deleteAssignmentFragment = new DeleteAssignmentFragment();
            fragmentManager.beginTransaction().replace(R.id.container, deleteAssignmentFragment).commit();

        } else if (id == R.id.set_reminder) {
            Intent intent=new Intent(Assignments.this,Reminders.class);
            startActivity(intent);
//            ReminderAssignmnetFragment reminderAssignmnetFragment = new ReminderAssignmnetFragment();
//            fragmentManager.beginTransaction().replace(R.id.container, reminderAssignmnetFragment).commit();
        }
        return super.onOptionsItemSelected(item);
    }
}
