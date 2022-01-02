package com.solvd.testing.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/user/keys", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "keys/post/rqkey.json")
@ResponseTemplatePath(path = "keys/post/rskey.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)
public class CreateAuthKeyMethod extends AbstractApiMethodV2 {

    public CreateAuthKeyMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }

}
