rootProject.name = "app"

include("app")

//version de un repo
plugins{
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}