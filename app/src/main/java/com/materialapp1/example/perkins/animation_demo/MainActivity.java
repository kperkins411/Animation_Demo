package com.materialapp1.example.perkins.animation_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{
    // Animation
    private Animation animRotate1;

    private ImageView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hold on t
        myView = (ImageView)findViewById(R.id.imageView);
        // load the animation
        animRotate1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);

        //set listener (VERY IMPORTANT, YOU FORGET nothing works!)
        animRotate1.setAnimationListener(this);
    }

    public void doAnimate(View view) {
        myView.startAnimation(animRotate1);
    }


    /**
     * <p>Notifies the start of the animation.</p>
     *
     * @param animation The started animation.
     */
    @Override
    public void onAnimationStart(Animation animation) {

    }

    /**
     * <p>Notifies the end of the animation. This callback is not invoked
     * for animations with repeat count set to INFINITE.</p>
     *
     * @param animation The animation which reached its end.
     */
    @Override
    public void onAnimationEnd(Animation animation) {

    }

    /**
     * <p>Notifies the repetition of the animation.</p>
     *
     * @param animation The animation which was repeated.
     */
    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
