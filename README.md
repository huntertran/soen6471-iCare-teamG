SOEN6471 - TEAM G - iCare project
---

<!-- TOC -->

- [1. Team Agreement](#1-team-agreement)
    - [1.1. Tools](#11-tools)
    - [1.2. Team Meeting](#12-team-meeting)
- [2. How to run](#2-how-to-run)
- [3. Verify](#3-verify)

<!-- /TOC -->

# 1. Team Agreement
<a id="markdown-Team-Agreement" name="Team-Agreement"></a>

## 1.1. Tools
<a id="markdown-Tools" name="Tools"></a>

* UML tool: PlanUML
* UML specific version: 2.5
* Latex document: [Overleaf](https://www.overleaf.com/project/5ebc50fe232e7c0001a26413)
* Shared collaboration documents: [SOEN6471 Project folder on Google Drive](https://drive.google.com/drive/u/0/folders/1XqrZC_K5GWKAGo5Gh2oxO0GH3G9naT53)

## 1.2. Team Meeting
<a id="markdown-Team-Meeting" name="Team-Meeting"></a>

* Saturday: 4PM
* Wednesday: 4PM

Setup the topic for each meeting

# 2. How to run
<a id="markdown-How-to-run" name="How-to-run"></a>

> This instruction is for branch `independent` only

Steps by steps:

1. Using Visual Studio Code, open the root folder

2. Run > Start Debugging (or press F5) to start back-end server

![backend start](https://i.imgur.com/0RIRveA.png)

If run successfully, the terminal output should look like this

![terminal output](https://i.imgur.com/5xPomie.png)

3. Terminal > New Terminal to create a new terminal
4. Use `cd .\src\frontend\` to navigate to inside `frontend` folder
5. Run `npm install` to install frontend libraries
6. Run `npm start` to start frontend server

The terminal for frontend should look like this

![frontend](https://i.imgur.com/D7S2xrq.png)

# 3. Verify
<a id="markdown-Verify" name="Verify"></a>

The working project should look like this:

Backend: <http://localhost:8080/profile>

![backend](https://i.imgur.com/bIHb5GL.png)

Frontend: <http://localhost:3000/>

![frontend](https://i.imgur.com/V6j44VM.png)

You can stop the backend server to see the connection lost between front-end and backend, therefore verify this is an actual working project.

![lost connection](https://i.imgur.com/jN2AmWP.png)
