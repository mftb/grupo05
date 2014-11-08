package tests;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MutationScoreScenarioSteps {
	double k,t;
	@Given("the respective mutation tests data")
	public void mutationData() {
	}
	@When("the number of mutants killed is <mutantsKilled>")
	public void GetmutantsKilled(@Named("mutantsKilled") double killed) {
		k=killed;
	}
	@When("the total number of mutants is <totalMutants>")
	public void GetTotalMutants(@Named("totalMutants") double total) {
		t=total;
	}
    @Then("the mutation score should be <mutationScore>")
    public void checkCorrectScore(@Named("mutationScore") double score) {
        assertThat(k/t, is(score));
    }
	
}
