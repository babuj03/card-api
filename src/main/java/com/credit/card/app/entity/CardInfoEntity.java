package com.credit.card.app.entity;

import com.credit.card.app.validation.Luhn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credit_card_info")
public class CardInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String cardNumber;
    private double creditlimit;
    private double balance=0;
    private boolean active=false;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
    private String createdBy;
    private String updatedBy;
}
