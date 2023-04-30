package com.kamelyazev.shortlink.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "LINK_MAP", schema = "SOME")
public class LinkMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long linkId;
    @Column(name = "LONG_LINK")
    private String longLink;
    @Column(name = "TOKEN_LINK")
    private String tokenLink;

    public LinkMap() {
    }

    public LinkMap(String longLink, String tokenLink) {
        this.longLink = longLink;
        this.tokenLink = tokenLink;
    }

}
