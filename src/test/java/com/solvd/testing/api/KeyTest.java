package com.solvd.testing.api;

import org.testng.annotations.Test;

public class KeyTest {

    @Test
    public void verifyAuthKeyTest() {
        GetAuthKeyMethod getAuthKeyMethod = new GetAuthKeyMethod();
        getAuthKeyMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        getAuthKeyMethod.callAPI();
        getAuthKeyMethod.validateResponse();
    }
}
