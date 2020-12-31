import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript{
	repositories {
		mavenCentral()
		maven { url = uri("https://plugins.gradle.org/m2/") }
	}
}

plugins {
	kotlin("jvm") version "1.4.21"
	kotlin("plugin.spring") version "1.4.21"
}

dependencies{
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

allprojects{
	repositories{
		jcenter()
	}
}

subprojects{
	group = "com.thigorqueiroz"
	version = "0.0.1-SNAPSHOT"

	apply(plugin = "kotlin")

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "11"
		}
	}
	tasks.withType<Test> {
		useJUnitPlatform()
	}
}