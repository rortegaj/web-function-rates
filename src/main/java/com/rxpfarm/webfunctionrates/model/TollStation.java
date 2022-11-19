package com.rxpfarm.webfunctionrates.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TollStation {

    private String stationId;
    private Float mileMarker;
    private Integer stallCount;

}
