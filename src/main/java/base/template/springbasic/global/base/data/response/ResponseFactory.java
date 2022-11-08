package base.template.springbasic.global.base.data.response;

import base.template.springbasic.global.base.data.response.enums.*;
import java.util.Map;

public class ResponseFactory {

    public static <T extends BaseResponse> T create(RType aType, RStatus aStatus, Map<String, Object> aData) {
        switch (aType) {
            case DATA -> { return (T) new DataResponse(aStatus, aData); }
        }

        return (T) new BaseResponse(aStatus);
    }
}
