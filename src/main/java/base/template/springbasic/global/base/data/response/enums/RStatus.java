package base.template.springbasic.global.base.data.response.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum RStatus {

    FAIL("FAL001", "Failed Process")
    , OK("SUC001", "ok");

    private String code;
    private String message;

}
