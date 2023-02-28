Feature: Build&Price Testing

Background
* this is a price test

@smoke
Scenario: Build&Price
 Given validating landing page title
 When click buildAndPrice
 Then validate set your location page tile
 When enter zipCode '11373'
 Then click submit
 When validate build your toyota page title
 Then click camry hybrid2023
 Then validate camryLEhybrid page title
 Then click next step button
 Then click request a quote button
 
@dataDriven @csr-453 @regression
Scenario Outline: Build&Price with <zipcode>
 Given validating landing page title
 When click buildAndPrice
 Then validate set your location page tile
 When enter zipCode <zipcode>
 Then click submit
 When validate build your toyota page title
 Then click camry hybrid2023
 Then validate camryLEhybrid page title
 Then click next step button
 Then click request a quote button
 Examples:
 |zipcode|
 |'11373'|
 |'10037'|
 |'10038'|
 
