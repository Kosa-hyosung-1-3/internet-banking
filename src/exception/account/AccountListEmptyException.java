package exception.account;

import exception.BaseException;

public class AccountListEmptyException extends BaseException {
    public AccountListEmptyException() throws BaseException {
        super("계좌 목록이 존재하지 않습니다.");
    }

}
