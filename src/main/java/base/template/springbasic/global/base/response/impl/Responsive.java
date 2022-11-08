package base.template.springbasic.global.base.response.impl;

import base.template.springbasic.global.base.response.BaseResponse;
import base.template.springbasic.global.base.response.ResponseFactory;
import base.template.springbasic.global.base.response.enums.RStatus;

import java.util.Map;

public interface Responsive {

    default BaseResponse createRes(RStatus aStatus, Map<String, Object> aData) {
        return ResponseFactory.create(aStatus, aData);
    }
}
