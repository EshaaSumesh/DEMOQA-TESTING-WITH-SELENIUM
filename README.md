# DEMOQA TextBox Testing with Selenium

This project automates the **Text Box** form on the [DEMOQA website](https://demoqa.com/text-box) using **Selenium WebDriver** and **TestNG** in **Java**.  
It is designed to validate that user input in text boxes is correctly submitted and displayed.

---

## Overview

The test case covers:
- Launching the DEMOQA Text Box page  
- Filling in form fields (Full Name, Email, Current Address, Permanent Address)  
- Submitting the form  
- Verifying that the displayed output matches the entered input  

---

##  Technologies Used

| Category | Tool / Library |
|-----------|----------------|
| Language | Java |
| Automation Tool | Selenium WebDriver |
| Testing Framework | TestNG |
| IDE | VS Code  |
| Browser Driver | ChromeDriver (or EdgeDriver / GeckoDriver) |

---

## Setup Instructions

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/EshaaSumesh/DEMOQA-TESTING-WITH-SELENIUM.git
cd DEMOQA-TESTING-WITH-SELENIUM
```
### Running the Test

Run the test using TestNG in your IDE:

Open TextBoxTest.java

Right-click → Run as → TestNG Test

OR using command line:
```
testng testng.xml
```

### Test Reports

After running the test, detailed HTML reports are generated automatically by TestNG inside:

test-output/emailable-report.html
test-output/index.html

### Future Improvements

Add tests for other DEMOQA modules (Buttons, Forms, Alerts)
Implement Page Object Model (POM)
Integrate screenshots on failure
Configure CI/CD pipeline for automated test runs
