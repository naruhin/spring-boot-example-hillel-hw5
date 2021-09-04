package com.naruhin.springbootexamplehillelhw5.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "MANUFACTURERS")
@Getter
@Setter
@NoArgsConstructor
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "address_id")
    private Address address;

    public Manufacturer(String name) {
        this.name = name;
    }

}