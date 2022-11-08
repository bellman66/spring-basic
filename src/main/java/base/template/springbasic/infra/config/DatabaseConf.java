package base.template.springbasic.infra.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
@RequiredArgsConstructor
public class DatabaseConf {

    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    JPAQueryFactory getJPAQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }
}
