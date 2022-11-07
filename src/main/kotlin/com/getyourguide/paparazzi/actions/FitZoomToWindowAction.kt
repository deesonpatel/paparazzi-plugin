package com.getyourguide.paparazzi.actions

import com.getyourguide.paparazzi.service.service
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class FitZoomToWindowAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        e.project?.service?.zoomFitToWindow()
    }

    override fun update(e: AnActionEvent) {
        super.update(e)
        val project = e.project
        if (project != null) {
            e.presentation.isEnabled = !project.service.settings.isFitToWindow
        }
    }
}
