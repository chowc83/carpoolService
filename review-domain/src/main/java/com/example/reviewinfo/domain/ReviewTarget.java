package com.example.reviewinfo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ReviewTarget { 

    @Column(name = "REVIEWTARGET_ID")
    private Long reviewTargetId;

    @Column(name = "CARPOOL_ROLE")
    @Enumerated(EnumType.STRING)
    private CarpoolRole carpoolRole;

}
