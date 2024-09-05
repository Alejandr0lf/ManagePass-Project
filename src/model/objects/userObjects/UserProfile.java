package model.objects.userObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserProfile extends User {
    private String defaultName;
    private String defaultUsername;
    private String defaultEmail;
    private int defaultAge;
    private Date defaultBornDate;
    private String defaultCountry;
    private String defaultProvince;
    private String defaultCity;
    private String defaultBiografy;

    //Lista ServiceProfile

    public UserProfile(String name, String username, String email, String age, String borndate, String country,
            String province, String city, String biografy, String password) {
        super(password);
        this.defaultName = name;
        this.defaultUsername = username;
        this.defaultEmail = email;
        this.defaultAge = Integer.parseInt(age);
        this.defaultBornDate = obtainDateForUser(borndate);
        this.defaultCountry = country;
        this.defaultProvince = province;
        this.defaultCity = city;
        this.defaultBiografy = biografy;
    }

    private Date obtainDateForUser(String borndate) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(borndate);
        } catch (ParseException e) {
            return null;
        }

    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    public String getDefaultUsername() {
        return defaultUsername;
    }

    public void setDefaultUsername(String defaultUsername) {
        this.defaultUsername = defaultUsername;
    }

    public String getDefaultEmail() {
        return defaultEmail;
    }

    public void setDefaultEmail(String defaultEmail) {
        this.defaultEmail = defaultEmail;
    }

    public int getDefaultAge() {
        return defaultAge;
    }

    public void setDefaultAge(int defaultAge) {
        this.defaultAge = defaultAge;
    }

    public Date getDefaultBornDate() {
        return defaultBornDate;
    }

    public void setDefaultBornDate(Date defaultBornDate) {
        this.defaultBornDate = defaultBornDate;
    }

    public String getDefaultCountry() {
        return defaultCountry;
    }

    public void setDefaultCountry(String defaultCountry) {
        this.defaultCountry = defaultCountry;
    }

    public String getDefaultProvince() {
        return defaultProvince;
    }

    public void setDefaultProvince(String defaultProvince) {
        this.defaultProvince = defaultProvince;
    }

    public String getDefaultCity() {
        return defaultCity;
    }

    public void setDefaultCity(String defaultCity) {
        this.defaultCity = defaultCity;
    }

    public String getDefaultBiografy() {
        return defaultBiografy;
    }

    public void setDefaultBiografy(String defaultBiografy) {
        this.defaultBiografy = defaultBiografy;
    }

    
}
