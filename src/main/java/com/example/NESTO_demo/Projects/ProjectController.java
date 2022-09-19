package com.example.NESTO_demo.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/projects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @RequestMapping("/projects/{ID}")
    public Project getProject(@PathVariable Integer ID){
        System.out.println(ID);
        return projectService.getProject(ID);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/projects")
    public void addProject(@RequestBody Project project){
        projectService.addProject(project);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/projects/{ID}")
    public void updateProject(@RequestBody Project project, @PathVariable Integer ID){
        projectService.updateProject(project, ID);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/projects/{ID}")
    public void deleteProject(@RequestBody Project project, @PathVariable Integer ID){
        projectService.deleteProject(project, ID);
    }
}
