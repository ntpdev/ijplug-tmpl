package com.github.ntpdev.ijplugtmpl.services

import com.intellij.openapi.project.Project
import com.github.ntpdev.ijplugtmpl.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
