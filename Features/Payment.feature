Feature:Payment

Scenario: Login with valid Credential
 Given User Lanch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 When  User enter Email as "admin@yourstore.com" and password as "admin"  
 When   User click on Login button
 Then  User verify page title should be "Dashboard / nopCommerce administration"
 Then  close browser