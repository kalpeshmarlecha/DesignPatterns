# DesignPatterns
The self made guide to Design Patterns

Creational Design Patterns
## Singleton 
Real-Life Example
Suppose you are a member of a cricket team. And in a tournament your team is going to play against another team. As per the rules of the game, the captain of each side must go for a toss to decide which side will bat (or bowl) first. So, if your team does not have a captain, you need to elect someone as a captain first. And at the same time, your team cannot have more than one captain.

Computer World Example
In a software system sometimes we may decide to use only one file system. Usually we may use it for the centralized management of resources.

    
## Proxy Pattern: 
Real–Life Example
In a classroom, when one student is absent, during roll call, his best friend may try to mimic the student’s voice to try to keep his friend from being marked as absent.

Computer World Example
Consider an ATM implementation for a bank. Here we will find multiple proxy objects. Actual bank information will be stored in a remote server. We must remember that in the real programming world, the creation of multiple instances of a complex object (heavy object) is very costly. In such situations, we can create multiple proxy objects (which must point to an original object) and the total creation of actual objects can be carried out on a demand basis. Thus we can save both the memory and creational time.
