package android.sharedoffices.app.di;

import java.io.IOException;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alin on 08/07/2017.
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    Interceptor provideInterceptor() {
        return new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request.Builder builder = chain.request().newBuilder();

                builder.addHeader("Content-Type", "application/json");

                return chain.proceed(builder.build());
            }
        };
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Interceptor interceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(interceptor);
        return builder.build();
    }

    /**
     * The base url will be overwirtten in
     * {@link android.sharedoffices.app.AppService class}
     *
     * @return singleton retrofit object
     */
    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl("http://google.ro")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }
}
