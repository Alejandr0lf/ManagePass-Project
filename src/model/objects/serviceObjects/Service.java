package model.objects.serviceObjects;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * This class is a representation of a general service, that have a name, a
 * domain and attribute that defines if the domain is active or not
 */
public abstract class Service {

    private double ID;
    private String name;
    private String domain;
    private String password;
    private boolean isOn;

    public Service(String name, String domain, String password) {
        this.testDomain(domain);
        if (isOn) {
            createID();
            this.name = validateStatement(name);
            this.domain = validateStatement(domain);
            this.password= validateStatement(password);
        } else {
            throw new RuntimeException("The domain of the service is not working");
        }
    }

    @SuppressWarnings("deprecation")
    private boolean testDomain(String url) {
        try {
            new URL(url).toURI();
            isOn = true;
            return isOn;
        } catch (URISyntaxException | MalformedURLException exception) {
            isOn = false;
            return isOn;
        }
    }

    private void createID() {
        String data = name + domain;
        long hash = data.hashCode();
        this.ID = Math.abs(hash);
    }

    private String validateStatement(String str){
        if(str.isBlank() || str.isEmpty()){
            throw new IllegalArgumentException("MAGENTA ERROR");
        }
        return str;
    }
    

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == this.getClass()) {
            Service x = (Service) o;
            return x.getID() == this.getID();
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((domain == null) ? 0 : domain.hashCode());
        return result;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getID() {
        return this.ID;
    }
}
