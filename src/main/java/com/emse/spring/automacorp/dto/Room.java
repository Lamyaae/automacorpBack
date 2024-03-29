package com.emse.spring.automacorp.dto;

import java.util.Set;

public record Room(Long id, String name, Integer floor, Sensor currentTemperature, Double targetTemperature,Set<Window> windows) {
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getFloor() {
        return floor;
    }

    public Sensor getCurrentTemperature() {
        return currentTemperature;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    public Set<Window> getWindows() {
        return windows;
    }

}

