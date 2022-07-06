package com.example.reviewinfo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

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
