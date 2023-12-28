@RedBus
Feature: Book a Ticket

Background: Redbus Launch
Given Launch the RedBus "https://www.redbus.in"

@Bus @Ta
Scenario: Book a Bus for Chennai To Thirunelveli
When User enters a From place in From Input TxBx With one dim list
|Chennai|Pondicherry|Kanchipuram|
And User enters a To place in To Input TxBx with one dim Map
|place1|Tirunelveli|
|place2|Tanjavur|
|place3|Goa|
And User Selects a date in the calendar dropdown
And User clicks on search buses 
#Then Validate the From place, To place and Date 

#@Train 
#Scenario Outline: With Different Data
#When User enters a From place in From Input TxBx "<FromPlace>"
#And User enters a To place in To Input TxBx "<ToPlace>"
#And User Selects a date in the calendar dropdown "<Date>"
#And User clicks on search buses 
#Then Validate the From place, To place and Date 
#
#Examples:
#|FromPlace|ToPlace|Date|
#|Chennai|Tanjavur|15|
#|Chennai|Tirunelveli|16|
#|Chennai|Madurai|19|
#|Chennai|Goa|18|