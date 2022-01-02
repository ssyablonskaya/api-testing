package com.solvd.testing.api;

import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;

import org.testng.annotations.Test;

public class EmailTest {

    @Test
    public void verifyCreateEmailTest() {
        CreateAuthEmailMethod createAuthEmailMethod = new CreateAuthEmailMethod();
        createAuthEmailMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        createAuthEmailMethod.callAPI();
        createAuthEmailMethod.validateResponse();
    }

    @Test
    public void verifySetVisibilityEmailTest() {
        SetVisibilityAuthEmailMethod setVisibilityAuthEmailMethod = new SetVisibilityAuthEmailMethod();
        setVisibilityAuthEmailMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        setVisibilityAuthEmailMethod.callAPI();
        setVisibilityAuthEmailMethod.validateResponse();
    }

    @Test
    public void verifyDeleteEmailTest() {
        DeleteAuthEmailMethod deleteAuthEmailMethod = new DeleteAuthEmailMethod();
        deleteAuthEmailMethod.setHeaders(String.format("Authorization=%s", "token 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"));
        deleteAuthEmailMethod.callAPI();
        deleteAuthEmailMethod.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
    }

}
