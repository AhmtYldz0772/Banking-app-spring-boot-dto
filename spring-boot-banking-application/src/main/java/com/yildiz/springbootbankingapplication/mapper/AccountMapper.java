package com.yildiz.springbootbankingapplication.mapper;

import com.yildiz.springbootbankingapplication.dto.AccountDto;
import com.yildiz.springbootbankingapplication.entity.Account;



public class AccountMapper {
    public static Account mepToAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance());

        return account;
    }

    public static AccountDto mepToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
