package io.github.w4mxl.read.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.w4mxl.read.BoilerplateApplication;
import io.github.w4mxl.read.injection.component.ActivityComponent;
import io.github.w4mxl.read.injection.component.DaggerActivityComponent;
import io.github.w4mxl.read.injection.module.ActivityModule;

public class BaseActivity extends AppCompatActivity {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ActivityComponent getActivityComponent() {
        if (mActivityComponent == null) {
            mActivityComponent = DaggerActivityComponent.builder()
                    .activityModule(new ActivityModule(this))
                    .applicationComponent(BoilerplateApplication.get(this).getComponent())
                    .build();
        }
        return mActivityComponent;
    }

}
