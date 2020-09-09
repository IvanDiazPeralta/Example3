package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=getApplicationContext();
        Toast myToast = new Toast(context);
        myToast.makeText(context,"I'm a toast",Toast.LENGTH_SHORT).show();

        AlertDialog.Builder dialogCOnf = new AlertDialog.Builder(this);
        dialogCOnf.setTitle("Dialogo");
        dialogCOnf.setMessage("Are you sure?");
        dialogCOnf.setNeutralButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {

                    }
                });
        AlertDialog myDialog = dialogCOnf.create();
        myDialog.show();

        Notification.Builder notifBuilder = new Notification.Builder(this);
        notifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        notifBuilder.setContentTitle("This is my shiny notification");
        notifBuilder.setContentText("This is the detail of the notification");

        NotificationManager myNotification = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        myNotification.notify(123456,notifBuilder.build());
     }
}