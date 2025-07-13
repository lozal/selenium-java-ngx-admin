# Selenium + Java: ngx-admin UI Test Automation

This is a UI test automation framework using **Selenium WebDriver** and **Java**, targeting the **ngx-admin** Angular admin dashboard. The project follows a Page Object Model (POM) design and demonstrates best practices for building a maintainable test suite.

---

## Getting Started

### Prerequisites
- Java 11+ (JDK)
- Maven
- Browser WebDriver (e.g. ChromeDriver) compatible with your browser version

### Installation
```bash
git clone https://github.com/lozal/selenium-java-ngx-admin.git
cd selenium-java-ngx-admin
mvn clean install
```

---

## Running Tests

To run the full test suite:
```bash
mvn test
```

Tests can run headlessly or with a browser UI—adjust in `pom.xml` or `BaseTest.java`.

---

## Project Structure

```
selenium-java-ngx-admin/
│   pom.xml
│   README.md
│
├── .idea/                          # IDE settings (can be ignored in Git)
│
└── src/
    ├── main/
    │   └── java/
    │       ├── com/ngxadmin/pages/       # Page Object classes
    │       │   ├── BasePage.java
    │       │   ├── DashboardPage.java
    │       │   ├── LeftMenu.java
    │       │   └── LoginPage.java
    │       │
    │       ├── org/example/              # Placeholder main entry
    │       │   └── Main.java
    │       │
    │       └── utilities/                # Utility classes
    │           ├── JavaScriptUtility.java
    │           └── Utility.java
    │
    └── test/
        └── java/
            └── com/ngxadmin/
                ├── base/                 # Base test setup
                │   └── BaseTest.java
                │
                └── tests/
                    ├── dashboard/
                    │   └── DashboadTests.java
                    │
                    └── login/
                        └── LoginTests.java

---

## Key Features

- **Page Object Model**: clear separation of page logic and test code
- **Reusable WebDriver setup** (e.g. in `BaseTest`)
- **Configurable execution**: headless vs GUI mode
- **Data-driven tests** using properties or CSV
- **Useful helpers** for waits, elements interaction

