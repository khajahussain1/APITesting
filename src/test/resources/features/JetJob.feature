Feature: Rest API testing framework using java rest assured

  Background: Creation of job
    Given new job is created with status code 201.

  @Smoketest
  Scenario: Get Locations
    Given verify new job