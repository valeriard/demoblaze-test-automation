# 🛒 Demoblaze Serenity Automation

Proyecto de automatización de pruebas E2E para [Demoblaze](https://www.demoblaze.com/) utilizando Serenity BDD, Cucumber y Selenium WebDriver con el patrón Page Object Model.

## 📋 Tabla de Contenidos

- [Tecnologías](#-tecnologías)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Prerequisitos](#-prerequisitos)
- [Instalación](#-instalación)
- [Ejecución de Pruebas](#-ejecución-de-pruebas)
- [Reportes](#-reportes)
- [Patrones y Buenas Prácticas](#-patrones-y-buenas-prácticas)

## 🚀 Tecnologías

- **Java 21**
- **Serenity BDD** - Framework de automatización y reportes
- **Cucumber** - BDD (Behavior Driven Development)
- **Selenium WebDriver** - Automatización de navegadores
- **Gradle** - Gestión de dependencias y construcción
- **Lombok** - Reducción de código boilerplate
- **JUnit** - Framework de pruebas

## 📁 Estructura del Proyecto
demoblaze-automation/ ├── src/ │ ├── main/java/com/demoblaze/automation/ │ │ ├── definitions/ # Step Definitions de Cucumber │ │ ├── enums/ # Enumeraciones (datos de prueba) │ │ ├── models/ # DTOs y modelos de datos │ │ ├── pagesobject/ # Page Objects │ │ │ └── basepage/ # Clase base con métodos reutilizables │ │ └── steps/ # Steps de Serenity (capa de negocio) │ └── test/ │ ├── java/com/demoblaze/automation/runners/ │ │ └── DemoblazeRunner.java # Runner de Cucumber │ └── resources/ │ └── features/ # Archivos .feature (Gherkin) ├── build.gradle └── README.md

## ✅ Prerequisitos

- **Java JDK 21** o superior
- **Gradle 8.x** (incluido en el proyecto via wrapper)
- **Google Chrome** (última versión)

## 🔧 Instalación

1. **Clonar el repositorio:**
```bash
git clone https://github.com/tu-usuario/demoblaze-serenity-automation.git
cd demoblaze-serenity-automation
java -version
./gradlew clean build


