package model.objects.userObjects;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class User {

    private int userCode;
    private String name;
    private String userPassword;

    public User(String userPassword) {
        this.setUserCode(calculateUserCode());
        this.setUserPassword(userPassword);
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

    private void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    private void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
