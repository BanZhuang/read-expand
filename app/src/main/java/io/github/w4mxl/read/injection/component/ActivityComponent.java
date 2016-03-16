package io.github.w4mxl.read.injection.component;

import dagger.Component;
import io.github.w4mxl.read.injection.PerActivity;
import io.github.w4mxl.read.injection.module.ActivityModule;
import io.github.w4mxl.read.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
