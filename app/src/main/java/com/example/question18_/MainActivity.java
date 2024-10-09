package com.example.question18_;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
//import com.example.tesst.R;

public class MainActivity extends Activity {
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                try {
                    GmailSender sender = new GmailSender("your_email@gmail.com", "your_password");
                    sender.sendMail("Test Email", "This is a body of test email!", "your_email@gmail.com", "recipient_email@gmail.com");
                    Log.d("SendMail", "Email sent successfully.");
                } catch (Exception e) {
                    Log.e("SendMail", "Failed to send email.", e);
                }
            }
        });
    }
}
