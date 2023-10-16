# Test Assignment 2

## 1.1 COMPUTER MOUSE

### Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.

- How many clicks can the mouse buttons handle without breaking?

- How far can the mouse fall onto a hard surface without breaking?

- How quick is the response of the mouse?

- Can it handle being moved while clicking?

- Can it handle being clicked with different amounts of force?

- Can it handle sweaty hands without shorting out?

## 1.2 CATASTROPHIC FAILURE

### Find a story where a software system defect had a bad outcome. Describe what happened. 

NASA's Mars Climate Orbiter was lost in space due to a software error. 

The software was written in imperial units, while the rest of the system used metric units. This caused the orbiter to be off course, and it burned up after getting too close to the surface of Mars.

### Can you identify a test that would have prevented it?

A test that would have prevented this could be a test that checks that the units are correct and consistent throughout the system.

## 2 TWO KATAS

### 2.1
Can be found in code

### 2.2
Can be found here: https://github.com/Louise-E/BowlingGame_Test

## 3 INVESTIGATION OF TOOLS

## 3.1 JUNIT 5

### Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

@Tag

Used for filtering tests with a unique tag name. Useful for executing all tests under a specific tag name.

@Disabled

Tests with this tag are disabled and will not be executed. Useful when debugging the code.

@RepeatedTest

Used for repeating a test a specified number of times. Useful for testing a specific scenario multiple times.

@BeforeEach, @AfterEach

Signals that the annotated method should be executed before/after each @Test method in the current class. Useful for setting up and tearing down the test environment.

@BeforeAll, @AfterAll

Signals that the annotated method should be executed before/after all @Test methods in the current class. Unlike beforeEach/afterEach, these methods are only executed once. Useful for setting up and tearing down the test environment.

@DisplayName

Declares a custom display name for the test, and is used for displaying the name of the test in test reports. Useful for readability.

@Nested

Creates nested test classes. By running the parent class, all nested classes will be executed as well. Useful for grouping tests and showing a clear relationship between classes.

assumeFalse, assumeTrue

Used for assuming that a condition is true/false. If the assumption is false, the test will be aborted. Useful for when a test is not relevant for a specific test scenario.

## 3.2 MOCKING FRAMEWORKS

### Investigate mocking frameworks for your preferred language. 
### Choose at least two frameworks, and answer the questions.

Mockito and JMockit

#### What are their similarities?

The setup is fairly easy for both. 

#### What are their differences?

When setting up the test, JMockit has no specific annotation for partial mocks, unlike Mockito.

JMockit uses @Injectable or @Mocked annotations to mock a class, while Mockito uses @Mock or @InjectMocks.

Mockito has syntax inconsistencies, while JMockit is more consistent.


#### Which one would you prefer, if any, and why?

I have no specific preference.

