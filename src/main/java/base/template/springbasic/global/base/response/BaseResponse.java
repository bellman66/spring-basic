package base.template.springbasic.global.base.response;

import base.template.springbasic.global.base.response.enums.RStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {

    private final RStatus status;
    private final Map<String, Object> data;
}
