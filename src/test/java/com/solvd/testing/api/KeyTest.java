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
