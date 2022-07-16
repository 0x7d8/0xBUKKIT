import java.util.Locale

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "0xSERVER"
for (name in listOf("0xSERVER-API", "0xSERVER-Server")) {
    include(name)
    findProject(":$name")!!.projectDir = file(name)
}
