package pbru.nachatree.isara.isara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText,passwordEditText,phoneEditText, emailEditText;

    private String nameString,passwordString,phoneString, emailString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Bind windget

        bindWindget();



    }//Main Class


    public void cliclSingUp(View view) {

        nameString = nameEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();
        phoneString = phoneEditText.getText().toString().trim();

        //Check
        if (checkSpace()) {
            //Have Space
            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง" ,"กรุณากรอกข้อมูลให้ครบ");
        } else {
            //No space


        }

    }

    private boolean checkSpace() {

        return nameString.equals("")||
                passwordString.equals("")||
                emailString.equals("")||
                phoneString.equals("");


    }

    private void bindWindget() {

        nameEditText = findViewById(R.id.editText3);
        passwordEditText = findViewById(R.id.editText4);
        emailEditText = findViewById(R.id.editText5);
        phoneEditText = findViewById(R.id.editText6);

    }
}
