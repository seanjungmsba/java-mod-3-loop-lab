# Loop Lab

## Learning Goals

- Use loops and conditionals

## Introduction

The `Main` class has the following starter code:

```java
// simulate the passing of time
int startingYear = 2000;
int targetYear = 2011;
int currentYear = startingYear;
while (currentYear < targetYear) {
    System.out.println((currentYear - startingYear) + " year(s) have passed");
    // conditional logic based on the current year
    currentYear++;
}
```

It should give you output like the following:

```plaintext
0 year(s) have passed
1 year(s) have passed
2 year(s) have passed
3 year(s) have passed
4 year(s) have passed
5 year(s) have passed
6 year(s) have passed
7 year(s) have passed
8 year(s) have passed
9 year(s) have passed
10 year(s) have passed
```

## Instructions

Walk the student through any setup required to run the lesson (i.e.
`npm install` and `npm start`).

Use what you've learned in the previous units to:

1. Make sure the case that outputs "0 year(s)" doesn't run anymore - hint: it
   has to do with the way `currentYear` is initialized
2. Add an `if` statement inside the `while` loop so the output can have the
   right spelling for "year(s)" and "have" for every case.

Your final output should look something like this:

```plaintext
1 year has passed
2 years have passed
3 years have passed
4 years have passed
5 years have passed
6 years have passed
7 years have passed
8 years have passed
9 years have passed
10 years have passed
```
