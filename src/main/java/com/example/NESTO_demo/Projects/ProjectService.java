package com.example.NESTO_demo.Projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects(){
        ArrayList<Project> projectArrayList = new ArrayList<Project>();
        projectRepository.findAll().forEach(projectArrayList::add);
        return projectArrayList;
    }
    public Project getProject(String id){
        Optional<Project> project;
        project = projectRepository.findById(id);
        return project.get();
    }
    public void addProject(Project project){
        projectRepository.save(project);
    }
    public void updateProject(Project project, String ID){
        projectRepository.save(project);
    }
    public void deleteProject(Project project, String id) {projectRepository.deleteById(id);}
}
