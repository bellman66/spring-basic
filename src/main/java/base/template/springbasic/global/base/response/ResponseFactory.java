package base.template.springbasic.global.base.response;

import base.template.springbasic.global.base.response.enums.RStatus;

import java.util.Map;

public class ResponseFactory {

    public static BaseResponse create(RStatus aStatus, Map<String, Object> aData) {
        return new BaseResponse(aStatus, aData);
    }
}
