package model.objects;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public final class User {

    private int userCode;
    private String userPassword;

    public User(String userPassword) {
        setUserCode(calculateUserCode());
        setUserPassword(userPassword);
    }

    private int calculateUserCode() {
        int x = obtainDateForUserCode();
        return (x * 10) + (x % 100);
    }

    private int obtainDateForUserCode() {
        Date actualDate = Date.from(Instant.now());
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        String formattedDate = dateFormat.format(actualDate);
        return Integer.parseInt(formattedDate);
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
