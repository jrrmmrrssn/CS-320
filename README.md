# CS320
You are a software engineer for Grand Strand Systems, a software engineering company that focuses on developing and testing back-end services. You’ve been given an assignment to develop a mobile application for a customer. The customer will provide you with the requirements. Your job is to code up the application and provide unit tests to verify that it meets the customer’s requirements. You will be delivering the contact, task, and appointment services. The purpose of these services is to add, update, and delete contact, task, and appointment objects within the application.


Jeremy Morrison
CS-320 Software Test Automation Q&A
Jeff Phillips
08/13/2021
PROJECT TWO
Summary
Describe your unit testing approach for each of the three features.
To what extent was your approach aligned to the software requirements? Support your claims with specific evidence.
I aligned each requirement with a test case supporting the requirement. For instance, the task class requirements were:
The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
I created a test case for each requirement. For the first requirement I created a test to ensure a null Id will throw an Illegal argument exception. Then I tested that an Id with too many characters will throw an exception. I had a difficult time trying to test that the Id was not updatable, I tried to make the Id class final but I could not resolve the errors I was getting. I moved onto the next requirement and did the same, tested null and name length. Then tested null and description length on the final requirement. Each piece of the requirement has a test case.

Defend the overall quality of your JUnit tests. In other words, how do you know your JUnit tests were effective based on the coverage percentage?
Based on coverage percentage, I went back and reworked my code to only include what was necessary for the requirements until my coverage was 100 percent for each unit test. This was done after my previous module submissions, so this is not based off what was submitted. I am still confident in the code submitted there was simply unnecessary code that was not tested so I commented it out until my coverage result was 100 percent. Therefore, based on 100 percent coverage I know my testing was effective and my code meets each requirement because the tests were designed to cover each requirement.
Describe your experience writing the JUnit tests.
How did you ensure that your code was technically sound? Cite specific lines of code from your tests to illustrate.
To keep the code technically sound I attempted to keep the code as simple as possible and meet each requirement with the simplest means and without error. The code was tested, and functions as required. In the task class I used an if statement to iterate over each field to ensure they were not null and over the required length and throw an exception if the field does not meet those requirements:
	if(uniqueTaskId == null || uniqueTaskId.length() > 10) {
		throw new IllegalArgumentException("Id must not be null or greater than 10 characters.");
		}
	if(requiredName == null || requiredName.length() > 20) {
		throw new IllegalArgumentException("Name must not be null or greater than 20 characters.");
		}
	if(requiredDescription == null || requiredDescription.length() > 50) {
		throw new IllegalArgumentException("Description must not be null or greater than 50 characters.");
		}
Then each value is assigned, and the getter methods are established so that each variable may be accessed from other classes.
How did you ensure that your code was efficient? Cite specific lines of code from your tests to illustrate.
To ensure that my code was efficient, as I said I kept the code simple and to the point. Using a simple if statement with an illegal argument exception to check each field and assign each variable for access. In task service, each requirement received its own method with iterated over the variables in the array list to search for the I.D. then add a task, delete a task, or update an existing task with only a few lines of code:
	public boolean addTask(Task task) {
	        for (int i = 0; i < tasks.size(); i++) {
	             if (tasks.get(i).getUniqueTaskId().equals(task.getUniqueTaskId())) {
	                 return false;
	             }
	        }
	        tasks.add(task);
	        return true;
	    }
		public boolean deleteTask(String id) {
	      for(int i = 0; i < tasks.size(); i++) {
	        if (tasks.get(i).getUniqueTaskId().equals(id)) {
	          tasks.remove(i);
	          return true;
	        }
	      }
	      return false;
	    }
		public boolean updateTask(Task task) {
	      for(int i = 0; i < tasks.size(); i++) {
	        if (tasks.get(i).getUniqueTaskId().equals(task.getUniqueTaskId())) {
	          tasks.set(i, task);
	          return true;
	        }
	      }
	      return false;
	    }
I was advised at one point that it would be more efficient to use a HashMap instead of a list and I had intended on switching that up however I could not find the time to figure that out as I have no experience using a HashMap and other things going on currently with my children as well as my fiancé’s children (custody court & special needs).
Reflection
Testing Techniques
What were the software testing techniques that you employed in this project? Describe their characteristics using specific details.
Unit testing is a form of testing that encompasses a single task in your code. In each milestone I used unit testing to test each requirement task. If I were to test multiple functions per test the test would shift from functionality of a single method to interaction between different portions of code and that would be considered integration testing. 
In each module I began my test case with assertions to define test conditions. After the test conditions are defined, I made a test case for each unit or task requirement. One example is in class AppointmentTest(), testAppointmentIdIsNull() I access the assertions defined in the beginning of the test class and assert a thrown argument if and define a new appointment with parameters that are all acceptable except for appointment Id is null. This will test if an exception is thrown if appointment Id is null. This fulfills the requirement that appointment Id shall not be null. Each test case is identical except for the defined test variable altered to test each requirement such as Id is too long, date is null, date is in the past, description too long, description is null. I believe each test uses parameterized testing as each test uses specific parameters to execute multiple test cases under similar parameters. 

What are the other software testing techniques that you did not use for this project? Describe their characteristics using specific details.
Techniques not covered in the module testing up to this point would include integration testing, system testing, and acceptance testing. Integration testing involves testing different modules as a group, system testing verifies the entire software product functions properly together, and acceptance testing is testing as an end user to verify scenarios of practical use to meet requirements within the software. 
Aside from assertions there are other techniques within junit you can use such as aggregating tests, exception testing, ignoring tests, timeout for tests, assumptions with assume, and test runners. 

For each of the techniques you discussed, explain the practical uses and implications for different software development projects and situations.
The different test stages are used for different stages of the development life cycle. Testing usually begins with Unit testing to verify small pieces of code, then integration to verify different sections grouped together, then the full product, then user scenario/requirement testing. The different Junit techniques are used depending on the method of testing laid out in the planning phase before testing begins, normally you want technically sound and efficient tests written therefore whichever testing method you choose should be shortest, to the point and function properly.

Mindset
Assess the mindset that you adopted working on this project. In acting as a software tester, to what extent did you employ caution? Why was it important to appreciate the complexity and interrelationships of the code you were testing? Provide specific examples to illustrate your claims.
I believe I was cautious, not to a ridiculous degree because there were time constraints and there was a learning curve in the actual coding of the assignments and then the Junit coding. I realized I did not need to get extremely technical I just needed to meet the requirements and after realizing that I became less cautious and simply aimed to meet the requirement.
It is important to appreciate the complexity and interrelationships of the code because all of the code needs to function in sync with other portions of the application and it can become difficult with large applications for everything to function smoothly and having issues with one section can cause many other sections to develop functionality issues. Also you may think you are testing everything but something like a coverage test will show you exactly what is being tested, for instance my appointment service class had an extra method that was not needed or used for anything and through the coverage test I realized I could cut that method out and correct a few other things such as my set methods which were also not needed or tested.
Assess the ways you tried to limit bias in your review of the code. On the software developer side, can you imagine that bias would be a concern if you were responsible for testing your own code? Provide specific examples to illustrate your claims.
I think in code there may not be a whole lot of bias involved but I could see how a developer may think their method is more efficient or spend too much time staring at the same code and miss certain things that may not generate a code error but might generate a functionality error. I did research bias in coding and found there is such a thing as algorithmic bias where a developer may implement an algorithm that might favor or privilege one group of users or discriminate against a certain group such as A.I. facial recognition software has in the past or racist bots. This particular assignment I attempted to do things efficiently as I could with no previous experience and little knowledge of coding and testing and I did the best I could with what I could find, I don’t think there was any bias involved in the coding or the review. My initial thought is that it is all wrong and it won’t work so I aimed to make sure it functioned and tested properly the best I could.
Finally, evaluate the importance of being disciplined in your commitment to quality as a software engineering professional. Why is it important not to cut corners when it comes to writing or testing code? How do you plan to avoid technical debt as a practitioner in the field? Provide specific examples to illustrate your claims.
As our weekly discussion went in depth over this week, I believe small unforeseen errors and conditions can cause serious repercussions ranging from a failed link to many peoples lives and millions of dollars in damage or funds. Commitment to quality is essential and cutting corners can cost a client or their clients and your company everything. As a practitioner I think the best way to avoid technical debt in the field is to be thorough in your testing, and then automating testing so that you can focus on finding new methods to test for and include all previous methods of testing. Finding new scenarios and methods to test for while automating old tests will improve your quality and decrease technical debt over time.
