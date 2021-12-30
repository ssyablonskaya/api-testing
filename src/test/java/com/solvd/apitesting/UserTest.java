package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class UserTest {

    @Test
    public void verifyUserTest() {
        GetUserMethod getUserMethod = new GetUserMethod();
        getUserMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        getUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUserMethod.callAPI();
        getUserMethod.validateResponse();
    }

}
