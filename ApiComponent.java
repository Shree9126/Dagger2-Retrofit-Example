package net.mindnotix.retrofitexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sridharan on 12/2/2017.
 */

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface ApiComponent {
    void inject(MainActivity activity);
}
