# sudoku-kata

Welcome
=======

Dear Candidate,

We are keen to find people who enjoy programming and are familiar with techniques such as
Test Driven Development (TDD), Agile Methods and writing well-structured code.

This project is a Sudoku resolver except the code is ugly.
Please refactor the solution to improve the design, the maintainability
and the error-handling.

You will need Maven, Java and an editor/IDE of your choice.

We are looking for good style just as much as working code: and not solutions downloaded from the internet.

Maven
-----
The project is quite basic, but in case you are unfamiliar with maven:

> mvn test

Compiles and runs any available tests

> mvn package

Packages the project into a jar.

Sudoku: Program Maintenance
===========================

Sudoku is a number puzzle that is popular in some of the world's
press. The rules of the game are simple: You simply fill in all the
squares in the grid so that each row, column and each of the 3x3
squares contains all the digits from 1 to 9 without repeats or
omissions.

Given a board:

 -----------------------
|     6 | 2 9   | 3 4   |
|       |   8 6 |   9 2 |
|       |   7   |     1 |
 -----------------------
| 1     |     8 |   7   |
|     8 |   2   | 1     |
|   9   | 1     |     8 |
 -----------------------
| 7     |   3   |       |
| 5 1   | 8 4   |       |
|   6 4 |       |       |
 -----------------------

The solver can be run:


> mvn package
> java -cp target/sudoku-1.0-SNAPSHOT.jar org.sudoku.Sudoku 006 290 340 000 086 092 000 070 001 100 008 070 008 020 100 090 100 008 700 030 000 510 840 000 064

Giving a result of:

 -----------------------
| 8 5 6 | 2 9 1 | 3 4 7 |
| 3 7 1 | 4 8 6 | 5 9 2 |
| 2 4 9 | 5 7 3 | 6 8 1 |
 -----------------------
| 1 2 5 | 3 6 8 | 4 7 9 |
| 4 3 8 | 9 2 7 | 1 6 5 |
| 6 9 7 | 1 5 4 | 2 3 8 |
 -----------------------
| 7 8 2 | 6 3 5 | 9 1 4 |
| 5 1 3 | 8 4 9 | 7 2 6 |
| 9 6 4 | 7 1 2 | 8 5 3 |
 -----------------------

We would like you to refactor the code so we can understand it.


