# This Branch is the source code of Hai-feng Wu's part 6

![alt](https://i.imgur.com/pLkPlvu.png)

Our group did part-6 individually, so I didn't implement register part, so if you want to test this functionality, you have to add users to mysql database by SQL statement directly. And then you can login, after certain time, you will be logged out in the server side, so that next time you start a new request, you have to login again.

You can find the principle of springMVC's interceptor. And the interceptor I wrote is `LoginCheck.java`. The most important part of the code is:
```java
LoginCheck.java
//If request have a valid user in session, reset it once again, and give it 5 seconds alive time.
request.getSession().setAttribute("user", userSession);
request.getSession().setMaxInactiveInterval(5);
```

![alt](https://i.imgur.com/ydSjqIg.png)

# How to run this implementation
- Have to have `mysql` installed, the version should be consistent with maven dependency.
- Import pom.xml to intelliJ-Idea
- Find `HospitalInformatic.java`, here is the entry point of this program.
- Open the browser, go to `localhost:8080`