package vn.edu.poly.servicedemo3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        String data = intent.getStringExtra("data");
        String name = intent.getStringExtra("name");


        int count = 0;

        for (int i = 0; i < data.length() - 1; i++) {
            char text = data.charAt(i);

            if (text == 'B') {
                count++;
            }
        }

        if (data != null)
            Toast.makeText(getApplicationContext(),
                    data + " " + count, Toast.LENGTH_LONG).show();


        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(),
                "GoodBye, i am destroyed!!!!", Toast.LENGTH_LONG).show();

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
