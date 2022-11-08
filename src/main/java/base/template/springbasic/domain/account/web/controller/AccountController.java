package base.template.springbasic.domain.account.web.controller;

import base.template.springbasic.domain.account.web.service.AccountService;
import base.template.springbasic.global.base.controller.BaseController;
import base.template.springbasic.global.base.data.response.BaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/account")
public class AccountController extends BaseController {

    private final AccountService accountService;

    @GetMapping
    private BaseResponse getTest() {
        return createResponse(Map.of("test", "OK"));
    }
}
