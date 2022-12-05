package org.acme.travels;

import org.acme.travels.PersonsModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("persons")
@io.quarkus.runtime.Startup()
public class PersonsProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.PersonsModel> {

    @javax.inject.Inject()
    public PersonsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public PersonsProcess() {
    }

    @Override()
    public org.acme.travels.PersonsProcessInstance createInstance(org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.acme.travels.PersonsModel value) {
        return new org.acme.travels.PersonsProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.acme.travels.PersonsModel createModel() {
        return new org.acme.travels.PersonsModel();
    }

    public org.acme.travels.PersonsProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.PersonsModel) value);
    }

    public org.acme.travels.PersonsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.PersonsModel) value);
    }

    public org.acme.travels.PersonsProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.PersonsProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.PersonsProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.PersonsProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("persons", true);
        factory.variable("person", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.travels.Person.class), null, "customTags", null);
        factory.name("persons");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End Event 1");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_6BDF2751-F544-4AFC-AB47-8C5F52EC97AD");
        endNode1.metaData("elementname", "End Event 1");
        endNode1.metaData("x", 1060);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 135);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode2 = factory.startNode(2);
        startNode2.name("StartProcess");
        startNode2.interrupting(true);
        startNode2.metaData("UniqueId", "_F2CC5C1D-5116-4C20-8702-A8357341790F");
        startNode2.metaData("elementname", "StartProcess");
        startNode2.metaData("x", 320);
        startNode2.metaData("width", 56);
        startNode2.metaData("y", 135);
        startNode2.metaData("height", 56);
        startNode2.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode3 = factory.ruleSetNode(3);
        ruleSetNode3.name("Evaluate Person");
        ruleSetNode3.ruleUnit("org.acme.travels.PersonValidationService", new org.jbpm.workflow.core.node.RuleUnitFactory<org.acme.travels.PersonValidationService>() {

            public org.acme.travels.PersonValidationService bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.acme.travels.PersonValidationService unit = new org.acme.travels.PersonValidationService();
                org.acme.travels.Person person = (org.acme.travels.Person) (kcontext.getVariable("person"));
                {
                    org.drools.ruleunits.api.DataStore unit_persons = unit.getPersons();
                    unit_persons.subscribe(org.drools.ruleunits.api.DataObserver.ofUpdatable(o -> kcontext.setVariable("person", o)));
                }
                {
                    org.drools.ruleunits.api.DataStore unit_persons = unit.getPersons();
                    unit_persons.add((org.acme.travels.Person) (kcontext.getVariable("person")));
                }
                return unit;
            }

            public org.drools.ruleunits.api.RuleUnit<org.acme.travels.PersonValidationService> unit() {
                return app.get(org.kie.kogito.rules.RuleUnits.class).create(org.acme.travels.PersonValidationService.class);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, org.acme.travels.PersonValidationService unit) {
            }
        });
        ruleSetNode3.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("person", "person", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_7B8CC121-6F99-464A-93F8-9EAC4BE4601A_personsInputX", "persons", "org.amce.travels.Person", null), null, null));
        ruleSetNode3.metaData("UniqueId", "_7B8CC121-6F99-464A-93F8-9EAC4BE4601A");
        ruleSetNode3.metaData("elementname", "Evaluate Person");
        ruleSetNode3.metaData("x", 456);
        ruleSetNode3.metaData("width", 154);
        ruleSetNode3.metaData("y", 112);
        ruleSetNode3.metaData("height", 102);
        ruleSetNode3.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode4 = factory.splitNode(4);
        splitNode4.name("Exclusive Gateway 1");
        splitNode4.type(2);
        splitNode4.metaData("UniqueId", "_CB2B4CEB-E636-4F0C-904B-3468083FF1EF");
        splitNode4.metaData("elementname", "Exclusive Gateway 1");
        splitNode4.metaData("x", 690);
        splitNode4.metaData("width", 56);
        splitNode4.metaData("y", 135);
        splitNode4.metaData("Default", null);
        splitNode4.metaData("height", 56);
        splitNode4.constraint(5, "_22717A42-3E59-431B-8AF8-C5061A69B295", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.travels.Person person = (org.acme.travels.Person) kcontext.getVariable("person");
            return person.isAdult() == false;
        }, 0, false);
        splitNode4.constraint(6, "_FA444C47-2749-42FF-ACE3-7CF52A2AB11A", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.travels.Person person = (org.acme.travels.Person) kcontext.getVariable("person");
            return person.isAdult() == true;
        }, 0, false);
        splitNode4.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode5 = factory.humanTaskNode(5);
        humanTaskNode5.name("Special handling for children");
        humanTaskNode5.workParameter("NodeName", "Special handling for children");
        humanTaskNode5.workParameter("TaskName", "ChildrenHandling");
        humanTaskNode5.workParameter("Priority", "1");
        humanTaskNode5.workParameter("Skippable", "true");
        humanTaskNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("b726e707-bd8f-487b-b1d4-7b4423367e4e", "EXPRESSION (ChildrenHandling)", "java.lang.Object", "ChildrenHandling"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("person", "person", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_personInputX", "person", "org.acme.travels.Person", null), null, null));
        humanTaskNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("cf0da537-a4f5-4a47-a60a-a87c30abbf70", "EXPRESSION (true)", "java.lang.Object", "true"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode5.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX", "Priority", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("fb6bbba1-2344-4af9-9a92-5a04c0c81661", "EXPRESSION (1)", "java.lang.Object", "1"), new org.jbpm.workflow.core.impl.DataDefinition("_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D_PriorityInputX", "Priority", "Object", null))), null));
        humanTaskNode5.done();
        humanTaskNode5.metaData("UniqueId", "_D9CFCEE9-BCDF-48D0-8CB4-A55584DF0D9D");
        humanTaskNode5.metaData("elementname", "Special handling for children");
        humanTaskNode5.metaData("x", 826);
        humanTaskNode5.metaData("width", 154);
        humanTaskNode5.metaData("y", 112);
        humanTaskNode5.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode6 = factory.endNode(6);
        endNode6.name("End Event 2");
        endNode6.terminate(false);
        endNode6.metaData("UniqueId", "_44052DCF-2D80-48EC-9691-556FEDD102FD");
        endNode6.metaData("elementname", "End Event 2");
        endNode6.metaData("x", 1060);
        endNode6.metaData("width", 56);
        endNode6.metaData("y", 298);
        endNode6.metaData("height", 56);
        endNode6.done();
        factory.connection(5, 1, "_C93EF8F2-D9C0-45D1-A3D6-C8A376D07806");
        factory.connection(2, 3, "_41D07816-A956-491C-9787-5B8C0B8C4F58");
        factory.connection(3, 4, "_29B77FA9-3C5F-4EC3-9F37-5D74C182F3C0");
        factory.connection(4, 5, "_22717A42-3E59-431B-8AF8-C5061A69B295");
        factory.connection(4, 6, "_FA444C47-2749-42FF-ACE3-7CF52A2AB11A");
        factory.validate();
        return factory.getProcess();
    }
}
