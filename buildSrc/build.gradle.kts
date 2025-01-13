plugins {
  `java-gradle-plugin`
  `kotlin-dsl`
}
repositories {
  mavenCentral()
}
dependencies {
  implementation("org.springframework.boot:spring-boot-gradle-plugin:3.4.1")
  implementation("org.springframework.boot:spring-boot-dependencies:3.4.1")
  implementation("io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.1.7")
  implementation("io.freefair.gradle:lombok-plugin:8.10")
}
