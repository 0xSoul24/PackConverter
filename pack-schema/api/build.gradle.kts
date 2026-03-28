dependencies {
    compileOnly(project(":bedrock-pack-schema")) // Available on compile, but not runtime classpath - we shade it in task below
    implementation("com.google.code.gson:gson:2.13.2")
    implementation("org.jetbrains:annotations:26.1.0")
}

val bedrockPackSchemaSourceSet = project(":bedrock-pack-schema").sourceSets.getByName("main")

tasks.jar {
    from(bedrockPackSchemaSourceSet.output)
    duplicatesStrategy = DuplicatesStrategy.WARN
}
