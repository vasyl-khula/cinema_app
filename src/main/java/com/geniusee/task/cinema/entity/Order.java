package com.geniusee.task.cinema.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "visitor_name")
    private String visitorName;

    @OneToOne
    @JoinColumn (name = "movie_id")
    private Movie movie;

    @Column(name = "row_number")
    private Integer rowNumber;

    @Column(name = "seat_number")
    private Integer seatNumber;

    @Column(name = "price")
    private Long price;

}
