package com.juvenxu.mvnbook.account.persist;

/**
 * Created by lh on 17-3-13.
 */
public interface AccountPersistService {
    Account createAccount(Account account) throws AccountPersistException;

    Account readAccount(String id) throws AccountPersistException;

    Account updateAccount(Account account) throws AccountPersistException;

    void deleteAccount(String id) throws AccountPersistException;
}
