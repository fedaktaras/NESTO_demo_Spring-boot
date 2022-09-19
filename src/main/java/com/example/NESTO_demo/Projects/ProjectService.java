package com.example.NESTO_demo.Projects;

import com.example.NESTO_demo.Projects.Project;
import com.example.NESTO_demo.Projects.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects(){
        ArrayList<Project> projectArrayList = new ArrayList<Project>();
        projectRepository.findAll().forEach(projectArrayList::add);
        return projectArrayList;
    }
    public Project getProject(Integer id){
        Optional<Project> project;
        project = projectRepository.findById(id);
        return project.get();
    }
    public void addProject(Project project){
        projectRepository.save(project);
    }
    public void updateProject(Project project, Integer ID){
        projectRepository.save(project);
    }
    public void deleteProject(Project project, Integer id) {projectRepository.deleteById(id);}
}
