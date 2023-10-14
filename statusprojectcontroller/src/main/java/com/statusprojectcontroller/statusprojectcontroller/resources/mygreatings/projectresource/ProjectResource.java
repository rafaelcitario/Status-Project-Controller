package com.statusprojectcontroller.statusprojectcontroller.resources.mygreatings.projectresource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/new-project")
public class ProjectResource {
    public String newProject(){
        return "Vamos iniciar um novo projeto";
    }
}
