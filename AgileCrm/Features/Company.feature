
@GetCompany
Feature: Perform CRUD on Company

Scenario: Get all Company Api 

Given I setup a request structure to get company info
|method|
| POST |
When I hit an api to get all info
Then I verify with company response