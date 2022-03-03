package com.example.myapplication.ui.theme

object Repository {
    suspend fun getProjects(page:Int,id:Int) = ServiceCreator.create<ProjectService>().getProjects(page,id)
}
