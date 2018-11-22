package com.kswr.spring.boot.postgis.demo.postgisdemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer;
import com.bedatadriven.jackson.datatype.jts.serialization.GeometrySerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vividsolutions.jts.geom.Geometry;

@Entity
@Table(name = "states02")
public class State {
    @Id
    @Column(name = "ogc_fid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String party;

    @NotBlank
    private String type;

    @Column(name = "wkb_geometry")
    @JsonSerialize(using = GeometrySerializer.class)
    @JsonDeserialize(using = GeometryDeserializer.class)
    private Geometry geometry;

//    public Long getId() {
//        return id;
//    }

    public String getParty() {
        return party;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
