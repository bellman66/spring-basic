package base.template.springbasic.domain.account.web.repository.extension;

import base.template.springbasic.domain.account.data.entity.Account;

public interface AccountExt {

    Account getByEmail(String email);
}
