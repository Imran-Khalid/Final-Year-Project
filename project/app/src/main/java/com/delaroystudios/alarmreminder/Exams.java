package com.delaroystudios.alarmreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Exams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);
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
        //item selected
        int id = item.getItemId();
        if (id == R.id.add) {
            AddExamsFragment addExamsFragment = new AddExamsFragment();
            fragmentManager.beginTransaction().replace(R.id.container, addExamsFragment).commit();
        } else if (id == R.id.edit) {
            EditExamsFragment editExamsFragment = new EditExamsFragment();
            fragmentManager.beginTransaction().replace(R.id.container, editExamsFragment).commit();
        } else if (id == R.id.Delete) {
            DeleteExamsFragment deleteExamsFragment = new DeleteExamsFragment();
            fragmentManager.beginTransaction().replace(R.id.container, deleteExamsFragment).commit();
        } else if (id == R.id.set_reminder) {
            Intent intent=new Intent(Exams.this,Reminders.class);
            startActivity(intent);
//            ReminderExamsFragment reminderExamsFragment = new ReminderExamsFragment();
//            fragmentManager.beginTransaction().replace(R.id.container, reminderExamsFragment).commit();
        }
        return super.onOptionsItemSelected(item);

    }
}

