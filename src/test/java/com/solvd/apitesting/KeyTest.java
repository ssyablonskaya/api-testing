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
