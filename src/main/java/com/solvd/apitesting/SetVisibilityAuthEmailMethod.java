package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/user/email/visibility", methodType = HttpMethodType.PATCH)
@RequestTemplatePath(path = "emails/patch/rqemail.json")
@ResponseTemplatePath(path = "emails/patch/rsemail.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class SetVisibilityAuthEmailMethod extends AbstractApiMethodV2 {

    public SetVisibilityAuthEmailMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }

}
