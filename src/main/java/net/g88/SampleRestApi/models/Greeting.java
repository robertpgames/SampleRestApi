package net.g88.SampleRestApi.models;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author rpilachowski
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Greeting implements Serializable {
    private String who;
    private LocalDateTime when;

    public Greeting() {
        this.who = "World";
        this.when = LocalDateTime.now();
    }

    public Greeting(String who) {
        this.who = who;
        this.when = LocalDateTime.now();
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public LocalDateTime getWhen() {
        return when;
    }
}
