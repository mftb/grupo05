Narrative: User requests calculation of mutation score

Scenario: Mutation Score Calculation
Given the respective mutation tests data
When the number of mutants killed is <mutantsKilled>
When the total number of mutants is <totalMutants>
Then the mutation score should be <mutationScore>

Examples:
|mutantsKilled|totalMutants|mutationScore|
|16|16|1|
|8|16|0.5|
|4|16|0.25|
|8|32|0.25|
|4|32|0.125|








