plugins {
    `java-library`
    application
    id("com.gradleup.shadow") apply true
}

sourceSets {
    main {
        resources {
            srcDir("src/main/java/resources")
        }
    }
}

dependencies {
    api(project(":converter"))
    implementation("com.twelvemonkeys.imageio:imageio-tga:3.9.4")
    implementation("com.formdev:flatlaf:3.6")
    implementation("com.formdev:flatlaf-intellij-themes:3.6")
}

application {
    mainClass.set("org.geysermc.pack.converter.bootstrap.Main")
}

tasks.named("shadowJar") {
    // Only set the archiveFileName property, as destinationDirectory is not available
    (this as Jar).archiveFileName.set("Thunder.jar")
}