Narrative: User browse in the page
    Depending of what he clicks, something happens

Scenario: Uol website
Given the Chosen Website is <URL>
When the user clicks <elemName>
Then the pageTitle should be <someTitle>

Examples:
|URL|elemName|someTitle|
|http://www.uol.com.br|CARROS|Carros: not�cias, lan�amentos e avalia��es sobre carros - UOL Carros|
|http://www.uol.com.br|ECONOMIA|UOL Economia: encontre orienta��es e not�cias sobre economia - UOL Economia|









