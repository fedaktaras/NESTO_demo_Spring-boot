package com.example.NESTO_demo.Projects;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {
    private List<Project> projectList = new ArrayList<>( Arrays.asList(
            new Project("8005", "Боднар вітальня"),
            new Project("8006", "Боднар Спальня"),
            new Project("8007", "Боднар Кухня"))
    );

    public List<Project> getAllProjects(){
        return projectList;
    }

    public Project getProject(String id){
        return projectList.stream().filter(project -> project.ID.equals(id)).findFirst().get();
    }

    public void addProject(Project project){
        projectList.add(project);
    }
}
