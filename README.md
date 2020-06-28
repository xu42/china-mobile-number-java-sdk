China Mobile Number SDK for Java
================================

[![Build Status](https://travis-ci.org/xu42/china-mobile-number-java-sdk.png?branch=master)](https://travis-ci.org/xu42/china-mobile-number-java-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.xu42/china-mobile-number/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/com.github.xu42/china-mobile-number)
[![Code Coverage](https://codecov.io/github/xu42/china-mobile-number-java-sdk/coverage.svg)](https://codecov.io/gh/xu42/china-mobile-number-java-sdk)

Getting Started
---------------

#### Install the SDK ####

```xml
<dependency>
  <groupId>com.github.xu42</groupId>
  <artifactId>china-mobile-number</artifactId>
  <version>1.0.2</version>
</dependency>
```

#### Examples ####

```java
// mobile number is valid
boolean isValid = ChinaMobileNumber.isValid("13800138000");

// get mobile number opertor 
ChinaMobileOperatorEnum operator = ChinaMobileNumber.getOperator("13800138000");
```


Building From Source
---------------

Once you check out the code from GitHub, you can build it using Maven. 
To disable test and the GPG-signing in the build, use:

```sh
mvn clean install -Dmaven.test.skip=true -Dgpg.skip=true
```
