Narrative: User browse in the page
    Depending of what he clicks, something happens

Scenario: Uol website
Given the Chosen Website is <URL>
When the user clicks <elemName>
Then the pageTitle should be <someTitle>

Examples:
|URL|elemName|someTitle|
|http://www.uol.com.br|CARROS|Carros: notícias, lançamentos e avaliações sobre carros - UOL Carros|
|http://www.uol.com.br|ECONOMIA|UOL Economia: encontre orientações e notícias sobre economia - UOL Economia|









