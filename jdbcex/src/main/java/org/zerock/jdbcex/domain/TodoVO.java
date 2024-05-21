package org.zerock.jdbcex.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;


@Getter
@Builder
@ToString
public class TodoVO {
    private long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;

}
