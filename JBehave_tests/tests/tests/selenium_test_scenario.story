Narrative: User browse the page
    Depending of what he clicks, something happens

Scenario: Website Navigation Test
Given the Chosen Website is <URL>
When the user clicks <elemName>
When the user waits 1 seconds
Then the page title should be <someTitle>

Examples:
|URL										|elemName	|someTitle		|
|http://143.106.16.17:8081/goodbuy/file/view|Submissões	|MC437 Grupo 5	|
|http://143.106.16.17:8081/goodbuy/file/view|Home		|MC437 Grupo 5	|
|http://143.106.16.17:8081/goodbuy/file/view|FAQ		|MC437 Grupo 5	|





