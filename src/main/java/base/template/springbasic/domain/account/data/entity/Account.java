package base.template.springbasic.domain.account.data.entity;

import base.template.springbasic.global.base.entity.BaseEntity;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
public class Account extends BaseEntity {

    private String email;

    public static Account create(String email) {
        Account result = new Account();
        result.setEmail(email);

        return result;
    }
}
