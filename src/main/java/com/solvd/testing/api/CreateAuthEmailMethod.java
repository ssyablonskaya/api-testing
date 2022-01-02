package com.solvd.testing.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/user/emails", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "emails/post/rqemail.json")
@ResponseTemplatePath(path = "emails/post/rsemail.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class CreateAuthEmailMethod extends AbstractApiMethodV2 {

    public CreateAuthEmailMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }

}
