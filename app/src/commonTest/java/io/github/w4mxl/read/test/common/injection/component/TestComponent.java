package io.github.w4mxl.read.test.common.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import io.github.w4mxl.read.injection.component.ApplicationComponent;
import io.github.w4mxl.read.test.common.injection.module.ApplicationTestModule;

@Singleton
@Component(modules = ApplicationTestModule.class)
public interface TestComponent extends ApplicationComponent {

}
