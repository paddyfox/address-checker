# Address Checker
Simple Java project to teach Unit and Integration testing

## To run tests
`mvn clean verify`

# Tasks
BEFORE STARTING, CHECKOUT A NEW BRANCH AND NAME IT: `yourFirstName-surname` eg. `paddy-fox`.

## Word Checker
1. Work out the `postcodeValidator` regex and change the expected value in `postcodeValidatorValidPostcodeTest` unit test so that it passes.
2. Complete the `postcodeValidatorMultipleInvalidPostcodesTest` test so that it can accept multiple postcode examples, all of which fail the regex checks.

3. Create a `roadNameValidator` which accepts a String road name variable which only allows characters in the alphabet.
4. Create unit tests for the `roadNameValidator` which tests positive/negative scenarios.

WHEN FINISHED, PUSH YOUR CHANGES UP TO ORIGIN.

## Number Checker
1. Create a `houseNumberValidator` which accepts a numeric house number variable which is always exactly 2 digits starting from number 1.
2. Create unit tests for the `houseNumberValidator` which tests positive/negative/boundary scenarios - remember to always make sure the test can also fail.

3. Write a function to determine whether a value is a prime number.
It should return true or false if the value is an integer in the range 2 - 1000000000000 inclusive, else it should throw an error.

4. Create appropriate unit tests to validate your code.

WHEN FINISHED, PUSH YOUR CHANGES UP TO ORIGIN.

