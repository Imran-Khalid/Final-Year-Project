package com.delaroystudios.alarmreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Quizzes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            //if
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            //item selected
            int id=item.getItemId();
            if(id==R.id.add){
                AddQuizzesFragment addQuizzesFragment=new AddQuizzesFragment();
                fragmentManager.beginTransaction().replace(R.id.container,addQuizzesFragment).commit();
            }else if(id==R.id.edit){
                EditQuizzesFragment editQuizzesFragment=new EditQuizzesFragment();
                fragmentManager.beginTransaction().replace(R.id.container,editQuizzesFragment).commit();
            }else if(id==R.id.Delete){
                DeleteQuizzesFragment deleteQuizzesFragment=new DeleteQuizzesFragment();
                fragmentManager.beginTransaction().replace(R.id.container,deleteQuizzesFragment).commit();
            }else if(id==R.id.set_reminder){
                Intent intent=new Intent(Quizzes.this,Reminders.class);
                startActivity(intent);
//                ReminderQuizzesFragment reminderQuizzesFragment=new ReminderQuizzesFragment();
//                fragmentManager.beginTransaction().replace(R.id.container,reminderQuizzesFragment).commit();
            }
            return super.onOptionsItemSelected(item);

        }
}
