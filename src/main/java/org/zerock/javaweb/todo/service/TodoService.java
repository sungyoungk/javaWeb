package org.zerock.javaweb.todo.service;

import com.sun.tools.javac.comp.Todo;
import org.zerock.javaweb.todo.dto.TodoDTO;

import javax.management.AttributeNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;

    public void register(TodoDTO todoDTO) {
        System.out.println("DEBUG... ..." + todoDTO);
    }

    public List<TodoDTO> getList() {
        List<TodoDTO> todoDTOs = IntStream.range(0,10)
                .mapToObj(i -> {
                  TodoDTO dto = new TodoDTO();

                    dto.setTno((long) i);
                    dto.setTitle("Todo.." + i);
                    dto.setDueDate(LocalDate.now());

                    return dto;
                }).collect(Collectors.toList());

        return todoDTOs;
    }

    public TodoDTO get(Long tno) {

        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample DTO");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);

        return dto;
    }   
}
