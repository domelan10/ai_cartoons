# ai_cartoons

A Java project developed in **Eclipse** using **JDK 11** and **Drools 7.46**.

## 📌 Overview

This project emulates a decision tree using Drools 7.46 rules executed in a Java 11 application.

### 📊 Decision Tree Diagram:

Decision tree found under [this](https://ekursy.put.poznan.pl/pluginfile.php/2751608/mod_folder/content/0/cartoon_shows_from-8090_selection.jpg) link.

## 🧰 Tech Stack

* **Java:** JDK 11
* **Rule Engine:** Drools 7.46
* **IDE:** Eclipse IDE 2021-09R
* **Build System:** None (manual JAR management)

## 📁 Project Structure

```
.
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── sample
│       │           ├── Interfejs.java
│       │           └── Main.java        # Application entry point
│       └── resources
│           ├── com
│           │   └── sample
│           │       └── rules
│           │           └── rules.drl     # Drools rules
│           ├── logback-test.xml          # Logging configuration
│           └── META-INF
│               ├── kmodule.xml           # Drools KIE module configuration
│               └── maven
│                   └── pom.properties   # Generated metadata
└── target
    └── classes                          # Compiled classes
```

## ⚙️ Prerequisites

Ensure the following are installed:

* **Java JDK 11**
* **Eclipse IDE**

Verify Java version:

```bash
java -version
```

## 📦 Dependencies (Manual Setup)

This project does **not use Maven or Gradle**. Required Drools libraries must be added manually to the project build path.

Required JARs (Drools 7.46):

* `drools-core-7.46.0.Final.jar`
* `drools-compiler-7.46.0.Final.jar`
* `kie-api-7.46.0.Final.jar`
* `kie-internal-7.46.0.Final.jar`
* `antlr-runtime.jar`
* `slf4j-api.jar`

Place all JARs in the `lib/` directory.

### Add JARs to Eclipse

1. Right-click project → **Properties**
2. **Java Build Path → Libraries**
3. Click **Add JARs** or **Add External JARs**
4. Select all files from `lib/`
5. Apply and close

## 📜 Drools Rules

Drools rule files (`.drl`) are located in:

```
src/main/resources/
```

## ▶️ Running the Application

### Run via Eclipse IDE (2021-09R)

This project is intended to be run directly from **Eclipse IDE 2021-09R**.

1. Open the project in Eclipse
2. Ensure all required JARs are added to **Java Build Path**
3. Locate the main class (contains `public static void main(String[] args)`)
4. Right-click the class → **Run As → Java Application**

## 📝 Notes

* This project is **Java 11 only**
* Ensure `.drl` files are included on the classpath
* No dependency management tool is used
