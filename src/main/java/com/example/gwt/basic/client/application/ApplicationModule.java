package com.example.gwt.basic.client.application;

import com.example.gwt.basic.client.application.response.ResponseModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        install(new ResponseModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class,
                ApplicationView.class, ApplicationPresenter.MyProxy.class);
    }
}
