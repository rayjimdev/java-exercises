## Getting Started

Here is a guideline to help you get started to write Java code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

# java-exercises
Solving a list of different Java exercises.

# CLASSIFICATION
Let us classify some exercises in different levels such as:
- easy
- medium
- difficult
Each type will be included in different packages.

# SOLUTION
If the exercise has not a solution, a comment will be included as
NOT SOLVED.
If one or more solutions are available, a subpackage is added with the
name 'solutions' and, for each found solution, a new class will be
added with the name:

<original-class-name>_s1.java,
<original-class-name>_s2.java,
...
<original-class-name>_sn.java

with n > 0.

The solution must not be added in the <original-class-name>.java
(main class) and the subclasses must extend from the main class and
override the solution method.