package com.jeessicats.aopdemo.dao;

import com.jeessicats.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork();
}
