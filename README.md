# 🛡️ ThreatLens — Cybersecurity Threat Analyzer



**ThreatLens** is a Java-based command-line cybersecurity tool designed to analyze URLs for potentially suspicious characteristics and generate an interpretable **threat score from 0 to 100**.

The project demonstrates how fundamental Java programming concepts can be applied to a practical cybersecurity use case: **preliminary URL threat analysis**.

---

## 🔍 What is ThreatLens?

Suspicious URLs are commonly used in phishing and social-engineering attacks. Certain characteristics of a URL can act as potential warning signs, such as unusual length, suspicious keywords, insecure HTTP connections, special symbols, numeric patterns, or the use of an IP address.

ThreatLens evaluates these characteristics using a **rule-based detection system** and converts the detected indicators into an overall threat score.

### 🚦 Risk Classification

| Score | Verdict |
|-------|---------|
| 🟢 **0–29** | Low Risk |
| 🟡 **30–59** | Suspicious |
| 🔴 **60–100** | High Risk |

> **Note:** ThreatLens is a heuristic analysis tool developed for educational purposes. A threat score does not guarantee that a URL is safe or malicious.

---

## ✨ Features

- 🔗 URL length analysis
- 🔒 HTTPS security check
- 🚨 Suspicious keyword detection
- ⚠️ Suspicious symbol detection
- 🔢 Numeric pattern detection
- 🌐 IP address pattern detection
- 📊 Threat score generation from **0–100**
- 🚦 Automatic risk classification
- 💻 Fully command-line based
- ⚡ Lightweight and easy to execute

---
## ⚙️ How It Works

```text

ThreatLens follows a simple analysis pipeline:
             USER INPUT
                 │
                 ▼
             URL RECEIVED
                 │
                 ▼
        ┌─────────────────────┐
        │     URL ANALYSIS    │
        ├─────────────────────┤
        │ • URL Length        │
        │ • HTTPS Status      │
        │ • Suspicious Words  │
        │ • Suspicious Symbols│
        │ • Numeric Patterns  │
        │ • IP Address        │
        └─────────────────────┘
                 │
                 ▼
           THREAT SCORE
              0–100
                 │
                 ▼
        ┌─────────────────┐
        │ RISK CLASSIFIER │
        └─────────────────┘
                 │
        ┌────────┼────────┐
        ▼        ▼        ▼
      LOW    SUSPICIOUS   HIGH
      RISK                  RISK
```

## 📊 Threat Scoring

ThreatLens uses predefined heuristic rules to assign risk points to detected indicators.

| Indicator | Score |
|-----------|------:|
| URL exceeds configured length | +20 |
| URL does not use HTTPS | +15 |
| Suspicious keyword detected | +20 |
| Suspicious `@` symbol detected | +25 |
| Numeric pattern detected | +10 |
| IP address pattern detected | +20 |

The final score is capped at 100.

The scoring values are educational heuristics and are not intended to represent an industry-standard threat intelligence score.

## 🧪 Sample Analysis

🟢 Low-Risk URL

URL: https://google.com

           ANALYSIS RESULT

URL          : https://google.com
Threat Score : 0/100
Verdict      : LOW RISK

🟡 Suspicious URL

URL: http://secure-login-verify123.com/account


           ANALYSIS RESULT

URL          : http://secure-login-verify123.com/account
Threat Score : 45/100
Verdict      : SUSPICIOUS

🔴 High-Risk URL

URL: http://192.168.1.25/login


           ANALYSIS RESULT


URL          : http://192.168.1.25/login
Threat Score : 65/100
Verdict      : HIGH RISK

## 🛠️ Technology Stack

- Java 21
- `Scanner`
- Regular Expressions
- Arrays
- Conditional Logic
- String Processing
- Git & GitHub

📁 Project Structure
```
ThreatLens/
│
├── src/
│   └── ThreatLens.java
│
├── .gitignore
└── README.md
```

## 💻 Requirements

Before running ThreatLens, make sure Java JDK 21 or later is installed.

Check your Java installation:

java -version

Check the Java compiler:

javac -version
🚀 Setup & Installation
1. Clone the repository
git clone https://github.com/codeby-rhythm-sharma/ThreatLens.git
2. Open the project directory
cd ThreatLens
3. Compile the project
javac -d out src\ThreatLens.java
4. Run ThreatLens
java -cp out ThreatLens
5. Enter a URL

The application will prompt:

Enter a URL to analyze:

Enter the URL you want to analyze and press Enter.

## 🧠 Java Concepts Demonstrated

ThreatLens applies several fundamental Java programming concepts:

Classes and Methods
Conditional Statements
Loops
Arrays
String Manipulation
Regular Expressions
User Input using Scanner
Basic Modular Program Structure

## ⚠️ Limitations

ThreatLens is a lightweight, rule-based educational tool.

It currently:

Does not connect to external threat-intelligence databases
Does not inspect the actual contents of a website
Does not perform malware scanning
Does not use machine-learning models
Does not guarantee that a URL is malicious or safe

Therefore, the generated score should be considered a preliminary heuristic assessment, not a definitive security verdict.

## 🔮 Future Enhancements

Possible future improvements include:

- 🔐 Integration with threat-intelligence APIs
- 🌐 Domain reputation checking
- 📅 WHOIS and domain-age analysis
- 🔎 DNS analysis
- 🔗 Redirect-chain detection
- 🛡️ SSL/TLS certificate analysis
- 🧩 Advanced URL obfuscation detection
- 📂 Batch URL analysis
- 📄 JSON/CSV report generation
- 🤖 Machine-learning-based URL classification
- 🖥️ Graphical or web-based interface
- 🎓 Academic Context

ThreatLens was developed as a project for the Programming in Java course.

The project combines Java programming fundamentals with an introductory cybersecurity application, demonstrating how software development concepts can be applied to a practical security problem.

## 👩‍💻 Author

**Rhythm Sharma**

**B.Tech — Computer Science and Engineering**  
**Specialization — Cybersecurity & Digital Forensics**

GitHub: [@codeby-rhythm-sharma](https://github.com/codeby-rhythm-sharma)

---

## 📜 Disclaimer

ThreatLens is developed for **educational and academic purposes**.

The tool uses predefined heuristic rules and should not be used as a replacement for professional cybersecurity tools, threat-intelligence platforms, or security analysis performed by qualified professionals.
