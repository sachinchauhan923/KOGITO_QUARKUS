package org.acme.travels;

import org.drools.core.common.ReteEvaluator;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;

public class PersonValidationServiceRuleUnitInstance extends ReteEvaluatorBasedRuleUnitInstance<org.acme.travels.PersonValidationService> {

    public PersonValidationServiceRuleUnitInstance(RuleUnit<org.acme.travels.PersonValidationService> unit, org.acme.travels.PersonValidationService workingMemory, ReteEvaluator reteEvaluator) {
        super(unit,
              workingMemory,
              reteEvaluator);
    }

    @Override
    protected void bind(ReteEvaluator evaluator, org.acme.travels.PersonValidationService ruleUnit) {
        ruleUnit.getPersons()
                .subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("persons")));
        evaluator.setGlobal("persons",
                            ruleUnit.getPersons());
    }
}
