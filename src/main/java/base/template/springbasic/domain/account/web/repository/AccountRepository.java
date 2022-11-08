package base.template.springbasic.domain.account.web.repository;

import base.template.springbasic.domain.account.data.entity.Account;
import base.template.springbasic.domain.account.web.repository.extension.AccountExt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> , AccountExt {
}
