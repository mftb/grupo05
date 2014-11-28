Narrative: This Scenario should be used as a template for others
    Duplicate the three files associated and modify them.

Scenario: File upload
Given the Chosen Website is <URL>
When the user clicks <elemName>
When the user waits 1 seconds
When the user select field <fieldName> and types <userText>
When the user clicks <SubmitButton>
Then the <Message> should be <SuccessText>

Examples:
|URL									|elemName	|fieldName	|userText		|SubmitButton									|Message				|SuccessText						|
|http://localhost:8080/goodbuy/file/view|Upload		|file		|/tmp/test.xml	|.main > form:nth-child(5) > input:nth-child(4)	|.main > h2:nth-child(6)|O Upload foi concluído com sucesso!|
|http://localhost:8080/goodbuy/file/view|Upload		|file		|invalid.xml	|.main > form:nth-child(5) > input:nth-child(4)	|.main > h2:nth-child(6)|Arquivo não encontrado				|





