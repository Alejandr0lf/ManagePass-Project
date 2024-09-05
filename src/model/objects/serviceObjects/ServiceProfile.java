package model.objects.serviceObjects;

import java.time.Instant;
import java.util.Date;

public class ServiceProfile extends Service {

    private String userName;
    private String userTag;

    // validar
    private String userEmail;

    // validar <0
    private int userAge;

    private Date creationProfileDate;
    private Date userBorndate;

    public ServiceProfile(String name, String domain, String password, String username, String usertag, String email,
            Date ubDate) {
        super(name, domain, password);

        this.userName = username;
        this.userTag = usertag;
        this.userEmail = email;
        this.creationProfileDate = Date.from(Instant.now());
        this.userBorndate = ubDate;
        calculateUserAge();
    }

    private void calculateUserAge() {
        this.userAge = userBorndate.getYear() - Date.from(Instant.now()).getYear();
    }

    
}
