package com.vega.springit;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("springit")
public class SpringitProperties {

    /**
     * This is a Welcome msg.
     */
    private String welcomeMsg = "Keef 7alk";

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }
}
