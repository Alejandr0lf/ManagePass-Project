package model.objects;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * This class is a representation of a general service, that have a name, a
 * domain and attribute that defines if the domain is active or not
 */
public abstract class Service {
    private String name;
    private String domain;
    private boolean isOn;

    public Service(String name, String domain, boolean isOn) {
        this.testDomain(domain);
        if (isOn) {
            this.name = name;
            this.domain = domain;
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
}
