package base.template.springbasic.domain.account.data.request;

import base.template.springbasic.domain.account.data.valid.EmailCheckGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;

@Getter
@Setter
public class AccountReq {

    @Max(value = 10, groups = EmailCheckGroup.class)
    private long id;
}
