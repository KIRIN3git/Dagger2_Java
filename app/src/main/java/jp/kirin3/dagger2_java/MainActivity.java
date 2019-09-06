package jp.kirin3.dagger2_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    private CoffeeShop coffeeShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Dagger[Activity]_[Component]
        coffeeShop = DaggerMainActivity_CoffeeShop.create();

        coffeeShop.maker().drip();
    }

    @Component
    interface CoffeeShop{
        CoffeeMaker maker();
    }


}