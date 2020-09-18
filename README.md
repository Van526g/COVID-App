# COVID-19 Monitor
Member Names: Vanessa Giron (van526g@bu.edu) & Nikhil Gupta (nikhilgu@bu.edu)

**Overview**: 'COVID-19 Monitor' is an Android Studio application that is directed for anyone who wants to monitor their COVID-19 symptoms by taking a survey 
and recording them daily. The application allows the user to see how many of those that took the survey experienced any of the symptoms by looking at the admin 
dashbaord. If the user is interested to know more about COVID-19, the application has a feature that allows them to see the symptoms, testings, preventions, and 
global cases and deaths of the virus. 

# Motivation
The reason why the 'COVID-19 Monitor' was created is to assist people track their daily symptoms and provide them with important information about the virus. 
This application will be beneficial to those who wants to keep safe during this global pandemic. 

# COVID-19 Monitor Features

**Single Sign On (SSO)**:

*Class Name* - MainActivity

*Layout File Name* - activity_main.xml

***Overview*** - The google single sign on (SSO) was used to authenticate users, and store their data in the firebase in a structured and easily navigable way. It was also used to allow users to sign out and use another account if the need arose. After returning the users account, we were able to retrieve their google account ID, and store other information such as their name, e-mail, symptom status, and last survey date in the firebase. 

***Testing*** - In order to make sure that everything was working accordingly, a few tests were made. 

1. Entered the first e-mail, authentication was a success and the main activity page is launched. Did not sign out from main page. 

2. Repeated step #1 but with a different e-mail. Authentication was a success. 

3. Repeated step #1 with the same exact e-mail and Google told me that the account was already logged in. 

4. Repeated step #1 with a different account, but used the wrong password. Google said that the password was incorrect. The application then said that 'Login Failed!'. 

5. Logged-in using the same e-mail from step #1 and accessed the main activity page. I then successfully logged out from the Google e-mail account by 
clicking on the 'Sign Out' button.

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
of the COVID-19 virus. For the survey questions page, each individual response is recorded in the firebase, and is used for daily tracking purposes and in the admin dashboard. 


The user has to answer either 'Yes' or 'No' if they are experiencing the symptom that is being asked. When the user is answering the questions, the firebase is recording the amount of times they answered 'Yes', and then display it on the result activity page that is shown right after the survey is completed. On the result page, the user is given two options: 'Post to Daily Tracker' and 'Return'. If the user chooses the former, they are sent directly to the daily tracker page and if they choose the latter, they return back to the main activity page. 

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

***Overview*** -  Clicking on the 'Daily Tracker' button from the main page, or the result page, takes the user directly to the tracker where they can save the number of symptoms they experience that day, or open the number of symptoms they experienced from a previous day. When the user inputs the total of symptoms, 
they have to save the entry by clicking on the 'Save' button, then a text box pops up and asks to enter the date in a MM-DD-YYYY format. If the user wants to see 
the symptoms from a previous day, they just have to click on 'Open' and a text box pops up asking to enter the date they want to check in the MM-DD-YYYY format. 
The symptoms will then be shown in the same box where they are asked to enter the '# of symptoms'. The purpose of the calendar shown on the page is to remind the
user what date it is. Finally, the 'Return' button takes the user back to the main activity page. 

***Tesing*** - The best way to test this feature is by entering several number of symptoms in the box and saving them under random dates. Then, click on the 
'Open' button and enter the dates that you saved the number of symptoms under. The correct number should be shown every time you enter the dates. 

<img width="250" alt="Screen Shot 2020-09-17 at 4 30 28 PM" src="https://user-images.githubusercontent.com/55956331/93525953-c21bab00-f904-11ea-8b01-fce201cfacc2.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 30 44 PM" src="https://user-images.githubusercontent.com/55956331/93525972-c8118c00-f904-11ea-8a1f-73dd0a3eca28.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 01 PM" src="https://user-images.githubusercontent.com/55956331/93525985-cba51300-f904-11ea-89d8-b622c37cea90.png">




**Admin Dashboard**:

*Class Name* - AdminActivity

*Layout File Name* - activity_admin.xml

***Overview*** - For the admin dashboard page, we have it show who has and hasn’t taken their daily COVID symptom survey, and based on their results, what percent of users have COVID symptoms. All the information is grabbed from the firebase, and is currently viewable to all users. We did implement the ability 
to only have a certain programmed user have access to this page, but removed it for the demonstration purpose.

***Testing*** - In order to make sure the admin dashboard was working correctly, a few people logged-in to their Google e-mail accounts and took the survey.
As shown in the first figure below, four accounts that logged-in to the application to take the survey completed the survey, but the user 'Vanessa' did not. 
As shown in the second figure below, once the user 'Vanessa' took the survey, the admin dashboard shows that the user completed it.  

<img width="250" alt="Screen Shot 2020-09-17 at 5 37 28 PM" src="https://user-images.githubusercontent.com/55956331/93531473-496d1c80-f90d-11ea-8dc8-9e3c63ede296.png"> <img width="250" alt="Screen Shot 2020-09-17 at 5 57 15 PM" src="https://user-images.githubusercontent.com/55956331/93532884-dadd8e00-f90f-11ea-97e5-7053f8bb8ce9.png">




**COVID Information**:

*Class Names* - InfoMenuActivity, InfoActivity, SymptomsListActivity, PreventionActivity, & TestingActivity

*Layout File Names* - activity_infoMenu.xml, activity_info.xml, activity_symptoms_list.xml, activity_prevention.xml, & activity_testing.xml

***Overview*** - The COVID Information page consists of five buttons: Symptoms, Preventions, Testings, Global Data, and Return. 

*Symptoms* - Clicking on this button takes the user to a page that shows a list of common COVID-19 symptoms. 

*Preventions* - Clicking on this button takes the user to a page that shows how they can prevent from obtaining and spreading COVID-19. 

*Testings* - Clicking on this button takes the user to a page that shows the two types of tests they can take, who should get tested, and explaining the results 
of positive & negative tests for COVID-19. 

*Global Data* - Clicking on this button takes the user to a page that shows the data of total confirmed cases and the death tally both globally and in each country. The global COVID statistics page utilized the API linked below. Only one request was made for both global stats and per-country stats, and the JSON response was parsed using Google Volley and Java’s JSON library to show the total confirmed cases and confirmed deaths for the world and all countries. While not implemented, features such as searching up a country and displaying daily statistics of confirmed cases and deaths is a possibility.

*Return* - This button takes the user back to the main activity page. 

***Testing*** - Clicking on every button shown on the COVID Information page takes the user directly to their corresponding activity pages. 

<img width="250" alt="Screen Shot 2020-09-17 at 4 31 14 PM" src="https://user-images.githubusercontent.com/55956331/93526075-e8d9e180-f904-11ea-9a20-68fbb36c00d1.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 20 PM" src="https://user-images.githubusercontent.com/55956331/93526084-ec6d6880-f904-11ea-99c0-64840fe2c7c2.png">

<img width="250" alt="Screen Shot 2020-09-17 at 4 31 25 PM" src="https://user-images.githubusercontent.com/55956331/93526091-eecfc280-f904-11ea-8c95-b17c4bc622ff.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 32 PM" src="https://user-images.githubusercontent.com/55956331/93526102-f2fbe000-f904-11ea-88a7-a33ba7bb1abc.png"> <img width="250" alt="Screen Shot 2020-09-17 at 4 31 44 PM" src="https://user-images.githubusercontent.com/55956331/93526121-f8592a80-f904-11ea-843a-526769aebc79.png">

**Firebase Layout** - Structure of our database. Each user is defined by their unique google account ID, and contains children for their name, email, date of last survey, and most recent symptom survey answers.

<img width="250" alt="Firebase Structure" src="https://github.com/nikhilgu99/TestRepo/blob/master/firebase.png?raw=true">


# COVID-19 Monitor Video Recording

Video Recording for 'COVID_App_FINAL.zip' - https://drive.google.com/file/d/1BDSkMlqd30acTE2grtrTp2vhOYJsn5BZ/view

* At the end of the video, the bottom of the screen says 'Login Failed'. I made sure to NOT click on any of the two accounts to show the notifcation that pops up if the user does not choose any of their accounts listed. 


# API Reference 
**API**: https://api.covid19api.com/summary

# Contributions 
**Vanessa Giron**: In charge of the graphical user interface (GUI), results activity, survey activity, daily tracker activty, COVID information activity, such as
the symptoms, preventions, and testings, and the GitHub README.md.

**Nikhil Gupta**: In charge of the single sign on (SSO) and firebase setup, admin dashboard activity, survey activity, using the COVID-19 API to get the global cases and deaths for the COVID information activity, and the GitHub README.md. First, I committed my contributions to my own repository, then I uploaded a ZIP of the project here for Vanessa to work on. My repo can be found here: https://github.com/nikhilgu99/COVID_Monitor

# Credits
**Save & Open the Symptoms in the Daily Tracker Activty**: http://www.vetbossel.in/create-notepad-application-android-studio/
