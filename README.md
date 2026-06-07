# 🛒 Demoblaze Serenity Automation

Proyecto de automatización de pruebas E2E para [Demoblaze](https://www.demoblaze.com/) utilizando Serenity BDD, Cucumber y Selenium WebDriver con el patrón Page Object Model.

## 📋 Tabla de Contenidos

- [Tecnologías](#-tecnologías)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Prerequisitos](#-prerequisitos)
- [Instalación](#-instalación)
- [Ejecución de Pruebas](#-ejecución-de-pruebas)
- [Reportes](#-reportes)

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
```
Verificar instalación de Java:
```bash
java -version
```
Compilar el proyecto:
```bash
./gradlew clean build
```

▶️ Ejecución de Pruebas
```bash
./gradlew clean test
```
Ejecutar por tags
```bash
./gradlew clean test -Dcucumber.filter.tags="@Purchaseproduct"
./gradlew clean test -Dcucumber.filter.tags="@EndToEnd"
```
Ejecutar y generar reportes
```bash
./gradlew clean test aggregate
```
📊 Reportes
Los reportes de Serenity se generan automáticamente después de cada ejecución:
Ruta: target/site/serenity/index.html
Abrir en navegador para ver reportes detallados con screenshots y pasos
# Abrir reporte en Windows
start target/site/serenity/index.html

# Abrir reporte en Mac/Linux
open target/site/serenity/index.html

🎯 Casos de Prueba

@EndToEnd - Flujo Completo de Compra
✅ Agregar múltiples productos al carrito
✅ Validar cantidad de productos en el carrito
✅ Completar formulario de pago
✅ Confirmar compra exitosa

🐛 Troubleshooting
Error: StaleElementReferenceException
Solución: Ya implementado con esperas explícitas en selectCategoryAndWait()
Error: ChromeDriver version mismatch
Solución: El proyecto usa WebDriverManager que descarga automáticamente el driver correcto
Error: Tests no se ejecutan
Verificar que el tag en DemoblazeRunner.java coincida con el feature
Revisar que el glue path sea correcto: com.demoblaze.automation.definitions

👤 Autor
Valeria Rivera


