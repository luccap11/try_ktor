val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val h2_version: String by project
val hikaricp_version: String by project

plugins {
    kotlin("jvm") version "1.8.0"
    id("io.ktor.plugin") version "2.2.1"
    //id("org.jetbrains.kotlin.plugin.allopen") version "1.8.0"
    //id("org.jetbrains.kotlin.plugin.noarg") version "1.8.0"//this will generate no-argument constructors for your Hibernate entities.
    id("org.jetbrains.kotlin.plugin.jpa") version "1.8.0"

    //servono??
    //id("org.jetbrains.kotlin.plugin.spring") version "1.8.0"
}


//allOpen {
//    annotation("javax.persistence.Entity")
//    annotation("javax.persistence.MappedSuperclass")
//    annotation("javax.persistence.Embeddable")
//    annotation("jakarta.persistence.Entity")
//    annotation("jakarta.persistence.MappedSuperclass")
//    annotation("jakarta.persistence.Embeddable")

//    annotation("com.example.models.jpa")
//}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.tomcat.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-auth-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-auth-jwt-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-cors-jvm:$ktor_version")
    implementation("io.ktor:ktor-serialization-gson:$ktor_version")
    implementation("io.ktor:ktor-server-openapi:$ktor_version")
    implementation("io.ktor:ktor-server-swagger:$ktor_version")
    implementation("io.ktor:ktor-server-call-logging-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-tomcat-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    implementation("io.ktor:ktor-server-config-yaml:$ktor_version")
    //db
    implementation("mysql:mysql-connector-java:8.0.30")
    //implementation("mysql:mysql-connector-java:5.1.18")
    implementation("org.hibernate:hibernate-core:6.1.6.Final")
    //implementation("org.hibernate:hibernate-core:5.6.14.Final")
    implementation("com.h2database:h2:$h2_version")//2.1.214
    //implementation("com.h2database:h2:1.4.200")
    //implementation("com.zaxxer:HikariCP:$hikaricp_version")

    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
