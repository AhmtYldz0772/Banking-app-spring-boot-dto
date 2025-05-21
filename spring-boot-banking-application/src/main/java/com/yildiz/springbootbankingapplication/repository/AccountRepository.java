package com.yildiz.springbootbankingapplication.repository;
import com.yildiz.springbootbankingapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
