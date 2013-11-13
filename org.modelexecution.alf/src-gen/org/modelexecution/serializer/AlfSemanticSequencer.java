package org.modelexecution.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.modelexecution.alf.AcceptBlock;
import org.modelexecution.alf.AcceptClause;
import org.modelexecution.alf.AcceptStatement;
import org.modelexecution.alf.ActiveClassBody;
import org.modelexecution.alf.ActiveClassDeclaration;
import org.modelexecution.alf.ActiveClassDefinition;
import org.modelexecution.alf.ActiveClassDefinitionOrStub;
import org.modelexecution.alf.ActiveClassMember;
import org.modelexecution.alf.ActivityDeclaration;
import org.modelexecution.alf.ActivityDefinition;
import org.modelexecution.alf.ActivityDefinitionOrStub;
import org.modelexecution.alf.AdditiveExpression;
import org.modelexecution.alf.AdditiveExpressionCompletion;
import org.modelexecution.alf.AlfPackage;
import org.modelexecution.alf.AliasDefinition;
import org.modelexecution.alf.AndExpression;
import org.modelexecution.alf.AndExpressionCompletion;
import org.modelexecution.alf.AnnotatedStatement;
import org.modelexecution.alf.Annotation;
import org.modelexecution.alf.Annotations;
import org.modelexecution.alf.AssignmentExpressionCompletion;
import org.modelexecution.alf.AssociationDeclaration;
import org.modelexecution.alf.AssociationDefinition;
import org.modelexecution.alf.AssociationDefinitionOrStub;
import org.modelexecution.alf.AttributeDefinition;
import org.modelexecution.alf.AttributeInitializer;
import org.modelexecution.alf.BOOLEAN_LITERAL;
import org.modelexecution.alf.BehaviorClause;
import org.modelexecution.alf.BehaviorInvocation;
import org.modelexecution.alf.BitStringComplementExpression;
import org.modelexecution.alf.Block;
import org.modelexecution.alf.BlockStatement;
import org.modelexecution.alf.BooleanNegationExpression;
import org.modelexecution.alf.BreakStatement;
import org.modelexecution.alf.ClassBody;
import org.modelexecution.alf.ClassDeclaration;
import org.modelexecution.alf.ClassDefinition;
import org.modelexecution.alf.ClassDefinitionOrStub;
import org.modelexecution.alf.ClassExtentExpressionCompletion;
import org.modelexecution.alf.ClassMember;
import org.modelexecution.alf.ClassificationClause;
import org.modelexecution.alf.ClassificationExpression;
import org.modelexecution.alf.ClassificationExpressionCompletion;
import org.modelexecution.alf.ClassificationFromClause;
import org.modelexecution.alf.ClassificationToClause;
import org.modelexecution.alf.ClassifierSignature;
import org.modelexecution.alf.ClassifierTemplateParameter;
import org.modelexecution.alf.ClassifyStatement;
import org.modelexecution.alf.ColonQualifiedNameCompletion;
import org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference;
import org.modelexecution.alf.ColonQualifiedNameCompletionWithoutBinding;
import org.modelexecution.alf.CompoundAcceptStatementCompletion;
import org.modelexecution.alf.ConcurrentClauses;
import org.modelexecution.alf.ConditionalAndExpression;
import org.modelexecution.alf.ConditionalAndExpressionCompletion;
import org.modelexecution.alf.ConditionalExpression;
import org.modelexecution.alf.ConditionalExpressionCompletion;
import org.modelexecution.alf.ConditionalOrExpression;
import org.modelexecution.alf.ConditionalOrExpressionCompletion;
import org.modelexecution.alf.DataTypeDeclaration;
import org.modelexecution.alf.DataTypeDefinition;
import org.modelexecution.alf.DataTypeDefinitionOrStub;
import org.modelexecution.alf.DoStatement;
import org.modelexecution.alf.DocumentedStatement;
import org.modelexecution.alf.EmptyStatement;
import org.modelexecution.alf.EnumerationBody;
import org.modelexecution.alf.EnumerationDeclaration;
import org.modelexecution.alf.EnumerationDefinition;
import org.modelexecution.alf.EnumerationDefinitionOrStub;
import org.modelexecution.alf.EnumerationLiteralName;
import org.modelexecution.alf.EqualityExpression;
import org.modelexecution.alf.EqualityExpressionCompletion;
import org.modelexecution.alf.ExclusiveOrExpression;
import org.modelexecution.alf.ExclusiveOrExpressionCompletion;
import org.modelexecution.alf.Expression;
import org.modelexecution.alf.Feature;
import org.modelexecution.alf.FeatureInvocation;
import org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index;
import org.modelexecution.alf.FinalClause;
import org.modelexecution.alf.ForControl;
import org.modelexecution.alf.ForStatement;
import org.modelexecution.alf.FormalParameter;
import org.modelexecution.alf.FormalParameterList;
import org.modelexecution.alf.FormalParameters;
import org.modelexecution.alf.INTEGER_LITERAL;
import org.modelexecution.alf.IfStatement;
import org.modelexecution.alf.ImportDeclaration;
import org.modelexecution.alf.ImportReference;
import org.modelexecution.alf.InLineStatement;
import org.modelexecution.alf.InclusiveOrExpression;
import org.modelexecution.alf.InclusiveOrExpressionCompletion;
import org.modelexecution.alf.Index;
import org.modelexecution.alf.IndexedNamedExpression;
import org.modelexecution.alf.IndexedNamedExpressionListCompletion;
import org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression;
import org.modelexecution.alf.InstanceInitializationExpression;
import org.modelexecution.alf.IsolationExpression;
import org.modelexecution.alf.LinkOperationCompletion;
import org.modelexecution.alf.LinkOperationTuple;
import org.modelexecution.alf.LiteralExpression;
import org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement;
import org.modelexecution.alf.LocalNameDeclarationStatement;
import org.modelexecution.alf.LocalNameDeclarationStatementCompletion;
import org.modelexecution.alf.LoopVariableDefinition;
import org.modelexecution.alf.MultiplicativeExpression;
import org.modelexecution.alf.MultiplicativeExpressionCompletion;
import org.modelexecution.alf.Multiplicity;
import org.modelexecution.alf.MultiplicityIndicator;
import org.modelexecution.alf.MultiplicityRange;
import org.modelexecution.alf.Name;
import org.modelexecution.alf.NameBinding;
import org.modelexecution.alf.NameList;
import org.modelexecution.alf.NameOrPrimaryExpression;
import org.modelexecution.alf.NameToExpressionCompletion;
import org.modelexecution.alf.NameToPrimaryExpression;
import org.modelexecution.alf.NamedExpression;
import org.modelexecution.alf.NamedTemplateBinding;
import org.modelexecution.alf.NamedTupleExpressionList;
import org.modelexecution.alf.NamespaceDeclaration;
import org.modelexecution.alf.NonEmptyStatementSequence;
import org.modelexecution.alf.NonFinalClause;
import org.modelexecution.alf.NonNameExpression;
import org.modelexecution.alf.NonNamePostfixOrCastExpression;
import org.modelexecution.alf.NumericUnaryExpression;
import org.modelexecution.alf.OpaqueBehaviorBody;
import org.modelexecution.alf.OperationDeclaration;
import org.modelexecution.alf.PackageBody;
import org.modelexecution.alf.PackageDeclaration;
import org.modelexecution.alf.PackageDefinition;
import org.modelexecution.alf.PackageDefinitionOrStub;
import org.modelexecution.alf.PackagedElement;
import org.modelexecution.alf.ParenthesizedExpression;
import org.modelexecution.alf.PositionalTemplateBinding;
import org.modelexecution.alf.PositionalTupleExpressionList;
import org.modelexecution.alf.PositionalTupleExpressionListCompletion;
import org.modelexecution.alf.PostfixExpressionCompletion;
import org.modelexecution.alf.PostfixOperation;
import org.modelexecution.alf.PostfixOrCastExpression;
import org.modelexecution.alf.PrefixExpression;
import org.modelexecution.alf.PrimaryExpression;
import org.modelexecution.alf.PrimaryExpressionCompletion;
import org.modelexecution.alf.PrimaryToExpressionCompletion;
import org.modelexecution.alf.PropertyDeclaration;
import org.modelexecution.alf.PropertyDefinition;
import org.modelexecution.alf.QualifiedName;
import org.modelexecution.alf.QualifiedNameList;
import org.modelexecution.alf.QualifiedNameWithoutBinding;
import org.modelexecution.alf.ReceptionDefinition;
import org.modelexecution.alf.ReclassifyAllClause;
import org.modelexecution.alf.RedefinitionClause;
import org.modelexecution.alf.RelationalExpression;
import org.modelexecution.alf.RelationalExpressionCompletion;
import org.modelexecution.alf.ReturnStatement;
import org.modelexecution.alf.STRING_LITERAL;
import org.modelexecution.alf.SequenceAnyExpression;
import org.modelexecution.alf.SequenceConstructionExpressionCompletion;
import org.modelexecution.alf.SequenceElement;
import org.modelexecution.alf.SequenceElementListCompletion;
import org.modelexecution.alf.SequenceElements;
import org.modelexecution.alf.SequenceInitializationExpression;
import org.modelexecution.alf.SequenceOperationOrReductionOrExpansion;
import org.modelexecution.alf.SequentialClauses;
import org.modelexecution.alf.ShiftExpression;
import org.modelexecution.alf.ShiftExpressionCompletion;
import org.modelexecution.alf.SignalDeclaration;
import org.modelexecution.alf.SignalDefinition;
import org.modelexecution.alf.SignalDefinitionOrStub;
import org.modelexecution.alf.SignalReceptionDeclaration;
import org.modelexecution.alf.SignalReceptionDefinitionOrStub;
import org.modelexecution.alf.SimpleAcceptStatementCompletion;
import org.modelexecution.alf.SpecializationClause;
import org.modelexecution.alf.StatementSequence;
import org.modelexecution.alf.StereotypeAnnotation;
import org.modelexecution.alf.StereotypeAnnotations;
import org.modelexecution.alf.StructuredBody;
import org.modelexecution.alf.StructuredMember;
import org.modelexecution.alf.SuperInvocationExpression;
import org.modelexecution.alf.SwitchCase;
import org.modelexecution.alf.SwitchClause;
import org.modelexecution.alf.SwitchDefaultClause;
import org.modelexecution.alf.SwitchStatement;
import org.modelexecution.alf.TaggedValue;
import org.modelexecution.alf.TaggedValueList;
import org.modelexecution.alf.TemplateParameterSubstitution;
import org.modelexecution.alf.TemplateParameters;
import org.modelexecution.alf.ThisExpression;
import org.modelexecution.alf.Tuple;
import org.modelexecution.alf.TypeName;
import org.modelexecution.alf.TypePart;
import org.modelexecution.alf.UNLIMITED_NATURAL;
import org.modelexecution.alf.UnitDefinition;
import org.modelexecution.alf.UnlimitedNaturalLiteral;
import org.modelexecution.alf.VisibilityIndicator;
import org.modelexecution.alf.WhileStatement;
import org.modelexecution.services.AlfGrammarAccess;

@SuppressWarnings("all")
public class AlfSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AlfGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AlfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AlfPackage.ACCEPT_BLOCK:
				if(context == grammarAccess.getAcceptBlockRule()) {
					sequence_AcceptBlock(context, (AcceptBlock) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACCEPT_CLAUSE:
				if(context == grammarAccess.getAcceptClauseRule()) {
					sequence_AcceptClause(context, (AcceptClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACCEPT_STATEMENT:
				if(context == grammarAccess.getAcceptStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AcceptStatement(context, (AcceptStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVE_CLASS_BODY:
				if(context == grammarAccess.getActiveClassBodyRule()) {
					sequence_ActiveClassBody(context, (ActiveClassBody) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVE_CLASS_DECLARATION:
				if(context == grammarAccess.getActiveClassDeclarationRule()) {
					sequence_ActiveClassDeclaration(context, (ActiveClassDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVE_CLASS_DEFINITION:
				if(context == grammarAccess.getActiveClassDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionRule() ||
				   context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_ActiveClassDefinition(context, (ActiveClassDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVE_CLASS_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassDefinitionOrStubRule() ||
				   context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_ActiveClassDefinitionOrStub(context, (ActiveClassDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVE_CLASS_MEMBER:
				if(context == grammarAccess.getActiveClassMemberRule()) {
					sequence_ActiveClassMember(context, (ActiveClassMember) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVITY_DECLARATION:
				if(context == grammarAccess.getActivityDeclarationRule()) {
					sequence_ActivityDeclaration(context, (ActivityDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVITY_DEFINITION:
				if(context == grammarAccess.getActivityDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionRule() ||
				   context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_ActivityDefinition(context, (ActivityDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ACTIVITY_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getActivityDefinitionOrStubRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_ActivityDefinitionOrStub(context, (ActivityDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ADDITIVE_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule()) {
					sequence_AdditiveExpression(context, (AdditiveExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ADDITIVE_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getAdditiveExpressionCompletionRule()) {
					sequence_AdditiveExpressionCompletion(context, (AdditiveExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ALIAS_DEFINITION:
				if(context == grammarAccess.getAliasDefinitionRule()) {
					sequence_AliasDefinition(context, (AliasDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.AND_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getAndExpressionCompletionRule()) {
					sequence_AndExpressionCompletion(context, (AndExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ANNOTATED_STATEMENT:
				if(context == grammarAccess.getAnnotatedStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AnnotatedStatement(context, (AnnotatedStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ANNOTATIONS:
				if(context == grammarAccess.getAnnotationsRule()) {
					sequence_Annotations(context, (Annotations) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ASSIGNMENT_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getAssignmentExpressionCompletionRule() ||
				   context == grammarAccess.getExpressionCompletionRule()) {
					sequence_AssignmentExpressionCompletion(context, (AssignmentExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ASSOCIATION_DECLARATION:
				if(context == grammarAccess.getAssociationDeclarationRule()) {
					sequence_AssociationDeclaration(context, (AssociationDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ASSOCIATION_DEFINITION:
				if(context == grammarAccess.getAssociationDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionRule() ||
				   context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_AssociationDefinition(context, (AssociationDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ASSOCIATION_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getAssociationDefinitionOrStubRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_AssociationDefinitionOrStub(context, (AssociationDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ATTRIBUTE_DEFINITION:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getAttributeDefinitionRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getFeatureDefinitionOrStubRule()) {
					sequence_AttributeDefinition(context, (AttributeDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ATTRIBUTE_INITIALIZER:
				if(context == grammarAccess.getAttributeInitializerRule()) {
					sequence_AttributeInitializer(context, (AttributeInitializer) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBOOLEAN_LITERALRule() ||
				   context == grammarAccess.getPRIMITIVE_LITERALRule()) {
					sequence_BOOLEAN_LITERAL(context, (BOOLEAN_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BEHAVIOR_CLAUSE:
				if(context == grammarAccess.getBehaviorClauseRule()) {
					sequence_BehaviorClause(context, (BehaviorClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BEHAVIOR_INVOCATION:
				if(context == grammarAccess.getBehaviorInvocationRule()) {
					sequence_BehaviorInvocation(context, (BehaviorInvocation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BIT_STRING_COMPLEMENT_EXPRESSION:
				if(context == grammarAccess.getBitStringComplementExpressionRule() ||
				   context == grammarAccess.getCastCompletionRule() ||
				   context == grammarAccess.getNonNameUnaryExpressionRule() ||
				   context == grammarAccess.getNonPostfixNonCastUnaryExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_BitStringComplementExpression(context, (BitStringComplementExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BLOCK_STATEMENT:
				if(context == grammarAccess.getBlockStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_BlockStatement(context, (BlockStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BOOLEAN_NEGATION_EXPRESSION:
				if(context == grammarAccess.getBooleanNegationExpressionRule() ||
				   context == grammarAccess.getCastCompletionRule() ||
				   context == grammarAccess.getNonNameUnaryExpressionRule() ||
				   context == grammarAccess.getNonPostfixNonCastUnaryExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_BooleanNegationExpression(context, (BooleanNegationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.BREAK_STATEMENT:
				if(context == grammarAccess.getBreakStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_BreakStatement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASS_BODY:
				if(context == grammarAccess.getClassBodyRule()) {
					sequence_ClassBody(context, (ClassBody) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASS_DECLARATION:
				if(context == grammarAccess.getClassDeclarationRule()) {
					sequence_ClassDeclaration(context, (ClassDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASS_DEFINITION:
				if(context == grammarAccess.getClassDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionRule() ||
				   context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_ClassDefinition(context, (ClassDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASS_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassDefinitionOrStubRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_ClassDefinitionOrStub(context, (ClassDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASS_EXTENT_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getClassExtentExpressionCompletionRule()) {
					sequence_ClassExtentExpressionCompletion(context, (ClassExtentExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASS_MEMBER:
				if(context == grammarAccess.getClassMemberRule()) {
					sequence_ClassMember(context, (ClassMember) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_CLAUSE:
				if(context == grammarAccess.getClassificationClauseRule()) {
					sequence_ClassificationClause(context, (ClassificationClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_EXPRESSION:
				if(context == grammarAccess.getClassificationExpressionRule()) {
					sequence_ClassificationExpression(context, (ClassificationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getClassificationExpressionCompletionRule()) {
					sequence_ClassificationExpressionCompletion(context, (ClassificationExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_FROM_CLAUSE:
				if(context == grammarAccess.getClassificationFromClauseRule()) {
					sequence_ClassificationFromClause(context, (ClassificationFromClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFICATION_TO_CLAUSE:
				if(context == grammarAccess.getClassificationToClauseRule()) {
					sequence_ClassificationToClause(context, (ClassificationToClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFIER_SIGNATURE:
				if(context == grammarAccess.getClassifierSignatureRule()) {
					sequence_ClassifierSignature(context, (ClassifierSignature) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFIER_TEMPLATE_PARAMETER:
				if(context == grammarAccess.getClassifierTemplateParameterRule()) {
					sequence_ClassifierTemplateParameter(context, (ClassifierTemplateParameter) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CLASSIFY_STATEMENT:
				if(context == grammarAccess.getClassifyStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ClassifyStatement(context, (ClassifyStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.COLON_QUALIFIED_NAME_COMPLETION:
				if(context == grammarAccess.getColonQualifiedNameCompletionRule()) {
					sequence_ColonQualifiedNameCompletion(context, (ColonQualifiedNameCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.COLON_QUALIFIED_NAME_COMPLETION_OF_IMPORT_REFERENCE:
				if(context == grammarAccess.getColonQualifiedNameCompletionOfImportReferenceRule() ||
				   context == grammarAccess.getImportReferenceQualifiedNameCompletionRule()) {
					sequence_ColonQualifiedNameCompletionOfImportReference(context, (ColonQualifiedNameCompletionOfImportReference) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.COLON_QUALIFIED_NAME_COMPLETION_WITHOUT_BINDING:
				if(context == grammarAccess.getColonQualifiedNameCompletionWithoutBindingRule()) {
					sequence_ColonQualifiedNameCompletionWithoutBinding(context, (ColonQualifiedNameCompletionWithoutBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.COMPOUND_ACCEPT_STATEMENT_COMPLETION:
				if(context == grammarAccess.getCompoundAcceptStatementCompletionRule()) {
					sequence_CompoundAcceptStatementCompletion(context, (CompoundAcceptStatementCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONCURRENT_CLAUSES:
				if(context == grammarAccess.getConcurrentClausesRule()) {
					sequence_ConcurrentClauses(context, (ConcurrentClauses) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_AND_EXPRESSION:
				if(context == grammarAccess.getConditionalAndExpressionRule()) {
					sequence_ConditionalAndExpression(context, (ConditionalAndExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_AND_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getConditionalAndExpressionCompletionRule()) {
					sequence_ConditionalAndExpressionCompletion(context, (ConditionalAndExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_EXPRESSION:
				if(context == grammarAccess.getConditionalExpressionRule()) {
					sequence_ConditionalExpression(context, (ConditionalExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getConditionalExpressionCompletionRule() ||
				   context == grammarAccess.getExpressionCompletionRule()) {
					sequence_ConditionalExpressionCompletion(context, (ConditionalExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_OR_EXPRESSION:
				if(context == grammarAccess.getConditionalOrExpressionRule()) {
					sequence_ConditionalOrExpression(context, (ConditionalOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.CONDITIONAL_OR_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getConditionalOrExpressionCompletionRule()) {
					sequence_ConditionalOrExpressionCompletion(context, (ConditionalOrExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.DATA_TYPE_DECLARATION:
				if(context == grammarAccess.getDataTypeDeclarationRule()) {
					sequence_DataTypeDeclaration(context, (DataTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.DATA_TYPE_DEFINITION:
				if(context == grammarAccess.getClassifierDefinitionRule() ||
				   context == grammarAccess.getDataTypeDefinitionRule() ||
				   context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_DataTypeDefinition(context, (DataTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.DATA_TYPE_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionOrStubRule() ||
				   context == grammarAccess.getDataTypeDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_DataTypeDefinitionOrStub(context, (DataTypeDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.DO_STATEMENT:
				if(context == grammarAccess.getDoStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_DoStatement(context, (DoStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.DOCUMENTED_STATEMENT:
				if(context == grammarAccess.getDocumentedStatementRule()) {
					sequence_DocumentedStatement(context, (DocumentedStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EMPTY_STATEMENT:
				if(context == grammarAccess.getEmptyStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_EmptyStatement(context, (EmptyStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ENUMERATION_BODY:
				if(context == grammarAccess.getEnumerationBodyRule()) {
					sequence_EnumerationBody(context, (EnumerationBody) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ENUMERATION_DECLARATION:
				if(context == grammarAccess.getEnumerationDeclarationRule()) {
					sequence_EnumerationDeclaration(context, (EnumerationDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ENUMERATION_DEFINITION:
				if(context == grammarAccess.getClassifierDefinitionRule() ||
				   context == grammarAccess.getEnumerationDefinitionRule() ||
				   context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_EnumerationDefinition(context, (EnumerationDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ENUMERATION_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionOrStubRule() ||
				   context == grammarAccess.getEnumerationDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_EnumerationDefinitionOrStub(context, (EnumerationDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ENUMERATION_LITERAL_NAME:
				if(context == grammarAccess.getEnumerationLiteralNameRule()) {
					sequence_EnumerationLiteralName(context, (EnumerationLiteralName) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getEqualityExpressionRule()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EQUALITY_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getEqualityExpressionCompletionRule()) {
					sequence_EqualityExpressionCompletion(context, (EqualityExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EXCLUSIVE_OR_EXPRESSION:
				if(context == grammarAccess.getExclusiveOrExpressionRule()) {
					sequence_ExclusiveOrExpression(context, (ExclusiveOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EXCLUSIVE_OR_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getExclusiveOrExpressionCompletionRule()) {
					sequence_ExclusiveOrExpressionCompletion(context, (ExclusiveOrExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getInitializationExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FEATURE_INVOCATION:
				if(context == grammarAccess.getFeatureInvocationRule()) {
					sequence_FeatureInvocation(context, (FeatureInvocation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FEATURE_OR_SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_OR_INDEX:
				if(context == grammarAccess.getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexRule()) {
					sequence_Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index(context, (Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FINAL_CLAUSE:
				if(context == grammarAccess.getFinalClauseRule()) {
					sequence_FinalClause(context, (FinalClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FOR_CONTROL:
				if(context == grammarAccess.getForControlRule()) {
					sequence_ForControl(context, (ForControl) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FOR_STATEMENT:
				if(context == grammarAccess.getForStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ForStatement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FORMAL_PARAMETER:
				if(context == grammarAccess.getFormalParameterRule()) {
					sequence_FormalParameter(context, (FormalParameter) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FORMAL_PARAMETER_LIST:
				if(context == grammarAccess.getFormalParameterListRule()) {
					sequence_FormalParameterList(context, (FormalParameterList) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.FORMAL_PARAMETERS:
				if(context == grammarAccess.getFormalParametersRule()) {
					sequence_FormalParameters(context, (FormalParameters) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getINTEGER_LITERALRule() ||
				   context == grammarAccess.getNUMBER_LITERALRule() ||
				   context == grammarAccess.getPRIMITIVE_LITERALRule()) {
					sequence_INTEGER_LITERAL(context, (INTEGER_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.IMPORT_DECLARATION:
				if(context == grammarAccess.getImportDeclarationRule()) {
					sequence_ImportDeclaration(context, (ImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.IMPORT_REFERENCE:
				if(context == grammarAccess.getImportReferenceRule()) {
					sequence_ImportReference(context, (ImportReference) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.IN_LINE_STATEMENT:
				if(context == grammarAccess.getInLineStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_InLineStatement(context, (InLineStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INCLUSIVE_OR_EXPRESSION:
				if(context == grammarAccess.getInclusiveOrExpressionRule()) {
					sequence_InclusiveOrExpression(context, (InclusiveOrExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INCLUSIVE_OR_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getInclusiveOrExpressionCompletionRule()) {
					sequence_InclusiveOrExpressionCompletion(context, (InclusiveOrExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INDEX:
				if(context == grammarAccess.getIndexRule()) {
					sequence_Index(context, (Index) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INDEXED_NAMED_EXPRESSION:
				if(context == grammarAccess.getIndexedNamedExpressionRule()) {
					sequence_IndexedNamedExpression(context, (IndexedNamedExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INDEXED_NAMED_EXPRESSION_LIST_COMPLETION:
				if(context == grammarAccess.getIndexedNamedExpressionListCompletionRule()) {
					sequence_IndexedNamedExpressionListCompletion(context, (IndexedNamedExpressionListCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getInstanceCreationOrSequenceConstructionExpressionRule()) {
					sequence_InstanceCreationOrSequenceConstructionExpression(context, (InstanceCreationOrSequenceConstructionExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.INSTANCE_INITIALIZATION_EXPRESSION:
				if(context == grammarAccess.getInitializationExpressionRule() ||
				   context == grammarAccess.getInstanceInitializationExpressionRule()) {
					sequence_InstanceInitializationExpression(context, (InstanceInitializationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.ISOLATION_EXPRESSION:
				if(context == grammarAccess.getCastCompletionRule() ||
				   context == grammarAccess.getIsolationExpressionRule() ||
				   context == grammarAccess.getNonNameUnaryExpressionRule() ||
				   context == grammarAccess.getNonPostfixNonCastUnaryExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_IsolationExpression(context, (IsolationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LINK_OPERATION_COMPLETION:
				if(context == grammarAccess.getLinkOperationCompletionRule()) {
					sequence_LinkOperationCompletion(context, (LinkOperationCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LINK_OPERATION_TUPLE:
				if(context == grammarAccess.getLinkOperationTupleRule()) {
					sequence_LinkOperationTuple(context, (LinkOperationTuple) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LITERAL_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getLiteralExpressionRule()) {
					sequence_LiteralExpression(context, (LiteralExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT:
				if(context == grammarAccess.getLocalNameDeclarationOrExpressionStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LocalNameDeclarationOrExpressionStatement(context, (LocalNameDeclarationOrExpressionStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT:
				if(context == grammarAccess.getLocalNameDeclarationStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LocalNameDeclarationStatement(context, (LocalNameDeclarationStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LOCAL_NAME_DECLARATION_STATEMENT_COMPLETION:
				if(context == grammarAccess.getLocalNameDeclarationStatementCompletionRule()) {
					sequence_LocalNameDeclarationStatementCompletion(context, (LocalNameDeclarationStatementCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.LOOP_VARIABLE_DEFINITION:
				if(context == grammarAccess.getLoopVariableDefinitionRule()) {
					sequence_LoopVariableDefinition(context, (LoopVariableDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.MULTIPLICATIVE_EXPRESSION:
				if(context == grammarAccess.getMultiplicativeExpressionRule()) {
					sequence_MultiplicativeExpression(context, (MultiplicativeExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.MULTIPLICATIVE_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getMultiplicativeExpressionCompletionRule()) {
					sequence_MultiplicativeExpressionCompletion(context, (MultiplicativeExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.MULTIPLICITY:
				if(context == grammarAccess.getMultiplicityRule()) {
					sequence_Multiplicity(context, (Multiplicity) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.MULTIPLICITY_INDICATOR:
				if(context == grammarAccess.getMultiplicityIndicatorRule()) {
					sequence_MultiplicityIndicator(context, (MultiplicityIndicator) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.MULTIPLICITY_RANGE:
				if(context == grammarAccess.getMultiplicityRangeRule()) {
					sequence_MultiplicityRange(context, (MultiplicityRange) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAME:
				if(context == grammarAccess.getNameRule()) {
					sequence_Name(context, (Name) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAME_BINDING:
				if(context == grammarAccess.getNameBindingRule() ||
				   context == grammarAccess.getUnqualifiedNameRule()) {
					sequence_NameBinding(context, (NameBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAME_LIST:
				if(context == grammarAccess.getNameListRule()) {
					sequence_NameList(context, (NameList) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAME_OR_PRIMARY_EXPRESSION:
				if(context == grammarAccess.getNameOrPrimaryExpressionRule()) {
					sequence_NameOrPrimaryExpression(context, (NameOrPrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAME_TO_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getNameToExpressionCompletionRule()) {
					sequence_NameToExpressionCompletion(context, (NameToExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAME_TO_PRIMARY_EXPRESSION:
				if(context == grammarAccess.getNameToPrimaryExpressionRule()) {
					sequence_NameToPrimaryExpression(context, (NameToPrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAMED_EXPRESSION:
				if(context == grammarAccess.getNamedExpressionRule()) {
					sequence_NamedExpression(context, (NamedExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAMED_TEMPLATE_BINDING:
				if(context == grammarAccess.getNamedTemplateBindingRule() ||
				   context == grammarAccess.getTemplateBindingRule()) {
					sequence_NamedTemplateBinding(context, (NamedTemplateBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAMED_TUPLE_EXPRESSION_LIST:
				if(context == grammarAccess.getNamedTupleExpressionListRule()) {
					sequence_NamedTupleExpressionList(context, (NamedTupleExpressionList) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NAMESPACE_DECLARATION:
				if(context == grammarAccess.getNamespaceDeclarationRule()) {
					sequence_NamespaceDeclaration(context, (NamespaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NON_EMPTY_STATEMENT_SEQUENCE:
				if(context == grammarAccess.getNonEmptyStatementSequenceRule()) {
					sequence_NonEmptyStatementSequence(context, (NonEmptyStatementSequence) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NON_FINAL_CLAUSE:
				if(context == grammarAccess.getNonFinalClauseRule()) {
					sequence_NonFinalClause(context, (NonFinalClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NON_NAME_EXPRESSION:
				if(context == grammarAccess.getNonNameExpressionRule()) {
					sequence_NonNameExpression(context, (NonNameExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NON_NAME_POSTFIX_OR_CAST_EXPRESSION:
				if(context == grammarAccess.getNonNamePostfixOrCastExpressionRule() ||
				   context == grammarAccess.getNonNameUnaryExpressionRule()) {
					sequence_NonNamePostfixOrCastExpression(context, (NonNamePostfixOrCastExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.NUMERIC_UNARY_EXPRESSION:
				if(context == grammarAccess.getNonNameUnaryExpressionRule() ||
				   context == grammarAccess.getNonPostfixNonCastUnaryExpressionRule() ||
				   context == grammarAccess.getNumericUnaryExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_NumericUnaryExpression(context, (NumericUnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.OPAQUE_BEHAVIOR_BODY:
				if(context == grammarAccess.getOpaqueBehaviorBodyRule()) {
					sequence_OpaqueBehaviorBody(context, (OpaqueBehaviorBody) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.OPERATION_DECLARATION:
				if(context == grammarAccess.getOperationDeclarationRule()) {
					sequence_OperationDeclaration(context, (OperationDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getFeatureDefinitionOrStubRule() ||
				   context == grammarAccess.getOperationDefinitionOrStubRule()) {
					sequence_OperationDeclaration_OperationDefinitionOrStub(context, (OperationDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PACKAGE_BODY:
				if(context == grammarAccess.getPackageBodyRule()) {
					sequence_PackageBody(context, (PackageBody) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PACKAGE_DEFINITION:
				if(context == grammarAccess.getNamespaceDefinitionRule() ||
				   context == grammarAccess.getPackageDefinitionRule()) {
					sequence_PackageDefinition(context, (PackageDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PACKAGE_DEFINITION_OR_STUB:
				if(context == grammarAccess.getPackageDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule()) {
					sequence_PackageDefinitionOrStub(context, (PackageDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PACKAGED_ELEMENT:
				if(context == grammarAccess.getPackagedElementRule()) {
					sequence_PackagedElement(context, (PackagedElement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PARENTHESIZED_EXPRESSION:
				if(context == grammarAccess.getParenthesizedExpressionRule()) {
					sequence_ParenthesizedExpression(context, (ParenthesizedExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.POSITIONAL_TEMPLATE_BINDING:
				if(context == grammarAccess.getPositionalTemplateBindingRule() ||
				   context == grammarAccess.getTemplateBindingRule()) {
					sequence_PositionalTemplateBinding(context, (PositionalTemplateBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.POSITIONAL_TUPLE_EXPRESSION_LIST:
				if(context == grammarAccess.getPositionalTupleExpressionListRule()) {
					sequence_PositionalTupleExpressionList(context, (PositionalTupleExpressionList) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.POSITIONAL_TUPLE_EXPRESSION_LIST_COMPLETION:
				if(context == grammarAccess.getPositionalTupleExpressionListCompletionRule()) {
					sequence_PositionalTupleExpressionListCompletion(context, (PositionalTupleExpressionListCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.POSTFIX_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getPostfixExpressionCompletionRule()) {
					sequence_PostfixExpressionCompletion(context, (PostfixExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.POSTFIX_OPERATION:
				if(context == grammarAccess.getPostfixOperationRule()) {
					sequence_PostfixOperation(context, (PostfixOperation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.POSTFIX_OR_CAST_EXPRESSION:
				if(context == grammarAccess.getCastCompletionRule() ||
				   context == grammarAccess.getPostfixOrCastExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_PostfixOrCastExpression(context, (PostfixOrCastExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PREFIX_EXPRESSION:
				if(context == grammarAccess.getNonNameUnaryExpressionRule() ||
				   context == grammarAccess.getNonPostfixNonCastUnaryExpressionRule() ||
				   context == grammarAccess.getPrefixExpressionRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_PrefixExpression(context, (PrefixExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PRIMARY_EXPRESSION:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (PrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PRIMARY_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getPrimaryExpressionCompletionRule()) {
					sequence_PrimaryExpressionCompletion(context, (PrimaryExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PRIMARY_TO_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getPrimaryToExpressionCompletionRule()) {
					sequence_PrimaryToExpressionCompletion(context, (PrimaryToExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PROPERTY_DECLARATION:
				if(context == grammarAccess.getPropertyDeclarationRule()) {
					sequence_PropertyDeclaration(context, (PropertyDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.PROPERTY_DEFINITION:
				if(context == grammarAccess.getPropertyDefinitionRule()) {
					sequence_PropertyDefinition(context, (PropertyDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.QUALIFIED_NAME:
				if(context == grammarAccess.getQualifiedNameRule()) {
					sequence_QualifiedName(context, (QualifiedName) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.QUALIFIED_NAME_LIST:
				if(context == grammarAccess.getQualifiedNameListRule() ||
				   context == grammarAccess.getTaggedValuesRule()) {
					sequence_QualifiedNameList(context, (QualifiedNameList) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.QUALIFIED_NAME_WITHOUT_BINDING:
				if(context == grammarAccess.getQualifiedNameWithoutBindingRule()) {
					sequence_QualifiedNameWithoutBinding(context, (QualifiedNameWithoutBinding) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RECEPTION_DEFINITION:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getActiveFeatureDefinitionOrStubRule() ||
				   context == grammarAccess.getReceptionDefinitionRule()) {
					sequence_ReceptionDefinition(context, (ReceptionDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RECLASSIFY_ALL_CLAUSE:
				if(context == grammarAccess.getReclassifyAllClauseRule()) {
					sequence_ReclassifyAllClause(context, (ReclassifyAllClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.REDEFINITION_CLAUSE:
				if(context == grammarAccess.getRedefinitionClauseRule()) {
					sequence_RedefinitionClause(context, (RedefinitionClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getRelationalExpressionRule()) {
					sequence_RelationalExpression(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RELATIONAL_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getRelationalExpressionCompletionRule()) {
					sequence_RelationalExpressionCompletion(context, (RelationalExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STRING_LITERAL:
				if(context == grammarAccess.getPRIMITIVE_LITERALRule() ||
				   context == grammarAccess.getSTRING_LITERALRule()) {
					sequence_STRING_LITERAL(context, (STRING_LITERAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_ANY_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getSequenceAnyExpressionRule()) {
					sequence_SequenceAnyExpression(context, (SequenceAnyExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getSequenceConstructionExpressionCompletionRule()) {
					sequence_SequenceConstructionExpressionCompletion(context, (SequenceConstructionExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_ELEMENT:
				if(context == grammarAccess.getSequenceElementRule()) {
					sequence_SequenceElement(context, (SequenceElement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_ELEMENT_LIST_COMPLETION:
				if(context == grammarAccess.getSequenceElementListCompletionRule()) {
					sequence_SequenceElementListCompletion(context, (SequenceElementListCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_ELEMENTS:
				if(context == grammarAccess.getSequenceElementsRule()) {
					sequence_SequenceElements(context, (SequenceElements) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_INITIALIZATION_EXPRESSION:
				if(context == grammarAccess.getInitializationExpressionRule() ||
				   context == grammarAccess.getSequenceInitializationExpressionRule()) {
					sequence_SequenceInitializationExpression(context, (SequenceInitializationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION:
				if(context == grammarAccess.getSequenceOperationOrReductionOrExpansionRule()) {
					sequence_SequenceOperationOrReductionOrExpansion(context, (SequenceOperationOrReductionOrExpansion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SEQUENTIAL_CLAUSES:
				if(context == grammarAccess.getSequentialClausesRule()) {
					sequence_SequentialClauses(context, (SequentialClauses) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SHIFT_EXPRESSION:
				if(context == grammarAccess.getShiftExpressionRule()) {
					sequence_ShiftExpression(context, (ShiftExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SHIFT_EXPRESSION_COMPLETION:
				if(context == grammarAccess.getShiftExpressionCompletionRule()) {
					sequence_ShiftExpressionCompletion(context, (ShiftExpressionCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SIGNAL_DECLARATION:
				if(context == grammarAccess.getSignalDeclarationRule()) {
					sequence_SignalDeclaration(context, (SignalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SIGNAL_DEFINITION:
				if(context == grammarAccess.getClassifierDefinitionRule() ||
				   context == grammarAccess.getNamespaceDefinitionRule() ||
				   context == grammarAccess.getSignalDefinitionRule()) {
					sequence_SignalDefinition(context, (SignalDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SIGNAL_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassMemberDefinitionRule() ||
				   context == grammarAccess.getClassifierDefinitionOrStubRule() ||
				   context == grammarAccess.getPackagedElementDefinitionRule() ||
				   context == grammarAccess.getSignalDefinitionOrStubRule()) {
					sequence_SignalDefinitionOrStub(context, (SignalDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SIGNAL_RECEPTION_DECLARATION:
				if(context == grammarAccess.getSignalReceptionDeclarationRule()) {
					sequence_SignalReceptionDeclaration(context, (SignalReceptionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SIGNAL_RECEPTION_DEFINITION_OR_STUB:
				if(context == grammarAccess.getActiveClassMemberDefinitionRule() ||
				   context == grammarAccess.getActiveFeatureDefinitionOrStubRule() ||
				   context == grammarAccess.getSignalReceptionDefinitionOrStubRule()) {
					sequence_SignalReceptionDefinitionOrStub(context, (SignalReceptionDefinitionOrStub) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SIMPLE_ACCEPT_STATEMENT_COMPLETION:
				if(context == grammarAccess.getSimpleAcceptStatementCompletionRule()) {
					sequence_SimpleAcceptStatementCompletion(context, (SimpleAcceptStatementCompletion) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SPECIALIZATION_CLAUSE:
				if(context == grammarAccess.getSpecializationClauseRule()) {
					sequence_SpecializationClause(context, (SpecializationClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STATEMENT_SEQUENCE:
				if(context == grammarAccess.getStatementSequenceRule()) {
					sequence_StatementSequence(context, (StatementSequence) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STEREOTYPE_ANNOTATION:
				if(context == grammarAccess.getStereotypeAnnotationRule()) {
					sequence_StereotypeAnnotation(context, (StereotypeAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STEREOTYPE_ANNOTATIONS:
				if(context == grammarAccess.getStereotypeAnnotationsRule()) {
					sequence_StereotypeAnnotations(context, (StereotypeAnnotations) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STRUCTURED_BODY:
				if(context == grammarAccess.getStructuredBodyRule()) {
					sequence_StructuredBody(context, (StructuredBody) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.STRUCTURED_MEMBER:
				if(context == grammarAccess.getStructuredMemberRule()) {
					sequence_StructuredMember(context, (StructuredMember) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SUPER_INVOCATION_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getSuperInvocationExpressionRule()) {
					sequence_SuperInvocationExpression(context, (SuperInvocationExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_CASE:
				if(context == grammarAccess.getSwitchCaseRule()) {
					sequence_SwitchCase(context, (SwitchCase) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_CLAUSE:
				if(context == grammarAccess.getSwitchClauseRule()) {
					sequence_SwitchClause(context, (SwitchClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_DEFAULT_CLAUSE:
				if(context == grammarAccess.getSwitchDefaultClauseRule()) {
					sequence_SwitchDefaultClause(context, (SwitchDefaultClause) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.SWITCH_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSwitchStatementRule()) {
					sequence_SwitchStatement(context, (SwitchStatement) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TAGGED_VALUE:
				if(context == grammarAccess.getTaggedValueRule()) {
					sequence_TaggedValue(context, (TaggedValue) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TAGGED_VALUE_LIST:
				if(context == grammarAccess.getTaggedValueListRule() ||
				   context == grammarAccess.getTaggedValuesRule()) {
					sequence_TaggedValueList(context, (TaggedValueList) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TEMPLATE_PARAMETER_SUBSTITUTION:
				if(context == grammarAccess.getTemplateParameterSubstitutionRule()) {
					sequence_TemplateParameterSubstitution(context, (TemplateParameterSubstitution) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TEMPLATE_PARAMETERS:
				if(context == grammarAccess.getTemplateParametersRule()) {
					sequence_TemplateParameters(context, (TemplateParameters) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.THIS_EXPRESSION:
				if(context == grammarAccess.getBaseExpressionRule() ||
				   context == grammarAccess.getThisExpressionRule()) {
					sequence_ThisExpression(context, (ThisExpression) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TUPLE:
				if(context == grammarAccess.getTupleRule()) {
					sequence_Tuple(context, (Tuple) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TYPE_NAME:
				if(context == grammarAccess.getTypeNameRule()) {
					sequence_TypeName(context, (TypeName) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.TYPE_PART:
				if(context == grammarAccess.getTypePartRule()) {
					sequence_TypePart(context, (TypePart) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.UNLIMITED_NATURAL:
				if(context == grammarAccess.getNUMBER_LITERALRule() ||
				   context == grammarAccess.getPRIMITIVE_LITERALRule() ||
				   context == grammarAccess.getUNLIMITED_NATURALRule()) {
					sequence_UNLIMITED_NATURAL(context, (UNLIMITED_NATURAL) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.UNIT_DEFINITION:
				if(context == grammarAccess.getUnitDefinitionRule()) {
					sequence_UnitDefinition(context, (UnitDefinition) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.UNLIMITED_NATURAL_LITERAL:
				if(context == grammarAccess.getUnlimitedNaturalLiteralRule()) {
					sequence_UnlimitedNaturalLiteral(context, (UnlimitedNaturalLiteral) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.VISIBILITY_INDICATOR:
				if(context == grammarAccess.getVisibilityIndicatorRule()) {
					sequence_VisibilityIndicator(context, (VisibilityIndicator) semanticObject); 
					return; 
				}
				else break;
			case AlfPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getWhileStatementRule()) {
					sequence_WhileStatement(context, (WhileStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (acceptClause=AcceptClause block=Block)
	 */
	protected void sequence_AcceptBlock(EObject context, AcceptBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAcceptBlock_AcceptClause()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAcceptBlock_AcceptClause()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAcceptBlock_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAcceptBlock_Block()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAcceptBlockAccess().getAcceptClauseAcceptClauseParserRuleCall_0_0(), semanticObject.getAcceptClause());
		feeder.accept(grammarAccess.getAcceptBlockAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name? qualifiedNameList=QualifiedNameList)
	 */
	protected void sequence_AcceptClause(EObject context, AcceptClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (acceptClause=AcceptClause (simpleCompletion=SimpleAcceptStatementCompletion | compoundCompletion=CompoundAcceptStatementCompletion))
	 */
	protected void sequence_AcceptStatement(EObject context, AcceptStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activeClassMember+=ActiveClassMember* behaviorClasue=BehaviorClause?)
	 */
	protected void sequence_ActiveClassBody(EObject context, ActiveClassBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isAbstract?='abstract'? classifierSignature=ClassifierSignature)
	 */
	protected void sequence_ActiveClassDeclaration(EObject context, ActiveClassDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activeClassDeclaration=ActiveClassDeclaration activeClassBody=ActiveClassBody?)
	 */
	protected void sequence_ActiveClassDefinitionOrStub(EObject context, ActiveClassDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activeClassDeclaration=ActiveClassDeclaration activeClassBody=ActiveClassBody)
	 */
	protected void sequence_ActiveClassDefinition(EObject context, ActiveClassDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getActiveClassDefinition_ActiveClassDeclaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getActiveClassDefinition_ActiveClassDeclaration()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getActiveClassDefinition_ActiveClassBody()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getActiveClassDefinition_ActiveClassBody()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActiveClassDefinitionAccess().getActiveClassDeclarationActiveClassDeclarationParserRuleCall_0_0(), semanticObject.getActiveClassDeclaration());
		feeder.accept(grammarAccess.getActiveClassDefinitionAccess().getActiveClassBodyActiveClassBodyParserRuleCall_1_0(), semanticObject.getActiveClassBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         comment=ML_COMMENT? 
	 *         stereotypeAnnotations=StereotypeAnnotations 
	 *         visibilityIndicator=VisibilityIndicator? 
	 *         activeClassMemberDefinition=ActiveClassMemberDefinition
	 *     )
	 */
	protected void sequence_ActiveClassMember(EObject context, ActiveClassMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name templateParameters=TemplateParameters? formalParameters=FormalParameters typePart=TypePart?)
	 */
	protected void sequence_ActivityDeclaration(EObject context, ActivityDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activityDeclaration=ActivityDeclaration block=Block?)
	 */
	protected void sequence_ActivityDefinitionOrStub(EObject context, ActivityDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activityDeclaration=ActivityDeclaration block=Block)
	 */
	protected void sequence_ActivityDefinition(EObject context, ActivityDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getActivityDefinition_ActivityDeclaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getActivityDefinition_ActivityDeclaration()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getActivityDefinition_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getActivityDefinition_Block()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActivityDefinitionAccess().getActivityDeclarationActivityDeclarationParserRuleCall_0_0(), semanticObject.getActivityDeclaration());
		feeder.accept(grammarAccess.getActivityDefinitionAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion 
	 *         (operator+=AdditiveOperator multiplicativeExpression+=MultiplicativeExpression)*
	 *     )
	 */
	protected void sequence_AdditiveExpressionCompletion(EObject context, AdditiveExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression additiveExpressionCompletion=AdditiveExpressionCompletion)
	 */
	protected void sequence_AdditiveExpression(EObject context, AdditiveExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAdditiveExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAdditiveExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAdditiveExpression_AdditiveExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAdditiveExpression_AdditiveExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditiveExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionCompletionAdditiveExpressionCompletionParserRuleCall_1_0(), semanticObject.getAdditiveExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     alias=Name
	 */
	protected void sequence_AliasDefinition(EObject context, AliasDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAliasDefinition_Alias()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAliasDefinition_Alias()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasDefinitionAccess().getAliasNameParserRuleCall_1_0(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (equalityExpressionCompletion=EqualityExpressionCompletion equalityExpression+=EqualityExpression*)
	 */
	protected void sequence_AndExpressionCompletion(EObject context, AndExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression andExpressionCompletion=AndExpressionCompletion)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAndExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAndExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAndExpression_AndExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAndExpression_AndExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpressionCompletionAndExpressionCompletionParserRuleCall_1_0(), semanticObject.getAndExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (annotations=Annotations statement=Statement)
	 */
	protected void sequence_AnnotatedStatement(EObject context, AnnotatedStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAnnotatedStatement_Annotations()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAnnotatedStatement_Annotations()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAnnotatedStatement_Statement()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAnnotatedStatement_Statement()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotatedStatementAccess().getAnnotationsAnnotationsParserRuleCall_1_0(), semanticObject.getAnnotations());
		feeder.accept(grammarAccess.getAnnotatedStatementAccess().getStatementStatementParserRuleCall_3_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID nameList=NameList?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation annotation+=Annotation*)
	 */
	protected void sequence_Annotations(EObject context, Annotations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=AssignmentOperator expression=Expression)
	 */
	protected void sequence_AssignmentExpressionCompletion(EObject context, AssignmentExpressionCompletion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getExpressionCompletion_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getExpressionCompletion_Expression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAssignmentExpressionCompletion_Operator()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAssignmentExpressionCompletion_Operator()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentExpressionCompletionAccess().getOperatorAssignmentOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getAssignmentExpressionCompletionAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isAbstract?='abstract'? classifierSignature=ClassifierSignature)
	 */
	protected void sequence_AssociationDeclaration(EObject context, AssociationDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (associationDeclaration=AssociationDeclaration structuredBody=StructuredBody?)
	 */
	protected void sequence_AssociationDefinitionOrStub(EObject context, AssociationDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (associationDeclaration=AssociationDeclaration structuredBody=StructuredBody)
	 */
	protected void sequence_AssociationDefinition(EObject context, AssociationDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAssociationDefinition_AssociationDeclaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAssociationDefinition_AssociationDeclaration()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAssociationDefinition_StructuredBody()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAssociationDefinition_StructuredBody()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssociationDefinitionAccess().getAssociationDeclarationAssociationDeclarationParserRuleCall_0_0(), semanticObject.getAssociationDeclaration());
		feeder.accept(grammarAccess.getAssociationDefinitionAccess().getStructuredBodyStructuredBodyParserRuleCall_1_0(), semanticObject.getStructuredBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (propertyDeclaration=PropertyDeclaration attributeInitializer=AttributeInitializer?)
	 */
	protected void sequence_AttributeDefinition(EObject context, AttributeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     initializationExpression=InitializationExpression
	 */
	protected void sequence_AttributeInitializer(EObject context, AttributeInitializer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getAttributeInitializer_InitializationExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getAttributeInitializer_InitializationExpression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeInitializerAccess().getInitializationExpressionInitializationExpressionParserRuleCall_1_0(), semanticObject.getInitializationExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN_VALUE
	 */
	protected void sequence_BOOLEAN_LITERAL(EObject context, BOOLEAN_LITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBOOLEAN_LITERALAccess().getValueBOOLEAN_VALUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block | name=Name)
	 */
	protected void sequence_BehaviorClause(EObject context, BehaviorClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     tuple=Tuple
	 */
	protected void sequence_BehaviorInvocation(EObject context, BehaviorInvocation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getBehaviorInvocation_Tuple()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getBehaviorInvocation_Tuple()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBehaviorInvocationAccess().getTupleTupleParserRuleCall_0(), semanticObject.getTuple());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     unaryExpression=UnaryExpression
	 */
	protected void sequence_BitStringComplementExpression(EObject context, BitStringComplementExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getBitStringComplementExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getBitStringComplementExpression_UnaryExpression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBitStringComplementExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_1_0(), semanticObject.getUnaryExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_BlockStatement(EObject context, BlockStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getBlockStatement_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getBlockStatement_Block()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlockStatementAccess().getBlockBlockParserRuleCall_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statementSequence=StatementSequence
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getBlock_StatementSequence()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getBlock_StatementSequence()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlockAccess().getStatementSequenceStatementSequenceParserRuleCall_1_0(), semanticObject.getStatementSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     unaryExpression=UnaryExpression
	 */
	protected void sequence_BooleanNegationExpression(EObject context, BooleanNegationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getBooleanNegationExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getBooleanNegationExpression_UnaryExpression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanNegationExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_1_0(), semanticObject.getUnaryExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {BreakStatement}
	 */
	protected void sequence_BreakStatement(EObject context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classMember+=ClassMember*)
	 */
	protected void sequence_ClassBody(EObject context, ClassBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isAbstract?='abstract'? classifierSignature=ClassifierSignature)
	 */
	protected void sequence_ClassDeclaration(EObject context, ClassDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classDeclaration=ClassDeclaration classBody=ClassBody?)
	 */
	protected void sequence_ClassDefinitionOrStub(EObject context, ClassDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classDeclaration=ClassDeclaration classBody=ClassBody)
	 */
	protected void sequence_ClassDefinition(EObject context, ClassDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassDefinition_ClassDeclaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassDefinition_ClassDeclaration()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassDefinition_ClassBody()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassDefinition_ClassBody()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassDefinitionAccess().getClassDeclarationClassDeclarationParserRuleCall_0_0(), semanticObject.getClassDeclaration());
		feeder.accept(grammarAccess.getClassDefinitionAccess().getClassBodyClassBodyParserRuleCall_1_0(), semanticObject.getClassBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ClassExtentExpressionCompletion}
	 */
	protected void sequence_ClassExtentExpressionCompletion(EObject context, ClassExtentExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         comment=ML_COMMENT? 
	 *         stereotypeAnnotations=StereotypeAnnotations 
	 *         visibilityIndicator=VisibilityIndicator? 
	 *         classMemberDefinition=ClassMemberDefinition
	 *     )
	 */
	protected void sequence_ClassMember(EObject context, ClassMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (classificationFromClause=ClassificationFromClause classificationToClause=ClassificationToClause?) | 
	 *         (reclassifyAllClause=ReclassifyAllClause? classificationToClause=ClassificationToClause)
	 *     )
	 */
	protected void sequence_ClassificationClause(EObject context, ClassificationClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relationalExpressionCompletion=RelationalExpressionCompletion (operator=ClassificationOperator name=QualifiedName)?)
	 */
	protected void sequence_ClassificationExpressionCompletion(EObject context, ClassificationExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion)
	 */
	protected void sequence_ClassificationExpression(EObject context, ClassificationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassificationExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassificationExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassificationExpression_ClassificationExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassificationExpression_ClassificationExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassificationExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getClassificationExpressionAccess().getClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0(), semanticObject.getClassificationExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedNameList=QualifiedNameList
	 */
	protected void sequence_ClassificationFromClause(EObject context, ClassificationFromClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassificationFromClause_QualifiedNameList()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassificationFromClause_QualifiedNameList()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassificationFromClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0(), semanticObject.getQualifiedNameList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedNameList=QualifiedNameList
	 */
	protected void sequence_ClassificationToClause(EObject context, ClassificationToClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassificationToClause_QualifiedNameList()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassificationToClause_QualifiedNameList()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassificationToClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0(), semanticObject.getQualifiedNameList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name templateParameters=TemplateParameters? specializationClause=SpecializationClause?)
	 */
	protected void sequence_ClassifierSignature(EObject context, ClassifierSignature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=ML_COMMENT? name=Name qualifiedName=QualifiedName?)
	 */
	protected void sequence_ClassifierTemplateParameter(EObject context, ClassifierTemplateParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression classificationClause=ClassificationClause)
	 */
	protected void sequence_ClassifyStatement(EObject context, ClassifyStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassifyStatement_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassifyStatement_Expression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getClassifyStatement_ClassificationClause()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getClassifyStatement_ClassificationClause()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassifyStatementAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getClassifyStatementAccess().getClassificationClauseClassificationClauseParserRuleCall_2_0(), semanticObject.getClassificationClause());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Name name+=Name* (star?='*' | alias=AliasDefinition)?)
	 */
	protected void sequence_ColonQualifiedNameCompletionOfImportReference(EObject context, ColonQualifiedNameCompletionOfImportReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     names+=Name+
	 */
	protected void sequence_ColonQualifiedNameCompletionWithoutBinding(EObject context, ColonQualifiedNameCompletionWithoutBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     namedBindings+=NameBinding+
	 */
	protected void sequence_ColonQualifiedNameCompletion(EObject context, ColonQualifiedNameCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block acceptBlock+=AcceptBlock*)
	 */
	protected void sequence_CompoundAcceptStatementCompletion(EObject context, CompoundAcceptStatementCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nonFinalClause+=NonFinalClause nonFinalClause+=NonFinalClause*)
	 */
	protected void sequence_ConcurrentClauses(EObject context, ConcurrentClauses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion inclusiveOrExpression+=InclusiveOrExpression*)
	 */
	protected void sequence_ConditionalAndExpressionCompletion(EObject context, ConditionalAndExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion)
	 */
	protected void sequence_ConditionalAndExpression(EObject context, ConditionalAndExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getConditionalAndExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getConditionalAndExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getConditionalAndExpression_ConditionalAndExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getConditionalAndExpression_ConditionalAndExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalAndExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getConditionalAndExpressionAccess().getConditionalAndExpressionCompletionConditionalAndExpressionCompletionParserRuleCall_1_0(), semanticObject.getConditionalAndExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion (expression=Expression conditionalExpression=ConditionalExpression)?)
	 */
	protected void sequence_ConditionalExpressionCompletion(EObject context, ConditionalExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression conditionalExpressionCompletion=ConditionalExpressionCompletion)
	 */
	protected void sequence_ConditionalExpression(EObject context, ConditionalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getConditionalExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getConditionalExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getConditionalExpression_ConditionalExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getConditionalExpression_ConditionalExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getConditionalExpressionAccess().getConditionalExpressionCompletionConditionalExpressionCompletionParserRuleCall_1_0(), semanticObject.getConditionalExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (conditionalAndExpressionCompletion=ConditionalAndExpressionCompletion conditionalAndExpression+=ConditionalAndExpression*)
	 */
	protected void sequence_ConditionalOrExpressionCompletion(EObject context, ConditionalOrExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression conditionalOrExpressionCompletion=ConditionalOrExpressionCompletion)
	 */
	protected void sequence_ConditionalOrExpression(EObject context, ConditionalOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getConditionalOrExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getConditionalOrExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getConditionalOrExpression_ConditionalOrExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getConditionalOrExpression_ConditionalOrExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionalOrExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getConditionalOrExpressionAccess().getConditionalOrExpressionCompletionConditionalOrExpressionCompletionParserRuleCall_1_0(), semanticObject.getConditionalOrExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isAbstract?='abstract'? classifierSignature=ClassifierSignature)
	 */
	protected void sequence_DataTypeDeclaration(EObject context, DataTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dataTypeDeclaration=DataTypeDeclaration structureBody=StructuredBody?)
	 */
	protected void sequence_DataTypeDefinitionOrStub(EObject context, DataTypeDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dataTypeDeclaration=DataTypeDeclaration structureBody=StructuredBody)
	 */
	protected void sequence_DataTypeDefinition(EObject context, DataTypeDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getDataTypeDefinition_DataTypeDeclaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getDataTypeDefinition_DataTypeDeclaration()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getDataTypeDefinition_StructureBody()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getDataTypeDefinition_StructureBody()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeDefinitionAccess().getDataTypeDeclarationDataTypeDeclarationParserRuleCall_0_0(), semanticObject.getDataTypeDeclaration());
		feeder.accept(grammarAccess.getDataTypeDefinitionAccess().getStructureBodyStructuredBodyParserRuleCall_1_0(), semanticObject.getStructureBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block expression=Expression)
	 */
	protected void sequence_DoStatement(EObject context, DoStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getDoStatement_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getDoStatement_Block()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getDoStatement_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getDoStatement_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoStatementAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.accept(grammarAccess.getDoStatementAccess().getExpressionExpressionParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment=ML_COMMENT? statement=Statement)
	 */
	protected void sequence_DocumentedStatement(EObject context, DocumentedStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EmptyStatement}
	 */
	protected void sequence_EmptyStatement(EObject context, EmptyStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (enumerationLiteralName+=EnumerationLiteralName enumerationLiteralName+=EnumerationLiteralName*)
	 */
	protected void sequence_EnumerationBody(EObject context, EnumerationBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name specializationClause=SpecializationClause?)
	 */
	protected void sequence_EnumerationDeclaration(EObject context, EnumerationDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (enumerationDeclaration=EnumerationDeclaration enumerationBody=EnumerationBody?)
	 */
	protected void sequence_EnumerationDefinitionOrStub(EObject context, EnumerationDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (enumerationClause=EnumerationDeclaration enumerationBody=EnumerationBody)
	 */
	protected void sequence_EnumerationDefinition(EObject context, EnumerationDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getEnumerationDefinition_EnumerationClause()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getEnumerationDefinition_EnumerationClause()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getEnumerationDefinition_EnumerationBody()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getEnumerationDefinition_EnumerationBody()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerationDefinitionAccess().getEnumerationClauseEnumerationDeclarationParserRuleCall_0_0(), semanticObject.getEnumerationClause());
		feeder.accept(grammarAccess.getEnumerationDefinitionAccess().getEnumerationBodyEnumerationBodyParserRuleCall_1_0(), semanticObject.getEnumerationBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment=ML_COMMENT? name=Name)
	 */
	protected void sequence_EnumerationLiteralName(EObject context, EnumerationLiteralName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         classificationExpressionCompletion=ClassificationExpressionCompletion 
	 *         (operator+=EqualityOperator classificationExpression+=ClassificationExpression)*
	 *     )
	 */
	protected void sequence_EqualityExpressionCompletion(EObject context, EqualityExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression classificationExpressionCompletion=ClassificationExpressionCompletion)
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getEqualityExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getEqualityExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getEqualityExpression_ClassificationExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getEqualityExpression_ClassificationExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualityExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getEqualityExpressionAccess().getClassificationExpressionCompletionClassificationExpressionCompletionParserRuleCall_1_0(), semanticObject.getClassificationExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (andExpressionCompletion=AndExpressionCompletion andExpression+=AndExpression*)
	 */
	protected void sequence_ExclusiveOrExpressionCompletion(EObject context, ExclusiveOrExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion)
	 */
	protected void sequence_ExclusiveOrExpression(EObject context, ExclusiveOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getExclusiveOrExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getExclusiveOrExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getExclusiveOrExpression_ExclusiveOrExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getExclusiveOrExpression_ExclusiveOrExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExclusiveOrExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getExclusiveOrExpressionAccess().getExclusiveOrExpressionCompletionExclusiveOrExpressionCompletionParserRuleCall_1_0(), semanticObject.getExclusiveOrExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression expressionCompletion=ExpressionCompletion)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getExpression_ExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getExpression_ExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionCompletionExpressionCompletionParserRuleCall_1_0(), semanticObject.getExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tuple=Tuple
	 */
	protected void sequence_FeatureInvocation(EObject context, FeatureInvocation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getFeatureInvocation_Tuple()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getFeatureInvocation_Tuple()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureInvocationAccess().getTupleTupleParserRuleCall_0(), semanticObject.getTuple());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getFeature_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getFeature_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature=Feature featureInvocation=FeatureInvocation?) | 
	 *         sequenceOperationOrReductionOrExpansion=SequenceOperationOrReductionOrExpansion | 
	 *         index=Index
	 *     )
	 */
	protected void sequence_Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index(EObject context, Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_FinalClause(EObject context, FinalClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getFinalClause_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getFinalClause_Block()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFinalClauseAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (loopVariableDefinition+=LoopVariableDefinition loopVariableDefinition+=LoopVariableDefinition*)
	 */
	protected void sequence_ForControl(EObject context, ForControl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (forControl=ForControl block=Block)
	 */
	protected void sequence_ForStatement(EObject context, ForStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getForStatement_ForControl()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getForStatement_ForControl()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getForStatement_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getForStatement_Block()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForStatementAccess().getForControlForControlParserRuleCall_2_0(), semanticObject.getForControl());
		feeder.accept(grammarAccess.getForStatementAccess().getBlockBlockParserRuleCall_4_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (formalParameter+=FormalParameter formalParameter+=FormalParameter*)
	 */
	protected void sequence_FormalParameterList(EObject context, FormalParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=ML_COMMENT? stereotypeAnnotations=StereotypeAnnotations parameterDirection=ParameterDirection name=Name typePart=TypePart)
	 */
	protected void sequence_FormalParameter(EObject context, FormalParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (formalParameterList=FormalParameterList?)
	 */
	protected void sequence_FormalParameters(EObject context, FormalParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INTEGER_VALUE
	 */
	protected void sequence_INTEGER_LITERAL(EObject context, INTEGER_LITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getINTEGER_LITERALAccess().getValueINTEGER_VALUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sequentialClauses=SequentialClauses finalClause=FinalClause?)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=ImportVisibilityIndicator importReference=ImportReference)
	 */
	protected void sequence_ImportDeclaration(EObject context, ImportDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getImportDeclaration_Visibility()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getImportDeclaration_Visibility()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getImportDeclaration_ImportReference()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getImportDeclaration_ImportReference()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportDeclarationAccess().getVisibilityImportVisibilityIndicatorEnumRuleCall_0_0(), semanticObject.getVisibility());
		feeder.accept(grammarAccess.getImportDeclarationAccess().getImportReferenceImportReferenceParserRuleCall_2_0(), semanticObject.getImportReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name (completion=ImportReferenceQualifiedNameCompletion | alias=AliasDefinition | star?='*')?)
	 */
	protected void sequence_ImportReference(EObject context, ImportReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID name=Name)
	 */
	protected void sequence_InLineStatement(EObject context, InLineStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getInLineStatement_Id()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getInLineStatement_Id()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getInLineStatement_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getInLineStatement_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInLineStatementAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getInLineStatementAccess().getNameNameParserRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exclusiveOrExpressionCompletion=ExclusiveOrExpressionCompletion exclusiveOrExpression+=ExclusiveOrExpression*)
	 */
	protected void sequence_InclusiveOrExpressionCompletion(EObject context, InclusiveOrExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression inclusiveOrExpressionCompletion=InclusiveOrExpressionCompletion)
	 */
	protected void sequence_InclusiveOrExpression(EObject context, InclusiveOrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getInclusiveOrExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getInclusiveOrExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getInclusiveOrExpression_InclusiveOrExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getInclusiveOrExpression_InclusiveOrExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInclusiveOrExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getInclusiveOrExpressionAccess().getInclusiveOrExpressionCompletionInclusiveOrExpressionCompletionParserRuleCall_1_0(), semanticObject.getInclusiveOrExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Index(EObject context, Index semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getIndex_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getIndex_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIndexAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression indexedNamedExpression+=IndexedNamedExpression*)
	 */
	protected void sequence_IndexedNamedExpressionListCompletion(EObject context, IndexedNamedExpressionListCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name index=Index? expression=Expression)
	 */
	protected void sequence_IndexedNamedExpression(EObject context, IndexedNamedExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiedName=QualifiedName (sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion | tuple=Tuple))
	 */
	protected void sequence_InstanceCreationOrSequenceConstructionExpression(EObject context, InstanceCreationOrSequenceConstructionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     tuple=Tuple
	 */
	protected void sequence_InstanceInitializationExpression(EObject context, InstanceInitializationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getInstanceInitializationExpression_Tuple()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getInstanceInitializationExpression_Tuple()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceInitializationExpressionAccess().getTupleTupleParserRuleCall_1_0(), semanticObject.getTuple());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     unaryExpression=UnaryExpression
	 */
	protected void sequence_IsolationExpression(EObject context, IsolationExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getIsolationExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getIsolationExpression_UnaryExpression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIsolationExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_1_0(), semanticObject.getUnaryExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (linkOperation=LinkOperation linkOperationTuple=LinkOperationTuple)
	 */
	protected void sequence_LinkOperationCompletion(EObject context, LinkOperationCompletion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getLinkOperationCompletion_LinkOperation()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getLinkOperationCompletion_LinkOperation()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getLinkOperationCompletion_LinkOperationTuple()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getLinkOperationCompletion_LinkOperationTuple()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLinkOperationCompletionAccess().getLinkOperationLinkOperationEnumRuleCall_0_0(), semanticObject.getLinkOperation());
		feeder.accept(grammarAccess.getLinkOperationCompletionAccess().getLinkOperationTupleLinkOperationTupleParserRuleCall_1_0(), semanticObject.getLinkOperationTuple());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (
	 *                 name=Name 
	 *                 (
	 *                     (
	 *                         index=Index 
	 *                         (
	 *                             indexNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | 
	 *                             (primaryToExpressionCompletion=PrimaryToExpressionCompletion positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion)
	 *                         )
	 *                     ) | 
	 *                     indexedNamedExpressionListCompletion=IndexedNamedExpressionListCompletion | 
	 *                     positionalTupleExpressionListCompletion=PositionalTupleExpressionListCompletion | 
	 *                     (nameToExpressionCompletion=NameToExpressionCompletion positionalTupleExpressionList=PositionalTupleExpressionList)
	 *                 )
	 *             ) | 
	 *             positionalTupleExpressionList=PositionalTupleExpressionList
	 *         )?
	 *     )
	 */
	protected void sequence_LinkOperationTuple(EObject context, LinkOperationTuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=PRIMITIVE_LITERAL
	 */
	protected void sequence_LiteralExpression(EObject context, LiteralExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getLiteralExpression_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getLiteralExpression_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralExpressionAccess().getExpressionPRIMITIVE_LITERALParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             potentiallyAmbiguousName=QualifiedName 
	 *             (
	 *                 (multiplicaityIndicator=MultiplicityIndicator? name=Name localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion) | 
	 *                 nameToExpressionCompletion=NameToExpressionCompletion
	 *             )
	 *         ) | 
	 *         nonNameExpression=NonNameExpression
	 *     )
	 */
	protected void sequence_LocalNameDeclarationOrExpressionStatement(EObject context, LocalNameDeclarationOrExpressionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     initializationExpression=InitializationExpression
	 */
	protected void sequence_LocalNameDeclarationStatementCompletion(EObject context, LocalNameDeclarationStatementCompletion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getLocalNameDeclarationStatementCompletion_InitializationExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getLocalNameDeclarationStatementCompletion_InitializationExpression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalNameDeclarationStatementCompletionAccess().getInitializationExpressionInitializationExpressionParserRuleCall_1_0(), semanticObject.getInitializationExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name typeName=TypeName multiplicityIndicator=MultiplicityIndicator? localNameDeclarationCompletion=LocalNameDeclarationStatementCompletion)
	 */
	protected void sequence_LocalNameDeclarationStatement(EObject context, LocalNameDeclarationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=Name expression1=Expression expression2=Expression?) | (typeName=QualifiedName name=Name expression3=Expression))
	 */
	protected void sequence_LoopVariableDefinition(EObject context, LoopVariableDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator+=MultiplicativeOperator unaryExpression+=UnaryExpression)*)
	 */
	protected void sequence_MultiplicativeExpressionCompletion(EObject context, MultiplicativeExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression multiplicativeExpressionCompletion=MultiplicativeExpressionCompletion)
	 */
	protected void sequence_MultiplicativeExpression(EObject context, MultiplicativeExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getMultiplicativeExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getMultiplicativeExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getMultiplicativeExpression_MultiplicativeExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getMultiplicativeExpression_MultiplicativeExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionCompletionMultiplicativeExpressionCompletionParserRuleCall_1_0(), semanticObject.getMultiplicativeExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {MultiplicityIndicator}
	 */
	protected void sequence_MultiplicityIndicator(EObject context, MultiplicityIndicator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lower=INTEGER_LITERAL? upper=UnlimitedNaturalLiteral)
	 */
	protected void sequence_MultiplicityRange(EObject context, MultiplicityRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         multiplicityRange=MultiplicityRange? 
	 *         ((isOrdered?='ordered' isNonUnique?='nonunique'?) | (isNonUnique?='nonunique' isOrdered?='ordered'?) | isSequence?='sequence')?
	 *     )
	 */
	protected void sequence_Multiplicity(EObject context, Multiplicity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name templateBinding=TemplateBinding?)
	 */
	protected void sequence_NameBinding(EObject context, NameBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=Name name+=Name*)
	 */
	protected void sequence_NameList(EObject context, NameList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding nameToPrimaryExpression=NameToPrimaryExpression?)
	 */
	protected void sequence_NameOrPrimaryExpression(EObject context, NameOrPrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nameToPrimary=NameToPrimaryExpression? primaryToExpressionCompletion=PrimaryToExpressionCompletion)
	 */
	protected void sequence_NameToExpressionCompletion(EObject context, NameToExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         linkOperationCompletion=LinkOperationCompletion | 
	 *         classExtentExpressionCompletion=ClassExtentExpressionCompletion | 
	 *         sequenceConstructionCompletion=SequenceConstructionExpressionCompletion | 
	 *         behaviorInvocation=BehaviorInvocation
	 *     )
	 */
	protected void sequence_NameToPrimaryExpression(EObject context, NameToPrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getName_Id()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getName_Id()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name expression=Expression)
	 */
	protected void sequence_NamedExpression(EObject context, NamedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNamedExpression_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNamedExpression_Name()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNamedExpression_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNamedExpression_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamedExpressionAccess().getNameNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getNamedExpressionAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (templateParameterSubstitution+=TemplateParameterSubstitution templateParameterSubstitution+=TemplateParameterSubstitution*)
	 */
	protected void sequence_NamedTemplateBinding(EObject context, NamedTemplateBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namedExpression+=NamedExpression namedExpression+=NamedExpression*)
	 */
	protected void sequence_NamedTupleExpressionList(EObject context, NamedTupleExpressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedName=QualifiedName
	 */
	protected void sequence_NamespaceDeclaration(EObject context, NamespaceDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNamespaceDeclaration_QualifiedName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNamespaceDeclaration_QualifiedName()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceDeclarationAccess().getQualifiedNameQualifiedNameParserRuleCall_1_0(), semanticObject.getQualifiedName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statement+=DocumentedStatement+
	 */
	protected void sequence_NonEmptyStatementSequence(EObject context, NonEmptyStatementSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression block=Block)
	 */
	protected void sequence_NonFinalClause(EObject context, NonFinalClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNonFinalClause_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNonFinalClause_Expression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNonFinalClause_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNonFinalClause_Block()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNonFinalClauseAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getNonFinalClauseAccess().getBlockBlockParserRuleCall_3_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nonNameUnaryExpression=NonNameUnaryExpression expressionCompletion=ExpressionCompletion)
	 */
	protected void sequence_NonNameExpression(EObject context, NonNameExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNonNameExpression_NonNameUnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNonNameExpression_NonNameUnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNonNameExpression_ExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNonNameExpression_ExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNonNameExpressionAccess().getNonNameUnaryExpressionNonNameUnaryExpressionParserRuleCall_0_0(), semanticObject.getNonNameUnaryExpression());
		feeder.accept(grammarAccess.getNonNameExpressionAccess().getExpressionCompletionExpressionCompletionParserRuleCall_1_0(), semanticObject.getExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (any?='any' castCompletion=CastCompletion) | 
	 *         (
	 *             potentiallyAmbiguousQualifiedName=QualifiedNameWithoutBinding 
	 *             (
	 *                 (castCompletion=CastCompletion | postifixExpressionCompletion=PostfixExpressionCompletion)? | 
	 *                 (nameToExpressionCompletion=NameToExpressionCompletion postfixExpressionCompletion=PostfixExpressionCompletion?)
	 *             )
	 *         ) | 
	 *         (nonNameExpression=NonNameExpression postfixExpressionCompletion=PostfixExpressionCompletion?) | 
	 *         (baseExpression=BaseExpression postfixExpressionCompletion=PostfixExpressionCompletion?)
	 *     )
	 */
	protected void sequence_NonNamePostfixOrCastExpression(EObject context, NonNamePostfixOrCastExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=NumericUnaryOperator unaryExpression=UnaryExpression)
	 */
	protected void sequence_NumericUnaryExpression(EObject context, NumericUnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNumericUnaryExpression_Operator()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNumericUnaryExpression_Operator()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getNumericUnaryExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getNumericUnaryExpression_UnaryExpression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumericUnaryExpressionAccess().getOperatorNumericUnaryOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getNumericUnaryExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_1_0(), semanticObject.getUnaryExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     bodydefinition=Block
	 */
	protected void sequence_OpaqueBehaviorBody(EObject context, OpaqueBehaviorBody semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getOpaqueBehaviorBody_Bodydefinition()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getOpaqueBehaviorBody_Bodydefinition()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpaqueBehaviorBodyAccess().getBodydefinitionBlockParserRuleCall_0(), semanticObject.getBodydefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isAbstract?='abstract'? name=Name formalParameters=FormalParameters typePart=TypePart? redefinitionClause=RedefinitionClause?)
	 */
	protected void sequence_OperationDeclaration(EObject context, OperationDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isAbstract?='abstract'? 
	 *         name=Name 
	 *         formalParameters=FormalParameters 
	 *         typePart=TypePart? 
	 *         redefinitionClause=RedefinitionClause? 
	 *         block=Block?
	 *     )
	 */
	protected void sequence_OperationDeclaration_OperationDefinitionOrStub(EObject context, OperationDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packagedElement+=PackagedElement*)
	 */
	protected void sequence_PackageBody(EObject context, PackageBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Name
	 */
	protected void sequence_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPackageDeclaration_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPackageDeclaration_Name()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDeclarationAccess().getNameNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (declaration=PackageDeclaration body=PackageBody?)
	 */
	protected void sequence_PackageDefinitionOrStub(EObject context, PackageDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration=PackageDeclaration body=PackageBody)
	 */
	protected void sequence_PackageDefinition(EObject context, PackageDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPackageDefinition_Declaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPackageDefinition_Declaration()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPackageDefinition_Body()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPackageDefinition_Body()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageDefinitionAccess().getDeclarationPackageDeclarationParserRuleCall_0_0(), semanticObject.getDeclaration());
		feeder.accept(grammarAccess.getPackageDefinitionAccess().getBodyPackageBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         comment=ML_COMMENT? 
	 *         stereotypeAnnotations=StereotypeAnnotations 
	 *         importVisibilityIndicator=ImportVisibilityIndicator 
	 *         packagedElementDefinition=PackagedElementDefinition
	 *     )
	 */
	protected void sequence_PackagedElement(EObject context, PackagedElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ParenthesizedExpression(EObject context, ParenthesizedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getParenthesizedExpression_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getParenthesizedExpression_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParenthesizedExpressionAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiedName+=QualifiedName qualifiedName+=QualifiedName*)
	 */
	protected void sequence_PositionalTemplateBinding(EObject context, PositionalTemplateBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=Expression*)
	 */
	protected void sequence_PositionalTupleExpressionListCompletion(EObject context, PositionalTupleExpressionListCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=Expression expression+=Expression*)
	 */
	protected void sequence_PositionalTupleExpressionList(EObject context, PositionalTupleExpressionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((primaryExpressionCompletion=PrimaryExpressionCompletion postfixOperation=PostfixOperation?) | postfixOperation=PostfixOperation)
	 */
	protected void sequence_PostfixExpressionCompletion(EObject context, PostfixExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     operator=AffixOperator
	 */
	protected void sequence_PostfixOperation(EObject context, PostfixOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPostfixOperation_Operator()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPostfixOperation_Operator()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPostfixOperationAccess().getOperatorAffixOperatorEnumRuleCall_0(), semanticObject.getOperator());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         nonNamePostfixOrCastExpression=NonNamePostfixOrCastExpression | 
	 *         (nameOrPrimaryExpression=NameOrPrimaryExpression postFixExpressionCompletion=PostfixExpressionCompletion?)
	 *     )
	 */
	protected void sequence_PostfixOrCastExpression(EObject context, PostfixOrCastExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=AffixOperator primaryExpression=PrimaryExpression)
	 */
	protected void sequence_PrefixExpression(EObject context, PrefixExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPrefixExpression_Operator()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPrefixExpression_Operator()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPrefixExpression_PrimaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPrefixExpression_PrimaryExpression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrefixExpressionAccess().getOperatorAffixOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getPrefixExpressionAccess().getPrimaryExpressionPrimaryExpressionParserRuleCall_1_0(), semanticObject.getPrimaryExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     content+=Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index+
	 */
	protected void sequence_PrimaryExpressionCompletion(EObject context, PrimaryExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (nameOrPrimaryExpression=NameOrPrimaryExpression | baseExpression=BaseExpression | parenthesizedExpression=ParenthesizedExpression) 
	 *         primaryExpressionCompletion=PrimaryExpressionCompletion?
	 *     )
	 */
	protected void sequence_PrimaryExpression(EObject context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (postFixExpressionCompletion=PostfixExpressionCompletion? expressionCompletion=ExpressionCompletion)
	 */
	protected void sequence_PrimaryToExpressionCompletion(EObject context, PrimaryToExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name isComposite?='compose'? typePart=TypePart)
	 */
	protected void sequence_PropertyDeclaration(EObject context, PropertyDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     propertyDeclaration=PropertyDeclaration
	 */
	protected void sequence_PropertyDefinition(EObject context, PropertyDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPropertyDefinition_PropertyDeclaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPropertyDefinition_PropertyDeclaration()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyDefinitionAccess().getPropertyDeclarationPropertyDeclarationParserRuleCall_0_0(), semanticObject.getPropertyDeclaration());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiedName+=QualifiedName qualifiedName+=QualifiedName*)
	 */
	protected void sequence_QualifiedNameList(EObject context, QualifiedNameList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unqualified=Name nameCompletion=ColonQualifiedNameCompletionWithoutBinding?)
	 */
	protected void sequence_QualifiedNameWithoutBinding(EObject context, QualifiedNameWithoutBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unqualified=UnqualifiedName nameCompletion=ColonQualifiedNameCompletion?)
	 */
	protected void sequence_QualifiedName(EObject context, QualifiedName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     receptionName=QualifiedName
	 */
	protected void sequence_ReceptionDefinition(EObject context, ReceptionDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getReceptionDefinition_ReceptionName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getReceptionDefinition_ReceptionName()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReceptionDefinitionAccess().getReceptionNameQualifiedNameParserRuleCall_1_0(), semanticObject.getReceptionName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ReclassifyAllClause}
	 */
	protected void sequence_ReclassifyAllClause(EObject context, ReclassifyAllClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedNameList=QualifiedNameList
	 */
	protected void sequence_RedefinitionClause(EObject context, RedefinitionClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getRedefinitionClause_QualifiedNameList()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getRedefinitionClause_QualifiedNameList()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRedefinitionClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0(), semanticObject.getQualifiedNameList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (shiftExpressionCompletion=ShiftExpressionCompletion (relationalOperator=RelationalOperator shiftExpression=ShiftExpression)?)
	 */
	protected void sequence_RelationalExpressionCompletion(EObject context, RelationalExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression relationalExpressionCompletion=RelationalExpressionCompletion)
	 */
	protected void sequence_RelationalExpression(EObject context, RelationalExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getRelationalExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getRelationalExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getRelationalExpression_RelationalExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getRelationalExpression_RelationalExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationalExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getRelationalExpressionAccess().getRelationalExpressionCompletionRelationalExpressionCompletionParserRuleCall_1_0(), semanticObject.getRelationalExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression?)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_STRING_LITERAL(EObject context, STRING_LITERAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSTRING_LITERALAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (sequenceConstructionExpressionCompletion=SequenceConstructionExpressionCompletion?)
	 */
	protected void sequence_SequenceAnyExpression(EObject context, SequenceAnyExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (multiplicityIndicator=MultiplicityIndicator? sequenceElements=SequenceElements?)
	 */
	protected void sequence_SequenceConstructionExpressionCompletion(EObject context, SequenceConstructionExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sequenceElement+=SequenceElement*)
	 */
	protected void sequence_SequenceElementListCompletion(EObject context, SequenceElementListCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression | sequenceInitializationExpression=SequenceInitializationExpression)
	 */
	protected void sequence_SequenceElement(EObject context, SequenceElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (expression1=Expression (expression2=Expression | sequenceElementListCompletion=SequenceElementListCompletion)) | 
	 *         (sequenceInitializationExpression=SequenceInitializationExpression sequenceElementListCompletion=SequenceElementListCompletion)
	 *     )
	 */
	protected void sequence_SequenceElements(EObject context, SequenceElements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isNew?='new'? sequenceElements=SequenceElements)
	 */
	protected void sequence_SequenceInitializationExpression(EObject context, SequenceInitializationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (qualifiedName=QualifiedName tuple=Tuple) | 
	 *         (isReduce?='reduce' isOrdered?='ordered'? qualifiedName=QualifiedNameWithoutBinding templateBinding=TemplateBinding?) | 
	 *         (id=ID name=Name expression=Expression)
	 *     )
	 */
	protected void sequence_SequenceOperationOrReductionOrExpansion(EObject context, SequenceOperationOrReductionOrExpansion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (concurrentClauses+=ConcurrentClauses concurrentClauses+=ConcurrentClauses*)
	 */
	protected void sequence_SequentialClauses(EObject context, SequentialClauses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (additiveExpressionCompletion=AdditiveExpressionCompletion (operator+=ShiftOperator additiveExpression+=AdditiveExpression)*)
	 */
	protected void sequence_ShiftExpressionCompletion(EObject context, ShiftExpressionCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unaryExpression=UnaryExpression shiftExpressionCompletion=ShiftExpressionCompletion)
	 */
	protected void sequence_ShiftExpression(EObject context, ShiftExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getShiftExpression_UnaryExpression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getShiftExpression_UnaryExpression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getShiftExpression_ShiftExpressionCompletion()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getShiftExpression_ShiftExpressionCompletion()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShiftExpressionAccess().getUnaryExpressionUnaryExpressionParserRuleCall_0_0(), semanticObject.getUnaryExpression());
		feeder.accept(grammarAccess.getShiftExpressionAccess().getShiftExpressionCompletionShiftExpressionCompletionParserRuleCall_1_0(), semanticObject.getShiftExpressionCompletion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (isAbstract?='abstract'? classifierSignature=ClassifierSignature)
	 */
	protected void sequence_SignalDeclaration(EObject context, SignalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signalDeclaration=SignalDeclaration structuredBody=StructuredBody?)
	 */
	protected void sequence_SignalDefinitionOrStub(EObject context, SignalDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signalDeclaration=SignalDeclaration structuredBody=StructuredBody)
	 */
	protected void sequence_SignalDefinition(EObject context, SignalDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getSignalDefinition_SignalDeclaration()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getSignalDefinition_SignalDeclaration()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getSignalDefinition_StructuredBody()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getSignalDefinition_StructuredBody()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSignalDefinitionAccess().getSignalDeclarationSignalDeclarationParserRuleCall_0_0(), semanticObject.getSignalDeclaration());
		feeder.accept(grammarAccess.getSignalDefinitionAccess().getStructuredBodyStructuredBodyParserRuleCall_1_0(), semanticObject.getStructuredBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (signalName=Name specializationClause=SpecializationClause?)
	 */
	protected void sequence_SignalReceptionDeclaration(EObject context, SignalReceptionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signalReceptionOrDeclaration=SignalReceptionDeclaration structuredBody=StructuredBody?)
	 */
	protected void sequence_SignalReceptionDefinitionOrStub(EObject context, SignalReceptionDefinitionOrStub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SimpleAcceptStatementCompletion}
	 */
	protected void sequence_SimpleAcceptStatementCompletion(EObject context, SimpleAcceptStatementCompletion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qualifiedNameList=QualifiedNameList
	 */
	protected void sequence_SpecializationClause(EObject context, SpecializationClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getSpecializationClause_QualifiedNameList()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getSpecializationClause_QualifiedNameList()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSpecializationClauseAccess().getQualifiedNameListQualifiedNameListParserRuleCall_1_0(), semanticObject.getQualifiedNameList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (documentStatement+=DocumentedStatement*)
	 */
	protected void sequence_StatementSequence(EObject context, StatementSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotypeName=QualifiedName taggedValues=TaggedValues?)
	 */
	protected void sequence_StereotypeAnnotation(EObject context, StereotypeAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=StereotypeAnnotation*)
	 */
	protected void sequence_StereotypeAnnotations(EObject context, StereotypeAnnotations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (structuredMember+=StructuredMember*)
	 */
	protected void sequence_StructuredBody(EObject context, StructuredBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=ML_COMMENT? streotypeAnnotations=StereotypeAnnotations isPublic?='public'? propertyDefinition=PropertyDefinition)
	 */
	protected void sequence_StructuredMember(EObject context, StructuredMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiedName=QualifiedName? tuple=Tuple)
	 */
	protected void sequence_SuperInvocationExpression(EObject context, SuperInvocationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_SwitchCase(EObject context, SwitchCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getSwitchCase_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getSwitchCase_Expression()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchCaseAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (switchCase+=SwitchCase switchCase+=SwitchCase* statementSequence=NonEmptyStatementSequence)
	 */
	protected void sequence_SwitchClause(EObject context, SwitchClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statementSequence=NonEmptyStatementSequence
	 */
	protected void sequence_SwitchDefaultClause(EObject context, SwitchDefaultClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getSwitchDefaultClause_StatementSequence()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getSwitchDefaultClause_StatementSequence()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchDefaultClauseAccess().getStatementSequenceNonEmptyStatementSequenceParserRuleCall_2_0(), semanticObject.getStatementSequence());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression switchClause+=SwitchClause* defaultClause=SwitchDefaultClause?)
	 */
	protected void sequence_SwitchStatement(EObject context, SwitchStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (taggedValue+=TaggedValue taggedValue+=TaggedValue*)
	 */
	protected void sequence_TaggedValueList(EObject context, TaggedValueList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name value=PRIMITIVE_LITERAL)
	 */
	protected void sequence_TaggedValue(EObject context, TaggedValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getTaggedValue_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getTaggedValue_Name()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getTaggedValue_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getTaggedValue_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTaggedValueAccess().getNameNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTaggedValueAccess().getValuePRIMITIVE_LITERALParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name qualifiedName=QualifiedName)
	 */
	protected void sequence_TemplateParameterSubstitution(EObject context, TemplateParameterSubstitution semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getTemplateParameterSubstitution_Name()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getTemplateParameterSubstitution_Name()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getTemplateParameterSubstitution_QualifiedName()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getTemplateParameterSubstitution_QualifiedName()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTemplateParameterSubstitutionAccess().getNameNameParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTemplateParameterSubstitutionAccess().getQualifiedNameQualifiedNameParserRuleCall_2_0(), semanticObject.getQualifiedName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classifierTemplateParameter+=ClassifierTemplateParameter classifierTemplateParameter+=ClassifierTemplateParameter*)
	 */
	protected void sequence_TemplateParameters(EObject context, TemplateParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tuple=Tuple?)
	 */
	protected void sequence_ThisExpression(EObject context, ThisExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((namedTupleExpressionList=NamedTupleExpressionList | positionalTupleExpressionList=PositionalTupleExpressionList)?)
	 */
	protected void sequence_Tuple(EObject context, Tuple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiedName=QualifiedName | any?='any')
	 */
	protected void sequence_TypeName(EObject context, TypeName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeName=TypeName multiplicity=Multiplicity?)
	 */
	protected void sequence_TypePart(EObject context, TypePart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value='*'
	 */
	protected void sequence_UNLIMITED_NATURAL(EObject context, UNLIMITED_NATURAL semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getPRIMITIVE_LITERAL_Value()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUNLIMITED_NATURALAccess().getValueAsteriskKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         namespaceDeclaration=NamespaceDeclaration? 
	 *         importDeclarations+=ImportDeclaration* 
	 *         comment=ML_COMMENT? 
	 *         stereotypeAnnotations=StereotypeAnnotations 
	 *         namesapceDefinition=NamespaceDefinition
	 *     )
	 */
	protected void sequence_UnitDefinition(EObject context, UnitDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (integer=INTEGER_LITERAL | star?='*')
	 */
	protected void sequence_UnlimitedNaturalLiteral(EObject context, UnlimitedNaturalLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (PUBLIC='public' | PRIVATE='private' | PROTECTED='protected')
	 */
	protected void sequence_VisibilityIndicator(EObject context, VisibilityIndicator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression block=Block)
	 */
	protected void sequence_WhileStatement(EObject context, WhileStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getWhileStatement_Expression()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getWhileStatement_Expression()));
			if(transientValues.isValueTransient(semanticObject, AlfPackage.eINSTANCE.getWhileStatement_Block()) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlfPackage.eINSTANCE.getWhileStatement_Block()));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileStatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getWhileStatementAccess().getBlockBlockParserRuleCall_4_0(), semanticObject.getBlock());
		feeder.finish();
	}
}
