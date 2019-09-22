What I Changed:

Added enums to denote the different types of gumball machines
Q1 = 1 quarter gumball machine
Q2 = 2 quarter gumball machine
C = any coin gumball machine

Gumball Object:
Added Type has_type variable to denote the type of gumball machine being instatiated
Added int sum variable to keep track of coins inside Q1 & Q2

insertQuarter -> insertCoin
Changed the name to be more generic since we might have gumballs that take more than just quarters
```insertCoin()```
Changed the function to be able to handle all gumball machines and their respective limits with coins

```turnCrank()```
Changed around some of the print functions to cover more generic gumball bases

Finally added main for testing the three separate gumball machines
Tests include:
Typical user case: user gives proper change and is given a gumball
Invalid coin case: user gives a penny or nickel with a quarter-only gumball machine
No gumball use case: User tries to insert money into an empty gumball machine


 output
![image](https://user-images.githubusercontent.com/55565917/65395703-7c5cee80-dd53-11e9-8668-62f187a7244c.png)
