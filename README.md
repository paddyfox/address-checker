# Address Checker
Simple Java project to teach Unit and Integration testing

## To run tests
`mvn clean verify`

# Tasks
BEFORE STARTING, CHECKOUT A NEW BRANCH AND NAME IT: `yourFirstName-surname` eg. `paddy-fox`.

1. Work out the `postcodeValidator` regex and change the expected value in `testAValidPostcode` unit test so that it passes.
2. Complete the `testMultipleInvalidPostcodes` test so that it can accept multiple postcode examples, all of which fail the regex checks.

3. Create a `houseNumberValidator` which accepts a numeric house number variable which is always exactly 2 digits.
4. Create unit tests for the house `houseNumberValidator` which tests positive/negative/boundary scenarios - remember to always make sure the test can also fail.

5. Create a `roadNameValidator` which accepts a String road name variable which only allows characters in the alphabet.
6. Create unit tests for the house `roadNameValidator` which tests positive/negative scenarios.

WHEN FINISHED, PUSH YOUR CHANGES UP TO ORIGIN.
