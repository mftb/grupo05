Narrative: User requests calculation of mutation score

Scenario: Mutation Score Calculation
Given the respective mutation tests data
When the number of mutants killed is <mutantsKilled>
When the total number of mutants is <totalMutants>
Then the mutation score should be <mutationScore>

Examples:
|mutantsKilled	|totalMutants	|mutationScore	|
|100			|100			|1				|
|32				|32				|1				|
|16				|16				|1				|
|50				|100			|0.5			|
|8				|16				|0.5			|
|30				|100			|0.3			|
|3				|10				|0.3			|
|25				|100			|0.25			|
|4				|16				|0.25			|
|8				|32				|0.25			|
|4				|32				|0.125			|
|10				|100			|0.100			|
|1				|64				|0.015625		|
|1				|128			|0.0078125		|
|1				|256			|0.00390625		|
|1				|512			|0.001953125	|
|1				|1024			|0.0009765625	|
|1				|2048			|0.00048828125	|
|1				|4096			|0.000244140625	|


