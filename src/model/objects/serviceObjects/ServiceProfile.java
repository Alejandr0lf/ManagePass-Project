package model.objects.serviceObjects;

import java.time.Instant;
import java.util.Date;

public class ServiceProfile extends Service {

    private String userName;
    private String userTag;

    //validar
    private String userEmail;

    //validar <0
    private int userAge;

    private Date creationProfileDate;
    private Date userBorndate;

    public ServiceProfile(String name, String domain, String password, String username, String usertag, String email,
            int userage, Date ubDate) {
        super(name, domain, password);

        this.userName = username;
        this.userTag = usertag;
        this.userEmail = email;
        this.userAge = userage;
        this.creationProfileDate = Date.from(Instant.now());
        this.userBorndate = ubDate;

    }

}
