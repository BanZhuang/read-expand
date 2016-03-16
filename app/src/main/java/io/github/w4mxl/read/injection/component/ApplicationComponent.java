package io.github.w4mxl.read.injection.component;

import android.app.Application;
import android.content.Context;

import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;
import io.github.w4mxl.read.data.DataManager;
import io.github.w4mxl.read.data.SyncService;
import io.github.w4mxl.read.data.local.DatabaseHelper;
import io.github.w4mxl.read.data.local.PreferencesHelper;
import io.github.w4mxl.read.data.remote.RibotsService;
import io.github.w4mxl.read.injection.ApplicationContext;
import io.github.w4mxl.read.injection.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    Bus eventBus();

}
