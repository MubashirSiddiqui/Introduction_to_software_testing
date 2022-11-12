# Week 2
## Dependability Quiz
1. 2,1,3
2. error removal
3. False
4. False
5. True
6. False
7. False

## Testing Principles: Where
1.
- [x] Arithmetic on floating point numbers is often approximate, so it can introduce errors
- [x] Floating point numbers have values that are not actually numbers, such as infinity and NaN (not a number), that can cause computations to behave strangely.
- [x] As floating point computations are approximate, equality comparisons fail after computations that would succeed when using real numbers
2.
- [x] Programmers often make 'off-by-one' errors
- [x] Determining strict limits on ranges is difficult in requirements engineering
- [x] Relational boundaries define points of discontinuity for programs
3.
- [x] When converting an integer to a smaller bit length (e.g. long to int), the value may be truncated.
- [x] When converting to a larger bit length (e.g., int to long), the value may change from positive to negative.
- [x] When converting from signed to unsigned types (e.g., int to byte), negative numbers can't be represented.
- [x] When converting from a double to int, the value is truncated to a whole number.

## Testing Principles: How
1.
- [x] The tests tend to run faster, so we can run more of them.
- [x] We can usually see more of the internal state at the unit level so we can build stronger oracles.
2. We want several different verification techniques checking the same program or subsystem.
3.
- [x] Create libraries or utility functions to encapsulate operations that developers tend to get wrong.
- [x] Create checklists for developers based on the most common errors seen in test.
- [x] Use languages / IDEs that eliminate certain classes of errors by compile-time checks.
- [x] Create tools to test/verify specific kinds of common errors.
4. Given the same inputs, sometimes the program fails a test and other times it does not.
5.
- [x] If a program error is transient (it happens and is masked out by other code), you might not be able to "see" it and the test may pass.
- [x] Often programs are stateful - that is, a test may trigger an error, but it only becomes visible as an output if a long sequence of steps are executed, whereas it might be immediately visible by examining internal state.

## The V-Model Quiz
1. A software development model that pairs different stages of software development with the appropriate testing procedure. These tests are later used when checking the verification of each phase of the software.
2. Module Testing.
3. Verification Testing.

## Validation and Verification in the "V-Model" Quiz
1. A and B
2. The system has passed all tests from unit testing through verification testing and is now ready for validation testing.
3. True.

## Structural Testing
1. White-box testing
2. The goal of testing is to achieve 100% structural coverage to ensure the absence of bugs.

## Mutation Testing
1. With mutation testing, you can know how much of the code structure you covered.
2.
- [x] The mutation operator introduces a syntactic change to the program so that the mutant cannot be compiled.
- [x] You only create one mutant for mutation testing.
3. She should write more test cases.

## On Basic Testing Terminology, Dependability, and Testing Principles
1. The tests may all pass but the program may still be incorrect
2.
- [x] The program is incorrect
- [x] The test itself is incorrect
3. No
4. Implementation of the software.
5. False
6. the program reaches a state where the error manifests.
7. No
8.
- [x] certainly robust
- [x] certainly incorrect
9. white-box
10.
- [x] It can sometimes find errors that are not actively looked for, when (for example) a program crashes during execution of a test case.
- [x] It documents system behavior.
- [x] It is difficult to do rigorously.
- [x] It checks the whole system, including software that you didn't write.
11.
- [x] Remove data you added after testing is done.
- [x] Close connection after testing is done.
12. in a separate class, and for each method in the program we associated a test case(s) to test the correctness of the method.
13. All of the above