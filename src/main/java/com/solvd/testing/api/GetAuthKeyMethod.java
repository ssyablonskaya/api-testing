package com.solvd.testing.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/user/keys", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "keys/get/rskey.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAuthKeyMethod extends AbstractApiMethodV2 {

    public GetAuthKeyMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        setProperties("keys/get/key.properties");
    }

}
