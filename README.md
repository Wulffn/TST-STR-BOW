### Computer mouse

Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.

1. Test om knapper er funktionelle
2. Test scroll funktion
3. Test Test multi klik
4. Test koordinater på skærm

### Catastrophic failure

Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?

"A serious software glitch in the F-35 Joint Strike Fighter air crafts garnered wide public attention. The plane engineers identified a software bug that causes the planes, when flying in formation, to incorrectly detect targets. As each of the planes within the formation detect a target from varying angles, the software is reportedly unable to decipher whether there is just one or multiple targets. As one news agency put it, the F-35’s are “seeing double”."

## Investigation of tools

### Jupiter JUnit 5

Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

####@Tag 

Tags are used to filter which tests are executed for a given test plan. For example, a development team may tag tests with values such as "fast", "slow", "ci-server", etc. and then supply a list of tags to be used for the current test plan, potentially dependent on the current environment.

####@Disabled 

When applied at the class level, all test methods within that class are automatically disabled as well.

When applied at the method level, the presence of this annotation does not prevent the test class from being instantiated. Rather, it prevents the execution of the test method and method-level lifecycle callbacks such as @BeforeEach methods, @AfterEach methods, and corresponding extension APIs.

####@RepeatedTest

Is used to signal that the annotated method is a test template method that should be repeated a specified number of times with a configurable display name.
Each invocation of the repeated test behaves like the execution of a regular @Test method with full support for the same lifecycle callbacks and extensions. In addition, the current repetition and total number of repetitions can be accessed by having the RepetitionInfo injected.

####@BeforeEach

Is used to signal that the annotated method should be executed before each @Test method in the current test class.

####@AfterEach

Is used to signal that the annotated method should be executed after each @Test method in the current test class.

####@BeforeAll

Is used to signal that the annotated method should be executed before all tests in the current test class.

####@AfterAll

Is used to signal that the annotated method should be executed after all tests in the current test class.

####@DisplayName 

Is used to declare a custom display name for the annotated test class or test method.

####@Nested

Is used to signal that the annotated class is a nested, non-static test class.

####assumeFalse, assumeTrue

Assumptions is a collection of utility methods that support conditional test execution based on assumptions.
In direct contrast to failed assertions, failed assumptions do not result in a test failure; rather, a failed assumption results in a test being aborted.

Assumptions are typically used whenever it does not make sense to continue execution of a given test method — for example, if the test depends on something that does not exist in the current runtime environment.
