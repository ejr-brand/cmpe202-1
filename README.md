# cmpe202

Changes made

Added enum Type:

Q1 - 1 quarter gumball machine

Q2 - 2 quarter gumball machine

C - any coin gumball machine

Variables added to class and constructor:

private Type has_type - denotes the type of gumball machine being created

private int sum - used later for 2 quarter and any coin gumball machine to keep track of coins

```insertCoin()```
Changed to a more generic name for scalability for other gumball platforms.  Added more ifs to be able to handle the the different gumball machines and their respective coin limitations

```turnCrank()```
Adjusted some of the print statements to be more generic so that it can handle all types of gumball machines 

Main method (testing):

Typical use case: user enters correct change and is given a gumball

Invalid Coin use case: user gives incorrect coinage for a specific gumball machine

No Gumball use case: user gives coins to an empty gumball machine

output photo
![image](https://user-images.githubusercontent.com/55565917/65396614-ea59e380-dd5c-11e9-9ded-a874eac9224e.png)
