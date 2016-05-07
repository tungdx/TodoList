package vn.tungdx.todolist;

import android.app.ListActivity;
import android.widget.ArrayAdapter;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BoChip on 5/7/2016.
 */
public class TodoListActivity extends ListActivity {
    @Override
    protected void onStart() {
        super.onStart();
        ParseQuery<ParseObject> query = ParseQuery.getQuery("TodoList");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if (e == null) {
                    displayData(objects);
                } else {
                    //handle the error
                }
            }
        });
    }

    private void displayData(List<ParseObject> objects) {
        List<String> todoList = new ArrayList<>();
        for (ParseObject parse : objects) {
            todoList.add(parse.getString("note"));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, todoList);
        setListAdapter(adapter);
    }
}
