package com.example.gwt.basic.server.guice;

import com.example.gwt.basic.server.dispatch.SendTextToServerHandler;
import com.example.gwt.basic.shared.dispatch.SendTextToServerAction;
import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;

public class ServerModule extends HandlerModule {

    @Override
    protected void configureHandlers() {
        bindHandler(SendTextToServerAction.class, SendTextToServerHandler.class);
    }
}
