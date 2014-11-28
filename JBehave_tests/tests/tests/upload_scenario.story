Narrative: User choose a file to be uploaded
    The file ought to be uploaded and validated

Scenario: File upload
Given the Chosen Website is <URL>
When the user clicks <elemName>
When the user waits 1 seconds
Then the page title should be <someTitle>

Examples:
|URL|elemName|someTitle|
|http://localhost:8080/goodbuy/file/view|Upload|MC437 Grupo 5|
|http://localhost:8080/goodbuy/file/view|Upload|MC437 Grupo 5|





