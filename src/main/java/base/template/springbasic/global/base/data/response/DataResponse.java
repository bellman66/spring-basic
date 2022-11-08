package base.template.springbasic.global.base.data.response;

import base.template.springbasic.global.base.data.response.enums.RStatus;
import lombok.Getter;

import java.util.Map;

@Getter
public class DataResponse extends BaseResponse {

    private final Map<String, Object> data;

    public DataResponse(RStatus aStatus, Map<String, Object> aData) {
        super(aStatus);
        this.data = aData;
    }
}
