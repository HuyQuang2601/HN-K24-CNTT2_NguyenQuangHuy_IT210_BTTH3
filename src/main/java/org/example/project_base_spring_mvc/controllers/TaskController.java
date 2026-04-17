package org.example.project_base_spring_mvc.controllers;

import jakarta.validation.Valid;
import org.example.project_base_spring_mvc.models.TaskItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final List<TaskItem> taskItems = new ArrayList<>();

    public TaskController() {
        taskItems.add(new TaskItem("TK-001", "Hoàn thành bài tập MVC", LocalDate.now().plusDays(3), "HIGH"));
        taskItems.add(new TaskItem("TK-002", "Ôn tập Java Core", LocalDate.now().plusDays(7), "MEDIUM"));
        taskItems.add(new TaskItem("TK-003", "Đọc tài liệu Spring", LocalDate.now().plusDays(10), "LOW"));
    }

    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("tasks", taskItems);
        return "task-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("taskItem", new TaskItem());
        return "task-form";
    }

    @PostMapping
    public String createTask(@Valid @ModelAttribute("taskItem") TaskItem taskItem, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "task-form";
        }

        if (taskItem.getId() == null || taskItem.getId().isBlank()) {
            taskItem.setId("TK-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase());
        }

        taskItems.add(taskItem);
        return "redirect:/tasks";

    }
}
