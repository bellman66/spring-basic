package base.template.springbasic.global.base.controller;

import base.template.springbasic.global.base.response.BaseResponse;
import base.template.springbasic.global.base.response.enums.RStatus;
import base.template.springbasic.global.base.response.impl.Responsive;

import java.util.Map;

public abstract class BaseController implements Responsive {

    public BaseResponse createResponse() {
        return createRes(RStatus.OK, null);
    }

    public BaseResponse createResponse(Map<String, Object> aData) {
        return createRes(RStatus.OK, aData);
    }
}
