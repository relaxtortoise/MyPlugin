package com.github.relaxtortoise.myplugin.services

import com.intellij.openapi.project.Project
import com.github.relaxtortoise.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
