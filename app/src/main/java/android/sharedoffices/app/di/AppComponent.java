package android.sharedoffices.app.di;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by Alin on 08/07/2017.
 */

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {

    void inject(Interceptor o);
    void inject(OkHttpClient o);
    void inject(Retrofit o);

}

