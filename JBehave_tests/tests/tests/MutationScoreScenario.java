package tests;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import tests.MutationScoreScenarioSteps;
import tests.SeleniumTestScenarioSteps;

public class MutationScoreScenario extends JUnitStory {
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(StoryReporterBuilder.Format.CONSOLE, StoryReporterBuilder.Format.TXT, StoryReporterBuilder.Format.HTML, StoryReporterBuilder.Format.XML));
    }
    @Override
    public List<CandidateSteps> candidateSteps() {
        return new InstanceStepsFactory(configuration(), new MutationScoreScenarioSteps(), new SeleniumTestScenarioSteps()).createCandidateSteps();
    }
}
