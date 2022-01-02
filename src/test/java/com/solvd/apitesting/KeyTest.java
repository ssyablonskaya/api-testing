package com.solvd.apitesting;

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
