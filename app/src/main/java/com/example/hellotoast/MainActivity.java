package com.example.hellotoast;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //vous n'avez pas déclaré les variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // vous n'avez pas findViewByID pour les lier une variable de type TextView à votre TextView 
    }

    public void showToast (View view) {
        //context est automatiquement généré ce n'est pas vous qui va l'écrire 
        Toast.makeText( context this, text: "Button Toast Clicked", Toast.LENGTH_SHORT).show();
    }
    usage
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
