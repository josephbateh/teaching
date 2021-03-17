# Primitive Types

## Printing Text

https://repl.it/@josephbateh/Hello-World

### Lesson Notes

- Mention of code must end with a semi-colon.
- Discuss `println` vs `print`.
- Mention that programs need to be in a class called `Main`.
- Mention that the `Main` class needs to include a `main` method.
- Mentioned that the extra code will make sense later, but it needs to be there.

### Task

Print out your name in the following format:

```
Jane Doe
```

## Variables

https://repl.it/@josephbateh/Variables

### Lesson Notes

- Mention format of variable declaration, including quotation marks for strings.
- Mention that notes can be printed using `print` and `println`.
- Mention that strings can be concatenated together with the `+` operator.
- Mention that spaces inside quotation marks matter.
- Discuss concatenation.

### Task

Using a variable, print out your name in the following format:

```
Name: Jane Doe
```

## Primitive Data Types

https://repl.it/@josephbateh/Primitive-Data-Types

### Lesson Notes

- Discuss types beyond strings.
- Discuss an integer.
- Discuss a double.
- Discuss a boolean.
- Mention that primitive types can be printed as well.
- Show how `System.out.println(3 + 4 + " is 7 so is " + 4 + 3)` behaves.

### Task

Use variables to print out your name, the date you last logged into your computer, and whether or not you've been to a soccer match in the format:

```
Jane Doe
Last login: 2021-02-28
Soccer match: true
```

## Expressions And Assignments

https://repl.it/@josephbateh/Expressions-and-Assignments

### Lesson Notes

- Discuss operators.
- Discuss order of operations.
- Discuss right to left assignment.
- Discuss context of operators (adding two strings vs two integers).

### Task

Use variables to convert a temperature from Celsius to Kelvin. Print it out in the following format:

```
Temperature: 20 C
Temperature: 293 K
```

## User Input

https://repl.it/@josephbateh/User-Input

### Lesson Notes

- Discuss the scanner class.
- Discuss imports.
- Discuss `nextLine` vs `nextInt`.

### Task

Use the scanner class to get a temperature from the user in Kelvin. Convert that temperature to Celsius.

```
Enter Temperature in Kelvin:
456
Temperature: 182.85 C
```

## Casting And Ranges Of Variables

https://repl.it/@josephbateh/Casting#Main.java

### Lesson Notes

- Discuss floor rounding.
- Discuss types that cannot be cast.
- Discuss `double avg = (3+4)/2`

### Task

Ask the user for the number of people that need to fit into cars that fit five people. Return the number of people that should be in each car (if divided evenly). Assume there will never be too many people.

```
How many people?
10
How many cars?
5
People per car: 2
```