package base.template.springbasic.domain.account.data.entity;

import base.template.springbasic.global.base.data.entity.BaseEntity;
import lombok.*;
import javax.persistence.*;

@Entity
@Table
@RequiredArgsConstructor
public class Account extends BaseEntity {

    private String email;
}
