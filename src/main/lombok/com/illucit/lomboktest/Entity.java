package com.illucit.lomboktest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Entity {

    private int id;

    private String name;

}
