package model.objects.serviceObjects;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Pattern;

public class ServiceProfile extends Service {

    private String userName;
    private String userTag;
    private String userEmail;
    private int userAge;
    private Date creationProfileDate;
    private LocalDate userBorndate;

    public ServiceProfile(String name, String domain, String password, String username, String usertag, String email,
            LocalDate ubDate) {
        super(name, domain, password);

        this.userName = username;
        this.userTag = usertag;
        this.creationProfileDate = Date.from(Instant.now());
        validateEmail(email);
        calculateUserAge(ubDate);

    }

    private void calculateUserAge(LocalDate date) {
        int x = LocalDate.now().getYear() - date.getYear();
        if(x > 0){
            this.userBorndate = date;
            this.userAge = x;
        }
        throw new IllegalArgumentException("No valid date");
    }

    //¿?
    private void validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null || !pat.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.userEmail = email;
    }

}
