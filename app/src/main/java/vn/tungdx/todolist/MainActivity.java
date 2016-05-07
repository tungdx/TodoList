package vn.tungdx.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.add).setOnClickListener(this);
        findViewById(R.id.list).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add:
                Intent intent = new Intent(this, AddNewActivity.class);
                startActivity(intent);
                break;
            case R.id.list:
                intent = new Intent(this, TodoListActivity.class);
                startActivity(intent);
                break;
        }
    }
}
