package com.solvd.apitesting;

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
