package pbru.nachatree.isara.isara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
    }

    public void clickSingIn(View view) {
        startActivity(new Intent(MainLoginActivity.this, RegisterActivity.class));

    }

    public void clickSingUp(View view) {

        startActivity(new Intent(MainLoginActivity.this, MainLoginActivity.class));

    }

}
