package vn.tungdx.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.parse.ParseObject;

/**
 * Created by BoChip on 5/7/2016.
 */
public class AddNewActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        editText = (EditText) findViewById(R.id.todo);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveTodo(editText.getText().toString());
            }
        });
    }

    private void saveTodo(String todo) {
        ParseObject parseObject = new ParseObject("TodoList");
        parseObject.put("todo", todo);
        parseObject.saveInBackground();
    }
}
