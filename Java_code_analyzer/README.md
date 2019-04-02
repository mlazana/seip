<div align="center">
<img src="../media/aueb.jpg" height="80px">
<h1> 1st Assignment<br/><sub>Java lab assignments 2019</sub></h1>
<img src="../media/java-design-patterns.png" width="300" height="200"/>
</div>
<br>

The purpose of this assignment is to get familiar with <b> Java design patterns</b>. More precisely, I created Java source code analyzer in order to generate the following metrics:

* Lines if code
* Number of classes
* Number of methods

## Requirements

``` Java 1.8.120 ``` , ``` Apache.maven-3.6.0 ``` 

## Getting started

In order to build the project run: 

``` mvn compile package ```

Go to target directory and run:

``` java -jar Java_code_analyzer-0.0.1-SNAPSHOT-jar-with-dependencies [sourceFile] [string or regex] ```

