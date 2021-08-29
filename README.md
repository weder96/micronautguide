## Micronaut 3.0.0 Documentation

- [User Guide](https://docs.micronaut.io/3.0.0/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.0.0/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.0.0/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

# micronautguide


INSTALLING WITH SDKMAN!
This tool makes installing the Micronaut framework on any Unix based platform (Mac OSX, Linux, Cygwin, Solaris, or FreeBSD) easy.

Simply open a new terminal and enter:
$ curl -s https://get.sdkman.io | bash

Follow the on-screen instructions to complete installation.
Open a new terminal or type the command:
$ source "$HOME/.sdkman/bin/sdkman-init.sh"

Then install the latest stable version of the framework:
$ sdk install micronaut

If prompted, make this your default version. After installation is complete it can be tested with:
$ mn --version

That’s all there is to it!


Installing with a package manager
SDKMAN! is a tool for managing parallel versions of multiple Software Development Kits on most Unix-based systems.

$ sdk install gradle 7.2




CREATING YOUR FIRST MICRONAUT APPLICATION
Learn how to create a Hello World Micronaut application with a controller and a functional test.

Authors: Iván López, Sergio del Amo

Micronaut Version: 3.0.0

1. Getting Started
In this guide, we will create a Micronaut application written in Java.

2. What you will need
To complete this guide, you will need the following:

Some time on your hands

A decent text editor or IDE

JDK 1.8 or greater installed with JAVA_HOME configured appropriately

3. Solution
We recommend that you follow the instructions in the next sections and create the application step by step. However, you can go right to the completed example.

Download and unzip the source

4. Writing the Application
Create an application using the Micronaut Command Line Interface or with Micronaut Launch.

mn create-app example.micronaut.micronautguide --build=gradle --lang=java


If you don’t specify the --build argument, Gradle is used as the build tool.
If you don’t specify the --lang argument, Java is used as the language
