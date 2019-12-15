package com.sourcetree.life.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

public class Article {
    private Integer id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    @PositiveOrZero
    private Integer cat_id;

    @PositiveOrZero
    private Integer order_id;

    @NotEmpty
    private String know_id;
}
