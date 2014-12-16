Narrative: User choose a file to be uploaded
    The file ought to be uploaded and validated

Scenario: File upload
Given the Chosen Website is <URL>
When the user clicks <elemName>
When the user waits 1 seconds
When the user select field <fieldName> and types <userText>
When the user waits 1 seconds
When the user clicks <SubmitButton>
Then the <Message> should be <SuccessText>

Examples:
|URL										|elemName	|fieldName	|userText			|SubmitButton	|Message	|SuccessText											|
|http://143.106.16.17:8081/goodbuy/file/view|Upload		|file		|/tmp/test.xml		|submeter		|resultado	|Upload concluído com sucesso!\n\nClique aqui para ver	|
|http://143.106.16.17:8081/goodbuy/file/view|Upload		|file		|invalid.xml		|submeter		|resultado	|Selecione arquivo válido!								|
|http://143.106.16.17:8081/goodbuy/file/view|Upload		|file		|/tmp/invalid.txt	|submeter		|resultado	|Formato de arquivo inválido!							|





