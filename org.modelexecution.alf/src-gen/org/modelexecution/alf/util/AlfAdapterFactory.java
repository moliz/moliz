/**
 */
package org.modelexecution.alf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.modelexecution.alf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.modelexecution.alf.AlfPackage
 * @generated
 */
public class AlfAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlfPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlfAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AlfPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlfSwitch<Adapter> modelSwitch =
    new AlfSwitch<Adapter>()
    {
      @Override
      public Adapter caseOpaqueBehaviorBody(OpaqueBehaviorBody object)
      {
        return createOpaqueBehaviorBodyAdapter();
      }
      @Override
      public Adapter caseUnitDefinition(UnitDefinition object)
      {
        return createUnitDefinitionAdapter();
      }
      @Override
      public Adapter caseBOOLEAN_LITERAL(BOOLEAN_LITERAL object)
      {
        return createBOOLEAN_LITERALAdapter();
      }
      @Override
      public Adapter caseNUMBER_LITERAL(NUMBER_LITERAL object)
      {
        return createNUMBER_LITERALAdapter();
      }
      @Override
      public Adapter caseINTEGER_LITERAL(INTEGER_LITERAL object)
      {
        return createINTEGER_LITERALAdapter();
      }
      @Override
      public Adapter caseUNLIMITED_NATURAL(UNLIMITED_NATURAL object)
      {
        return createUNLIMITED_NATURALAdapter();
      }
      @Override
      public Adapter caseSTRING_LITERAL(STRING_LITERAL object)
      {
        return createSTRING_LITERALAdapter();
      }
      @Override
      public Adapter caseStereotypeAnnotations(StereotypeAnnotations object)
      {
        return createStereotypeAnnotationsAdapter();
      }
      @Override
      public Adapter caseStereotypeAnnotation(StereotypeAnnotation object)
      {
        return createStereotypeAnnotationAdapter();
      }
      @Override
      public Adapter caseTaggedValues(TaggedValues object)
      {
        return createTaggedValuesAdapter();
      }
      @Override
      public Adapter caseTaggedValueList(TaggedValueList object)
      {
        return createTaggedValueListAdapter();
      }
      @Override
      public Adapter casePRIMITIVE_LITERAL(PRIMITIVE_LITERAL object)
      {
        return createPRIMITIVE_LITERALAdapter();
      }
      @Override
      public Adapter caseTaggedValue(TaggedValue object)
      {
        return createTaggedValueAdapter();
      }
      @Override
      public Adapter caseNamespaceDeclaration(NamespaceDeclaration object)
      {
        return createNamespaceDeclarationAdapter();
      }
      @Override
      public Adapter caseImportDeclaration(ImportDeclaration object)
      {
        return createImportDeclarationAdapter();
      }
      @Override
      public Adapter caseImportReference(ImportReference object)
      {
        return createImportReferenceAdapter();
      }
      @Override
      public Adapter caseImportReferenceQualifiedNameCompletion(ImportReferenceQualifiedNameCompletion object)
      {
        return createImportReferenceQualifiedNameCompletionAdapter();
      }
      @Override
      public Adapter caseColonQualifiedNameCompletionOfImportReference(ColonQualifiedNameCompletionOfImportReference object)
      {
        return createColonQualifiedNameCompletionOfImportReferenceAdapter();
      }
      @Override
      public Adapter caseAliasDefinition(AliasDefinition object)
      {
        return createAliasDefinitionAdapter();
      }
      @Override
      public Adapter caseNamespaceDefinition(NamespaceDefinition object)
      {
        return createNamespaceDefinitionAdapter();
      }
      @Override
      public Adapter caseVisibilityIndicator(VisibilityIndicator object)
      {
        return createVisibilityIndicatorAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter casePackageDefinition(PackageDefinition object)
      {
        return createPackageDefinitionAdapter();
      }
      @Override
      public Adapter casePackageDefinitionOrStub(PackageDefinitionOrStub object)
      {
        return createPackageDefinitionOrStubAdapter();
      }
      @Override
      public Adapter casePackageBody(PackageBody object)
      {
        return createPackageBodyAdapter();
      }
      @Override
      public Adapter casePackagedElement(PackagedElement object)
      {
        return createPackagedElementAdapter();
      }
      @Override
      public Adapter casePackagedElementDefinition(PackagedElementDefinition object)
      {
        return createPackagedElementDefinitionAdapter();
      }
      @Override
      public Adapter caseClassifierDefinition(ClassifierDefinition object)
      {
        return createClassifierDefinitionAdapter();
      }
      @Override
      public Adapter caseClassifierDefinitionOrStub(ClassifierDefinitionOrStub object)
      {
        return createClassifierDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseClassifierSignature(ClassifierSignature object)
      {
        return createClassifierSignatureAdapter();
      }
      @Override
      public Adapter caseTemplateParameters(TemplateParameters object)
      {
        return createTemplateParametersAdapter();
      }
      @Override
      public Adapter caseClassifierTemplateParameter(ClassifierTemplateParameter object)
      {
        return createClassifierTemplateParameterAdapter();
      }
      @Override
      public Adapter caseSpecializationClause(SpecializationClause object)
      {
        return createSpecializationClauseAdapter();
      }
      @Override
      public Adapter caseClassDeclaration(ClassDeclaration object)
      {
        return createClassDeclarationAdapter();
      }
      @Override
      public Adapter caseClassDefinition(ClassDefinition object)
      {
        return createClassDefinitionAdapter();
      }
      @Override
      public Adapter caseClassDefinitionOrStub(ClassDefinitionOrStub object)
      {
        return createClassDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseClassBody(ClassBody object)
      {
        return createClassBodyAdapter();
      }
      @Override
      public Adapter caseClassMember(ClassMember object)
      {
        return createClassMemberAdapter();
      }
      @Override
      public Adapter caseClassMemberDefinition(ClassMemberDefinition object)
      {
        return createClassMemberDefinitionAdapter();
      }
      @Override
      public Adapter caseActiveClassDeclaration(ActiveClassDeclaration object)
      {
        return createActiveClassDeclarationAdapter();
      }
      @Override
      public Adapter caseActiveClassDefinition(ActiveClassDefinition object)
      {
        return createActiveClassDefinitionAdapter();
      }
      @Override
      public Adapter caseActiveClassDefinitionOrStub(ActiveClassDefinitionOrStub object)
      {
        return createActiveClassDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseActiveClassBody(ActiveClassBody object)
      {
        return createActiveClassBodyAdapter();
      }
      @Override
      public Adapter caseBehaviorClause(BehaviorClause object)
      {
        return createBehaviorClauseAdapter();
      }
      @Override
      public Adapter caseActiveClassMember(ActiveClassMember object)
      {
        return createActiveClassMemberAdapter();
      }
      @Override
      public Adapter caseActiveClassMemberDefinition(ActiveClassMemberDefinition object)
      {
        return createActiveClassMemberDefinitionAdapter();
      }
      @Override
      public Adapter caseDataTypeDeclaration(DataTypeDeclaration object)
      {
        return createDataTypeDeclarationAdapter();
      }
      @Override
      public Adapter caseDataTypeDefinition(DataTypeDefinition object)
      {
        return createDataTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseDataTypeDefinitionOrStub(DataTypeDefinitionOrStub object)
      {
        return createDataTypeDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseStructuredBody(StructuredBody object)
      {
        return createStructuredBodyAdapter();
      }
      @Override
      public Adapter caseStructuredMember(StructuredMember object)
      {
        return createStructuredMemberAdapter();
      }
      @Override
      public Adapter caseAssociationDeclaration(AssociationDeclaration object)
      {
        return createAssociationDeclarationAdapter();
      }
      @Override
      public Adapter caseAssociationDefinition(AssociationDefinition object)
      {
        return createAssociationDefinitionAdapter();
      }
      @Override
      public Adapter caseAssociationDefinitionOrStub(AssociationDefinitionOrStub object)
      {
        return createAssociationDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseEnumerationDeclaration(EnumerationDeclaration object)
      {
        return createEnumerationDeclarationAdapter();
      }
      @Override
      public Adapter caseEnumerationDefinition(EnumerationDefinition object)
      {
        return createEnumerationDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumerationDefinitionOrStub(EnumerationDefinitionOrStub object)
      {
        return createEnumerationDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseEnumerationBody(EnumerationBody object)
      {
        return createEnumerationBodyAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteralName(EnumerationLiteralName object)
      {
        return createEnumerationLiteralNameAdapter();
      }
      @Override
      public Adapter caseSignalDeclaration(SignalDeclaration object)
      {
        return createSignalDeclarationAdapter();
      }
      @Override
      public Adapter caseSignalDefinition(SignalDefinition object)
      {
        return createSignalDefinitionAdapter();
      }
      @Override
      public Adapter caseSignalDefinitionOrStub(SignalDefinitionOrStub object)
      {
        return createSignalDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseActivityDeclaration(ActivityDeclaration object)
      {
        return createActivityDeclarationAdapter();
      }
      @Override
      public Adapter caseActivityDefinition(ActivityDefinition object)
      {
        return createActivityDefinitionAdapter();
      }
      @Override
      public Adapter caseActivityDefinitionOrStub(ActivityDefinitionOrStub object)
      {
        return createActivityDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseFormalParameters(FormalParameters object)
      {
        return createFormalParametersAdapter();
      }
      @Override
      public Adapter caseFormalParameterList(FormalParameterList object)
      {
        return createFormalParameterListAdapter();
      }
      @Override
      public Adapter caseFormalParameter(FormalParameter object)
      {
        return createFormalParameterAdapter();
      }
      @Override
      public Adapter caseFeatureDefinitionOrStub(FeatureDefinitionOrStub object)
      {
        return createFeatureDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseActiveFeatureDefinitionOrStub(ActiveFeatureDefinitionOrStub object)
      {
        return createActiveFeatureDefinitionOrStubAdapter();
      }
      @Override
      public Adapter casePropertyDefinition(PropertyDefinition object)
      {
        return createPropertyDefinitionAdapter();
      }
      @Override
      public Adapter caseAttributeDefinition(AttributeDefinition object)
      {
        return createAttributeDefinitionAdapter();
      }
      @Override
      public Adapter caseAttributeInitializer(AttributeInitializer object)
      {
        return createAttributeInitializerAdapter();
      }
      @Override
      public Adapter casePropertyDeclaration(PropertyDeclaration object)
      {
        return createPropertyDeclarationAdapter();
      }
      @Override
      public Adapter caseTypePart(TypePart object)
      {
        return createTypePartAdapter();
      }
      @Override
      public Adapter caseTypeName(TypeName object)
      {
        return createTypeNameAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter caseMultiplicityRange(MultiplicityRange object)
      {
        return createMultiplicityRangeAdapter();
      }
      @Override
      public Adapter caseUnlimitedNaturalLiteral(UnlimitedNaturalLiteral object)
      {
        return createUnlimitedNaturalLiteralAdapter();
      }
      @Override
      public Adapter caseOperationDeclaration(OperationDeclaration object)
      {
        return createOperationDeclarationAdapter();
      }
      @Override
      public Adapter caseOperationDefinitionOrStub(OperationDefinitionOrStub object)
      {
        return createOperationDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseRedefinitionClause(RedefinitionClause object)
      {
        return createRedefinitionClauseAdapter();
      }
      @Override
      public Adapter caseReceptionDefinition(ReceptionDefinition object)
      {
        return createReceptionDefinitionAdapter();
      }
      @Override
      public Adapter caseSignalReceptionDeclaration(SignalReceptionDeclaration object)
      {
        return createSignalReceptionDeclarationAdapter();
      }
      @Override
      public Adapter caseSignalReceptionDefinitionOrStub(SignalReceptionDefinitionOrStub object)
      {
        return createSignalReceptionDefinitionOrStubAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseQualifiedName(QualifiedName object)
      {
        return createQualifiedNameAdapter();
      }
      @Override
      public Adapter caseColonQualifiedNameCompletion(ColonQualifiedNameCompletion object)
      {
        return createColonQualifiedNameCompletionAdapter();
      }
      @Override
      public Adapter caseUnqualifiedName(UnqualifiedName object)
      {
        return createUnqualifiedNameAdapter();
      }
      @Override
      public Adapter caseNameBinding(NameBinding object)
      {
        return createNameBindingAdapter();
      }
      @Override
      public Adapter caseQualifiedNameWithoutBinding(QualifiedNameWithoutBinding object)
      {
        return createQualifiedNameWithoutBindingAdapter();
      }
      @Override
      public Adapter caseColonQualifiedNameCompletionWithoutBinding(ColonQualifiedNameCompletionWithoutBinding object)
      {
        return createColonQualifiedNameCompletionWithoutBindingAdapter();
      }
      @Override
      public Adapter caseTemplateBinding(TemplateBinding object)
      {
        return createTemplateBindingAdapter();
      }
      @Override
      public Adapter casePositionalTemplateBinding(PositionalTemplateBinding object)
      {
        return createPositionalTemplateBindingAdapter();
      }
      @Override
      public Adapter caseNamedTemplateBinding(NamedTemplateBinding object)
      {
        return createNamedTemplateBindingAdapter();
      }
      @Override
      public Adapter caseTemplateParameterSubstitution(TemplateParameterSubstitution object)
      {
        return createTemplateParameterSubstitutionAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseNonNameExpression(NonNameExpression object)
      {
        return createNonNameExpressionAdapter();
      }
      @Override
      public Adapter caseNameToExpressionCompletion(NameToExpressionCompletion object)
      {
        return createNameToExpressionCompletionAdapter();
      }
      @Override
      public Adapter casePrimaryToExpressionCompletion(PrimaryToExpressionCompletion object)
      {
        return createPrimaryToExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseExpressionCompletion(ExpressionCompletion object)
      {
        return createExpressionCompletionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseBaseExpression(BaseExpression object)
      {
        return createBaseExpressionAdapter();
      }
      @Override
      public Adapter caseNameToPrimaryExpression(NameToPrimaryExpression object)
      {
        return createNameToPrimaryExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpressionCompletion(PrimaryExpressionCompletion object)
      {
        return createPrimaryExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index(Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index object)
      {
        return createFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexAdapter();
      }
      @Override
      public Adapter caseLiteralExpression(LiteralExpression object)
      {
        return createLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseNameOrPrimaryExpression(NameOrPrimaryExpression object)
      {
        return createNameOrPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseThisExpression(ThisExpression object)
      {
        return createThisExpressionAdapter();
      }
      @Override
      public Adapter caseParenthesizedExpression(ParenthesizedExpression object)
      {
        return createParenthesizedExpressionAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseTuple(Tuple object)
      {
        return createTupleAdapter();
      }
      @Override
      public Adapter casePositionalTupleExpressionList(PositionalTupleExpressionList object)
      {
        return createPositionalTupleExpressionListAdapter();
      }
      @Override
      public Adapter casePositionalTupleExpressionListCompletion(PositionalTupleExpressionListCompletion object)
      {
        return createPositionalTupleExpressionListCompletionAdapter();
      }
      @Override
      public Adapter caseNamedTupleExpressionList(NamedTupleExpressionList object)
      {
        return createNamedTupleExpressionListAdapter();
      }
      @Override
      public Adapter caseNamedExpression(NamedExpression object)
      {
        return createNamedExpressionAdapter();
      }
      @Override
      public Adapter caseBehaviorInvocation(BehaviorInvocation object)
      {
        return createBehaviorInvocationAdapter();
      }
      @Override
      public Adapter caseFeatureInvocation(FeatureInvocation object)
      {
        return createFeatureInvocationAdapter();
      }
      @Override
      public Adapter caseSuperInvocationExpression(SuperInvocationExpression object)
      {
        return createSuperInvocationExpressionAdapter();
      }
      @Override
      public Adapter caseInstanceCreationOrSequenceConstructionExpression(InstanceCreationOrSequenceConstructionExpression object)
      {
        return createInstanceCreationOrSequenceConstructionExpressionAdapter();
      }
      @Override
      public Adapter caseLinkOperationCompletion(LinkOperationCompletion object)
      {
        return createLinkOperationCompletionAdapter();
      }
      @Override
      public Adapter caseLinkOperationTuple(LinkOperationTuple object)
      {
        return createLinkOperationTupleAdapter();
      }
      @Override
      public Adapter caseIndexedNamedExpressionListCompletion(IndexedNamedExpressionListCompletion object)
      {
        return createIndexedNamedExpressionListCompletionAdapter();
      }
      @Override
      public Adapter caseIndexedNamedExpression(IndexedNamedExpression object)
      {
        return createIndexedNamedExpressionAdapter();
      }
      @Override
      public Adapter caseClassExtentExpressionCompletion(ClassExtentExpressionCompletion object)
      {
        return createClassExtentExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseSequenceAnyExpression(SequenceAnyExpression object)
      {
        return createSequenceAnyExpressionAdapter();
      }
      @Override
      public Adapter caseSequenceConstructionExpressionCompletion(SequenceConstructionExpressionCompletion object)
      {
        return createSequenceConstructionExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseMultiplicityIndicator(MultiplicityIndicator object)
      {
        return createMultiplicityIndicatorAdapter();
      }
      @Override
      public Adapter caseSequenceElements(SequenceElements object)
      {
        return createSequenceElementsAdapter();
      }
      @Override
      public Adapter caseSequenceElementListCompletion(SequenceElementListCompletion object)
      {
        return createSequenceElementListCompletionAdapter();
      }
      @Override
      public Adapter caseSequenceElement(SequenceElement object)
      {
        return createSequenceElementAdapter();
      }
      @Override
      public Adapter caseSequenceInitializationExpression(SequenceInitializationExpression object)
      {
        return createSequenceInitializationExpressionAdapter();
      }
      @Override
      public Adapter caseIndex(Index object)
      {
        return createIndexAdapter();
      }
      @Override
      public Adapter caseSequenceOperationOrReductionOrExpansion(SequenceOperationOrReductionOrExpansion object)
      {
        return createSequenceOperationOrReductionOrExpansionAdapter();
      }
      @Override
      public Adapter casePostfixExpressionCompletion(PostfixExpressionCompletion object)
      {
        return createPostfixExpressionCompletionAdapter();
      }
      @Override
      public Adapter casePostfixOperation(PostfixOperation object)
      {
        return createPostfixOperationAdapter();
      }
      @Override
      public Adapter casePrefixExpression(PrefixExpression object)
      {
        return createPrefixExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePostfixOrCastExpression(PostfixOrCastExpression object)
      {
        return createPostfixOrCastExpressionAdapter();
      }
      @Override
      public Adapter caseNonNameUnaryExpression(NonNameUnaryExpression object)
      {
        return createNonNameUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseNonNamePostfixOrCastExpression(NonNamePostfixOrCastExpression object)
      {
        return createNonNamePostfixOrCastExpressionAdapter();
      }
      @Override
      public Adapter caseNonPostfixNonCastUnaryExpression(NonPostfixNonCastUnaryExpression object)
      {
        return createNonPostfixNonCastUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseBooleanNegationExpression(BooleanNegationExpression object)
      {
        return createBooleanNegationExpressionAdapter();
      }
      @Override
      public Adapter caseBitStringComplementExpression(BitStringComplementExpression object)
      {
        return createBitStringComplementExpressionAdapter();
      }
      @Override
      public Adapter caseNumericUnaryExpression(NumericUnaryExpression object)
      {
        return createNumericUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseIsolationExpression(IsolationExpression object)
      {
        return createIsolationExpressionAdapter();
      }
      @Override
      public Adapter caseCastCompletion(CastCompletion object)
      {
        return createCastCompletionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpression(MultiplicativeExpression object)
      {
        return createMultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExpressionCompletion(MultiplicativeExpressionCompletion object)
      {
        return createMultiplicativeExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpressionCompletion(AdditiveExpressionCompletion object)
      {
        return createAdditiveExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseShiftExpression(ShiftExpression object)
      {
        return createShiftExpressionAdapter();
      }
      @Override
      public Adapter caseShiftExpressionCompletion(ShiftExpressionCompletion object)
      {
        return createShiftExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseRelationalExpression(RelationalExpression object)
      {
        return createRelationalExpressionAdapter();
      }
      @Override
      public Adapter caseRelationalExpressionCompletion(RelationalExpressionCompletion object)
      {
        return createRelationalExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseClassificationExpression(ClassificationExpression object)
      {
        return createClassificationExpressionAdapter();
      }
      @Override
      public Adapter caseClassificationExpressionCompletion(ClassificationExpressionCompletion object)
      {
        return createClassificationExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseEqualityExpression(EqualityExpression object)
      {
        return createEqualityExpressionAdapter();
      }
      @Override
      public Adapter caseEqualityExpressionCompletion(EqualityExpressionCompletion object)
      {
        return createEqualityExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpressionCompletion(AndExpressionCompletion object)
      {
        return createAndExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseExclusiveOrExpression(ExclusiveOrExpression object)
      {
        return createExclusiveOrExpressionAdapter();
      }
      @Override
      public Adapter caseExclusiveOrExpressionCompletion(ExclusiveOrExpressionCompletion object)
      {
        return createExclusiveOrExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseInclusiveOrExpression(InclusiveOrExpression object)
      {
        return createInclusiveOrExpressionAdapter();
      }
      @Override
      public Adapter caseInclusiveOrExpressionCompletion(InclusiveOrExpressionCompletion object)
      {
        return createInclusiveOrExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseConditionalAndExpression(ConditionalAndExpression object)
      {
        return createConditionalAndExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalAndExpressionCompletion(ConditionalAndExpressionCompletion object)
      {
        return createConditionalAndExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseConditionalOrExpression(ConditionalOrExpression object)
      {
        return createConditionalOrExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalOrExpressionCompletion(ConditionalOrExpressionCompletion object)
      {
        return createConditionalOrExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseConditionalExpression(ConditionalExpression object)
      {
        return createConditionalExpressionAdapter();
      }
      @Override
      public Adapter caseConditionalExpressionCompletion(ConditionalExpressionCompletion object)
      {
        return createConditionalExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseAssignmentExpressionCompletion(AssignmentExpressionCompletion object)
      {
        return createAssignmentExpressionCompletionAdapter();
      }
      @Override
      public Adapter caseStatementSequence(StatementSequence object)
      {
        return createStatementSequenceAdapter();
      }
      @Override
      public Adapter caseDocumentedStatement(DocumentedStatement object)
      {
        return createDocumentedStatementAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseAnnotatedStatement(AnnotatedStatement object)
      {
        return createAnnotatedStatementAdapter();
      }
      @Override
      public Adapter caseAnnotations(Annotations object)
      {
        return createAnnotationsAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseNameList(NameList object)
      {
        return createNameListAdapter();
      }
      @Override
      public Adapter caseInLineStatement(InLineStatement object)
      {
        return createInLineStatementAdapter();
      }
      @Override
      public Adapter caseBlockStatement(BlockStatement object)
      {
        return createBlockStatementAdapter();
      }
      @Override
      public Adapter caseEmptyStatement(EmptyStatement object)
      {
        return createEmptyStatementAdapter();
      }
      @Override
      public Adapter caseLocalNameDeclarationOrExpressionStatement(LocalNameDeclarationOrExpressionStatement object)
      {
        return createLocalNameDeclarationOrExpressionStatementAdapter();
      }
      @Override
      public Adapter caseLocalNameDeclarationStatement(LocalNameDeclarationStatement object)
      {
        return createLocalNameDeclarationStatementAdapter();
      }
      @Override
      public Adapter caseLocalNameDeclarationStatementCompletion(LocalNameDeclarationStatementCompletion object)
      {
        return createLocalNameDeclarationStatementCompletionAdapter();
      }
      @Override
      public Adapter caseInitializationExpression(InitializationExpression object)
      {
        return createInitializationExpressionAdapter();
      }
      @Override
      public Adapter caseInstanceInitializationExpression(InstanceInitializationExpression object)
      {
        return createInstanceInitializationExpressionAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseSequentialClauses(SequentialClauses object)
      {
        return createSequentialClausesAdapter();
      }
      @Override
      public Adapter caseConcurrentClauses(ConcurrentClauses object)
      {
        return createConcurrentClausesAdapter();
      }
      @Override
      public Adapter caseNonFinalClause(NonFinalClause object)
      {
        return createNonFinalClauseAdapter();
      }
      @Override
      public Adapter caseFinalClause(FinalClause object)
      {
        return createFinalClauseAdapter();
      }
      @Override
      public Adapter caseSwitchStatement(SwitchStatement object)
      {
        return createSwitchStatementAdapter();
      }
      @Override
      public Adapter caseSwitchClause(SwitchClause object)
      {
        return createSwitchClauseAdapter();
      }
      @Override
      public Adapter caseSwitchCase(SwitchCase object)
      {
        return createSwitchCaseAdapter();
      }
      @Override
      public Adapter caseSwitchDefaultClause(SwitchDefaultClause object)
      {
        return createSwitchDefaultClauseAdapter();
      }
      @Override
      public Adapter caseNonEmptyStatementSequence(NonEmptyStatementSequence object)
      {
        return createNonEmptyStatementSequenceAdapter();
      }
      @Override
      public Adapter caseWhileStatement(WhileStatement object)
      {
        return createWhileStatementAdapter();
      }
      @Override
      public Adapter caseDoStatement(DoStatement object)
      {
        return createDoStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseForControl(ForControl object)
      {
        return createForControlAdapter();
      }
      @Override
      public Adapter caseLoopVariableDefinition(LoopVariableDefinition object)
      {
        return createLoopVariableDefinitionAdapter();
      }
      @Override
      public Adapter caseBreakStatement(BreakStatement object)
      {
        return createBreakStatementAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseAcceptStatement(AcceptStatement object)
      {
        return createAcceptStatementAdapter();
      }
      @Override
      public Adapter caseSimpleAcceptStatementCompletion(SimpleAcceptStatementCompletion object)
      {
        return createSimpleAcceptStatementCompletionAdapter();
      }
      @Override
      public Adapter caseCompoundAcceptStatementCompletion(CompoundAcceptStatementCompletion object)
      {
        return createCompoundAcceptStatementCompletionAdapter();
      }
      @Override
      public Adapter caseAcceptBlock(AcceptBlock object)
      {
        return createAcceptBlockAdapter();
      }
      @Override
      public Adapter caseAcceptClause(AcceptClause object)
      {
        return createAcceptClauseAdapter();
      }
      @Override
      public Adapter caseClassifyStatement(ClassifyStatement object)
      {
        return createClassifyStatementAdapter();
      }
      @Override
      public Adapter caseClassificationClause(ClassificationClause object)
      {
        return createClassificationClauseAdapter();
      }
      @Override
      public Adapter caseClassificationFromClause(ClassificationFromClause object)
      {
        return createClassificationFromClauseAdapter();
      }
      @Override
      public Adapter caseClassificationToClause(ClassificationToClause object)
      {
        return createClassificationToClauseAdapter();
      }
      @Override
      public Adapter caseReclassifyAllClause(ReclassifyAllClause object)
      {
        return createReclassifyAllClauseAdapter();
      }
      @Override
      public Adapter caseQualifiedNameList(QualifiedNameList object)
      {
        return createQualifiedNameListAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.OpaqueBehaviorBody <em>Opaque Behavior Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.OpaqueBehaviorBody
   * @generated
   */
  public Adapter createOpaqueBehaviorBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.UnitDefinition <em>Unit Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.UnitDefinition
   * @generated
   */
  public Adapter createUnitDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BOOLEAN_LITERAL
   * @generated
   */
  public Adapter createBOOLEAN_LITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NUMBER_LITERAL <em>NUMBER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NUMBER_LITERAL
   * @generated
   */
  public Adapter createNUMBER_LITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.INTEGER_LITERAL <em>INTEGER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.INTEGER_LITERAL
   * @generated
   */
  public Adapter createINTEGER_LITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.UNLIMITED_NATURAL <em>UNLIMITED NATURAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.UNLIMITED_NATURAL
   * @generated
   */
  public Adapter createUNLIMITED_NATURALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.STRING_LITERAL <em>STRING LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.STRING_LITERAL
   * @generated
   */
  public Adapter createSTRING_LITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.StereotypeAnnotations <em>Stereotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.StereotypeAnnotations
   * @generated
   */
  public Adapter createStereotypeAnnotationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.StereotypeAnnotation <em>Stereotype Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.StereotypeAnnotation
   * @generated
   */
  public Adapter createStereotypeAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TaggedValues <em>Tagged Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TaggedValues
   * @generated
   */
  public Adapter createTaggedValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TaggedValueList <em>Tagged Value List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TaggedValueList
   * @generated
   */
  public Adapter createTaggedValueListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PRIMITIVE_LITERAL <em>PRIMITIVE LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PRIMITIVE_LITERAL
   * @generated
   */
  public Adapter createPRIMITIVE_LITERALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TaggedValue <em>Tagged Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TaggedValue
   * @generated
   */
  public Adapter createTaggedValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NamespaceDeclaration
   * @generated
   */
  public Adapter createNamespaceDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ImportDeclaration
   * @generated
   */
  public Adapter createImportDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ImportReference <em>Import Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ImportReference
   * @generated
   */
  public Adapter createImportReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ImportReferenceQualifiedNameCompletion <em>Import Reference Qualified Name Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ImportReferenceQualifiedNameCompletion
   * @generated
   */
  public Adapter createImportReferenceQualifiedNameCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference <em>Colon Qualified Name Completion Of Import Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference
   * @generated
   */
  public Adapter createColonQualifiedNameCompletionOfImportReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AliasDefinition <em>Alias Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AliasDefinition
   * @generated
   */
  public Adapter createAliasDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NamespaceDefinition <em>Namespace Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NamespaceDefinition
   * @generated
   */
  public Adapter createNamespaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.VisibilityIndicator <em>Visibility Indicator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.VisibilityIndicator
   * @generated
   */
  public Adapter createVisibilityIndicatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PackageDefinition <em>Package Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PackageDefinition
   * @generated
   */
  public Adapter createPackageDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PackageDefinitionOrStub <em>Package Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PackageDefinitionOrStub
   * @generated
   */
  public Adapter createPackageDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PackageBody <em>Package Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PackageBody
   * @generated
   */
  public Adapter createPackageBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PackagedElement <em>Packaged Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PackagedElement
   * @generated
   */
  public Adapter createPackagedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PackagedElementDefinition <em>Packaged Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PackagedElementDefinition
   * @generated
   */
  public Adapter createPackagedElementDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassifierDefinition <em>Classifier Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassifierDefinition
   * @generated
   */
  public Adapter createClassifierDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassifierDefinitionOrStub <em>Classifier Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassifierDefinitionOrStub
   * @generated
   */
  public Adapter createClassifierDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassifierSignature <em>Classifier Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassifierSignature
   * @generated
   */
  public Adapter createClassifierSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TemplateParameters <em>Template Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TemplateParameters
   * @generated
   */
  public Adapter createTemplateParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassifierTemplateParameter
   * @generated
   */
  public Adapter createClassifierTemplateParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SpecializationClause <em>Specialization Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SpecializationClause
   * @generated
   */
  public Adapter createSpecializationClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassDeclaration
   * @generated
   */
  public Adapter createClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassDefinition <em>Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassDefinition
   * @generated
   */
  public Adapter createClassDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassDefinitionOrStub <em>Class Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassDefinitionOrStub
   * @generated
   */
  public Adapter createClassDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassBody <em>Class Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassBody
   * @generated
   */
  public Adapter createClassBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassMember
   * @generated
   */
  public Adapter createClassMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassMemberDefinition <em>Class Member Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassMemberDefinition
   * @generated
   */
  public Adapter createClassMemberDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActiveClassDeclaration <em>Active Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActiveClassDeclaration
   * @generated
   */
  public Adapter createActiveClassDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActiveClassDefinition <em>Active Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActiveClassDefinition
   * @generated
   */
  public Adapter createActiveClassDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActiveClassDefinitionOrStub <em>Active Class Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActiveClassDefinitionOrStub
   * @generated
   */
  public Adapter createActiveClassDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActiveClassBody <em>Active Class Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActiveClassBody
   * @generated
   */
  public Adapter createActiveClassBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BehaviorClause <em>Behavior Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BehaviorClause
   * @generated
   */
  public Adapter createBehaviorClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActiveClassMember <em>Active Class Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActiveClassMember
   * @generated
   */
  public Adapter createActiveClassMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActiveClassMemberDefinition <em>Active Class Member Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActiveClassMemberDefinition
   * @generated
   */
  public Adapter createActiveClassMemberDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.DataTypeDeclaration <em>Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.DataTypeDeclaration
   * @generated
   */
  public Adapter createDataTypeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.DataTypeDefinition <em>Data Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.DataTypeDefinition
   * @generated
   */
  public Adapter createDataTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.DataTypeDefinitionOrStub <em>Data Type Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.DataTypeDefinitionOrStub
   * @generated
   */
  public Adapter createDataTypeDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.StructuredBody <em>Structured Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.StructuredBody
   * @generated
   */
  public Adapter createStructuredBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.StructuredMember <em>Structured Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.StructuredMember
   * @generated
   */
  public Adapter createStructuredMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AssociationDeclaration <em>Association Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AssociationDeclaration
   * @generated
   */
  public Adapter createAssociationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AssociationDefinition <em>Association Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AssociationDefinition
   * @generated
   */
  public Adapter createAssociationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AssociationDefinitionOrStub <em>Association Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AssociationDefinitionOrStub
   * @generated
   */
  public Adapter createAssociationDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EnumerationDeclaration <em>Enumeration Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EnumerationDeclaration
   * @generated
   */
  public Adapter createEnumerationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EnumerationDefinition <em>Enumeration Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EnumerationDefinition
   * @generated
   */
  public Adapter createEnumerationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EnumerationDefinitionOrStub <em>Enumeration Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EnumerationDefinitionOrStub
   * @generated
   */
  public Adapter createEnumerationDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EnumerationBody <em>Enumeration Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EnumerationBody
   * @generated
   */
  public Adapter createEnumerationBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EnumerationLiteralName <em>Enumeration Literal Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EnumerationLiteralName
   * @generated
   */
  public Adapter createEnumerationLiteralNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SignalDeclaration
   * @generated
   */
  public Adapter createSignalDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SignalDefinition
   * @generated
   */
  public Adapter createSignalDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SignalDefinitionOrStub <em>Signal Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SignalDefinitionOrStub
   * @generated
   */
  public Adapter createSignalDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActivityDeclaration <em>Activity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActivityDeclaration
   * @generated
   */
  public Adapter createActivityDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActivityDefinition <em>Activity Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActivityDefinition
   * @generated
   */
  public Adapter createActivityDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActivityDefinitionOrStub <em>Activity Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActivityDefinitionOrStub
   * @generated
   */
  public Adapter createActivityDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.FormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.FormalParameters
   * @generated
   */
  public Adapter createFormalParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.FormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.FormalParameterList
   * @generated
   */
  public Adapter createFormalParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.FormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.FormalParameter
   * @generated
   */
  public Adapter createFormalParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.FeatureDefinitionOrStub <em>Feature Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.FeatureDefinitionOrStub
   * @generated
   */
  public Adapter createFeatureDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ActiveFeatureDefinitionOrStub <em>Active Feature Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ActiveFeatureDefinitionOrStub
   * @generated
   */
  public Adapter createActiveFeatureDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PropertyDefinition
   * @generated
   */
  public Adapter createPropertyDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AttributeDefinition <em>Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AttributeDefinition
   * @generated
   */
  public Adapter createAttributeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AttributeInitializer <em>Attribute Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AttributeInitializer
   * @generated
   */
  public Adapter createAttributeInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PropertyDeclaration
   * @generated
   */
  public Adapter createPropertyDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TypePart <em>Type Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TypePart
   * @generated
   */
  public Adapter createTypePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TypeName
   * @generated
   */
  public Adapter createTypeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.MultiplicityRange <em>Multiplicity Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.MultiplicityRange
   * @generated
   */
  public Adapter createMultiplicityRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.UnlimitedNaturalLiteral <em>Unlimited Natural Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.UnlimitedNaturalLiteral
   * @generated
   */
  public Adapter createUnlimitedNaturalLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.OperationDeclaration <em>Operation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.OperationDeclaration
   * @generated
   */
  public Adapter createOperationDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.OperationDefinitionOrStub <em>Operation Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.OperationDefinitionOrStub
   * @generated
   */
  public Adapter createOperationDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.RedefinitionClause <em>Redefinition Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.RedefinitionClause
   * @generated
   */
  public Adapter createRedefinitionClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ReceptionDefinition <em>Reception Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ReceptionDefinition
   * @generated
   */
  public Adapter createReceptionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SignalReceptionDeclaration <em>Signal Reception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SignalReceptionDeclaration
   * @generated
   */
  public Adapter createSignalReceptionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SignalReceptionDefinitionOrStub <em>Signal Reception Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SignalReceptionDefinitionOrStub
   * @generated
   */
  public Adapter createSignalReceptionDefinitionOrStubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.QualifiedName
   * @generated
   */
  public Adapter createQualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ColonQualifiedNameCompletion <em>Colon Qualified Name Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletion
   * @generated
   */
  public Adapter createColonQualifiedNameCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.UnqualifiedName <em>Unqualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.UnqualifiedName
   * @generated
   */
  public Adapter createUnqualifiedNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NameBinding <em>Name Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NameBinding
   * @generated
   */
  public Adapter createNameBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.QualifiedNameWithoutBinding <em>Qualified Name Without Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.QualifiedNameWithoutBinding
   * @generated
   */
  public Adapter createQualifiedNameWithoutBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ColonQualifiedNameCompletionWithoutBinding <em>Colon Qualified Name Completion Without Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionWithoutBinding
   * @generated
   */
  public Adapter createColonQualifiedNameCompletionWithoutBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TemplateBinding
   * @generated
   */
  public Adapter createTemplateBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PositionalTemplateBinding <em>Positional Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PositionalTemplateBinding
   * @generated
   */
  public Adapter createPositionalTemplateBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NamedTemplateBinding <em>Named Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NamedTemplateBinding
   * @generated
   */
  public Adapter createNamedTemplateBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.TemplateParameterSubstitution
   * @generated
   */
  public Adapter createTemplateParameterSubstitutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NonNameExpression <em>Non Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NonNameExpression
   * @generated
   */
  public Adapter createNonNameExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NameToExpressionCompletion <em>Name To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NameToExpressionCompletion
   * @generated
   */
  public Adapter createNameToExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PrimaryToExpressionCompletion <em>Primary To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PrimaryToExpressionCompletion
   * @generated
   */
  public Adapter createPrimaryToExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ExpressionCompletion <em>Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ExpressionCompletion
   * @generated
   */
  public Adapter createExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BaseExpression <em>Base Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BaseExpression
   * @generated
   */
  public Adapter createBaseExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NameToPrimaryExpression <em>Name To Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NameToPrimaryExpression
   * @generated
   */
  public Adapter createNameToPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PrimaryExpressionCompletion <em>Primary Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PrimaryExpressionCompletion
   * @generated
   */
  public Adapter createPrimaryExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index <em>Feature Or Sequence Operation Or Reduction Or Expansion Or Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index
   * @generated
   */
  public Adapter createFeature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.LiteralExpression
   * @generated
   */
  public Adapter createLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NameOrPrimaryExpression <em>Name Or Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NameOrPrimaryExpression
   * @generated
   */
  public Adapter createNameOrPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ThisExpression <em>This Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ThisExpression
   * @generated
   */
  public Adapter createThisExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ParenthesizedExpression
   * @generated
   */
  public Adapter createParenthesizedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Tuple
   * @generated
   */
  public Adapter createTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PositionalTupleExpressionList <em>Positional Tuple Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PositionalTupleExpressionList
   * @generated
   */
  public Adapter createPositionalTupleExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PositionalTupleExpressionListCompletion <em>Positional Tuple Expression List Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PositionalTupleExpressionListCompletion
   * @generated
   */
  public Adapter createPositionalTupleExpressionListCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NamedTupleExpressionList <em>Named Tuple Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NamedTupleExpressionList
   * @generated
   */
  public Adapter createNamedTupleExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NamedExpression <em>Named Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NamedExpression
   * @generated
   */
  public Adapter createNamedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BehaviorInvocation <em>Behavior Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BehaviorInvocation
   * @generated
   */
  public Adapter createBehaviorInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.FeatureInvocation <em>Feature Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.FeatureInvocation
   * @generated
   */
  public Adapter createFeatureInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SuperInvocationExpression <em>Super Invocation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SuperInvocationExpression
   * @generated
   */
  public Adapter createSuperInvocationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression <em>Instance Creation Or Sequence Construction Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression
   * @generated
   */
  public Adapter createInstanceCreationOrSequenceConstructionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.LinkOperationCompletion <em>Link Operation Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.LinkOperationCompletion
   * @generated
   */
  public Adapter createLinkOperationCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.LinkOperationTuple <em>Link Operation Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.LinkOperationTuple
   * @generated
   */
  public Adapter createLinkOperationTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.IndexedNamedExpressionListCompletion <em>Indexed Named Expression List Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.IndexedNamedExpressionListCompletion
   * @generated
   */
  public Adapter createIndexedNamedExpressionListCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.IndexedNamedExpression <em>Indexed Named Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.IndexedNamedExpression
   * @generated
   */
  public Adapter createIndexedNamedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassExtentExpressionCompletion <em>Class Extent Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassExtentExpressionCompletion
   * @generated
   */
  public Adapter createClassExtentExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequenceAnyExpression <em>Sequence Any Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequenceAnyExpression
   * @generated
   */
  public Adapter createSequenceAnyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequenceConstructionExpressionCompletion <em>Sequence Construction Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequenceConstructionExpressionCompletion
   * @generated
   */
  public Adapter createSequenceConstructionExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.MultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.MultiplicityIndicator
   * @generated
   */
  public Adapter createMultiplicityIndicatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequenceElements <em>Sequence Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequenceElements
   * @generated
   */
  public Adapter createSequenceElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequenceElementListCompletion <em>Sequence Element List Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequenceElementListCompletion
   * @generated
   */
  public Adapter createSequenceElementListCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequenceElement <em>Sequence Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequenceElement
   * @generated
   */
  public Adapter createSequenceElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequenceInitializationExpression <em>Sequence Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequenceInitializationExpression
   * @generated
   */
  public Adapter createSequenceInitializationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Index <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Index
   * @generated
   */
  public Adapter createIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion <em>Sequence Operation Or Reduction Or Expansion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion
   * @generated
   */
  public Adapter createSequenceOperationOrReductionOrExpansionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PostfixExpressionCompletion <em>Postfix Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PostfixExpressionCompletion
   * @generated
   */
  public Adapter createPostfixExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PostfixOperation <em>Postfix Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PostfixOperation
   * @generated
   */
  public Adapter createPostfixOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PrefixExpression <em>Prefix Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PrefixExpression
   * @generated
   */
  public Adapter createPrefixExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.PostfixOrCastExpression <em>Postfix Or Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.PostfixOrCastExpression
   * @generated
   */
  public Adapter createPostfixOrCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NonNameUnaryExpression <em>Non Name Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NonNameUnaryExpression
   * @generated
   */
  public Adapter createNonNameUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression <em>Non Name Postfix Or Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression
   * @generated
   */
  public Adapter createNonNamePostfixOrCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NonPostfixNonCastUnaryExpression <em>Non Postfix Non Cast Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NonPostfixNonCastUnaryExpression
   * @generated
   */
  public Adapter createNonPostfixNonCastUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BooleanNegationExpression <em>Boolean Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BooleanNegationExpression
   * @generated
   */
  public Adapter createBooleanNegationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BitStringComplementExpression <em>Bit String Complement Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BitStringComplementExpression
   * @generated
   */
  public Adapter createBitStringComplementExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NumericUnaryExpression <em>Numeric Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NumericUnaryExpression
   * @generated
   */
  public Adapter createNumericUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.IsolationExpression <em>Isolation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.IsolationExpression
   * @generated
   */
  public Adapter createIsolationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.CastCompletion <em>Cast Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.CastCompletion
   * @generated
   */
  public Adapter createCastCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.MultiplicativeExpression
   * @generated
   */
  public Adapter createMultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.MultiplicativeExpressionCompletion <em>Multiplicative Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.MultiplicativeExpressionCompletion
   * @generated
   */
  public Adapter createMultiplicativeExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AdditiveExpressionCompletion <em>Additive Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AdditiveExpressionCompletion
   * @generated
   */
  public Adapter createAdditiveExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ShiftExpression
   * @generated
   */
  public Adapter createShiftExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ShiftExpressionCompletion <em>Shift Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ShiftExpressionCompletion
   * @generated
   */
  public Adapter createShiftExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.RelationalExpression
   * @generated
   */
  public Adapter createRelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.RelationalExpressionCompletion <em>Relational Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.RelationalExpressionCompletion
   * @generated
   */
  public Adapter createRelationalExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassificationExpression <em>Classification Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassificationExpression
   * @generated
   */
  public Adapter createClassificationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassificationExpressionCompletion <em>Classification Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassificationExpressionCompletion
   * @generated
   */
  public Adapter createClassificationExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EqualityExpression
   * @generated
   */
  public Adapter createEqualityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EqualityExpressionCompletion <em>Equality Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EqualityExpressionCompletion
   * @generated
   */
  public Adapter createEqualityExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AndExpressionCompletion <em>And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AndExpressionCompletion
   * @generated
   */
  public Adapter createAndExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ExclusiveOrExpression
   * @generated
   */
  public Adapter createExclusiveOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ExclusiveOrExpressionCompletion <em>Exclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ExclusiveOrExpressionCompletion
   * @generated
   */
  public Adapter createExclusiveOrExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.InclusiveOrExpression
   * @generated
   */
  public Adapter createInclusiveOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.InclusiveOrExpressionCompletion <em>Inclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.InclusiveOrExpressionCompletion
   * @generated
   */
  public Adapter createInclusiveOrExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ConditionalAndExpression
   * @generated
   */
  public Adapter createConditionalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ConditionalAndExpressionCompletion <em>Conditional And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ConditionalAndExpressionCompletion
   * @generated
   */
  public Adapter createConditionalAndExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ConditionalOrExpression
   * @generated
   */
  public Adapter createConditionalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ConditionalOrExpressionCompletion <em>Conditional Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ConditionalOrExpressionCompletion
   * @generated
   */
  public Adapter createConditionalOrExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ConditionalExpression
   * @generated
   */
  public Adapter createConditionalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ConditionalExpressionCompletion <em>Conditional Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ConditionalExpressionCompletion
   * @generated
   */
  public Adapter createConditionalExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AssignmentExpressionCompletion <em>Assignment Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AssignmentExpressionCompletion
   * @generated
   */
  public Adapter createAssignmentExpressionCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.StatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.StatementSequence
   * @generated
   */
  public Adapter createStatementSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.DocumentedStatement <em>Documented Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.DocumentedStatement
   * @generated
   */
  public Adapter createDocumentedStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AnnotatedStatement <em>Annotated Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AnnotatedStatement
   * @generated
   */
  public Adapter createAnnotatedStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Annotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Annotations
   * @generated
   */
  public Adapter createAnnotationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NameList <em>Name List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NameList
   * @generated
   */
  public Adapter createNameListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.InLineStatement <em>In Line Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.InLineStatement
   * @generated
   */
  public Adapter createInLineStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BlockStatement
   * @generated
   */
  public Adapter createBlockStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.EmptyStatement <em>Empty Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.EmptyStatement
   * @generated
   */
  public Adapter createEmptyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement <em>Local Name Declaration Or Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement
   * @generated
   */
  public Adapter createLocalNameDeclarationOrExpressionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.LocalNameDeclarationStatement <em>Local Name Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.LocalNameDeclarationStatement
   * @generated
   */
  public Adapter createLocalNameDeclarationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.LocalNameDeclarationStatementCompletion <em>Local Name Declaration Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.LocalNameDeclarationStatementCompletion
   * @generated
   */
  public Adapter createLocalNameDeclarationStatementCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.InitializationExpression <em>Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.InitializationExpression
   * @generated
   */
  public Adapter createInitializationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.InstanceInitializationExpression <em>Instance Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.InstanceInitializationExpression
   * @generated
   */
  public Adapter createInstanceInitializationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SequentialClauses <em>Sequential Clauses</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SequentialClauses
   * @generated
   */
  public Adapter createSequentialClausesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ConcurrentClauses <em>Concurrent Clauses</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ConcurrentClauses
   * @generated
   */
  public Adapter createConcurrentClausesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NonFinalClause <em>Non Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NonFinalClause
   * @generated
   */
  public Adapter createNonFinalClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.FinalClause <em>Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.FinalClause
   * @generated
   */
  public Adapter createFinalClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SwitchStatement
   * @generated
   */
  public Adapter createSwitchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SwitchClause <em>Switch Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SwitchClause
   * @generated
   */
  public Adapter createSwitchClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SwitchCase
   * @generated
   */
  public Adapter createSwitchCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SwitchDefaultClause <em>Switch Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SwitchDefaultClause
   * @generated
   */
  public Adapter createSwitchDefaultClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.NonEmptyStatementSequence <em>Non Empty Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.NonEmptyStatementSequence
   * @generated
   */
  public Adapter createNonEmptyStatementSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.WhileStatement
   * @generated
   */
  public Adapter createWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.DoStatement
   * @generated
   */
  public Adapter createDoStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ForControl
   * @generated
   */
  public Adapter createForControlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.LoopVariableDefinition <em>Loop Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.LoopVariableDefinition
   * @generated
   */
  public Adapter createLoopVariableDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.BreakStatement
   * @generated
   */
  public Adapter createBreakStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AcceptStatement <em>Accept Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AcceptStatement
   * @generated
   */
  public Adapter createAcceptStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.SimpleAcceptStatementCompletion <em>Simple Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.SimpleAcceptStatementCompletion
   * @generated
   */
  public Adapter createSimpleAcceptStatementCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.CompoundAcceptStatementCompletion <em>Compound Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.CompoundAcceptStatementCompletion
   * @generated
   */
  public Adapter createCompoundAcceptStatementCompletionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AcceptBlock <em>Accept Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AcceptBlock
   * @generated
   */
  public Adapter createAcceptBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.AcceptClause <em>Accept Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.AcceptClause
   * @generated
   */
  public Adapter createAcceptClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassifyStatement <em>Classify Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassifyStatement
   * @generated
   */
  public Adapter createClassifyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassificationClause <em>Classification Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassificationClause
   * @generated
   */
  public Adapter createClassificationClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassificationFromClause <em>Classification From Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassificationFromClause
   * @generated
   */
  public Adapter createClassificationFromClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ClassificationToClause <em>Classification To Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ClassificationToClause
   * @generated
   */
  public Adapter createClassificationToClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.ReclassifyAllClause <em>Reclassify All Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.ReclassifyAllClause
   * @generated
   */
  public Adapter createReclassifyAllClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.modelexecution.alf.QualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.modelexecution.alf.QualifiedNameList
   * @generated
   */
  public Adapter createQualifiedNameListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AlfAdapterFactory
