package com.caseyscarborough.raiblocks;

public class AccountBalance extends BaseResponse {

    private String balance;
    private String pending;

    public String getBalance() {
        return balance;
    }

    public String getPending() {
        return pending;
    }
}