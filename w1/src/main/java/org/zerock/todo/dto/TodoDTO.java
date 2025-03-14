package org.zerock.todo.dto;

import java.time.LocalDate;

public class TodoDTO {
    private Long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;

    //getter & setter
    public Long getTno() {
        return this.tno;
    }
    public void setTno(Long tno) {
        this.tno = tno;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDueDate() {
        return this.dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }
    public void setFinished(boolean isFinished) {
        this.finished = isFinished;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "tno=" + tno +
                ", title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", finished=" + finished +
                '}';
    }
}
