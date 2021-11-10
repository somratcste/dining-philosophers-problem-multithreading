# Dining Philosophers Problem using Java Multithreading
Solution for Dining Philosophers Problem Using Java Multithreading 

## Problem 
* It was formulated by Dijkstra in 1965 
* 5 philosophers are present at a table and there are 5 forks (chopsticks)
* The philosophers can eat and think 
* Philosophers can eat when they have both left and right chopsticks 
* A chopstick can be hold by one philosopher at a given time 
* The problem: How to create a concurrent algorithm such that no philosopher 
will starve? (The aim is to avoid deadlocks). 
  
## Aim 
* The aim of the philosopher is that it is possible to avoid thread starvation
* All the thread are going to be executed by the executor service
* We are able to avoid deadlocks via using tryLock() 

## Process
```
while(true) { 
    // Initially, thinking about life, universe, and everything
    think();

    // Take a break from thinking, hungry now
    pick_up_left_fork();
    pick_up_right_fork();
    eat();
    put_down_right_fork();
    put_down_left_fork();

    // Not hungry anymore. Back to thinking!
}
```


## Output 

```
Philosopher 1 is thinking...
Philosopher 2 is thinking...
Philosopher 4 is thinking...
Philosopher 3 is thinking...
Philosopher 0 is thinking...
Philosopher 3 pick up LEFT Chopstick: 3
Philosopher 3 pick up RIGHT Chopstick: 4
Philosopher 3 is eating...
Philosopher 0 pick up LEFT Chopstick: 0
Philosopher 0 pick up RIGHT Chopstick: 1
Philosopher 0 is eating...
Philosopher 2 pick up LEFT Chopstick: 2
Philosopher 2 put down LEFT Chopstick: 2
Philosopher 2 is thinking...
Philosopher 3 put down RIGHT Chopstick: 4
Philosopher 3 put down LEFT Chopstick: 3
Philosopher 3 is thinking...
Philosopher 1 is thinking...
Philosopher 4 pick up LEFT Chopstick: 4
Philosopher 4 put down LEFT Chopstick: 4
Philosopher 4 is thinking...
Philosopher 0 put down RIGHT Chopstick: 1
Philosopher 0 put down LEFT Chopstick: 0
Philosopher 0 is thinking...
Philosopher 2 pick up LEFT Chopstick: 2
Philosopher 2 pick up RIGHT Chopstick: 3
Philosopher 2 is eating...
Philosopher 0 pick up LEFT Chopstick: 0
Philosopher 0 pick up RIGHT Chopstick: 1
Philosopher 0 is eating...
Philosopher 2 put down RIGHT Chopstick: 3
Philosopher 2 put down LEFT Chopstick: 2
Philosopher 2 is thinking...
Philosopher 4 pick up LEFT Chopstick: 4
Philosopher 4 put down LEFT Chopstick: 4
Philosopher 4 is thinking...
Philosopher 3 pick up LEFT Chopstick: 3
Philosopher 3 pick up RIGHT Chopstick: 4
Philosopher 3 is eating...
Philosopher 2 pick up LEFT Chopstick: 2
Philosopher 2 put down LEFT Chopstick: 2
Philosopher 2 is thinking...
Philosopher 1 is thinking...
Philosopher 2 pick up LEFT Chopstick: 2
Philosopher 0 put down RIGHT Chopstick: 1
Philosopher 0 put down LEFT Chopstick: 0
Philosopher 0 is thinking...
Philosopher 2 put down LEFT Chopstick: 2
Philosopher 2 is thinking...
Philosopher 4 is thinking...
Philosopher 1 pick up LEFT Chopstick: 1
Philosopher 1 pick up RIGHT Chopstick: 2
Philosopher 1 is eating...
Philosopher 3 put down RIGHT Chopstick: 4
Philosopher 3 put down LEFT Chopstick: 3
Philosopher 3 is thinking...
Philosopher 2 is thinking...
Philosopher 4 pick up LEFT Chopstick: 4
Philosopher 4 pick up RIGHT Chopstick: 0
Philosopher 4 is eating...
Philosopher 0 is thinking...
Philosopher 0 is thinking...
Philosopher 3 pick up LEFT Chopstick: 3
Philosopher 3 put down LEFT Chopstick: 3
Philosopher 3 is thinking...
Philosopher 1 put down RIGHT Chopstick: 2
Philosopher 1 put down LEFT Chopstick: 1
Philosopher 1 is thinking...
Philosopher 1 pick up LEFT Chopstick: 1
Philosopher 1 pick up RIGHT Chopstick: 2
Philosopher 1 is eating...
Philosopher 4 put down RIGHT Chopstick: 0
Philosopher 4 put down LEFT Chopstick: 4
Philosopher 4 is thinking...
Philosopher 2 is thinking...
Philosopher 3 pick up LEFT Chopstick: 3
Philosopher 3 pick up RIGHT Chopstick: 4
Philosopher 3 is eating...
Philosopher 1 put down RIGHT Chopstick: 2
Philosopher 1 put down LEFT Chopstick: 1
Philosopher 1 is thinking...
Philosopher 0 pick up LEFT Chopstick: 0
Philosopher 0 pick up RIGHT Chopstick: 1
Philosopher 0 is eating...
Philosopher 2 pick up LEFT Chopstick: 2
Philosopher 2 put down LEFT Chopstick: 2
Philosopher 2 is thinking...
Philosopher 3 put down RIGHT Chopstick: 4
Philosopher 3 put down LEFT Chopstick: 3
Philosopher 3 is thinking...
Philosopher 1 is thinking...
Philosopher 4 pick up LEFT Chopstick: 4
Philosopher 4 put down LEFT Chopstick: 4
Philosopher 4 is thinking...
Philosopher 0 put down RIGHT Chopstick: 1
Philosopher 0 put down LEFT Chopstick: 0
Philosopher 0 is thinking...
Philosopher 0 pick up LEFT Chopstick: 0
Philosopher 0 pick up RIGHT Chopstick: 1
Philosopher 0 is eating...
Philosopher 2 pick up LEFT Chopstick: 2
Philosopher 2 pick up RIGHT Chopstick: 3
Philosopher 2 is eating...
Philosopher 3 is thinking...
Philosopher 1 is thinking...
Philosopher 4 pick up LEFT Chopstick: 4
Philosopher 4 put down LEFT Chopstick: 4
Philosopher 4 is thinking...
Philosopher 0 put down RIGHT Chopstick: 1
Philosopher 0 put down LEFT Chopstick: 0
Philosopher 0 is thinking...
Philosopher 2 put down RIGHT Chopstick: 3
Philosopher 2 put down LEFT Chopstick: 2
Philosopher 4 pick up LEFT Chopstick: 4
Philosopher 4 pick up RIGHT Chopstick: 0
Philosopher 4 is eating...
Philosopher 1 pick up LEFT Chopstick: 1
Philosopher 1 pick up RIGHT Chopstick: 2
Philosopher 1 is eating...
Philosopher 4 put down RIGHT Chopstick: 0
Philosopher 4 put down LEFT Chopstick: 4
Philosopher 1 put down RIGHT Chopstick: 2
Philosopher 1 put down LEFT Chopstick: 1
Philosopher 0 eat 4 times!
Philosopher 1 eat 3 times!
Philosopher 2 eat 2 times!
Philosopher 3 eat 3 times!
Philosopher 4 eat 2 times!
```