package com.github.musketyr.exampleintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.musketyr.exampleintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
