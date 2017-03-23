# Heart rate calculator exercise

In this exercise we'll write a small program to calculate a target heart rate for a given intensity of exercise.

A person's target heart rate for a given percentage intensity of exercise is calculated as:

```

    Target heart rate = (((220 - age) - resting heart rate) * intensity) + resting heart rate 

```

Our program will prompt a user to input their age and resting heart rate, and then present a table of target heart rates for a given intensity of exercise, starting with 55% up to 95%, in increments of 5% intensity.

e.g.

```
Enter resting heart rate: 65
Enter age: 20

Age: 20     Resting heart rate: 65

Intensity | Heart rate
----------|----------
55%       |   139
60%       |   146
65%       |   152
70%       |   159
75%       |   166
80%       |   173
85%       |   179
90%       |   186
95%       |   193

```

A class has been provided, `HeartRateCalculator`, which can be run to collect a user's age and heart rate from the console.
 
 * Use the class provided to calculate and display the target heart rate for a user from 55% to 95% intensity
 * Display the results as a table
 * Don't allow invalid input. Age and resting heart rate should be entered as integers.
