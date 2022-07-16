import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "0xBUKKIT"
for (name in listOf("0xBUKKIT-API", "0xBUKKIT-JAR")) {
    include(name)
    findProject(":$name")!!.projectDir = file(name)
}
