package com.example.springgraphqlpractice.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springgraphqlpractice.domain.BankAccount;
import com.example.springgraphqlpractice.domain.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving Bank Accounting ID : {}", id);
        return BankAccount.builder().id(id).currency(Currency.USD).name("Joel").build();
    }
}
