package org.acme.travels.P6E;

import static org.acme.travels.Rules50d9e5332a794d2d8d94bba63f3efd8c.*;
import org.acme.travels.*;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate6E7A22667B20ABB243D8F77DD22260AE implements org.drools.model.functions.Predicate1<org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "86FDF0F2755DD7901F6F98F7573484EB";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.Person _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAge(), 20);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("age > 20");
        info.addRuleNames("Is adult", "/Users/sachinchauhan/Downloads/kogito-examples-stable 3/kogito-quarkus-examples/process-business-rules-quarkus/src/main/resources/org/acme/travels/PersonValidationService.drl");
        return info;
    }
}
