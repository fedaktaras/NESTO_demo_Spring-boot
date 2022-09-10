package com.example.NESTO_demo.Projects;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProjectController {

    @RequestMapping("/projects")
    public List<Project> getAllProjects(){

        return Arrays.asList(
                new Project("8005", "Боднар вітальня"),
                new Project("8006", "Боднар Спальня"),
                new Project("8007", "Боднар Кухня")
                );
    }
}
