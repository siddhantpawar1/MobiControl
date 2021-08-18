Feature: Clean Enrollment Verification
 
@verifycleanEnrollmentRule
Scenario: Verify Clean Enrollment rule is created in WebConsole
  Given User is logged into the home page
  When User Navigates to rules tab to create clean enrollment
  Then Clean Enrollment rule is created with unique enrollment ID
  
Feature: MGPA Enrollment Verification
 
@verifyMGPAEnrollmentRule
Scenario: Verify MGPA Enrollment rule is created in WebConsole
  Given User is logged into the home page
  When User Navigates to rules tab to create MGPA enrollment
  Then MGPA Enrollment rule is created with unique enrollment ID
  

Feature: Enterprise Binding
 
@verifyAndroidEnterpriseBindings
Scenario: Verify Android Enterprise bindings in webconsole
  Given User is logged into the home page
  When User Navigates to Global Settings to bind Google Account
  Then Android Enterprise binding should be completed
  
  
  Feature: Application Catalogue for AE
 
@verifyAndroidEnterpriseBindings
Scenario: Verify Application Catalogue rule us created in WebConsole
  Given User is logged into the home page
  When User Navigates to rules tab to create Application Catalogue rule
  Then Application Catalogue rule is created and gets applied to respective folder
  