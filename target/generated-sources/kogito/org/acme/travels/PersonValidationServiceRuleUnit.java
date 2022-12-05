package org.acme.travels;

import java.util.function.Function;
import org.drools.core.SessionConfiguration;
import org.drools.core.common.ReteEvaluator;
import org.drools.core.impl.RuleBase;
import org.drools.modelcompiler.KieBaseBuilder;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.impl.RuleUnits;
import org.drools.ruleunits.impl.factory.AbstractRuleUnit;
import org.drools.ruleunits.impl.factory.AbstractRuleUnits;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;
import org.drools.ruleunits.impl.sessions.RuleUnitExecutorImpl;

@javax.enterprise.context.ApplicationScoped
public class PersonValidationServiceRuleUnit extends AbstractRuleUnit<org.acme.travels.PersonValidationService> {

    private static final RuleBase ruleBase = KieBaseBuilder.createKieBaseFromModel(new org.acme.travels.Rules67e16c03514e4c20885b839f3560192c_PersonValidationService());

    private static final SessionConfiguration sessionConfiguration = ruleBase.getSessionConfiguration();

    static {
        sessionConfiguration.setClockType(org.drools.core.ClockType.REALTIME_CLOCK);
    }

    public PersonValidationServiceRuleUnit() {
        this((RuleUnits) null);
    }

    @javax.inject.Inject
    public PersonValidationServiceRuleUnit(javax.enterprise.inject.Instance<RuleUnits> ruleUnits) {
        this(ruleUnits == null || ruleUnits.isUnsatisfied() ? AbstractRuleUnits.DummyRuleUnits.INSTANCE : ruleUnits.get());
    }

    public PersonValidationServiceRuleUnit(RuleUnits ruleUnits) {
        super(org.acme.travels.PersonValidationService.class,
              ruleUnits);
        this.ruleUnits.register(this);
    }

    @Override
    public PersonValidationServiceRuleUnitInstance internalCreateInstance(org.acme.travels.PersonValidationService data) {
        ReteEvaluator reteEvaluator = evaluatorConfigurator.apply(new RuleUnitExecutorImpl(ruleBase,
                                                                                           sessionConfiguration));
        return new PersonValidationServiceRuleUnitInstance(this,
                                                           data,
                                                           reteEvaluator);
    }
}
