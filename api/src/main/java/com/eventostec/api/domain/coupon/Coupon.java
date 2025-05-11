package com.eventostec.api.domain.coupon;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "coupon")
@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Date validade;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;     // Relacionamento 1:N - Um evento só pode ter vários cupons e um cupom so pode ter apenas um evento

}
