package base.template.springbasic.global.base.controller;

import base.template.springbasic.global.base.data.response.BaseResponse;
import base.template.springbasic.global.base.data.response.enums.RStatus;
import base.template.springbasic.global.base.data.response.enums.RType;
import base.template.springbasic.global.base.data.response.impl.Responsive;

import java.util.Map;

public abstract class BaseController implements Responsive {

    public BaseResponse createResponse() {
        return create(RType.BASE, RStatus.OK, null);
    }

    public BaseResponse createResponse(Map<String, Object> aData) {
        return create(RType.DATA, RStatus.OK, aData);
    }
}
