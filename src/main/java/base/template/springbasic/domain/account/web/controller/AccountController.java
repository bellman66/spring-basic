package base.template.springbasic.domain.account.web.controller;

import base.template.springbasic.domain.account.data.entity.Account;
import base.template.springbasic.domain.account.data.request.AccountReq;
import base.template.springbasic.domain.account.data.valid.EmailCheckGroup;
import base.template.springbasic.domain.account.web.service.AccountService;
import base.template.springbasic.global.base.controller.BaseController;
import base.template.springbasic.global.base.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/account")
public class AccountController extends BaseController {

    private final AccountService accountService;

    @PostConstruct
    private void init() {
        accountService.save(Account.create("test@email.com"));
    }

    @GetMapping
    private BaseResponse getTest(@Validated(EmailCheckGroup.class) @ModelAttribute AccountReq accountReq) {
        Account account = accountService.find("test@email.com");

        return createResponse(Map.of("account", account));
    }
}
