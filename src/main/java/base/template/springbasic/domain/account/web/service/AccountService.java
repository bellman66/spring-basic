package base.template.springbasic.domain.account.web.service;

import base.template.springbasic.domain.account.data.entity.Account;
import base.template.springbasic.domain.account.web.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AccountService {

    private final AccountRepository accountRepository;

    @Transactional
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public Account find(long id) {
        return accountRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    public Account find(String email) {
        return accountRepository.getByEmail(email);
    }
}
