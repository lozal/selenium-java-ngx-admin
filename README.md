# 🖥️ Selenium + Java: ngx-admin UI Test Automation

This is a UI test automation framework using **Selenium WebDriver** and **Java**, targeting the **ngx-admin** Angular admin dashboard. The project follows a Page Object Model (POM) design and demonstrates best practices for building a maintainable test suite.

---

## 🚀 Getting Started

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

## ✅ Running Tests

To run the full test suite:
```bash
mvn test
```

Tests can run headlessly or with a browser UI—adjust in `pom.xml` or `BaseTest.java`.

---

## 📁 Project Structure

```
selenium-java-ngx-admin/
├── src/main/java/...    # Page Object Model classes
├── src/test/java/...    # Test classes
├── src/test/resources   # Test data, config, locators
├── pom.xml              # Maven config
└── README.md
```

---

## 🧠 Key Features

- **Page Object Model**: clear separation of page logic and test code
- **Reusable WebDriver setup** (e.g. in `BaseTest`)
- **Configurable execution**: headless vs GUI mode
- **Data-driven tests** using properties or CSV
- **Useful helpers** for waits, elements interaction

---

## 🧾 Sample Test

```java
@Test
public void testLoginDashboard() {
    LoginPage login = new LoginPage(driver);
    login.open();
    login.login("admin", "admin");

    DashboardPage dash = new DashboardPage(driver);
    assertTrue(dash.isLoaded());
    assertEquals("ngx-admin", dash.getTitle());
}
```

---

## 📊 Reporting & Logs

By default, test output prints to console. You can integrate:
- **Surefire Reports** (`target/surefire-reports`)
- **Allure** or other advanced reporting frameworks
