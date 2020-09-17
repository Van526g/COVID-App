# COVID-19 Monitor
Member Names: Vanessa Giron (van526g@bu.edu) & Nikhil Gupta (nikhilgu@bu.edu)

**Overview**: 'COVID-19 Monitor' is an Android Studio application that is directed for anyone who wants to monitor their COVID-19 symptoms by taking a survey 
and recording them daily. The application allows the user to see how many of those that took the survey experienced the same symptoms by looking at the admin 
dashbaord. If the user is interested to know more about COVID-19, the application has a feature that allows them to see the symptoms, testings, preventions, and 
global cases and deaths of the virus. 

# Motivation
The reason why the 'COVID-19 Monitor' was created is to assist people track their daily symptoms and provide them with important information about the virus. 
This application will be beneficial to those who wants to keep safe during this global pandemic. 

# COVID-19 Monitor Features

**Single Sign On (SSO)**:

*Class Name* - MainActivity

*Layout File Name* - activity_main.xml

<img width="250" alt="Screen Shot 2020-09-17 at 4 45 51 PM" src="https://user-images.githubusercontent.com/55956331/93526318-4837f180-f905-11ea-88e5-c981de8eaa2c.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 47 13 PM" src="https://user-images.githubusercontent.com/55956331/93526913-20955900-f906-11ea-9f7c-88725363012a.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 48 35 PM" src="https://user-images.githubusercontent.com/55956331/93526924-2428e000-f906-11ea-9b05-c9c2e8bc5c04.png">

<img width="250" alt="Screen Shot 2020-09-17 at 4 55 13 PM" src="https://user-images.githubusercontent.com/55956331/93527336-b5985200-f906-11ea-9b12-d64d08204793.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 54 48 PM" src="https://user-images.githubusercontent.com/55956331/93527349-bb8e3300-f906-11ea-824f-2b3e630157a7.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 55 28 PM" src="https://user-images.githubusercontent.com/55956331/93527354-bdf08d00-f906-11ea-8127-ba20240669a2.png">




**Main Page**: 

*Class Name* - QuestionActivity

*Layout File Name* - activity_question.xml

***Overview*** - The main activity page has all of the main features of the application listed: Symptom Survey, Daily Tracker, Admin Dashboard, COVID Information, and Sign Out. The user can choose which feature they want to check out by clicking on any of the buttons. 

***Testing*** - Clicking on any of the buttons lead directly to their corresponsing feature, or activity page. 

<img width="250" alt="Screen Shot 2020-09-17 at 4 28 05 PM" src="https://user-images.githubusercontent.com/55956331/93525596-491c5380-f904-11ea-9316-cf374d691eda.png">




**Symptom Survey**:

*Class Name* - SymptomActivity & ResultActivity

*Layout File Name* - activity_symptom.xml & activity_result.xml

***Overview*** - Clicking on the 'Symptom Survey' button from the main page takes the user directly to a survey that has 12 questions regarding the symptoms
of the COVID-19 virus. The user has to answer either 'Yes' or 'No' if they are experiencing the symptom that is being asked. When the user is answering the questions, the application is recording the amount of times they answered 'Yes', and then display it on the result activity page that is shown right after the 
survey is completed. On the result page, the user is given two options: 'Post to Daily Tracker' and 'Return'. If the user chooses the former, they are sent directly to the daily tracker page and if they choose the latter, they return back to the main activity page. 

***Testing*** -  In order to make sure that the survey & result activity pages are working properly, a few tests have to be made. 

1. Click 'Yes' to all 12 questions and make sure the result page shows '12/12'.

2. Click 'No' to all 12 questions and make sure the result page shows '0/12'. 

3. Click 'Yes' a certain amount of times and make sure the result page shows the correct number of yeses. For example, if you click 'Yes' 9 times, the result page must show '9/12'. 

4. Click 'Post to Daily Tracker' and make sure the daily tracker activity page is shown. 

5. Click 'Return' and make sure the main activity page is shown. 

<img width="250" alt="Screen Shot 2020-09-17 at 4 28 27 PM" src="https://user-images.githubusercontent.com/55956331/93525813-8e408580-f904-11ea-9f08-31abd71e1449.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 30 09 PM" src="https://user-images.githubusercontent.com/55956331/93525846-98fb1a80-f904-11ea-934b-2f554dbec854.png">




**Daily Tracker**:

*Class Name* - DailyTrackerActivity

*Layout File Name* - activity_daily_tracker.xml

<img width="250" alt="Screen Shot 2020-09-17 at 4 30 28 PM" src="https://user-images.githubusercontent.com/55956331/93525953-c21bab00-f904-11ea-8b01-fce201cfacc2.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 30 44 PM" src="https://user-images.githubusercontent.com/55956331/93525972-c8118c00-f904-11ea-8a1f-73dd0a3eca28.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 01 PM" src="https://user-images.githubusercontent.com/55956331/93525985-cba51300-f904-11ea-89d8-b622c37cea90.png">




**Admin Dashboard**:

*Class Name* - AdminActivity

*Layout File Name* - activity_admin.xml

<img width="250" alt="Screen Shot 2020-09-17 at 5 37 28 PM" src="https://user-images.githubusercontent.com/55956331/93531473-496d1c80-f90d-11ea-8dc8-9e3c63ede296.png"> <img width="250" alt="Screen Shot 2020-09-17 at 5 57 15 PM" src="https://user-images.githubusercontent.com/55956331/93532884-dadd8e00-f90f-11ea-97e5-7053f8bb8ce9.png">




**COVID Information**:

*Class Names* - InfoMenuActivity, InfoActivity, SymptomsListActivity, PreventionActivity, & TestingActivity

*Layout File Names* - activity_infoMenu.xml, activity_info.xml, activity_symptoms_list.xml, activity_prevention.xml, & activity_testing.xml

<img width="250" alt="Screen Shot 2020-09-17 at 4 31 14 PM" src="https://user-images.githubusercontent.com/55956331/93526075-e8d9e180-f904-11ea-9a20-68fbb36c00d1.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 20 PM" src="https://user-images.githubusercontent.com/55956331/93526084-ec6d6880-f904-11ea-99c0-64840fe2c7c2.png">

<img width="250" alt="Screen Shot 2020-09-17 at 4 31 25 PM" src="https://user-images.githubusercontent.com/55956331/93526091-eecfc280-f904-11ea-8c95-b17c4bc622ff.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 32 PM" src="https://user-images.githubusercontent.com/55956331/93526102-f2fbe000-f904-11ea-88a7-a33ba7bb1abc.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 44 PM" src="https://user-images.githubusercontent.com/55956331/93526121-f8592a80-f904-11ea-843a-526769aebc79.png">



# API Reference 
**API**: https://api.covid19api.com/summary

# Contributions 
**Vanessa Giron**: In charge of the graphical user interface (GUI), results activity, survey activity, daily tracker activty, COVID information activity, such as
the symptoms, preventions, and testings, and the GitHub README.md.

**Nikhil Gupta**: In charge of the single sign on (SSO), admin dashboard activity, survey activity, using the COVID-19 API to get the global cases and deaths 
for the COVID information activity, and the GitHub README.md. 

# Credits
**Save & Open the Symptoms in the Daily Tracker Activty**: http://www.vetbossel.in/create-notepad-application-android-studio/
