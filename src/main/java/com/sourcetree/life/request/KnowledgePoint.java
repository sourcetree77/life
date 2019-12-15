package com.sourcetree.life.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

@Setter
@Getter
public class KnowledgePoint {

    @NotEmpty
    private String name;

    @PositiveOrZero
    private Integer order_id;

    private Integer id;
}
