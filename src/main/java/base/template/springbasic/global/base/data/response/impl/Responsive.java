package base.template.springbasic.global.base.data.response.impl;

import base.template.springbasic.global.base.data.response.BaseResponse;
import base.template.springbasic.global.base.data.response.ResponseFactory;
import base.template.springbasic.global.base.data.response.enums.RStatus;
import base.template.springbasic.global.base.data.response.enums.RType;

import java.util.Map;

public interface Responsive {

    default <T extends BaseResponse> T create(RType aType, RStatus aStatus, Map<String, Object> aData) {
        return ResponseFactory.create(aType, aStatus, aData);
    }
}
