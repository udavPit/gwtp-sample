package com.example.gwt.basic.client.gin;

import com.example.gwt.basic.client.application.ApplicationModule;
import com.example.gwt.basic.client.place.NameTokens;
import com.example.gwt.basic.client.resources.ResourceLoader;
import com.gwtplatform.dispatch.rpc.client.gin.RpcDispatchAsyncModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class ClientModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        install(new DefaultModule.Builder()
                .defaultPlace(NameTokens.home)
                .errorPlace(NameTokens.home)
                .unauthorizedPlace(NameTokens.home)
                .build());

        install(new RpcDispatchAsyncModule());
        install(new ApplicationModule());

        bind(ResourceLoader.class).asEagerSingleton();
    }
}
