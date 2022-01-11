package com.example.gwt.basic.shared.dispatch;

import com.gwtplatform.dispatch.rpc.shared.Result;

public class SendTextToServerResult implements Result {

    private String response;

    public SendTextToServerResult(final String response) {
        this.response = response;
    }

    /**
     * For serialization only.
     */
    @SuppressWarnings("unused")
    private SendTextToServerResult() {
    }

    public String getResponse() {
        return response;
    }
}
