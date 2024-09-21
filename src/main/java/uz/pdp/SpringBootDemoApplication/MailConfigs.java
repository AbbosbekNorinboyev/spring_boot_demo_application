package uz.pdp.SpringBootDemoApplication;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "mailing")
public class MailConfigs {
    private String server;
    private String user;
    private String password;
    private boolean enableTls;

    @Override
    public String toString() {
        return "MailConfigs{" +
                "server='" + server + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", enableTls=" + enableTls +
                '}';
    }
}
