# Design-Patterns
Here I will add important design patterns that I will learn along the way as developer

Patterns are not tools you apply.
They are shapes your code falls into when designed well.

## BEHAVIOURAL DESIGN PATTERNS
- ### *Strategy design pattern* 
  - isolates frequently changing behavior behind a stable interface, switch behavior at runtime without using if-else or changing existing code
  - Components: Interface (declare behaviour), ConcreteStrategy (different implementations of the behaviour), Context (uses a strategy, does not know which one exactly)
  - Relation: Context has a IStrategy, ConcreteStrategy is a IStrategy 
  - When to use:
    - when lots of if/else
    - switching algorithm based on types
    - behaviour changing at runtime
  - eg.: Google Maps use different strategies for time-based-on-distance calculation for cycling, walking, car, public transport, etc. 
  - Link1: https://paritoshdadhich.medium.com/strategy-design-pattern-7e56a15e056b
  
