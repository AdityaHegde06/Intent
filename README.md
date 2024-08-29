# Intent
Intent Navigation App
This project demonstrates basic intent navigation between two activities in an Android application. The application contains two activities: MainActivity and SecondActivity. Users can navigate between these activities using button clicks.

Getting Started
These instructions will guide you on how to set up and run the project on your local machine for development and testing purposes.

Prerequisites
Android Studio: Ensure you have the latest version of Android Studio installed on your computer.
Gradle: Use the Gradle version recommended by Android Studio for building the project.
Installation
Clone the repository:

bash
Copy code
git clone Getting Started
These instructions will guide you on how to set up and run the project on your local machine for development and testing purposes.

Prerequisites
Android Studio: Ensure you have the latest version of Android Studio installed on your computer.
Gradle: Use the Gradle version recommended by Android Studio for building the project.
Installation
Clone the repository:

bash
Copy code
git clone C:\Users\adity\AndroidStudioProjects\Intent\.git
Open the project in Android Studio:

Click on File > Open, then select the cloned repository folder.
Build the project:

Click on Build > Make Project or press Ctrl+F9 to build the project.
Run the application:

Usage
Main Activity: The main screen contains a button. Clicking this button will navigate you to the SecondActivity.
Second Activity: This screen also contains a button. Clicking this button currently navigates back to SecondActivity, demonstrating an intent call.

SecondActivity
Package: com.example.intent
Functionality: Loads activity_second.xml, finds the button by its ID (button), and sets up a click listener to navigate back to SecondActivity.

XML Layouts
activity_main.xml: Contains a button with the ID button for navigating to SecondActivity.
activity_second.xml: Contains a button with the ID button for potential future navigation.
