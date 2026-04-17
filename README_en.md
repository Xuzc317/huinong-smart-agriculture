# Smart Agriculture IoT System with DJI Integration

## Project Overview
This repository contains the organized source code and documentation for a **Team Project / Course Project / Competition Project** - a smart agriculture system prototype integrating IoT sensors, Android mobile application, MQTT communication, cloud services, and DJI drone control.

The system demonstrates the integration of modern technologies for agricultural management, including environmental monitoring, automated irrigation, and aerial survey capabilities using drones.

## Tech Stack
- **Mobile Platform**: Android App (Java/Kotlin)
- **IoT Communication**: MQTT Protocol
- **Cloud Services**: Baidu Intelligent Cloud
- **Mapping & Navigation**: AMap SDK (高德地图)
- **Drone Control**: DJI Mobile SDK V4
- **Development Environment**: Android Studio 2023.1.1, Java 1.8
- **Database**: SQLite (local), Cloud Database

## System Features
- **User Management**: Registration, login, profile management, password change
- **Environmental Monitoring**: Real-time display of temperature, humidity, soil moisture
- **Irrigation Control**: Manual/Automatic irrigation modes, water pump control
- **Drone Operations**: DJI drone connection, status monitoring, flight reporting
- **Aerial Survey**: Live video streaming, photo/video capture, waypoint planning
- **Data Visualization**: Environmental data charts, map-based farm visualization
- **Communication**: MQTT-based sensor data transmission and device control

## Repository Structure
```
smart-agriculture-iot-dji/
├── README.md                      # Project documentation
├── .gitignore                     # Git ignore configuration
├── docs/                          # Project documentation
│   ├── project-summary.md         # Chinese project summary
│   ├── code-organization-note.md  # Code organization notes
│   ├── my-contribution.md         # My participation details
│   ├── function-list.md           # System features list
│   └── interview-notes.md         # Interview preparation notes
├── app/                           # Android application code
│   └── src/
│       └── main/
│           └── java/
│               └── com/example/memosystem/
│                   ├── MainActivity.java          # Main entry activity
│                   ├── RegisterActivity.java      # User registration
│                   ├── ConnectToDjiActivity.java  # DJI drone connection
│                   ├── WaypointActivity.java      # Waypoint planning
│                   ├── ManageActivity.java        # System management
│                   ├── MediaActivity.java         # Media file management
│                   ├── ChangePwdActivity.java     # Password change
│                   └── ... (other activity classes)
└── assets/                        # Resource files directory
    └── README.md                  # Assets description
```

## Current Status
**Important Notice**: This repository contains **organized Java source code snippets and project documentation** - it is **NOT a complete, runnable Android Studio project**.

### What's Included
- Organized Java source code files extracted from a `.docx` document
- Project documentation and technical specifications
- Code organization notes and contribution records

### What's Missing
- **Gradle build files** (`build.gradle`, `settings.gradle`, etc.)
- **Android configuration files** (`AndroidManifest.xml`, `proguard-rules.pro`)
- **XML layout files** (`res/layout/` directory)
- **Resource files** (images, strings, styles, drawables)
- **Dependency configurations** (DJI SDK, AMap SDK, MQTT libraries)
- **Complete project structure** with all necessary Android components

### Code Source & Organization
The Java code was extracted from a `.docx` document containing partial source code from the original project. Code has been:
1. Extracted and identified based on class names
2. Organized into appropriate `.java` files
3. Placed in standard Android project directory structure
4. Reviewed for sensitive information

## Sensitive Information Handling
For security purposes, all sensitive information in the code has been replaced with placeholder values:

### What Was Replaced
- **API Keys & Secrets**: All hardcoded API keys, passwords, and tokens
- **Server Addresses**: MQTT broker URLs, cloud service endpoints
- **Credentials**: Usernames, passwords, access tokens
- **Personal Information**: Email addresses, phone numbers
- **Configuration Details**: Specific server configurations

### Replacement Examples
```java
// Original (removed for security)
private String host = "tcp://127.0.0.1:1883";
private String password = "actual_password123";

// After replacement
private String host = "tcp://YOUR_MQTT_HOST:1883";
private String password = "YOUR_MQTT_PASSWORD";
```

### Unclassified Code
Some code fragments could not be automatically classified. These are available in `docs/unclassified-code.md` for manual review and organization.

## My Contributions
**Project Context**: This was a **Team Project** where I participated as a team member.

### What I Did
- Participated in system design discussions and competition material preparation
- Understood the overall architecture and workflow between Android app, IoT sensors, cloud platform, MQTT communication, and DJI drone module
- Learned the integration patterns of MQTT, DJI Mobile SDK, AMap SDK, and Android components
- Assisted in organizing software copyright application materials
- Organized partial project source code and documentation for GitHub repository
- Created comprehensive project documentation and code organization notes

### What I Did NOT Do
- I did **not** independently develop the Android application
- I did **not** implement the DJI SDK integration from scratch
- I did **not** build the complete IoT system architecture
- I did **not** serve as the core Android developer or DJI SDK expert

## Important Notes

### 1. Project Nature
- **Team Project** / **Course Project** / **Competition Project**
- **Project Documentation** and **Learning Record**
- **Partial Source Code** organization
- **Code Organization** exercise

### 2. Code Completeness
- This is **NOT** a complete Android Studio project
- Code may be **incomplete** or **missing implementations**
- Some classes may have **missing methods** or **partial implementations**
- **Cannot be directly compiled or run** without additional work

### 3. Intended Use
- **Learning Reference**: Understanding multi-technology integration
- **Code Organization Example**: How to structure Android project code
- **Documentation Template**: Project documentation format
- **Educational Purpose**: Demonstrating IoT + Android + Drone integration concepts

### 4. Repository Purpose
- **Code Archiving**: Preserving project code in organized form
- **Learning Record**: Documenting technology integration patterns
- **Project Documentation**: Comprehensive project specifications
- **Contribution Tracking**: Recording team participation and individual learning

## Future Work
To transform this into a complete, runnable Android project, the following would be required:

### Immediate Requirements
1. **Complete Android Project Structure** with all Gradle files
2. **XML Layout Files** for all activities and UI components
3. **AndroidManifest.xml** with proper permissions and activity declarations
4. **Resource Files** (drawables, strings, styles, colors, dimensions)
5. **Dependency Management** for all required SDKs and libraries

### Technical Integration
1. **DJI SDK Configuration**: Proper setup of DJI Mobile SDK dependencies
2. **AMap SDK Integration**: Configuration for map services and navigation
3. **MQTT Client Setup**: Complete MQTT communication implementation
4. **Cloud Service Integration**: Baidu Cloud API configuration
5. **Database Implementation**: Complete local and cloud data storage

### Code Completion
1. **Missing Method Implementations** in existing classes
2. **Additional Helper Classes** and utility functions
3. **Error Handling** and edge case management
4. **Testing Framework** and validation code
5. **Documentation Updates** with complete API references

## Disclaimer

### Educational Purpose Only
This repository is shared **for educational and documentation purposes only**. It is not a commercial system and may not be fully functional without significant additional development work.

### No Warranty
The code may be incomplete, contain errors, or have security vulnerabilities. Use at your own discretion and risk.

### Not Production-Ready
This project demonstrates integration concepts with various technologies but **should not be considered production-ready code**. It requires thorough testing, security review, and additional development before any production use.

### Team Project Acknowledgment
This work represents a **team effort** in a **course/competition context**. All technical implementations were collaborative efforts, and individual contributions should be understood within this team project framework.

---

*This repository serves as **Project Documentation**, **Code Organization Example**, and **Learning Record** for a smart agriculture IoT system with DJI integration.*