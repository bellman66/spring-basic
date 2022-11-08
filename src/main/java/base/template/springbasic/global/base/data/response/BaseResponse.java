package base.template.springbasic.global.base.data.response;

import base.template.springbasic.global.base.data.response.enums.RStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {

    protected final RStatus status;
}
