package patches.templates

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Template
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a template with absolute id = 'ProjectToBreak_SubprojectToBreak_Template2344'
in the project with absolute id = 'ProjectToBreak', and delete the patch script.
*/
create(AbsoluteId("ProjectToBreak"), Template({
    id = AbsoluteId("ProjectToBreak_SubprojectToBreak_Template2344")
    name = "template1"

    steps {
        script {
            id = "RUNNER_14"
            scriptContent = "echo template"
        }
    }
}))

