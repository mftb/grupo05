Narrative: User browse the page
    Depending of what he clicks, something happens

Scenario: Website Navigation Test
Given the Chosen Website is <URL>
When the user clicks <elemName>
Then the pageTitle should be <someTitle>

Examples:
|URL|elemName|someTitle|
|http://localhost:8080/MC437G5/file/view|Visualizar|Resultados dos testes|
|http://localhost:8080/MC437G5/file/view|Faça o upload de um novo arquivo|Upload de arquivos|









