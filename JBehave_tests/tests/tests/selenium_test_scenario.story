Narrative: User browse the page
    Depending of what he clicks, something happens

Scenario: Website Navigation Test
Given the Chosen Website is <URL>
When the user clicks <elemName>
When the user waits 1 seconds
Then the page title should be <someTitle>

Examples:
|URL|elemName|someTitle|
|http://localhost:8080/MC437G5/file/view|Visualizar|Resultados dos testes|
|http://localhost:8080/MC437G5/file/view|Fa�a o upload de um novo arquivo|Upload de arquivos|
|http://localhost:8080/MC437G5/file/view|Compartilhar|Compartilhamento de arquivos|









