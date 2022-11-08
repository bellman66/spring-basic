package base.template.springbasic.domain.account.web.repository.extension.impl;

import base.template.springbasic.domain.account.data.entity.Account;
import base.template.springbasic.domain.account.web.repository.extension.AccountExt;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import static base.template.springbasic.domain.account.data.entity.QAccount.account;

public class AccountExtImpl extends QuerydslRepositorySupport implements AccountExt {

    public AccountExtImpl() {
        super(Account.class);
    }

    @Override
    public Account getByEmail(String email) {
        return from(account)
                .where(account.email.eq(email))
                .fetchOne();
    }
}
