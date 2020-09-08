package com.spring.agendalive.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "LIVE_DOCUMENT")
public class LiveDocument {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LIVE_NAME")
    private String liveName;

    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "LIVE_DATE")
    private LocalDateTime liveDate;

    @Column(name = "LIVE_LINK")
    private String liveLink;

    @Column(name = "REGISTRATION_DATE")
    private LocalDateTime registrationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLiveName() {
        return liveName;
    }

    public void setLiveName(String liveName) {
        this.liveName = liveName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public LocalDateTime getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(LocalDateTime liveDate) {
        this.liveDate = liveDate;
    }

    public String getLiveLink() {
        return liveLink;
    }

    public void setLiveLink(String liveLink) {
        this.liveLink = liveLink;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}
