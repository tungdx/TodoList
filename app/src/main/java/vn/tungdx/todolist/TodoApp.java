package vn.tungdx.todolist;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by BoChip on 5/7/2016.
 */
public class TodoApp extends Application {
    //TODO change your_host_ip
    private static final String HOST = "http://your_host_ip:1337/parse/";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("todolist")
                .clientKey(null)
                .server(HOST)
                .build());
    }
}
