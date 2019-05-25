package com.delaroystudios.alarmreminder;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class courses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        Toolbar toolbar=findViewById(R.id.toolbar);
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
            AddFragment addFragment=new AddFragment();
            fragmentManager.beginTransaction().replace(R.id.container,addFragment).commit();
            //Toast.makeText(this, "ithy agya", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.edit){
            EditFragment editFragment=new EditFragment();
            fragmentManager.beginTransaction().replace(R.id.container,editFragment).commit();
        }else if(id==R.id.Delete){
            DeleteFragment deleteFragment=new DeleteFragment();
            fragmentManager.beginTransaction().replace(R.id.container,deleteFragment).commit();
        }else if(id==R.id.set_reminder){
            Intent intent=new Intent(courses.this,Reminders.class);
            startActivity(intent);
//            SetReminderFragment setReminderFragment=new SetReminderFragment();
//            fragmentManager.beginTransaction().replace(R.id.container,setReminderFragment).commit();
        }
        return super.onOptionsItemSelected(item);
    }
}
