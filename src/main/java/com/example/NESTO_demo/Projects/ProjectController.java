package com.example.NESTO_demo.Projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @RequestMapping("/projects/{id}")
    public Project getProject(@PathVariable String id){
        return projectService.getProject(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public void addProject(@RequestBody Project project){
        projectService.addProject(project);
    }
}
