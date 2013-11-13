/**
 */
package org.modelexecution.alf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.modelexecution.alf.AlfFactory
 * @model kind="package"
 * @generated
 */
public interface AlfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.modelexecution.org/Alf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlfPackage eINSTANCE = org.modelexecution.alf.impl.AlfPackageImpl.init();

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.OpaqueBehaviorBodyImpl <em>Opaque Behavior Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.OpaqueBehaviorBodyImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getOpaqueBehaviorBody()
   * @generated
   */
  int OPAQUE_BEHAVIOR_BODY = 0;

  /**
   * The feature id for the '<em><b>Bodydefinition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPAQUE_BEHAVIOR_BODY__BODYDEFINITION = 0;

  /**
   * The number of structural features of the '<em>Opaque Behavior Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPAQUE_BEHAVIOR_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.UnitDefinitionImpl <em>Unit Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.UnitDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getUnitDefinition()
   * @generated
   */
  int UNIT_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Namespace Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_DEFINITION__NAMESPACE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Import Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_DEFINITION__IMPORT_DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_DEFINITION__COMMENT = 2;

  /**
   * The feature id for the '<em><b>Stereotype Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_DEFINITION__STEREOTYPE_ANNOTATIONS = 3;

  /**
   * The feature id for the '<em><b>Namesapce Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_DEFINITION__NAMESAPCE_DEFINITION = 4;

  /**
   * The number of structural features of the '<em>Unit Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIT_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PRIMITIVE_LITERALImpl <em>PRIMITIVE LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PRIMITIVE_LITERALImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPRIMITIVE_LITERAL()
   * @generated
   */
  int PRIMITIVE_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_LITERAL__VALUE = 0;

  /**
   * The number of structural features of the '<em>PRIMITIVE LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BOOLEAN_LITERALImpl <em>BOOLEAN LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BOOLEAN_LITERALImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBOOLEAN_LITERAL()
   * @generated
   */
  int BOOLEAN_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = PRIMITIVE_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>BOOLEAN LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = PRIMITIVE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NUMBER_LITERALImpl <em>NUMBER LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NUMBER_LITERALImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNUMBER_LITERAL()
   * @generated
   */
  int NUMBER_LITERAL = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = PRIMITIVE_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>NUMBER LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = PRIMITIVE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.INTEGER_LITERALImpl <em>INTEGER LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.INTEGER_LITERALImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getINTEGER_LITERAL()
   * @generated
   */
  int INTEGER_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = NUMBER_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>INTEGER LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.UNLIMITED_NATURALImpl <em>UNLIMITED NATURAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.UNLIMITED_NATURALImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getUNLIMITED_NATURAL()
   * @generated
   */
  int UNLIMITED_NATURAL = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_NATURAL__VALUE = NUMBER_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>UNLIMITED NATURAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_NATURAL_FEATURE_COUNT = NUMBER_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.STRING_LITERALImpl <em>STRING LITERAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.STRING_LITERALImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSTRING_LITERAL()
   * @generated
   */
  int STRING_LITERAL = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = PRIMITIVE_LITERAL__VALUE;

  /**
   * The number of structural features of the '<em>STRING LITERAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = PRIMITIVE_LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.StereotypeAnnotationsImpl <em>Stereotype Annotations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.StereotypeAnnotationsImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getStereotypeAnnotations()
   * @generated
   */
  int STEREOTYPE_ANNOTATIONS = 7;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEREOTYPE_ANNOTATIONS__ANNOTATION = 0;

  /**
   * The number of structural features of the '<em>Stereotype Annotations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEREOTYPE_ANNOTATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.StereotypeAnnotationImpl <em>Stereotype Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.StereotypeAnnotationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getStereotypeAnnotation()
   * @generated
   */
  int STEREOTYPE_ANNOTATION = 8;

  /**
   * The feature id for the '<em><b>Stereotype Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEREOTYPE_ANNOTATION__STEREOTYPE_NAME = 0;

  /**
   * The feature id for the '<em><b>Tagged Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEREOTYPE_ANNOTATION__TAGGED_VALUES = 1;

  /**
   * The number of structural features of the '<em>Stereotype Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEREOTYPE_ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TaggedValuesImpl <em>Tagged Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TaggedValuesImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTaggedValues()
   * @generated
   */
  int TAGGED_VALUES = 9;

  /**
   * The number of structural features of the '<em>Tagged Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_VALUES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TaggedValueListImpl <em>Tagged Value List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TaggedValueListImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTaggedValueList()
   * @generated
   */
  int TAGGED_VALUE_LIST = 10;

  /**
   * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_VALUE_LIST__TAGGED_VALUE = TAGGED_VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tagged Value List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_VALUE_LIST_FEATURE_COUNT = TAGGED_VALUES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TaggedValueImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTaggedValue()
   * @generated
   */
  int TAGGED_VALUE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_VALUE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Tagged Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAGGED_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NamespaceDeclarationImpl <em>Namespace Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NamespaceDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNamespaceDeclaration()
   * @generated
   */
  int NAMESPACE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION__QUALIFIED_NAME = 0;

  /**
   * The number of structural features of the '<em>Namespace Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ImportDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getImportDeclaration()
   * @generated
   */
  int IMPORT_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__VISIBILITY = 0;

  /**
   * The feature id for the '<em><b>Import Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__IMPORT_REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Import Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ImportReferenceImpl <em>Import Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ImportReferenceImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getImportReference()
   * @generated
   */
  int IMPORT_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_REFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_REFERENCE__COMPLETION = 1;

  /**
   * The feature id for the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_REFERENCE__ALIAS = 2;

  /**
   * The feature id for the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_REFERENCE__STAR = 3;

  /**
   * The number of structural features of the '<em>Import Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_REFERENCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ImportReferenceQualifiedNameCompletionImpl <em>Import Reference Qualified Name Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ImportReferenceQualifiedNameCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getImportReferenceQualifiedNameCompletion()
   * @generated
   */
  int IMPORT_REFERENCE_QUALIFIED_NAME_COMPLETION = 16;

  /**
   * The number of structural features of the '<em>Import Reference Qualified Name Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_REFERENCE_QUALIFIED_NAME_COMPLETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ColonQualifiedNameCompletionOfImportReferenceImpl <em>Colon Qualified Name Completion Of Import Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ColonQualifiedNameCompletionOfImportReferenceImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getColonQualifiedNameCompletionOfImportReference()
   * @generated
   */
  int COLON_QUALIFIED_NAME_COMPLETION_OF_IMPORT_REFERENCE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION_OF_IMPORT_REFERENCE__NAME = IMPORT_REFERENCE_QUALIFIED_NAME_COMPLETION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION_OF_IMPORT_REFERENCE__STAR = IMPORT_REFERENCE_QUALIFIED_NAME_COMPLETION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION_OF_IMPORT_REFERENCE__ALIAS = IMPORT_REFERENCE_QUALIFIED_NAME_COMPLETION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Colon Qualified Name Completion Of Import Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION_OF_IMPORT_REFERENCE_FEATURE_COUNT = IMPORT_REFERENCE_QUALIFIED_NAME_COMPLETION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AliasDefinitionImpl <em>Alias Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AliasDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAliasDefinition()
   * @generated
   */
  int ALIAS_DEFINITION = 18;

  /**
   * The feature id for the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_DEFINITION__ALIAS = 0;

  /**
   * The number of structural features of the '<em>Alias Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NamespaceDefinitionImpl <em>Namespace Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NamespaceDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNamespaceDefinition()
   * @generated
   */
  int NAMESPACE_DEFINITION = 19;

  /**
   * The number of structural features of the '<em>Namespace Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.VisibilityIndicatorImpl <em>Visibility Indicator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.VisibilityIndicatorImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getVisibilityIndicator()
   * @generated
   */
  int VISIBILITY_INDICATOR = 20;

  /**
   * The feature id for the '<em><b>PUBLIC</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_INDICATOR__PUBLIC = 0;

  /**
   * The feature id for the '<em><b>PRIVATE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_INDICATOR__PRIVATE = 1;

  /**
   * The feature id for the '<em><b>PROTECTED</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_INDICATOR__PROTECTED = 2;

  /**
   * The number of structural features of the '<em>Visibility Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_INDICATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PackageDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PackageDefinitionImpl <em>Package Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PackageDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPackageDefinition()
   * @generated
   */
  int PACKAGE_DEFINITION = 22;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__DECLARATION = NAMESPACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION__BODY = NAMESPACE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION_FEATURE_COUNT = NAMESPACE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PackagedElementDefinitionImpl <em>Packaged Element Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PackagedElementDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPackagedElementDefinition()
   * @generated
   */
  int PACKAGED_ELEMENT_DEFINITION = 26;

  /**
   * The number of structural features of the '<em>Packaged Element Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGED_ELEMENT_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PackageDefinitionOrStubImpl <em>Package Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PackageDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPackageDefinitionOrStub()
   * @generated
   */
  int PACKAGE_DEFINITION_OR_STUB = 23;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION_OR_STUB__DECLARATION = PACKAGED_ELEMENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION_OR_STUB__BODY = PACKAGED_ELEMENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DEFINITION_OR_STUB_FEATURE_COUNT = PACKAGED_ELEMENT_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PackageBodyImpl <em>Package Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PackageBodyImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPackageBody()
   * @generated
   */
  int PACKAGE_BODY = 24;

  /**
   * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY__PACKAGED_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Package Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PackagedElementImpl <em>Packaged Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PackagedElementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPackagedElement()
   * @generated
   */
  int PACKAGED_ELEMENT = 25;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGED_ELEMENT__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Stereotype Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGED_ELEMENT__STEREOTYPE_ANNOTATIONS = 1;

  /**
   * The feature id for the '<em><b>Import Visibility Indicator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGED_ELEMENT__IMPORT_VISIBILITY_INDICATOR = 2;

  /**
   * The feature id for the '<em><b>Packaged Element Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGED_ELEMENT__PACKAGED_ELEMENT_DEFINITION = 3;

  /**
   * The number of structural features of the '<em>Packaged Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGED_ELEMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassifierDefinitionImpl <em>Classifier Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassifierDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassifierDefinition()
   * @generated
   */
  int CLASSIFIER_DEFINITION = 27;

  /**
   * The number of structural features of the '<em>Classifier Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_DEFINITION_FEATURE_COUNT = NAMESPACE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassifierDefinitionOrStubImpl <em>Classifier Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassifierDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassifierDefinitionOrStub()
   * @generated
   */
  int CLASSIFIER_DEFINITION_OR_STUB = 28;

  /**
   * The number of structural features of the '<em>Classifier Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT = PACKAGED_ELEMENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassifierSignatureImpl <em>Classifier Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassifierSignatureImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassifierSignature()
   * @generated
   */
  int CLASSIFIER_SIGNATURE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_SIGNATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Template Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_SIGNATURE__TEMPLATE_PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Specialization Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_SIGNATURE__SPECIALIZATION_CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Classifier Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_SIGNATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TemplateParametersImpl <em>Template Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TemplateParametersImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTemplateParameters()
   * @generated
   */
  int TEMPLATE_PARAMETERS = 30;

  /**
   * The feature id for the '<em><b>Classifier Template Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETERS__CLASSIFIER_TEMPLATE_PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Template Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassifierTemplateParameterImpl <em>Classifier Template Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassifierTemplateParameterImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassifierTemplateParameter()
   * @generated
   */
  int CLASSIFIER_TEMPLATE_PARAMETER = 31;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER__QUALIFIED_NAME = 2;

  /**
   * The number of structural features of the '<em>Classifier Template Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_TEMPLATE_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SpecializationClauseImpl <em>Specialization Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SpecializationClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSpecializationClause()
   * @generated
   */
  int SPECIALIZATION_CLAUSE = 32;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIALIZATION_CLAUSE__QUALIFIED_NAME_LIST = 0;

  /**
   * The number of structural features of the '<em>Specialization Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIALIZATION_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassDeclaration()
   * @generated
   */
  int CLASS_DECLARATION = 33;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__IS_ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Classifier Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASSIFIER_SIGNATURE = 1;

  /**
   * The number of structural features of the '<em>Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassDefinition()
   * @generated
   */
  int CLASS_DEFINITION = 34;

  /**
   * The feature id for the '<em><b>Class Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__CLASS_DECLARATION = CLASSIFIER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__CLASS_BODY = CLASSIFIER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION_FEATURE_COUNT = CLASSIFIER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassDefinitionOrStubImpl <em>Class Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassDefinitionOrStub()
   * @generated
   */
  int CLASS_DEFINITION_OR_STUB = 35;

  /**
   * The feature id for the '<em><b>Class Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION_OR_STUB__CLASS_DECLARATION = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION_OR_STUB__CLASS_BODY = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION_OR_STUB_FEATURE_COUNT = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassBodyImpl <em>Class Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassBodyImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassBody()
   * @generated
   */
  int CLASS_BODY = 36;

  /**
   * The feature id for the '<em><b>Class Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_BODY__CLASS_MEMBER = 0;

  /**
   * The number of structural features of the '<em>Class Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassMemberImpl <em>Class Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassMemberImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassMember()
   * @generated
   */
  int CLASS_MEMBER = 37;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Stereotype Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER__STEREOTYPE_ANNOTATIONS = 1;

  /**
   * The feature id for the '<em><b>Visibility Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER__VISIBILITY_INDICATOR = 2;

  /**
   * The feature id for the '<em><b>Class Member Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER__CLASS_MEMBER_DEFINITION = 3;

  /**
   * The number of structural features of the '<em>Class Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActiveClassMemberDefinitionImpl <em>Active Class Member Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActiveClassMemberDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActiveClassMemberDefinition()
   * @generated
   */
  int ACTIVE_CLASS_MEMBER_DEFINITION = 45;

  /**
   * The number of structural features of the '<em>Active Class Member Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_MEMBER_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassMemberDefinitionImpl <em>Class Member Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassMemberDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassMemberDefinition()
   * @generated
   */
  int CLASS_MEMBER_DEFINITION = 38;

  /**
   * The number of structural features of the '<em>Class Member Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_MEMBER_DEFINITION_FEATURE_COUNT = ACTIVE_CLASS_MEMBER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActiveClassDeclarationImpl <em>Active Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActiveClassDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActiveClassDeclaration()
   * @generated
   */
  int ACTIVE_CLASS_DECLARATION = 39;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DECLARATION__IS_ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Classifier Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DECLARATION__CLASSIFIER_SIGNATURE = 1;

  /**
   * The number of structural features of the '<em>Active Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActiveClassDefinitionImpl <em>Active Class Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActiveClassDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActiveClassDefinition()
   * @generated
   */
  int ACTIVE_CLASS_DEFINITION = 40;

  /**
   * The feature id for the '<em><b>Active Class Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DEFINITION__ACTIVE_CLASS_DECLARATION = CLASSIFIER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Active Class Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DEFINITION__ACTIVE_CLASS_BODY = CLASSIFIER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Active Class Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DEFINITION_FEATURE_COUNT = CLASSIFIER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActiveClassDefinitionOrStubImpl <em>Active Class Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActiveClassDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActiveClassDefinitionOrStub()
   * @generated
   */
  int ACTIVE_CLASS_DEFINITION_OR_STUB = 41;

  /**
   * The feature id for the '<em><b>Active Class Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DEFINITION_OR_STUB__ACTIVE_CLASS_DECLARATION = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Active Class Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DEFINITION_OR_STUB__ACTIVE_CLASS_BODY = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Active Class Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_DEFINITION_OR_STUB_FEATURE_COUNT = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActiveClassBodyImpl <em>Active Class Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActiveClassBodyImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActiveClassBody()
   * @generated
   */
  int ACTIVE_CLASS_BODY = 42;

  /**
   * The feature id for the '<em><b>Active Class Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_BODY__ACTIVE_CLASS_MEMBER = 0;

  /**
   * The feature id for the '<em><b>Behavior Clasue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_BODY__BEHAVIOR_CLASUE = 1;

  /**
   * The number of structural features of the '<em>Active Class Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_BODY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BehaviorClauseImpl <em>Behavior Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BehaviorClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBehaviorClause()
   * @generated
   */
  int BEHAVIOR_CLAUSE = 43;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_CLAUSE__BLOCK = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_CLAUSE__NAME = 1;

  /**
   * The number of structural features of the '<em>Behavior Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActiveClassMemberImpl <em>Active Class Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActiveClassMemberImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActiveClassMember()
   * @generated
   */
  int ACTIVE_CLASS_MEMBER = 44;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_MEMBER__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Stereotype Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_MEMBER__STEREOTYPE_ANNOTATIONS = 1;

  /**
   * The feature id for the '<em><b>Visibility Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_MEMBER__VISIBILITY_INDICATOR = 2;

  /**
   * The feature id for the '<em><b>Active Class Member Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_MEMBER__ACTIVE_CLASS_MEMBER_DEFINITION = 3;

  /**
   * The number of structural features of the '<em>Active Class Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_CLASS_MEMBER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.DataTypeDeclarationImpl <em>Data Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.DataTypeDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getDataTypeDeclaration()
   * @generated
   */
  int DATA_TYPE_DECLARATION = 46;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECLARATION__IS_ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Classifier Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECLARATION__CLASSIFIER_SIGNATURE = 1;

  /**
   * The number of structural features of the '<em>Data Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.DataTypeDefinitionImpl <em>Data Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.DataTypeDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getDataTypeDefinition()
   * @generated
   */
  int DATA_TYPE_DEFINITION = 47;

  /**
   * The feature id for the '<em><b>Data Type Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION__DATA_TYPE_DECLARATION = CLASSIFIER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structure Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION__STRUCTURE_BODY = CLASSIFIER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_FEATURE_COUNT = CLASSIFIER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.DataTypeDefinitionOrStubImpl <em>Data Type Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.DataTypeDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getDataTypeDefinitionOrStub()
   * @generated
   */
  int DATA_TYPE_DEFINITION_OR_STUB = 48;

  /**
   * The feature id for the '<em><b>Data Type Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_OR_STUB__DATA_TYPE_DECLARATION = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structure Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_OR_STUB__STRUCTURE_BODY = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Type Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEFINITION_OR_STUB_FEATURE_COUNT = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.StructuredBodyImpl <em>Structured Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.StructuredBodyImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getStructuredBody()
   * @generated
   */
  int STRUCTURED_BODY = 49;

  /**
   * The feature id for the '<em><b>Structured Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_BODY__STRUCTURED_MEMBER = 0;

  /**
   * The number of structural features of the '<em>Structured Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.StructuredMemberImpl <em>Structured Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.StructuredMemberImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getStructuredMember()
   * @generated
   */
  int STRUCTURED_MEMBER = 50;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_MEMBER__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Streotype Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_MEMBER__STREOTYPE_ANNOTATIONS = 1;

  /**
   * The feature id for the '<em><b>Is Public</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_MEMBER__IS_PUBLIC = 2;

  /**
   * The feature id for the '<em><b>Property Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_MEMBER__PROPERTY_DEFINITION = 3;

  /**
   * The number of structural features of the '<em>Structured Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_MEMBER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AssociationDeclarationImpl <em>Association Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AssociationDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAssociationDeclaration()
   * @generated
   */
  int ASSOCIATION_DECLARATION = 51;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DECLARATION__IS_ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Classifier Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DECLARATION__CLASSIFIER_SIGNATURE = 1;

  /**
   * The number of structural features of the '<em>Association Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AssociationDefinitionImpl <em>Association Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AssociationDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAssociationDefinition()
   * @generated
   */
  int ASSOCIATION_DEFINITION = 52;

  /**
   * The feature id for the '<em><b>Association Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DEFINITION__ASSOCIATION_DECLARATION = CLASSIFIER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DEFINITION__STRUCTURED_BODY = CLASSIFIER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Association Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DEFINITION_FEATURE_COUNT = CLASSIFIER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AssociationDefinitionOrStubImpl <em>Association Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AssociationDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAssociationDefinitionOrStub()
   * @generated
   */
  int ASSOCIATION_DEFINITION_OR_STUB = 53;

  /**
   * The feature id for the '<em><b>Association Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DEFINITION_OR_STUB__ASSOCIATION_DECLARATION = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DEFINITION_OR_STUB__STRUCTURED_BODY = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Association Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_DEFINITION_OR_STUB_FEATURE_COUNT = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EnumerationDeclarationImpl <em>Enumeration Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EnumerationDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEnumerationDeclaration()
   * @generated
   */
  int ENUMERATION_DECLARATION = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Specialization Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DECLARATION__SPECIALIZATION_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Enumeration Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EnumerationDefinitionImpl <em>Enumeration Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EnumerationDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEnumerationDefinition()
   * @generated
   */
  int ENUMERATION_DEFINITION = 55;

  /**
   * The feature id for the '<em><b>Enumeration Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DEFINITION__ENUMERATION_CLAUSE = CLASSIFIER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enumeration Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DEFINITION__ENUMERATION_BODY = CLASSIFIER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DEFINITION_FEATURE_COUNT = CLASSIFIER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EnumerationDefinitionOrStubImpl <em>Enumeration Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EnumerationDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEnumerationDefinitionOrStub()
   * @generated
   */
  int ENUMERATION_DEFINITION_OR_STUB = 56;

  /**
   * The feature id for the '<em><b>Enumeration Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DEFINITION_OR_STUB__ENUMERATION_DECLARATION = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enumeration Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DEFINITION_OR_STUB__ENUMERATION_BODY = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_DEFINITION_OR_STUB_FEATURE_COUNT = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EnumerationBodyImpl <em>Enumeration Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EnumerationBodyImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEnumerationBody()
   * @generated
   */
  int ENUMERATION_BODY = 57;

  /**
   * The feature id for the '<em><b>Enumeration Literal Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_BODY__ENUMERATION_LITERAL_NAME = 0;

  /**
   * The number of structural features of the '<em>Enumeration Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EnumerationLiteralNameImpl <em>Enumeration Literal Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EnumerationLiteralNameImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEnumerationLiteralName()
   * @generated
   */
  int ENUMERATION_LITERAL_NAME = 58;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_NAME__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_NAME__NAME = 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SignalDeclarationImpl <em>Signal Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SignalDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSignalDeclaration()
   * @generated
   */
  int SIGNAL_DECLARATION = 59;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__IS_ABSTRACT = 0;

  /**
   * The feature id for the '<em><b>Classifier Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION__CLASSIFIER_SIGNATURE = 1;

  /**
   * The number of structural features of the '<em>Signal Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SignalDefinitionImpl <em>Signal Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SignalDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSignalDefinition()
   * @generated
   */
  int SIGNAL_DEFINITION = 60;

  /**
   * The feature id for the '<em><b>Signal Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION__SIGNAL_DECLARATION = CLASSIFIER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION__STRUCTURED_BODY = CLASSIFIER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Signal Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION_FEATURE_COUNT = CLASSIFIER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SignalDefinitionOrStubImpl <em>Signal Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SignalDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSignalDefinitionOrStub()
   * @generated
   */
  int SIGNAL_DEFINITION_OR_STUB = 61;

  /**
   * The feature id for the '<em><b>Signal Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION_OR_STUB__SIGNAL_DECLARATION = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION_OR_STUB__STRUCTURED_BODY = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Signal Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_DEFINITION_OR_STUB_FEATURE_COUNT = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActivityDeclarationImpl <em>Activity Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActivityDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActivityDeclaration()
   * @generated
   */
  int ACTIVITY_DECLARATION = 62;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Template Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECLARATION__TEMPLATE_PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECLARATION__FORMAL_PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Type Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECLARATION__TYPE_PART = 3;

  /**
   * The number of structural features of the '<em>Activity Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActivityDefinitionImpl <em>Activity Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActivityDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActivityDefinition()
   * @generated
   */
  int ACTIVITY_DEFINITION = 63;

  /**
   * The feature id for the '<em><b>Activity Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DEFINITION__ACTIVITY_DECLARATION = CLASSIFIER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DEFINITION__BLOCK = CLASSIFIER_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DEFINITION_FEATURE_COUNT = CLASSIFIER_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActivityDefinitionOrStubImpl <em>Activity Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActivityDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActivityDefinitionOrStub()
   * @generated
   */
  int ACTIVITY_DEFINITION_OR_STUB = 64;

  /**
   * The feature id for the '<em><b>Activity Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DEFINITION_OR_STUB__ACTIVITY_DECLARATION = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DEFINITION_OR_STUB__BLOCK = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Activity Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_DEFINITION_OR_STUB_FEATURE_COUNT = CLASSIFIER_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.FormalParametersImpl <em>Formal Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.FormalParametersImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFormalParameters()
   * @generated
   */
  int FORMAL_PARAMETERS = 65;

  /**
   * The feature id for the '<em><b>Formal Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETERS__FORMAL_PARAMETER_LIST = 0;

  /**
   * The number of structural features of the '<em>Formal Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.FormalParameterListImpl <em>Formal Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.FormalParameterListImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFormalParameterList()
   * @generated
   */
  int FORMAL_PARAMETER_LIST = 66;

  /**
   * The feature id for the '<em><b>Formal Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST__FORMAL_PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Formal Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.FormalParameterImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFormalParameter()
   * @generated
   */
  int FORMAL_PARAMETER = 67;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Stereotype Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__STEREOTYPE_ANNOTATIONS = 1;

  /**
   * The feature id for the '<em><b>Parameter Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__PARAMETER_DIRECTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__NAME = 3;

  /**
   * The feature id for the '<em><b>Type Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER__TYPE_PART = 4;

  /**
   * The number of structural features of the '<em>Formal Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMETER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.FeatureDefinitionOrStubImpl <em>Feature Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.FeatureDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFeatureDefinitionOrStub()
   * @generated
   */
  int FEATURE_DEFINITION_OR_STUB = 68;

  /**
   * The number of structural features of the '<em>Feature Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT = CLASS_MEMBER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ActiveFeatureDefinitionOrStubImpl <em>Active Feature Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ActiveFeatureDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getActiveFeatureDefinitionOrStub()
   * @generated
   */
  int ACTIVE_FEATURE_DEFINITION_OR_STUB = 69;

  /**
   * The number of structural features of the '<em>Active Feature Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVE_FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT = ACTIVE_CLASS_MEMBER_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PropertyDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPropertyDefinition()
   * @generated
   */
  int PROPERTY_DEFINITION = 70;

  /**
   * The feature id for the '<em><b>Property Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__PROPERTY_DECLARATION = 0;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AttributeDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAttributeDefinition()
   * @generated
   */
  int ATTRIBUTE_DEFINITION = 71;

  /**
   * The feature id for the '<em><b>Property Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__PROPERTY_DECLARATION = FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION__ATTRIBUTE_INITIALIZER = FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_DEFINITION_FEATURE_COUNT = FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AttributeInitializerImpl <em>Attribute Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AttributeInitializerImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAttributeInitializer()
   * @generated
   */
  int ATTRIBUTE_INITIALIZER = 72;

  /**
   * The feature id for the '<em><b>Initialization Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INITIALIZER__INITIALIZATION_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Attribute Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_INITIALIZER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PropertyDeclarationImpl <em>Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PropertyDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPropertyDeclaration()
   * @generated
   */
  int PROPERTY_DECLARATION = 73;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Is Composite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__IS_COMPOSITE = 1;

  /**
   * The feature id for the '<em><b>Type Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION__TYPE_PART = 2;

  /**
   * The number of structural features of the '<em>Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TypePartImpl <em>Type Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TypePartImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTypePart()
   * @generated
   */
  int TYPE_PART = 74;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PART__TYPE_NAME = 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PART__MULTIPLICITY = 1;

  /**
   * The number of structural features of the '<em>Type Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PART_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TypeNameImpl <em>Type Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TypeNameImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTypeName()
   * @generated
   */
  int TYPE_NAME = 75;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME__QUALIFIED_NAME = 0;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME__ANY = 1;

  /**
   * The number of structural features of the '<em>Type Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.MultiplicityImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 76;

  /**
   * The feature id for the '<em><b>Multiplicity Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__MULTIPLICITY_RANGE = 0;

  /**
   * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__IS_ORDERED = 1;

  /**
   * The feature id for the '<em><b>Is Non Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__IS_NON_UNIQUE = 2;

  /**
   * The feature id for the '<em><b>Is Sequence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__IS_SEQUENCE = 3;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.MultiplicityRangeImpl <em>Multiplicity Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.MultiplicityRangeImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getMultiplicityRange()
   * @generated
   */
  int MULTIPLICITY_RANGE = 77;

  /**
   * The feature id for the '<em><b>Lower</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_RANGE__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_RANGE__UPPER = 1;

  /**
   * The number of structural features of the '<em>Multiplicity Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_RANGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.UnlimitedNaturalLiteralImpl <em>Unlimited Natural Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.UnlimitedNaturalLiteralImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getUnlimitedNaturalLiteral()
   * @generated
   */
  int UNLIMITED_NATURAL_LITERAL = 78;

  /**
   * The feature id for the '<em><b>Integer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_NATURAL_LITERAL__INTEGER = 0;

  /**
   * The feature id for the '<em><b>Star</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_NATURAL_LITERAL__STAR = 1;

  /**
   * The number of structural features of the '<em>Unlimited Natural Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNLIMITED_NATURAL_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.OperationDefinitionOrStubImpl <em>Operation Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.OperationDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getOperationDefinitionOrStub()
   * @generated
   */
  int OPERATION_DEFINITION_OR_STUB = 80;

  /**
   * The number of structural features of the '<em>Operation Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT = FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.OperationDeclarationImpl <em>Operation Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.OperationDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getOperationDeclaration()
   * @generated
   */
  int OPERATION_DECLARATION = 79;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__IS_ABSTRACT = OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__NAME = OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__FORMAL_PARAMETERS = OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Type Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__TYPE_PART = OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Redefinition Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__REDEFINITION_CLAUSE = OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION__BLOCK = OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Operation Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DECLARATION_FEATURE_COUNT = OPERATION_DEFINITION_OR_STUB_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.RedefinitionClauseImpl <em>Redefinition Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.RedefinitionClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getRedefinitionClause()
   * @generated
   */
  int REDEFINITION_CLAUSE = 81;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDEFINITION_CLAUSE__QUALIFIED_NAME_LIST = 0;

  /**
   * The number of structural features of the '<em>Redefinition Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDEFINITION_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ReceptionDefinitionImpl <em>Reception Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ReceptionDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getReceptionDefinition()
   * @generated
   */
  int RECEPTION_DEFINITION = 82;

  /**
   * The feature id for the '<em><b>Reception Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEPTION_DEFINITION__RECEPTION_NAME = ACTIVE_FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reception Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEPTION_DEFINITION_FEATURE_COUNT = ACTIVE_FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SignalReceptionDeclarationImpl <em>Signal Reception Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SignalReceptionDeclarationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSignalReceptionDeclaration()
   * @generated
   */
  int SIGNAL_RECEPTION_DECLARATION = 83;

  /**
   * The feature id for the '<em><b>Signal Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION_DECLARATION__SIGNAL_NAME = 0;

  /**
   * The feature id for the '<em><b>Specialization Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION_DECLARATION__SPECIALIZATION_CLAUSE = 1;

  /**
   * The number of structural features of the '<em>Signal Reception Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SignalReceptionDefinitionOrStubImpl <em>Signal Reception Definition Or Stub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SignalReceptionDefinitionOrStubImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSignalReceptionDefinitionOrStub()
   * @generated
   */
  int SIGNAL_RECEPTION_DEFINITION_OR_STUB = 84;

  /**
   * The feature id for the '<em><b>Signal Reception Or Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION_DEFINITION_OR_STUB__SIGNAL_RECEPTION_OR_DECLARATION = ACTIVE_FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION_DEFINITION_OR_STUB__STRUCTURED_BODY = ACTIVE_FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Signal Reception Definition Or Stub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_RECEPTION_DEFINITION_OR_STUB_FEATURE_COUNT = ACTIVE_FEATURE_DEFINITION_OR_STUB_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NameImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getName_()
   * @generated
   */
  int NAME = 85;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__ID = 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.QualifiedNameImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 86;

  /**
   * The feature id for the '<em><b>Unqualified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__UNQUALIFIED = 0;

  /**
   * The feature id for the '<em><b>Name Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__NAME_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ColonQualifiedNameCompletionImpl <em>Colon Qualified Name Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ColonQualifiedNameCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getColonQualifiedNameCompletion()
   * @generated
   */
  int COLON_QUALIFIED_NAME_COMPLETION = 87;

  /**
   * The feature id for the '<em><b>Named Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION__NAMED_BINDINGS = 0;

  /**
   * The number of structural features of the '<em>Colon Qualified Name Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.UnqualifiedNameImpl <em>Unqualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.UnqualifiedNameImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getUnqualifiedName()
   * @generated
   */
  int UNQUALIFIED_NAME = 88;

  /**
   * The number of structural features of the '<em>Unqualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNQUALIFIED_NAME_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NameBindingImpl <em>Name Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NameBindingImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNameBinding()
   * @generated
   */
  int NAME_BINDING = 89;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_BINDING__NAME = UNQUALIFIED_NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_BINDING__TEMPLATE_BINDING = UNQUALIFIED_NAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Name Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_BINDING_FEATURE_COUNT = UNQUALIFIED_NAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.QualifiedNameWithoutBindingImpl <em>Qualified Name Without Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.QualifiedNameWithoutBindingImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getQualifiedNameWithoutBinding()
   * @generated
   */
  int QUALIFIED_NAME_WITHOUT_BINDING = 90;

  /**
   * The feature id for the '<em><b>Unqualified</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITHOUT_BINDING__UNQUALIFIED = 0;

  /**
   * The feature id for the '<em><b>Name Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITHOUT_BINDING__NAME_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Qualified Name Without Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITHOUT_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ColonQualifiedNameCompletionWithoutBindingImpl <em>Colon Qualified Name Completion Without Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ColonQualifiedNameCompletionWithoutBindingImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getColonQualifiedNameCompletionWithoutBinding()
   * @generated
   */
  int COLON_QUALIFIED_NAME_COMPLETION_WITHOUT_BINDING = 91;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION_WITHOUT_BINDING__NAMES = 0;

  /**
   * The number of structural features of the '<em>Colon Qualified Name Completion Without Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLON_QUALIFIED_NAME_COMPLETION_WITHOUT_BINDING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TemplateBindingImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTemplateBinding()
   * @generated
   */
  int TEMPLATE_BINDING = 92;

  /**
   * The number of structural features of the '<em>Template Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PositionalTemplateBindingImpl <em>Positional Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PositionalTemplateBindingImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPositionalTemplateBinding()
   * @generated
   */
  int POSITIONAL_TEMPLATE_BINDING = 93;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_TEMPLATE_BINDING__QUALIFIED_NAME = TEMPLATE_BINDING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Positional Template Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_TEMPLATE_BINDING_FEATURE_COUNT = TEMPLATE_BINDING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NamedTemplateBindingImpl <em>Named Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NamedTemplateBindingImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNamedTemplateBinding()
   * @generated
   */
  int NAMED_TEMPLATE_BINDING = 94;

  /**
   * The feature id for the '<em><b>Template Parameter Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TEMPLATE_BINDING__TEMPLATE_PARAMETER_SUBSTITUTION = TEMPLATE_BINDING_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Template Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TEMPLATE_BINDING_FEATURE_COUNT = TEMPLATE_BINDING_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TemplateParameterSubstitutionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTemplateParameterSubstitution()
   * @generated
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION = 95;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__QUALIFIED_NAME = 1;

  /**
   * The number of structural features of the '<em>Template Parameter Substitution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.InitializationExpressionImpl <em>Initialization Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.InitializationExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getInitializationExpression()
   * @generated
   */
  int INITIALIZATION_EXPRESSION = 186;

  /**
   * The number of structural features of the '<em>Initialization Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 96;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__UNARY_EXPRESSION = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION_COMPLETION = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NonNameExpressionImpl <em>Non Name Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NonNameExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNonNameExpression()
   * @generated
   */
  int NON_NAME_EXPRESSION = 97;

  /**
   * The feature id for the '<em><b>Non Name Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_EXPRESSION__NON_NAME_UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_EXPRESSION__EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Non Name Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NameToExpressionCompletionImpl <em>Name To Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NameToExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNameToExpressionCompletion()
   * @generated
   */
  int NAME_TO_EXPRESSION_COMPLETION = 98;

  /**
   * The feature id for the '<em><b>Name To Primary</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_EXPRESSION_COMPLETION__NAME_TO_PRIMARY = 0;

  /**
   * The feature id for the '<em><b>Primary To Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_EXPRESSION_COMPLETION__PRIMARY_TO_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Name To Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PrimaryToExpressionCompletionImpl <em>Primary To Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PrimaryToExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPrimaryToExpressionCompletion()
   * @generated
   */
  int PRIMARY_TO_EXPRESSION_COMPLETION = 99;

  /**
   * The feature id for the '<em><b>Post Fix Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_TO_EXPRESSION_COMPLETION__POST_FIX_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_TO_EXPRESSION_COMPLETION__EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Primary To Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_TO_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ExpressionCompletionImpl <em>Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getExpressionCompletion()
   * @generated
   */
  int EXPRESSION_COMPLETION = 100;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_COMPLETION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PrimaryExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 101;

  /**
   * The feature id for the '<em><b>Name Or Primary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__NAME_OR_PRIMARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Base Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__BASE_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Parenthesized Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PARENTHESIZED_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Primary Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__PRIMARY_EXPRESSION_COMPLETION = 3;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BaseExpressionImpl <em>Base Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BaseExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBaseExpression()
   * @generated
   */
  int BASE_EXPRESSION = 102;

  /**
   * The number of structural features of the '<em>Base Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NameToPrimaryExpressionImpl <em>Name To Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NameToPrimaryExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNameToPrimaryExpression()
   * @generated
   */
  int NAME_TO_PRIMARY_EXPRESSION = 103;

  /**
   * The feature id for the '<em><b>Link Operation Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_PRIMARY_EXPRESSION__LINK_OPERATION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Class Extent Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_PRIMARY_EXPRESSION__CLASS_EXTENT_EXPRESSION_COMPLETION = 1;

  /**
   * The feature id for the '<em><b>Sequence Construction Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_PRIMARY_EXPRESSION__SEQUENCE_CONSTRUCTION_COMPLETION = 2;

  /**
   * The feature id for the '<em><b>Behavior Invocation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_PRIMARY_EXPRESSION__BEHAVIOR_INVOCATION = 3;

  /**
   * The number of structural features of the '<em>Name To Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_TO_PRIMARY_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PrimaryExpressionCompletionImpl <em>Primary Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PrimaryExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPrimaryExpressionCompletion()
   * @generated
   */
  int PRIMARY_EXPRESSION_COMPLETION = 104;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_COMPLETION__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Primary Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexImpl <em>Feature Or Sequence Operation Or Reduction Or Expansion Or Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_IndexImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index()
   * @generated
   */
  int FEATURE_OR_SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_OR_INDEX = 105;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OR_SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_OR_INDEX__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Feature Invocation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OR_SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_OR_INDEX__FEATURE_INVOCATION = 1;

  /**
   * The feature id for the '<em><b>Sequence Operation Or Reduction Or Expansion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OR_SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_OR_INDEX__SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION = 2;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OR_SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_OR_INDEX__INDEX = 3;

  /**
   * The number of structural features of the '<em>Feature Or Sequence Operation Or Reduction Or Expansion Or Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_OR_SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_OR_INDEX_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.LiteralExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLiteralExpression()
   * @generated
   */
  int LITERAL_EXPRESSION = 106;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__EXPRESSION = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NameOrPrimaryExpressionImpl <em>Name Or Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NameOrPrimaryExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNameOrPrimaryExpression()
   * @generated
   */
  int NAME_OR_PRIMARY_EXPRESSION = 107;

  /**
   * The feature id for the '<em><b>Potentially Ambiguous Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_PRIMARY_EXPRESSION__POTENTIALLY_AMBIGUOUS_QUALIFIED_NAME = 0;

  /**
   * The feature id for the '<em><b>Name To Primary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_PRIMARY_EXPRESSION__NAME_TO_PRIMARY_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Name Or Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_OR_PRIMARY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ThisExpressionImpl <em>This Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ThisExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getThisExpression()
   * @generated
   */
  int THIS_EXPRESSION = 108;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_EXPRESSION__TUPLE = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>This Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_EXPRESSION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ParenthesizedExpressionImpl <em>Parenthesized Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ParenthesizedExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getParenthesizedExpression()
   * @generated
   */
  int PARENTHESIZED_EXPRESSION = 109;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Parenthesized Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIZED_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.FeatureImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 110;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.TupleImpl <em>Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.TupleImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getTuple()
   * @generated
   */
  int TUPLE = 111;

  /**
   * The feature id for the '<em><b>Named Tuple Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE__NAMED_TUPLE_EXPRESSION_LIST = 0;

  /**
   * The feature id for the '<em><b>Positional Tuple Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE__POSITIONAL_TUPLE_EXPRESSION_LIST = 1;

  /**
   * The number of structural features of the '<em>Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PositionalTupleExpressionListImpl <em>Positional Tuple Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PositionalTupleExpressionListImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPositionalTupleExpressionList()
   * @generated
   */
  int POSITIONAL_TUPLE_EXPRESSION_LIST = 112;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_TUPLE_EXPRESSION_LIST__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Positional Tuple Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_TUPLE_EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PositionalTupleExpressionListCompletionImpl <em>Positional Tuple Expression List Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PositionalTupleExpressionListCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPositionalTupleExpressionListCompletion()
   * @generated
   */
  int POSITIONAL_TUPLE_EXPRESSION_LIST_COMPLETION = 113;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_TUPLE_EXPRESSION_LIST_COMPLETION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Positional Tuple Expression List Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITIONAL_TUPLE_EXPRESSION_LIST_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NamedTupleExpressionListImpl <em>Named Tuple Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NamedTupleExpressionListImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNamedTupleExpressionList()
   * @generated
   */
  int NAMED_TUPLE_EXPRESSION_LIST = 114;

  /**
   * The feature id for the '<em><b>Named Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TUPLE_EXPRESSION_LIST__NAMED_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Named Tuple Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_TUPLE_EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NamedExpressionImpl <em>Named Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NamedExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNamedExpression()
   * @generated
   */
  int NAMED_EXPRESSION = 115;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Named Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BehaviorInvocationImpl <em>Behavior Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BehaviorInvocationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBehaviorInvocation()
   * @generated
   */
  int BEHAVIOR_INVOCATION = 116;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_INVOCATION__TUPLE = 0;

  /**
   * The number of structural features of the '<em>Behavior Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_INVOCATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.FeatureInvocationImpl <em>Feature Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.FeatureInvocationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFeatureInvocation()
   * @generated
   */
  int FEATURE_INVOCATION = 117;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_INVOCATION__TUPLE = 0;

  /**
   * The number of structural features of the '<em>Feature Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_INVOCATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SuperInvocationExpressionImpl <em>Super Invocation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SuperInvocationExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSuperInvocationExpression()
   * @generated
   */
  int SUPER_INVOCATION_EXPRESSION = 118;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_EXPRESSION__QUALIFIED_NAME = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_EXPRESSION__TUPLE = BASE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Super Invocation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_INVOCATION_EXPRESSION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.InstanceCreationOrSequenceConstructionExpressionImpl <em>Instance Creation Or Sequence Construction Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.InstanceCreationOrSequenceConstructionExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getInstanceCreationOrSequenceConstructionExpression()
   * @generated
   */
  int INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION = 119;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__QUALIFIED_NAME = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sequence Construction Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION = BASE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION__TUPLE = BASE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Instance Creation Or Sequence Construction Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_CREATION_OR_SEQUENCE_CONSTRUCTION_EXPRESSION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.LinkOperationCompletionImpl <em>Link Operation Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.LinkOperationCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLinkOperationCompletion()
   * @generated
   */
  int LINK_OPERATION_COMPLETION = 120;

  /**
   * The feature id for the '<em><b>Link Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_COMPLETION__LINK_OPERATION = 0;

  /**
   * The feature id for the '<em><b>Link Operation Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_COMPLETION__LINK_OPERATION_TUPLE = 1;

  /**
   * The number of structural features of the '<em>Link Operation Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.LinkOperationTupleImpl <em>Link Operation Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.LinkOperationTupleImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLinkOperationTuple()
   * @generated
   */
  int LINK_OPERATION_TUPLE = 121;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__INDEX = 1;

  /**
   * The feature id for the '<em><b>Index Named Expression List Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__INDEX_NAMED_EXPRESSION_LIST_COMPLETION = 2;

  /**
   * The feature id for the '<em><b>Primary To Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__PRIMARY_TO_EXPRESSION_COMPLETION = 3;

  /**
   * The feature id for the '<em><b>Positional Tuple Expression List Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__POSITIONAL_TUPLE_EXPRESSION_LIST_COMPLETION = 4;

  /**
   * The feature id for the '<em><b>Indexed Named Expression List Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__INDEXED_NAMED_EXPRESSION_LIST_COMPLETION = 5;

  /**
   * The feature id for the '<em><b>Name To Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__NAME_TO_EXPRESSION_COMPLETION = 6;

  /**
   * The feature id for the '<em><b>Positional Tuple Expression List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE__POSITIONAL_TUPLE_EXPRESSION_LIST = 7;

  /**
   * The number of structural features of the '<em>Link Operation Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_OPERATION_TUPLE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.IndexedNamedExpressionListCompletionImpl <em>Indexed Named Expression List Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.IndexedNamedExpressionListCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getIndexedNamedExpressionListCompletion()
   * @generated
   */
  int INDEXED_NAMED_EXPRESSION_LIST_COMPLETION = 122;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_NAMED_EXPRESSION_LIST_COMPLETION__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Indexed Named Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_NAMED_EXPRESSION_LIST_COMPLETION__INDEXED_NAMED_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Indexed Named Expression List Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_NAMED_EXPRESSION_LIST_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.IndexedNamedExpressionImpl <em>Indexed Named Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.IndexedNamedExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getIndexedNamedExpression()
   * @generated
   */
  int INDEXED_NAMED_EXPRESSION = 123;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_NAMED_EXPRESSION__NAME = 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_NAMED_EXPRESSION__INDEX = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_NAMED_EXPRESSION__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Indexed Named Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEXED_NAMED_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassExtentExpressionCompletionImpl <em>Class Extent Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassExtentExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassExtentExpressionCompletion()
   * @generated
   */
  int CLASS_EXTENT_EXPRESSION_COMPLETION = 124;

  /**
   * The number of structural features of the '<em>Class Extent Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXTENT_EXPRESSION_COMPLETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequenceAnyExpressionImpl <em>Sequence Any Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequenceAnyExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequenceAnyExpression()
   * @generated
   */
  int SEQUENCE_ANY_EXPRESSION = 125;

  /**
   * The feature id for the '<em><b>Sequence Construction Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ANY_EXPRESSION__SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION = BASE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence Any Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ANY_EXPRESSION_FEATURE_COUNT = BASE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequenceConstructionExpressionCompletionImpl <em>Sequence Construction Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequenceConstructionExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequenceConstructionExpressionCompletion()
   * @generated
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION = 126;

  /**
   * The feature id for the '<em><b>Multiplicity Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION__MULTIPLICITY_INDICATOR = 0;

  /**
   * The feature id for the '<em><b>Sequence Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION__SEQUENCE_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Sequence Construction Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_CONSTRUCTION_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.MultiplicityIndicatorImpl <em>Multiplicity Indicator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.MultiplicityIndicatorImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getMultiplicityIndicator()
   * @generated
   */
  int MULTIPLICITY_INDICATOR = 127;

  /**
   * The number of structural features of the '<em>Multiplicity Indicator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_INDICATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequenceElementsImpl <em>Sequence Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequenceElementsImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequenceElements()
   * @generated
   */
  int SEQUENCE_ELEMENTS = 128;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENTS__EXPRESSION1 = 0;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENTS__EXPRESSION2 = 1;

  /**
   * The feature id for the '<em><b>Sequence Element List Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENTS__SEQUENCE_ELEMENT_LIST_COMPLETION = 2;

  /**
   * The feature id for the '<em><b>Sequence Initialization Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENTS__SEQUENCE_INITIALIZATION_EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Sequence Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENTS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequenceElementListCompletionImpl <em>Sequence Element List Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequenceElementListCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequenceElementListCompletion()
   * @generated
   */
  int SEQUENCE_ELEMENT_LIST_COMPLETION = 129;

  /**
   * The feature id for the '<em><b>Sequence Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENT_LIST_COMPLETION__SEQUENCE_ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Sequence Element List Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENT_LIST_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequenceElementImpl <em>Sequence Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequenceElementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequenceElement()
   * @generated
   */
  int SEQUENCE_ELEMENT = 130;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Sequence Initialization Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENT__SEQUENCE_INITIALIZATION_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Sequence Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequenceInitializationExpressionImpl <em>Sequence Initialization Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequenceInitializationExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequenceInitializationExpression()
   * @generated
   */
  int SEQUENCE_INITIALIZATION_EXPRESSION = 131;

  /**
   * The feature id for the '<em><b>Is New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_INITIALIZATION_EXPRESSION__IS_NEW = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sequence Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_INITIALIZATION_EXPRESSION__SEQUENCE_ELEMENTS = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sequence Initialization Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_INITIALIZATION_EXPRESSION_FEATURE_COUNT = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.IndexImpl <em>Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.IndexImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getIndex()
   * @generated
   */
  int INDEX = 132;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequenceOperationOrReductionOrExpansionImpl <em>Sequence Operation Or Reduction Or Expansion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequenceOperationOrReductionOrExpansionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION = 133;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__QUALIFIED_NAME = 0;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__TUPLE = 1;

  /**
   * The feature id for the '<em><b>Is Reduce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__IS_REDUCE = 2;

  /**
   * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__IS_ORDERED = 3;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__TEMPLATE_BINDING = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__ID = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__NAME = 6;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION__EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Sequence Operation Or Reduction Or Expansion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_OPERATION_OR_REDUCTION_OR_EXPANSION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PostfixExpressionCompletionImpl <em>Postfix Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PostfixExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPostfixExpressionCompletion()
   * @generated
   */
  int POSTFIX_EXPRESSION_COMPLETION = 134;

  /**
   * The feature id for the '<em><b>Primary Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION_COMPLETION__PRIMARY_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Postfix Operation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION_COMPLETION__POSTFIX_OPERATION = 1;

  /**
   * The number of structural features of the '<em>Postfix Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PostfixOperationImpl <em>Postfix Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PostfixOperationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPostfixOperation()
   * @generated
   */
  int POSTFIX_OPERATION = 135;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OPERATION__OPERATOR = 0;

  /**
   * The number of structural features of the '<em>Postfix Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OPERATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.UnaryExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 137;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NonPostfixNonCastUnaryExpressionImpl <em>Non Postfix Non Cast Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NonPostfixNonCastUnaryExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNonPostfixNonCastUnaryExpression()
   * @generated
   */
  int NON_POSTFIX_NON_CAST_UNARY_EXPRESSION = 141;

  /**
   * The number of structural features of the '<em>Non Postfix Non Cast Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PrefixExpressionImpl <em>Prefix Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PrefixExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPrefixExpression()
   * @generated
   */
  int PREFIX_EXPRESSION = 136;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_EXPRESSION__OPERATOR = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Primary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_EXPRESSION__PRIMARY_EXPRESSION = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Prefix Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_EXPRESSION_FEATURE_COUNT = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.PostfixOrCastExpressionImpl <em>Postfix Or Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.PostfixOrCastExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getPostfixOrCastExpression()
   * @generated
   */
  int POSTFIX_OR_CAST_EXPRESSION = 138;

  /**
   * The feature id for the '<em><b>Non Name Postfix Or Cast Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OR_CAST_EXPRESSION__NON_NAME_POSTFIX_OR_CAST_EXPRESSION = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name Or Primary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OR_CAST_EXPRESSION__NAME_OR_PRIMARY_EXPRESSION = UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Post Fix Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OR_CAST_EXPRESSION__POST_FIX_EXPRESSION_COMPLETION = UNARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Postfix Or Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_OR_CAST_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NonNameUnaryExpressionImpl <em>Non Name Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NonNameUnaryExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNonNameUnaryExpression()
   * @generated
   */
  int NON_NAME_UNARY_EXPRESSION = 139;

  /**
   * The number of structural features of the '<em>Non Name Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NonNamePostfixOrCastExpressionImpl <em>Non Name Postfix Or Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NonNamePostfixOrCastExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNonNamePostfixOrCastExpression()
   * @generated
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION = 140;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__ANY = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cast Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__CAST_COMPLETION = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Potentially Ambiguous Qualified Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__POTENTIALLY_AMBIGUOUS_QUALIFIED_NAME = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Postifix Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__POSTIFIX_EXPRESSION_COMPLETION = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Name To Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__NAME_TO_EXPRESSION_COMPLETION = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Postfix Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__POSTFIX_EXPRESSION_COMPLETION = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Non Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__NON_NAME_EXPRESSION = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Base Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION__BASE_EXPRESSION = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Non Name Postfix Or Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_NAME_POSTFIX_OR_CAST_EXPRESSION_FEATURE_COUNT = NON_NAME_UNARY_EXPRESSION_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BooleanNegationExpressionImpl <em>Boolean Negation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BooleanNegationExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBooleanNegationExpression()
   * @generated
   */
  int BOOLEAN_NEGATION_EXPRESSION = 142;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_NEGATION_EXPRESSION__UNARY_EXPRESSION = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Negation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_NEGATION_EXPRESSION_FEATURE_COUNT = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BitStringComplementExpressionImpl <em>Bit String Complement Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BitStringComplementExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBitStringComplementExpression()
   * @generated
   */
  int BIT_STRING_COMPLEMENT_EXPRESSION = 143;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STRING_COMPLEMENT_EXPRESSION__UNARY_EXPRESSION = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bit String Complement Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STRING_COMPLEMENT_EXPRESSION_FEATURE_COUNT = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NumericUnaryExpressionImpl <em>Numeric Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NumericUnaryExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNumericUnaryExpression()
   * @generated
   */
  int NUMERIC_UNARY_EXPRESSION = 144;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_UNARY_EXPRESSION__OPERATOR = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_UNARY_EXPRESSION__UNARY_EXPRESSION = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Numeric Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_UNARY_EXPRESSION_FEATURE_COUNT = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.IsolationExpressionImpl <em>Isolation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.IsolationExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getIsolationExpression()
   * @generated
   */
  int ISOLATION_EXPRESSION = 145;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISOLATION_EXPRESSION__UNARY_EXPRESSION = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Isolation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ISOLATION_EXPRESSION_FEATURE_COUNT = NON_POSTFIX_NON_CAST_UNARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.CastCompletionImpl <em>Cast Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.CastCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getCastCompletion()
   * @generated
   */
  int CAST_COMPLETION = 146;

  /**
   * The number of structural features of the '<em>Cast Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_COMPLETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.MultiplicativeExpressionImpl <em>Multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.MultiplicativeExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getMultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 147;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Multiplicative Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.MultiplicativeExpressionCompletionImpl <em>Multiplicative Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.MultiplicativeExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getMultiplicativeExpressionCompletion()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION_COMPLETION = 148;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_COMPLETION__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_COMPLETION__UNARY_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Multiplicative Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AdditiveExpressionImpl <em>Additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AdditiveExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAdditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 149;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Additive Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AdditiveExpressionCompletionImpl <em>Additive Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AdditiveExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAdditiveExpressionCompletion()
   * @generated
   */
  int ADDITIVE_EXPRESSION_COMPLETION = 150;

  /**
   * The feature id for the '<em><b>Multiplicative Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_COMPLETION__MULTIPLICATIVE_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_COMPLETION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Multiplicative Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_COMPLETION__MULTIPLICATIVE_EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Additive Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_COMPLETION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ShiftExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getShiftExpression()
   * @generated
   */
  int SHIFT_EXPRESSION = 151;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Shift Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION__SHIFT_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Shift Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ShiftExpressionCompletionImpl <em>Shift Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ShiftExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getShiftExpressionCompletion()
   * @generated
   */
  int SHIFT_EXPRESSION_COMPLETION = 152;

  /**
   * The feature id for the '<em><b>Additive Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_COMPLETION__ADDITIVE_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_COMPLETION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Additive Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_COMPLETION__ADDITIVE_EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Shift Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHIFT_EXPRESSION_COMPLETION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.RelationalExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getRelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 153;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Relational Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.RelationalExpressionCompletionImpl <em>Relational Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.RelationalExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getRelationalExpressionCompletion()
   * @generated
   */
  int RELATIONAL_EXPRESSION_COMPLETION = 154;

  /**
   * The feature id for the '<em><b>Shift Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_COMPLETION__SHIFT_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Relational Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_COMPLETION__RELATIONAL_OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Shift Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_COMPLETION__SHIFT_EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Relational Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_COMPLETION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassificationExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassificationExpression()
   * @generated
   */
  int CLASSIFICATION_EXPRESSION = 155;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Classification Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION__CLASSIFICATION_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Classification Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassificationExpressionCompletionImpl <em>Classification Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassificationExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassificationExpressionCompletion()
   * @generated
   */
  int CLASSIFICATION_EXPRESSION_COMPLETION = 156;

  /**
   * The feature id for the '<em><b>Relational Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION_COMPLETION__RELATIONAL_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION_COMPLETION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION_COMPLETION__NAME = 2;

  /**
   * The number of structural features of the '<em>Classification Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_EXPRESSION_COMPLETION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EqualityExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 157;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Classification Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__CLASSIFICATION_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EqualityExpressionCompletionImpl <em>Equality Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EqualityExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEqualityExpressionCompletion()
   * @generated
   */
  int EQUALITY_EXPRESSION_COMPLETION = 158;

  /**
   * The feature id for the '<em><b>Classification Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_COMPLETION__CLASSIFICATION_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_COMPLETION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Classification Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_COMPLETION__CLASSIFICATION_EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Equality Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_COMPLETION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AndExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 159;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>And Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__AND_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AndExpressionCompletionImpl <em>And Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AndExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAndExpressionCompletion()
   * @generated
   */
  int AND_EXPRESSION_COMPLETION = 160;

  /**
   * The feature id for the '<em><b>Equality Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_COMPLETION__EQUALITY_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Equality Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_COMPLETION__EQUALITY_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>And Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ExclusiveOrExpressionImpl <em>Exclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ExclusiveOrExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getExclusiveOrExpression()
   * @generated
   */
  int EXCLUSIVE_OR_EXPRESSION = 161;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Exclusive Or Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Exclusive Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ExclusiveOrExpressionCompletionImpl <em>Exclusive Or Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ExclusiveOrExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getExclusiveOrExpressionCompletion()
   * @generated
   */
  int EXCLUSIVE_OR_EXPRESSION_COMPLETION = 162;

  /**
   * The feature id for the '<em><b>And Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_COMPLETION__AND_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>And Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_COMPLETION__AND_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Exclusive Or Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSIVE_OR_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.InclusiveOrExpressionImpl <em>Inclusive Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.InclusiveOrExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getInclusiveOrExpression()
   * @generated
   */
  int INCLUSIVE_OR_EXPRESSION = 163;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Inclusive Or Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Inclusive Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.InclusiveOrExpressionCompletionImpl <em>Inclusive Or Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.InclusiveOrExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getInclusiveOrExpressionCompletion()
   * @generated
   */
  int INCLUSIVE_OR_EXPRESSION_COMPLETION = 164;

  /**
   * The feature id for the '<em><b>Exclusive Or Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_COMPLETION__EXCLUSIVE_OR_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Exclusive Or Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_COMPLETION__EXCLUSIVE_OR_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Inclusive Or Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUSIVE_OR_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ConditionalAndExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getConditionalAndExpression()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION = 165;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Conditional And Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION__CONDITIONAL_AND_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Conditional And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ConditionalAndExpressionCompletionImpl <em>Conditional And Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ConditionalAndExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getConditionalAndExpressionCompletion()
   * @generated
   */
  int CONDITIONAL_AND_EXPRESSION_COMPLETION = 166;

  /**
   * The feature id for the '<em><b>Inclusive Or Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_COMPLETION__INCLUSIVE_OR_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Inclusive Or Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_COMPLETION__INCLUSIVE_OR_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Conditional And Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_AND_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ConditionalOrExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getConditionalOrExpression()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION = 167;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Conditional Or Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION__CONDITIONAL_OR_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Conditional Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ConditionalOrExpressionCompletionImpl <em>Conditional Or Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ConditionalOrExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getConditionalOrExpressionCompletion()
   * @generated
   */
  int CONDITIONAL_OR_EXPRESSION_COMPLETION = 168;

  /**
   * The feature id for the '<em><b>Conditional And Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_COMPLETION__CONDITIONAL_AND_EXPRESSION_COMPLETION = 0;

  /**
   * The feature id for the '<em><b>Conditional And Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_COMPLETION__CONDITIONAL_AND_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Conditional Or Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_OR_EXPRESSION_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ConditionalExpressionImpl <em>Conditional Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ConditionalExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getConditionalExpression()
   * @generated
   */
  int CONDITIONAL_EXPRESSION = 169;

  /**
   * The feature id for the '<em><b>Unary Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__UNARY_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Conditional Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION__CONDITIONAL_EXPRESSION_COMPLETION = 1;

  /**
   * The number of structural features of the '<em>Conditional Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ConditionalExpressionCompletionImpl <em>Conditional Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ConditionalExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getConditionalExpressionCompletion()
   * @generated
   */
  int CONDITIONAL_EXPRESSION_COMPLETION = 170;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_COMPLETION__EXPRESSION = EXPRESSION_COMPLETION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Conditional Or Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_COMPLETION__CONDITIONAL_OR_EXPRESSION_COMPLETION = EXPRESSION_COMPLETION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Conditional Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_COMPLETION__CONDITIONAL_EXPRESSION = EXPRESSION_COMPLETION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conditional Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPRESSION_COMPLETION_FEATURE_COUNT = EXPRESSION_COMPLETION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AssignmentExpressionCompletionImpl <em>Assignment Expression Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AssignmentExpressionCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAssignmentExpressionCompletion()
   * @generated
   */
  int ASSIGNMENT_EXPRESSION_COMPLETION = 171;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_COMPLETION__EXPRESSION = EXPRESSION_COMPLETION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_COMPLETION__OPERATOR = EXPRESSION_COMPLETION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assignment Expression Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_EXPRESSION_COMPLETION_FEATURE_COUNT = EXPRESSION_COMPLETION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.StatementSequenceImpl <em>Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.StatementSequenceImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getStatementSequence()
   * @generated
   */
  int STATEMENT_SEQUENCE = 172;

  /**
   * The feature id for the '<em><b>Document Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE__DOCUMENT_STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Statement Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.DocumentedStatementImpl <em>Documented Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.DocumentedStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getDocumentedStatement()
   * @generated
   */
  int DOCUMENTED_STATEMENT = 173;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_STATEMENT__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_STATEMENT__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Documented Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.StatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 174;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BlockImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 175;

  /**
   * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENT_SEQUENCE = 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AnnotatedStatementImpl <em>Annotated Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AnnotatedStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAnnotatedStatement()
   * @generated
   */
  int ANNOTATED_STATEMENT = 176;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_STATEMENT__ANNOTATIONS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Annotated Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AnnotationsImpl <em>Annotations</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AnnotationsImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAnnotations()
   * @generated
   */
  int ANNOTATIONS = 177;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS__ANNOTATION = 0;

  /**
   * The number of structural features of the '<em>Annotations</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AnnotationImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 178;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ID = 0;

  /**
   * The feature id for the '<em><b>Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME_LIST = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NameListImpl <em>Name List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NameListImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNameList()
   * @generated
   */
  int NAME_LIST = 179;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_LIST__NAME = 0;

  /**
   * The number of structural features of the '<em>Name List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.InLineStatementImpl <em>In Line Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.InLineStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getInLineStatement()
   * @generated
   */
  int IN_LINE_STATEMENT = 180;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_STATEMENT__ID = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>In Line Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_LINE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BlockStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBlockStatement()
   * @generated
   */
  int BLOCK_STATEMENT = 181;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.EmptyStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEmptyStatement()
   * @generated
   */
  int EMPTY_STATEMENT = 182;

  /**
   * The number of structural features of the '<em>Empty Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.LocalNameDeclarationOrExpressionStatementImpl <em>Local Name Declaration Or Expression Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.LocalNameDeclarationOrExpressionStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLocalNameDeclarationOrExpressionStatement()
   * @generated
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT = 183;

  /**
   * The feature id for the '<em><b>Potentially Ambiguous Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT__POTENTIALLY_AMBIGUOUS_NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiplicaity Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT__MULTIPLICAITY_INDICATOR = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Local Name Declaration Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT__LOCAL_NAME_DECLARATION_COMPLETION = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Name To Expression Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT__NAME_TO_EXPRESSION_COMPLETION = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Non Name Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT__NON_NAME_EXPRESSION = STATEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Local Name Declaration Or Expression Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_OR_EXPRESSION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.LocalNameDeclarationStatementImpl <em>Local Name Declaration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.LocalNameDeclarationStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLocalNameDeclarationStatement()
   * @generated
   */
  int LOCAL_NAME_DECLARATION_STATEMENT = 184;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__TYPE_NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Multiplicity Indicator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__MULTIPLICITY_INDICATOR = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Local Name Declaration Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT__LOCAL_NAME_DECLARATION_COMPLETION = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Local Name Declaration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.LocalNameDeclarationStatementCompletionImpl <em>Local Name Declaration Statement Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.LocalNameDeclarationStatementCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLocalNameDeclarationStatementCompletion()
   * @generated
   */
  int LOCAL_NAME_DECLARATION_STATEMENT_COMPLETION = 185;

  /**
   * The feature id for the '<em><b>Initialization Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT_COMPLETION__INITIALIZATION_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Local Name Declaration Statement Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_NAME_DECLARATION_STATEMENT_COMPLETION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.InstanceInitializationExpressionImpl <em>Instance Initialization Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.InstanceInitializationExpressionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getInstanceInitializationExpression()
   * @generated
   */
  int INSTANCE_INITIALIZATION_EXPRESSION = 187;

  /**
   * The feature id for the '<em><b>Tuple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_INITIALIZATION_EXPRESSION__TUPLE = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instance Initialization Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_INITIALIZATION_EXPRESSION_FEATURE_COUNT = INITIALIZATION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.IfStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 188;

  /**
   * The feature id for the '<em><b>Sequential Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__SEQUENTIAL_CLAUSES = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Final Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__FINAL_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SequentialClausesImpl <em>Sequential Clauses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SequentialClausesImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSequentialClauses()
   * @generated
   */
  int SEQUENTIAL_CLAUSES = 189;

  /**
   * The feature id for the '<em><b>Concurrent Clauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL_CLAUSES__CONCURRENT_CLAUSES = 0;

  /**
   * The number of structural features of the '<em>Sequential Clauses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENTIAL_CLAUSES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ConcurrentClausesImpl <em>Concurrent Clauses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ConcurrentClausesImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getConcurrentClauses()
   * @generated
   */
  int CONCURRENT_CLAUSES = 190;

  /**
   * The feature id for the '<em><b>Non Final Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCURRENT_CLAUSES__NON_FINAL_CLAUSE = 0;

  /**
   * The number of structural features of the '<em>Concurrent Clauses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCURRENT_CLAUSES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NonFinalClauseImpl <em>Non Final Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NonFinalClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNonFinalClause()
   * @generated
   */
  int NON_FINAL_CLAUSE = 191;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FINAL_CLAUSE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FINAL_CLAUSE__BLOCK = 1;

  /**
   * The number of structural features of the '<em>Non Final Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_FINAL_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.FinalClauseImpl <em>Final Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.FinalClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getFinalClause()
   * @generated
   */
  int FINAL_CLAUSE = 192;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_CLAUSE__BLOCK = 0;

  /**
   * The number of structural features of the '<em>Final Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SwitchStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 193;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Switch Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__SWITCH_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Default Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__DEFAULT_CLAUSE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SwitchClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSwitchClause()
   * @generated
   */
  int SWITCH_CLAUSE = 194;

  /**
   * The feature id for the '<em><b>Switch Case</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CLAUSE__SWITCH_CASE = 0;

  /**
   * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CLAUSE__STATEMENT_SEQUENCE = 1;

  /**
   * The number of structural features of the '<em>Switch Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SwitchCaseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSwitchCase()
   * @generated
   */
  int SWITCH_CASE = 195;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SwitchDefaultClauseImpl <em>Switch Default Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SwitchDefaultClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSwitchDefaultClause()
   * @generated
   */
  int SWITCH_DEFAULT_CLAUSE = 196;

  /**
   * The feature id for the '<em><b>Statement Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFAULT_CLAUSE__STATEMENT_SEQUENCE = 0;

  /**
   * The number of structural features of the '<em>Switch Default Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_DEFAULT_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.NonEmptyStatementSequenceImpl <em>Non Empty Statement Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.NonEmptyStatementSequenceImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNonEmptyStatementSequence()
   * @generated
   */
  int NON_EMPTY_STATEMENT_SEQUENCE = 197;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_EMPTY_STATEMENT_SEQUENCE__STATEMENT = 0;

  /**
   * The number of structural features of the '<em>Non Empty Statement Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_EMPTY_STATEMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.WhileStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 198;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.DoStatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.DoStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getDoStatement()
   * @generated
   */
  int DO_STATEMENT = 199;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ForStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 200;

  /**
   * The feature id for the '<em><b>For Control</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__FOR_CONTROL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__BLOCK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ForControlImpl <em>For Control</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ForControlImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getForControl()
   * @generated
   */
  int FOR_CONTROL = 201;

  /**
   * The feature id for the '<em><b>Loop Variable Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL__LOOP_VARIABLE_DEFINITION = 0;

  /**
   * The number of structural features of the '<em>For Control</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_CONTROL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.LoopVariableDefinitionImpl <em>Loop Variable Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.LoopVariableDefinitionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLoopVariableDefinition()
   * @generated
   */
  int LOOP_VARIABLE_DEFINITION = 202;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__EXPRESSION1 = 1;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__EXPRESSION2 = 2;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__TYPE_NAME = 3;

  /**
   * The feature id for the '<em><b>Expression3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION__EXPRESSION3 = 4;

  /**
   * The number of structural features of the '<em>Loop Variable Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_VARIABLE_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.BreakStatementImpl <em>Break Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.BreakStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getBreakStatement()
   * @generated
   */
  int BREAK_STATEMENT = 203;

  /**
   * The number of structural features of the '<em>Break Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ReturnStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 204;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AcceptStatementImpl <em>Accept Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AcceptStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAcceptStatement()
   * @generated
   */
  int ACCEPT_STATEMENT = 205;

  /**
   * The feature id for the '<em><b>Accept Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__ACCEPT_CLAUSE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Simple Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__SIMPLE_COMPLETION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Compound Completion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT__COMPOUND_COMPLETION = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Accept Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.SimpleAcceptStatementCompletionImpl <em>Simple Accept Statement Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.SimpleAcceptStatementCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getSimpleAcceptStatementCompletion()
   * @generated
   */
  int SIMPLE_ACCEPT_STATEMENT_COMPLETION = 206;

  /**
   * The number of structural features of the '<em>Simple Accept Statement Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ACCEPT_STATEMENT_COMPLETION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.CompoundAcceptStatementCompletionImpl <em>Compound Accept Statement Completion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.CompoundAcceptStatementCompletionImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getCompoundAcceptStatementCompletion()
   * @generated
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION = 207;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION__BLOCK = 0;

  /**
   * The feature id for the '<em><b>Accept Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION__ACCEPT_BLOCK = 1;

  /**
   * The number of structural features of the '<em>Compound Accept Statement Completion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_ACCEPT_STATEMENT_COMPLETION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AcceptBlockImpl <em>Accept Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AcceptBlockImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAcceptBlock()
   * @generated
   */
  int ACCEPT_BLOCK = 208;

  /**
   * The feature id for the '<em><b>Accept Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_BLOCK__ACCEPT_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_BLOCK__BLOCK = 1;

  /**
   * The number of structural features of the '<em>Accept Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.AcceptClauseImpl <em>Accept Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.AcceptClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAcceptClause()
   * @generated
   */
  int ACCEPT_CLAUSE = 209;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_CLAUSE__NAME = 0;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_CLAUSE__QUALIFIED_NAME_LIST = 1;

  /**
   * The number of structural features of the '<em>Accept Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPT_CLAUSE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassifyStatementImpl <em>Classify Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassifyStatementImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassifyStatement()
   * @generated
   */
  int CLASSIFY_STATEMENT = 210;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFY_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Classification Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFY_STATEMENT__CLASSIFICATION_CLAUSE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Classify Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassificationClauseImpl <em>Classification Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassificationClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassificationClause()
   * @generated
   */
  int CLASSIFICATION_CLAUSE = 211;

  /**
   * The feature id for the '<em><b>Classification From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE__CLASSIFICATION_FROM_CLAUSE = 0;

  /**
   * The feature id for the '<em><b>Classification To Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE__CLASSIFICATION_TO_CLAUSE = 1;

  /**
   * The feature id for the '<em><b>Reclassify All Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE__RECLASSIFY_ALL_CLAUSE = 2;

  /**
   * The number of structural features of the '<em>Classification Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_CLAUSE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassificationFromClauseImpl <em>Classification From Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassificationFromClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassificationFromClause()
   * @generated
   */
  int CLASSIFICATION_FROM_CLAUSE = 212;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_FROM_CLAUSE__QUALIFIED_NAME_LIST = 0;

  /**
   * The number of structural features of the '<em>Classification From Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_FROM_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ClassificationToClauseImpl <em>Classification To Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ClassificationToClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassificationToClause()
   * @generated
   */
  int CLASSIFICATION_TO_CLAUSE = 213;

  /**
   * The feature id for the '<em><b>Qualified Name List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_TO_CLAUSE__QUALIFIED_NAME_LIST = 0;

  /**
   * The number of structural features of the '<em>Classification To Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_TO_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.ReclassifyAllClauseImpl <em>Reclassify All Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.ReclassifyAllClauseImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getReclassifyAllClause()
   * @generated
   */
  int RECLASSIFY_ALL_CLAUSE = 214;

  /**
   * The number of structural features of the '<em>Reclassify All Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECLASSIFY_ALL_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.impl.QualifiedNameListImpl <em>Qualified Name List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.impl.QualifiedNameListImpl
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getQualifiedNameList()
   * @generated
   */
  int QUALIFIED_NAME_LIST = 215;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_LIST__QUALIFIED_NAME = TAGGED_VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qualified Name List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_LIST_FEATURE_COUNT = TAGGED_VALUES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.ImportVisibilityIndicator <em>Import Visibility Indicator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.ImportVisibilityIndicator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getImportVisibilityIndicator()
   * @generated
   */
  int IMPORT_VISIBILITY_INDICATOR = 216;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.ParameterDirection <em>Parameter Direction</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.ParameterDirection
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getParameterDirection()
   * @generated
   */
  int PARAMETER_DIRECTION = 217;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.LinkOperation <em>Link Operation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.LinkOperation
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getLinkOperation()
   * @generated
   */
  int LINK_OPERATION = 218;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.AffixOperator <em>Affix Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.AffixOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAffixOperator()
   * @generated
   */
  int AFFIX_OPERATOR = 219;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.NumericUnaryOperator <em>Numeric Unary Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.NumericUnaryOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getNumericUnaryOperator()
   * @generated
   */
  int NUMERIC_UNARY_OPERATOR = 220;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.MultiplicativeOperator <em>Multiplicative Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.MultiplicativeOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getMultiplicativeOperator()
   * @generated
   */
  int MULTIPLICATIVE_OPERATOR = 221;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.AdditiveOperator <em>Additive Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.AdditiveOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAdditiveOperator()
   * @generated
   */
  int ADDITIVE_OPERATOR = 222;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.ShiftOperator <em>Shift Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.ShiftOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getShiftOperator()
   * @generated
   */
  int SHIFT_OPERATOR = 223;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.RelationalOperator <em>Relational Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.RelationalOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getRelationalOperator()
   * @generated
   */
  int RELATIONAL_OPERATOR = 224;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.ClassificationOperator <em>Classification Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.ClassificationOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getClassificationOperator()
   * @generated
   */
  int CLASSIFICATION_OPERATOR = 225;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.EqualityOperator <em>Equality Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.EqualityOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getEqualityOperator()
   * @generated
   */
  int EQUALITY_OPERATOR = 226;

  /**
   * The meta object id for the '{@link org.modelexecution.alf.AssignmentOperator <em>Assignment Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.modelexecution.alf.AssignmentOperator
   * @see org.modelexecution.alf.impl.AlfPackageImpl#getAssignmentOperator()
   * @generated
   */
  int ASSIGNMENT_OPERATOR = 227;


  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.OpaqueBehaviorBody <em>Opaque Behavior Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Opaque Behavior Body</em>'.
   * @see org.modelexecution.alf.OpaqueBehaviorBody
   * @generated
   */
  EClass getOpaqueBehaviorBody();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.OpaqueBehaviorBody#getBodydefinition <em>Bodydefinition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bodydefinition</em>'.
   * @see org.modelexecution.alf.OpaqueBehaviorBody#getBodydefinition()
   * @see #getOpaqueBehaviorBody()
   * @generated
   */
  EReference getOpaqueBehaviorBody_Bodydefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.UnitDefinition <em>Unit Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unit Definition</em>'.
   * @see org.modelexecution.alf.UnitDefinition
   * @generated
   */
  EClass getUnitDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.UnitDefinition#getNamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace Declaration</em>'.
   * @see org.modelexecution.alf.UnitDefinition#getNamespaceDeclaration()
   * @see #getUnitDefinition()
   * @generated
   */
  EReference getUnitDefinition_NamespaceDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.UnitDefinition#getImportDeclarations <em>Import Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Import Declarations</em>'.
   * @see org.modelexecution.alf.UnitDefinition#getImportDeclarations()
   * @see #getUnitDefinition()
   * @generated
   */
  EReference getUnitDefinition_ImportDeclarations();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.UnitDefinition#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.UnitDefinition#getComment()
   * @see #getUnitDefinition()
   * @generated
   */
  EAttribute getUnitDefinition_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.UnitDefinition#getStereotypeAnnotations <em>Stereotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stereotype Annotations</em>'.
   * @see org.modelexecution.alf.UnitDefinition#getStereotypeAnnotations()
   * @see #getUnitDefinition()
   * @generated
   */
  EReference getUnitDefinition_StereotypeAnnotations();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.UnitDefinition#getNamesapceDefinition <em>Namesapce Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namesapce Definition</em>'.
   * @see org.modelexecution.alf.UnitDefinition#getNamesapceDefinition()
   * @see #getUnitDefinition()
   * @generated
   */
  EReference getUnitDefinition_NamesapceDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BOOLEAN_LITERAL <em>BOOLEAN LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOLEAN LITERAL</em>'.
   * @see org.modelexecution.alf.BOOLEAN_LITERAL
   * @generated
   */
  EClass getBOOLEAN_LITERAL();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NUMBER_LITERAL <em>NUMBER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NUMBER LITERAL</em>'.
   * @see org.modelexecution.alf.NUMBER_LITERAL
   * @generated
   */
  EClass getNUMBER_LITERAL();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.INTEGER_LITERAL <em>INTEGER LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INTEGER LITERAL</em>'.
   * @see org.modelexecution.alf.INTEGER_LITERAL
   * @generated
   */
  EClass getINTEGER_LITERAL();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.UNLIMITED_NATURAL <em>UNLIMITED NATURAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UNLIMITED NATURAL</em>'.
   * @see org.modelexecution.alf.UNLIMITED_NATURAL
   * @generated
   */
  EClass getUNLIMITED_NATURAL();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.STRING_LITERAL <em>STRING LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING LITERAL</em>'.
   * @see org.modelexecution.alf.STRING_LITERAL
   * @generated
   */
  EClass getSTRING_LITERAL();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.StereotypeAnnotations <em>Stereotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stereotype Annotations</em>'.
   * @see org.modelexecution.alf.StereotypeAnnotations
   * @generated
   */
  EClass getStereotypeAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.StereotypeAnnotations#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see org.modelexecution.alf.StereotypeAnnotations#getAnnotation()
   * @see #getStereotypeAnnotations()
   * @generated
   */
  EReference getStereotypeAnnotations_Annotation();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.StereotypeAnnotation <em>Stereotype Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stereotype Annotation</em>'.
   * @see org.modelexecution.alf.StereotypeAnnotation
   * @generated
   */
  EClass getStereotypeAnnotation();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.StereotypeAnnotation#getStereotypeName <em>Stereotype Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stereotype Name</em>'.
   * @see org.modelexecution.alf.StereotypeAnnotation#getStereotypeName()
   * @see #getStereotypeAnnotation()
   * @generated
   */
  EReference getStereotypeAnnotation_StereotypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.StereotypeAnnotation#getTaggedValues <em>Tagged Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tagged Values</em>'.
   * @see org.modelexecution.alf.StereotypeAnnotation#getTaggedValues()
   * @see #getStereotypeAnnotation()
   * @generated
   */
  EReference getStereotypeAnnotation_TaggedValues();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TaggedValues <em>Tagged Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tagged Values</em>'.
   * @see org.modelexecution.alf.TaggedValues
   * @generated
   */
  EClass getTaggedValues();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TaggedValueList <em>Tagged Value List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tagged Value List</em>'.
   * @see org.modelexecution.alf.TaggedValueList
   * @generated
   */
  EClass getTaggedValueList();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.TaggedValueList#getTaggedValue <em>Tagged Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tagged Value</em>'.
   * @see org.modelexecution.alf.TaggedValueList#getTaggedValue()
   * @see #getTaggedValueList()
   * @generated
   */
  EReference getTaggedValueList_TaggedValue();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PRIMITIVE_LITERAL <em>PRIMITIVE LITERAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PRIMITIVE LITERAL</em>'.
   * @see org.modelexecution.alf.PRIMITIVE_LITERAL
   * @generated
   */
  EClass getPRIMITIVE_LITERAL();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.PRIMITIVE_LITERAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.modelexecution.alf.PRIMITIVE_LITERAL#getValue()
   * @see #getPRIMITIVE_LITERAL()
   * @generated
   */
  EAttribute getPRIMITIVE_LITERAL_Value();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TaggedValue <em>Tagged Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tagged Value</em>'.
   * @see org.modelexecution.alf.TaggedValue
   * @generated
   */
  EClass getTaggedValue();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.TaggedValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.TaggedValue#getName()
   * @see #getTaggedValue()
   * @generated
   */
  EReference getTaggedValue_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.TaggedValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.modelexecution.alf.TaggedValue#getValue()
   * @see #getTaggedValue()
   * @generated
   */
  EReference getTaggedValue_Value();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NamespaceDeclaration <em>Namespace Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Declaration</em>'.
   * @see org.modelexecution.alf.NamespaceDeclaration
   * @generated
   */
  EClass getNamespaceDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NamespaceDeclaration#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.NamespaceDeclaration#getQualifiedName()
   * @see #getNamespaceDeclaration()
   * @generated
   */
  EReference getNamespaceDeclaration_QualifiedName();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declaration</em>'.
   * @see org.modelexecution.alf.ImportDeclaration
   * @generated
   */
  EClass getImportDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ImportDeclaration#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see org.modelexecution.alf.ImportDeclaration#getVisibility()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_Visibility();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ImportDeclaration#getImportReference <em>Import Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Reference</em>'.
   * @see org.modelexecution.alf.ImportDeclaration#getImportReference()
   * @see #getImportDeclaration()
   * @generated
   */
  EReference getImportDeclaration_ImportReference();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ImportReference <em>Import Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Reference</em>'.
   * @see org.modelexecution.alf.ImportReference
   * @generated
   */
  EClass getImportReference();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ImportReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.ImportReference#getName()
   * @see #getImportReference()
   * @generated
   */
  EReference getImportReference_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ImportReference#getCompletion <em>Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Completion</em>'.
   * @see org.modelexecution.alf.ImportReference#getCompletion()
   * @see #getImportReference()
   * @generated
   */
  EReference getImportReference_Completion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ImportReference#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alias</em>'.
   * @see org.modelexecution.alf.ImportReference#getAlias()
   * @see #getImportReference()
   * @generated
   */
  EReference getImportReference_Alias();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ImportReference#isStar <em>Star</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Star</em>'.
   * @see org.modelexecution.alf.ImportReference#isStar()
   * @see #getImportReference()
   * @generated
   */
  EAttribute getImportReference_Star();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ImportReferenceQualifiedNameCompletion <em>Import Reference Qualified Name Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Reference Qualified Name Completion</em>'.
   * @see org.modelexecution.alf.ImportReferenceQualifiedNameCompletion
   * @generated
   */
  EClass getImportReferenceQualifiedNameCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference <em>Colon Qualified Name Completion Of Import Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colon Qualified Name Completion Of Import Reference</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference
   * @generated
   */
  EClass getColonQualifiedNameCompletionOfImportReference();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference#getName()
   * @see #getColonQualifiedNameCompletionOfImportReference()
   * @generated
   */
  EReference getColonQualifiedNameCompletionOfImportReference_Name();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference#isStar <em>Star</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Star</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference#isStar()
   * @see #getColonQualifiedNameCompletionOfImportReference()
   * @generated
   */
  EAttribute getColonQualifiedNameCompletionOfImportReference_Star();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alias</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionOfImportReference#getAlias()
   * @see #getColonQualifiedNameCompletionOfImportReference()
   * @generated
   */
  EReference getColonQualifiedNameCompletionOfImportReference_Alias();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AliasDefinition <em>Alias Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias Definition</em>'.
   * @see org.modelexecution.alf.AliasDefinition
   * @generated
   */
  EClass getAliasDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AliasDefinition#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alias</em>'.
   * @see org.modelexecution.alf.AliasDefinition#getAlias()
   * @see #getAliasDefinition()
   * @generated
   */
  EReference getAliasDefinition_Alias();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NamespaceDefinition <em>Namespace Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Definition</em>'.
   * @see org.modelexecution.alf.NamespaceDefinition
   * @generated
   */
  EClass getNamespaceDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.VisibilityIndicator <em>Visibility Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visibility Indicator</em>'.
   * @see org.modelexecution.alf.VisibilityIndicator
   * @generated
   */
  EClass getVisibilityIndicator();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.VisibilityIndicator#getPUBLIC <em>PUBLIC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>PUBLIC</em>'.
   * @see org.modelexecution.alf.VisibilityIndicator#getPUBLIC()
   * @see #getVisibilityIndicator()
   * @generated
   */
  EAttribute getVisibilityIndicator_PUBLIC();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.VisibilityIndicator#getPRIVATE <em>PRIVATE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>PRIVATE</em>'.
   * @see org.modelexecution.alf.VisibilityIndicator#getPRIVATE()
   * @see #getVisibilityIndicator()
   * @generated
   */
  EAttribute getVisibilityIndicator_PRIVATE();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.VisibilityIndicator#getPROTECTED <em>PROTECTED</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>PROTECTED</em>'.
   * @see org.modelexecution.alf.VisibilityIndicator#getPROTECTED()
   * @see #getVisibilityIndicator()
   * @generated
   */
  EAttribute getVisibilityIndicator_PROTECTED();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see org.modelexecution.alf.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EReference getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PackageDefinition <em>Package Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Definition</em>'.
   * @see org.modelexecution.alf.PackageDefinition
   * @generated
   */
  EClass getPackageDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PackageDefinition#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration</em>'.
   * @see org.modelexecution.alf.PackageDefinition#getDeclaration()
   * @see #getPackageDefinition()
   * @generated
   */
  EReference getPackageDefinition_Declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PackageDefinition#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.modelexecution.alf.PackageDefinition#getBody()
   * @see #getPackageDefinition()
   * @generated
   */
  EReference getPackageDefinition_Body();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PackageDefinitionOrStub <em>Package Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Definition Or Stub</em>'.
   * @see org.modelexecution.alf.PackageDefinitionOrStub
   * @generated
   */
  EClass getPackageDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PackageDefinitionOrStub#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaration</em>'.
   * @see org.modelexecution.alf.PackageDefinitionOrStub#getDeclaration()
   * @see #getPackageDefinitionOrStub()
   * @generated
   */
  EReference getPackageDefinitionOrStub_Declaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PackageDefinitionOrStub#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.modelexecution.alf.PackageDefinitionOrStub#getBody()
   * @see #getPackageDefinitionOrStub()
   * @generated
   */
  EReference getPackageDefinitionOrStub_Body();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PackageBody <em>Package Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Body</em>'.
   * @see org.modelexecution.alf.PackageBody
   * @generated
   */
  EClass getPackageBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.PackageBody#getPackagedElement <em>Packaged Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
   * @see org.modelexecution.alf.PackageBody#getPackagedElement()
   * @see #getPackageBody()
   * @generated
   */
  EReference getPackageBody_PackagedElement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PackagedElement <em>Packaged Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packaged Element</em>'.
   * @see org.modelexecution.alf.PackagedElement
   * @generated
   */
  EClass getPackagedElement();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.PackagedElement#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.PackagedElement#getComment()
   * @see #getPackagedElement()
   * @generated
   */
  EAttribute getPackagedElement_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PackagedElement#getStereotypeAnnotations <em>Stereotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stereotype Annotations</em>'.
   * @see org.modelexecution.alf.PackagedElement#getStereotypeAnnotations()
   * @see #getPackagedElement()
   * @generated
   */
  EReference getPackagedElement_StereotypeAnnotations();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.PackagedElement#getImportVisibilityIndicator <em>Import Visibility Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import Visibility Indicator</em>'.
   * @see org.modelexecution.alf.PackagedElement#getImportVisibilityIndicator()
   * @see #getPackagedElement()
   * @generated
   */
  EAttribute getPackagedElement_ImportVisibilityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PackagedElement#getPackagedElementDefinition <em>Packaged Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Packaged Element Definition</em>'.
   * @see org.modelexecution.alf.PackagedElement#getPackagedElementDefinition()
   * @see #getPackagedElement()
   * @generated
   */
  EReference getPackagedElement_PackagedElementDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PackagedElementDefinition <em>Packaged Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packaged Element Definition</em>'.
   * @see org.modelexecution.alf.PackagedElementDefinition
   * @generated
   */
  EClass getPackagedElementDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassifierDefinition <em>Classifier Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Definition</em>'.
   * @see org.modelexecution.alf.ClassifierDefinition
   * @generated
   */
  EClass getClassifierDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassifierDefinitionOrStub <em>Classifier Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Definition Or Stub</em>'.
   * @see org.modelexecution.alf.ClassifierDefinitionOrStub
   * @generated
   */
  EClass getClassifierDefinitionOrStub();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassifierSignature <em>Classifier Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Signature</em>'.
   * @see org.modelexecution.alf.ClassifierSignature
   * @generated
   */
  EClass getClassifierSignature();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassifierSignature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.ClassifierSignature#getName()
   * @see #getClassifierSignature()
   * @generated
   */
  EReference getClassifierSignature_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassifierSignature#getTemplateParameters <em>Template Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Parameters</em>'.
   * @see org.modelexecution.alf.ClassifierSignature#getTemplateParameters()
   * @see #getClassifierSignature()
   * @generated
   */
  EReference getClassifierSignature_TemplateParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassifierSignature#getSpecializationClause <em>Specialization Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specialization Clause</em>'.
   * @see org.modelexecution.alf.ClassifierSignature#getSpecializationClause()
   * @see #getClassifierSignature()
   * @generated
   */
  EReference getClassifierSignature_SpecializationClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TemplateParameters <em>Template Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameters</em>'.
   * @see org.modelexecution.alf.TemplateParameters
   * @generated
   */
  EClass getTemplateParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.TemplateParameters#getClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classifier Template Parameter</em>'.
   * @see org.modelexecution.alf.TemplateParameters#getClassifierTemplateParameter()
   * @see #getTemplateParameters()
   * @generated
   */
  EReference getTemplateParameters_ClassifierTemplateParameter();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier Template Parameter</em>'.
   * @see org.modelexecution.alf.ClassifierTemplateParameter
   * @generated
   */
  EClass getClassifierTemplateParameter();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ClassifierTemplateParameter#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.ClassifierTemplateParameter#getComment()
   * @see #getClassifierTemplateParameter()
   * @generated
   */
  EAttribute getClassifierTemplateParameter_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassifierTemplateParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.ClassifierTemplateParameter#getName()
   * @see #getClassifierTemplateParameter()
   * @generated
   */
  EReference getClassifierTemplateParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassifierTemplateParameter#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.ClassifierTemplateParameter#getQualifiedName()
   * @see #getClassifierTemplateParameter()
   * @generated
   */
  EReference getClassifierTemplateParameter_QualifiedName();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SpecializationClause <em>Specialization Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specialization Clause</em>'.
   * @see org.modelexecution.alf.SpecializationClause
   * @generated
   */
  EClass getSpecializationClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SpecializationClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.modelexecution.alf.SpecializationClause#getQualifiedNameList()
   * @see #getSpecializationClause()
   * @generated
   */
  EReference getSpecializationClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Declaration</em>'.
   * @see org.modelexecution.alf.ClassDeclaration
   * @generated
   */
  EClass getClassDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ClassDeclaration#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see org.modelexecution.alf.ClassDeclaration#isIsAbstract()
   * @see #getClassDeclaration()
   * @generated
   */
  EAttribute getClassDeclaration_IsAbstract();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassDeclaration#getClassifierSignature <em>Classifier Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classifier Signature</em>'.
   * @see org.modelexecution.alf.ClassDeclaration#getClassifierSignature()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_ClassifierSignature();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassDefinition <em>Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Definition</em>'.
   * @see org.modelexecution.alf.ClassDefinition
   * @generated
   */
  EClass getClassDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassDefinition#getClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Declaration</em>'.
   * @see org.modelexecution.alf.ClassDefinition#getClassDeclaration()
   * @see #getClassDefinition()
   * @generated
   */
  EReference getClassDefinition_ClassDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassDefinition#getClassBody <em>Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Body</em>'.
   * @see org.modelexecution.alf.ClassDefinition#getClassBody()
   * @see #getClassDefinition()
   * @generated
   */
  EReference getClassDefinition_ClassBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassDefinitionOrStub <em>Class Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Definition Or Stub</em>'.
   * @see org.modelexecution.alf.ClassDefinitionOrStub
   * @generated
   */
  EClass getClassDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassDefinitionOrStub#getClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Declaration</em>'.
   * @see org.modelexecution.alf.ClassDefinitionOrStub#getClassDeclaration()
   * @see #getClassDefinitionOrStub()
   * @generated
   */
  EReference getClassDefinitionOrStub_ClassDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassDefinitionOrStub#getClassBody <em>Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Body</em>'.
   * @see org.modelexecution.alf.ClassDefinitionOrStub#getClassBody()
   * @see #getClassDefinitionOrStub()
   * @generated
   */
  EReference getClassDefinitionOrStub_ClassBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassBody <em>Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Body</em>'.
   * @see org.modelexecution.alf.ClassBody
   * @generated
   */
  EClass getClassBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ClassBody#getClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Member</em>'.
   * @see org.modelexecution.alf.ClassBody#getClassMember()
   * @see #getClassBody()
   * @generated
   */
  EReference getClassBody_ClassMember();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Member</em>'.
   * @see org.modelexecution.alf.ClassMember
   * @generated
   */
  EClass getClassMember();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ClassMember#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.ClassMember#getComment()
   * @see #getClassMember()
   * @generated
   */
  EAttribute getClassMember_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassMember#getStereotypeAnnotations <em>Stereotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stereotype Annotations</em>'.
   * @see org.modelexecution.alf.ClassMember#getStereotypeAnnotations()
   * @see #getClassMember()
   * @generated
   */
  EReference getClassMember_StereotypeAnnotations();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassMember#getVisibilityIndicator <em>Visibility Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility Indicator</em>'.
   * @see org.modelexecution.alf.ClassMember#getVisibilityIndicator()
   * @see #getClassMember()
   * @generated
   */
  EReference getClassMember_VisibilityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassMember#getClassMemberDefinition <em>Class Member Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Member Definition</em>'.
   * @see org.modelexecution.alf.ClassMember#getClassMemberDefinition()
   * @see #getClassMember()
   * @generated
   */
  EReference getClassMember_ClassMemberDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassMemberDefinition <em>Class Member Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Member Definition</em>'.
   * @see org.modelexecution.alf.ClassMemberDefinition
   * @generated
   */
  EClass getClassMemberDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActiveClassDeclaration <em>Active Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Active Class Declaration</em>'.
   * @see org.modelexecution.alf.ActiveClassDeclaration
   * @generated
   */
  EClass getActiveClassDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ActiveClassDeclaration#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see org.modelexecution.alf.ActiveClassDeclaration#isIsAbstract()
   * @see #getActiveClassDeclaration()
   * @generated
   */
  EAttribute getActiveClassDeclaration_IsAbstract();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassDeclaration#getClassifierSignature <em>Classifier Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classifier Signature</em>'.
   * @see org.modelexecution.alf.ActiveClassDeclaration#getClassifierSignature()
   * @see #getActiveClassDeclaration()
   * @generated
   */
  EReference getActiveClassDeclaration_ClassifierSignature();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActiveClassDefinition <em>Active Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Active Class Definition</em>'.
   * @see org.modelexecution.alf.ActiveClassDefinition
   * @generated
   */
  EClass getActiveClassDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassDefinition#getActiveClassDeclaration <em>Active Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Class Declaration</em>'.
   * @see org.modelexecution.alf.ActiveClassDefinition#getActiveClassDeclaration()
   * @see #getActiveClassDefinition()
   * @generated
   */
  EReference getActiveClassDefinition_ActiveClassDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassDefinition#getActiveClassBody <em>Active Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Class Body</em>'.
   * @see org.modelexecution.alf.ActiveClassDefinition#getActiveClassBody()
   * @see #getActiveClassDefinition()
   * @generated
   */
  EReference getActiveClassDefinition_ActiveClassBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActiveClassDefinitionOrStub <em>Active Class Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Active Class Definition Or Stub</em>'.
   * @see org.modelexecution.alf.ActiveClassDefinitionOrStub
   * @generated
   */
  EClass getActiveClassDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassDefinitionOrStub#getActiveClassDeclaration <em>Active Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Class Declaration</em>'.
   * @see org.modelexecution.alf.ActiveClassDefinitionOrStub#getActiveClassDeclaration()
   * @see #getActiveClassDefinitionOrStub()
   * @generated
   */
  EReference getActiveClassDefinitionOrStub_ActiveClassDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassDefinitionOrStub#getActiveClassBody <em>Active Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Class Body</em>'.
   * @see org.modelexecution.alf.ActiveClassDefinitionOrStub#getActiveClassBody()
   * @see #getActiveClassDefinitionOrStub()
   * @generated
   */
  EReference getActiveClassDefinitionOrStub_ActiveClassBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActiveClassBody <em>Active Class Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Active Class Body</em>'.
   * @see org.modelexecution.alf.ActiveClassBody
   * @generated
   */
  EClass getActiveClassBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ActiveClassBody#getActiveClassMember <em>Active Class Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Active Class Member</em>'.
   * @see org.modelexecution.alf.ActiveClassBody#getActiveClassMember()
   * @see #getActiveClassBody()
   * @generated
   */
  EReference getActiveClassBody_ActiveClassMember();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassBody#getBehaviorClasue <em>Behavior Clasue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behavior Clasue</em>'.
   * @see org.modelexecution.alf.ActiveClassBody#getBehaviorClasue()
   * @see #getActiveClassBody()
   * @generated
   */
  EReference getActiveClassBody_BehaviorClasue();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BehaviorClause <em>Behavior Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Clause</em>'.
   * @see org.modelexecution.alf.BehaviorClause
   * @generated
   */
  EClass getBehaviorClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.BehaviorClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.BehaviorClause#getBlock()
   * @see #getBehaviorClause()
   * @generated
   */
  EReference getBehaviorClause_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.BehaviorClause#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.BehaviorClause#getName()
   * @see #getBehaviorClause()
   * @generated
   */
  EReference getBehaviorClause_Name();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActiveClassMember <em>Active Class Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Active Class Member</em>'.
   * @see org.modelexecution.alf.ActiveClassMember
   * @generated
   */
  EClass getActiveClassMember();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ActiveClassMember#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.ActiveClassMember#getComment()
   * @see #getActiveClassMember()
   * @generated
   */
  EAttribute getActiveClassMember_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassMember#getStereotypeAnnotations <em>Stereotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stereotype Annotations</em>'.
   * @see org.modelexecution.alf.ActiveClassMember#getStereotypeAnnotations()
   * @see #getActiveClassMember()
   * @generated
   */
  EReference getActiveClassMember_StereotypeAnnotations();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassMember#getVisibilityIndicator <em>Visibility Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility Indicator</em>'.
   * @see org.modelexecution.alf.ActiveClassMember#getVisibilityIndicator()
   * @see #getActiveClassMember()
   * @generated
   */
  EReference getActiveClassMember_VisibilityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActiveClassMember#getActiveClassMemberDefinition <em>Active Class Member Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Active Class Member Definition</em>'.
   * @see org.modelexecution.alf.ActiveClassMember#getActiveClassMemberDefinition()
   * @see #getActiveClassMember()
   * @generated
   */
  EReference getActiveClassMember_ActiveClassMemberDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActiveClassMemberDefinition <em>Active Class Member Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Active Class Member Definition</em>'.
   * @see org.modelexecution.alf.ActiveClassMemberDefinition
   * @generated
   */
  EClass getActiveClassMemberDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.DataTypeDeclaration <em>Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Declaration</em>'.
   * @see org.modelexecution.alf.DataTypeDeclaration
   * @generated
   */
  EClass getDataTypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.DataTypeDeclaration#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see org.modelexecution.alf.DataTypeDeclaration#isIsAbstract()
   * @see #getDataTypeDeclaration()
   * @generated
   */
  EAttribute getDataTypeDeclaration_IsAbstract();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DataTypeDeclaration#getClassifierSignature <em>Classifier Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classifier Signature</em>'.
   * @see org.modelexecution.alf.DataTypeDeclaration#getClassifierSignature()
   * @see #getDataTypeDeclaration()
   * @generated
   */
  EReference getDataTypeDeclaration_ClassifierSignature();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.DataTypeDefinition <em>Data Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Definition</em>'.
   * @see org.modelexecution.alf.DataTypeDefinition
   * @generated
   */
  EClass getDataTypeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DataTypeDefinition#getDataTypeDeclaration <em>Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type Declaration</em>'.
   * @see org.modelexecution.alf.DataTypeDefinition#getDataTypeDeclaration()
   * @see #getDataTypeDefinition()
   * @generated
   */
  EReference getDataTypeDefinition_DataTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DataTypeDefinition#getStructureBody <em>Structure Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure Body</em>'.
   * @see org.modelexecution.alf.DataTypeDefinition#getStructureBody()
   * @see #getDataTypeDefinition()
   * @generated
   */
  EReference getDataTypeDefinition_StructureBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.DataTypeDefinitionOrStub <em>Data Type Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Definition Or Stub</em>'.
   * @see org.modelexecution.alf.DataTypeDefinitionOrStub
   * @generated
   */
  EClass getDataTypeDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DataTypeDefinitionOrStub#getDataTypeDeclaration <em>Data Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type Declaration</em>'.
   * @see org.modelexecution.alf.DataTypeDefinitionOrStub#getDataTypeDeclaration()
   * @see #getDataTypeDefinitionOrStub()
   * @generated
   */
  EReference getDataTypeDefinitionOrStub_DataTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DataTypeDefinitionOrStub#getStructureBody <em>Structure Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structure Body</em>'.
   * @see org.modelexecution.alf.DataTypeDefinitionOrStub#getStructureBody()
   * @see #getDataTypeDefinitionOrStub()
   * @generated
   */
  EReference getDataTypeDefinitionOrStub_StructureBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.StructuredBody <em>Structured Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structured Body</em>'.
   * @see org.modelexecution.alf.StructuredBody
   * @generated
   */
  EClass getStructuredBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.StructuredBody#getStructuredMember <em>Structured Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structured Member</em>'.
   * @see org.modelexecution.alf.StructuredBody#getStructuredMember()
   * @see #getStructuredBody()
   * @generated
   */
  EReference getStructuredBody_StructuredMember();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.StructuredMember <em>Structured Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structured Member</em>'.
   * @see org.modelexecution.alf.StructuredMember
   * @generated
   */
  EClass getStructuredMember();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.StructuredMember#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.StructuredMember#getComment()
   * @see #getStructuredMember()
   * @generated
   */
  EAttribute getStructuredMember_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.StructuredMember#getStreotypeAnnotations <em>Streotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Streotype Annotations</em>'.
   * @see org.modelexecution.alf.StructuredMember#getStreotypeAnnotations()
   * @see #getStructuredMember()
   * @generated
   */
  EReference getStructuredMember_StreotypeAnnotations();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.StructuredMember#isIsPublic <em>Is Public</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Public</em>'.
   * @see org.modelexecution.alf.StructuredMember#isIsPublic()
   * @see #getStructuredMember()
   * @generated
   */
  EAttribute getStructuredMember_IsPublic();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.StructuredMember#getPropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Definition</em>'.
   * @see org.modelexecution.alf.StructuredMember#getPropertyDefinition()
   * @see #getStructuredMember()
   * @generated
   */
  EReference getStructuredMember_PropertyDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AssociationDeclaration <em>Association Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association Declaration</em>'.
   * @see org.modelexecution.alf.AssociationDeclaration
   * @generated
   */
  EClass getAssociationDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.AssociationDeclaration#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see org.modelexecution.alf.AssociationDeclaration#isIsAbstract()
   * @see #getAssociationDeclaration()
   * @generated
   */
  EAttribute getAssociationDeclaration_IsAbstract();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AssociationDeclaration#getClassifierSignature <em>Classifier Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classifier Signature</em>'.
   * @see org.modelexecution.alf.AssociationDeclaration#getClassifierSignature()
   * @see #getAssociationDeclaration()
   * @generated
   */
  EReference getAssociationDeclaration_ClassifierSignature();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AssociationDefinition <em>Association Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association Definition</em>'.
   * @see org.modelexecution.alf.AssociationDefinition
   * @generated
   */
  EClass getAssociationDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AssociationDefinition#getAssociationDeclaration <em>Association Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Association Declaration</em>'.
   * @see org.modelexecution.alf.AssociationDefinition#getAssociationDeclaration()
   * @see #getAssociationDefinition()
   * @generated
   */
  EReference getAssociationDefinition_AssociationDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AssociationDefinition#getStructuredBody <em>Structured Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Body</em>'.
   * @see org.modelexecution.alf.AssociationDefinition#getStructuredBody()
   * @see #getAssociationDefinition()
   * @generated
   */
  EReference getAssociationDefinition_StructuredBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AssociationDefinitionOrStub <em>Association Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association Definition Or Stub</em>'.
   * @see org.modelexecution.alf.AssociationDefinitionOrStub
   * @generated
   */
  EClass getAssociationDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AssociationDefinitionOrStub#getAssociationDeclaration <em>Association Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Association Declaration</em>'.
   * @see org.modelexecution.alf.AssociationDefinitionOrStub#getAssociationDeclaration()
   * @see #getAssociationDefinitionOrStub()
   * @generated
   */
  EReference getAssociationDefinitionOrStub_AssociationDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AssociationDefinitionOrStub#getStructuredBody <em>Structured Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Body</em>'.
   * @see org.modelexecution.alf.AssociationDefinitionOrStub#getStructuredBody()
   * @see #getAssociationDefinitionOrStub()
   * @generated
   */
  EReference getAssociationDefinitionOrStub_StructuredBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EnumerationDeclaration <em>Enumeration Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Declaration</em>'.
   * @see org.modelexecution.alf.EnumerationDeclaration
   * @generated
   */
  EClass getEnumerationDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EnumerationDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.EnumerationDeclaration#getName()
   * @see #getEnumerationDeclaration()
   * @generated
   */
  EReference getEnumerationDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EnumerationDeclaration#getSpecializationClause <em>Specialization Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specialization Clause</em>'.
   * @see org.modelexecution.alf.EnumerationDeclaration#getSpecializationClause()
   * @see #getEnumerationDeclaration()
   * @generated
   */
  EReference getEnumerationDeclaration_SpecializationClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EnumerationDefinition <em>Enumeration Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Definition</em>'.
   * @see org.modelexecution.alf.EnumerationDefinition
   * @generated
   */
  EClass getEnumerationDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EnumerationDefinition#getEnumerationClause <em>Enumeration Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumeration Clause</em>'.
   * @see org.modelexecution.alf.EnumerationDefinition#getEnumerationClause()
   * @see #getEnumerationDefinition()
   * @generated
   */
  EReference getEnumerationDefinition_EnumerationClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EnumerationDefinition#getEnumerationBody <em>Enumeration Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumeration Body</em>'.
   * @see org.modelexecution.alf.EnumerationDefinition#getEnumerationBody()
   * @see #getEnumerationDefinition()
   * @generated
   */
  EReference getEnumerationDefinition_EnumerationBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EnumerationDefinitionOrStub <em>Enumeration Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Definition Or Stub</em>'.
   * @see org.modelexecution.alf.EnumerationDefinitionOrStub
   * @generated
   */
  EClass getEnumerationDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EnumerationDefinitionOrStub#getEnumerationDeclaration <em>Enumeration Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumeration Declaration</em>'.
   * @see org.modelexecution.alf.EnumerationDefinitionOrStub#getEnumerationDeclaration()
   * @see #getEnumerationDefinitionOrStub()
   * @generated
   */
  EReference getEnumerationDefinitionOrStub_EnumerationDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EnumerationDefinitionOrStub#getEnumerationBody <em>Enumeration Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enumeration Body</em>'.
   * @see org.modelexecution.alf.EnumerationDefinitionOrStub#getEnumerationBody()
   * @see #getEnumerationDefinitionOrStub()
   * @generated
   */
  EReference getEnumerationDefinitionOrStub_EnumerationBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EnumerationBody <em>Enumeration Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Body</em>'.
   * @see org.modelexecution.alf.EnumerationBody
   * @generated
   */
  EClass getEnumerationBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.EnumerationBody#getEnumerationLiteralName <em>Enumeration Literal Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumeration Literal Name</em>'.
   * @see org.modelexecution.alf.EnumerationBody#getEnumerationLiteralName()
   * @see #getEnumerationBody()
   * @generated
   */
  EReference getEnumerationBody_EnumerationLiteralName();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EnumerationLiteralName <em>Enumeration Literal Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal Name</em>'.
   * @see org.modelexecution.alf.EnumerationLiteralName
   * @generated
   */
  EClass getEnumerationLiteralName();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.EnumerationLiteralName#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.EnumerationLiteralName#getComment()
   * @see #getEnumerationLiteralName()
   * @generated
   */
  EAttribute getEnumerationLiteralName_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EnumerationLiteralName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.EnumerationLiteralName#getName()
   * @see #getEnumerationLiteralName()
   * @generated
   */
  EReference getEnumerationLiteralName_Name();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Declaration</em>'.
   * @see org.modelexecution.alf.SignalDeclaration
   * @generated
   */
  EClass getSignalDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.SignalDeclaration#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see org.modelexecution.alf.SignalDeclaration#isIsAbstract()
   * @see #getSignalDeclaration()
   * @generated
   */
  EAttribute getSignalDeclaration_IsAbstract();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalDeclaration#getClassifierSignature <em>Classifier Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classifier Signature</em>'.
   * @see org.modelexecution.alf.SignalDeclaration#getClassifierSignature()
   * @see #getSignalDeclaration()
   * @generated
   */
  EReference getSignalDeclaration_ClassifierSignature();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SignalDefinition <em>Signal Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition</em>'.
   * @see org.modelexecution.alf.SignalDefinition
   * @generated
   */
  EClass getSignalDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalDefinition#getSignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal Declaration</em>'.
   * @see org.modelexecution.alf.SignalDefinition#getSignalDeclaration()
   * @see #getSignalDefinition()
   * @generated
   */
  EReference getSignalDefinition_SignalDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalDefinition#getStructuredBody <em>Structured Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Body</em>'.
   * @see org.modelexecution.alf.SignalDefinition#getStructuredBody()
   * @see #getSignalDefinition()
   * @generated
   */
  EReference getSignalDefinition_StructuredBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SignalDefinitionOrStub <em>Signal Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Definition Or Stub</em>'.
   * @see org.modelexecution.alf.SignalDefinitionOrStub
   * @generated
   */
  EClass getSignalDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalDefinitionOrStub#getSignalDeclaration <em>Signal Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal Declaration</em>'.
   * @see org.modelexecution.alf.SignalDefinitionOrStub#getSignalDeclaration()
   * @see #getSignalDefinitionOrStub()
   * @generated
   */
  EReference getSignalDefinitionOrStub_SignalDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalDefinitionOrStub#getStructuredBody <em>Structured Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Body</em>'.
   * @see org.modelexecution.alf.SignalDefinitionOrStub#getStructuredBody()
   * @see #getSignalDefinitionOrStub()
   * @generated
   */
  EReference getSignalDefinitionOrStub_StructuredBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActivityDeclaration <em>Activity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Declaration</em>'.
   * @see org.modelexecution.alf.ActivityDeclaration
   * @generated
   */
  EClass getActivityDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.ActivityDeclaration#getName()
   * @see #getActivityDeclaration()
   * @generated
   */
  EReference getActivityDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDeclaration#getTemplateParameters <em>Template Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Parameters</em>'.
   * @see org.modelexecution.alf.ActivityDeclaration#getTemplateParameters()
   * @see #getActivityDeclaration()
   * @generated
   */
  EReference getActivityDeclaration_TemplateParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDeclaration#getFormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameters</em>'.
   * @see org.modelexecution.alf.ActivityDeclaration#getFormalParameters()
   * @see #getActivityDeclaration()
   * @generated
   */
  EReference getActivityDeclaration_FormalParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDeclaration#getTypePart <em>Type Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Part</em>'.
   * @see org.modelexecution.alf.ActivityDeclaration#getTypePart()
   * @see #getActivityDeclaration()
   * @generated
   */
  EReference getActivityDeclaration_TypePart();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActivityDefinition <em>Activity Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Definition</em>'.
   * @see org.modelexecution.alf.ActivityDefinition
   * @generated
   */
  EClass getActivityDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDefinition#getActivityDeclaration <em>Activity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Activity Declaration</em>'.
   * @see org.modelexecution.alf.ActivityDefinition#getActivityDeclaration()
   * @see #getActivityDefinition()
   * @generated
   */
  EReference getActivityDefinition_ActivityDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDefinition#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.ActivityDefinition#getBlock()
   * @see #getActivityDefinition()
   * @generated
   */
  EReference getActivityDefinition_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActivityDefinitionOrStub <em>Activity Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Definition Or Stub</em>'.
   * @see org.modelexecution.alf.ActivityDefinitionOrStub
   * @generated
   */
  EClass getActivityDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDefinitionOrStub#getActivityDeclaration <em>Activity Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Activity Declaration</em>'.
   * @see org.modelexecution.alf.ActivityDefinitionOrStub#getActivityDeclaration()
   * @see #getActivityDefinitionOrStub()
   * @generated
   */
  EReference getActivityDefinitionOrStub_ActivityDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ActivityDefinitionOrStub#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.ActivityDefinitionOrStub#getBlock()
   * @see #getActivityDefinitionOrStub()
   * @generated
   */
  EReference getActivityDefinitionOrStub_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.FormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameters</em>'.
   * @see org.modelexecution.alf.FormalParameters
   * @generated
   */
  EClass getFormalParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.FormalParameters#getFormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameter List</em>'.
   * @see org.modelexecution.alf.FormalParameters#getFormalParameterList()
   * @see #getFormalParameters()
   * @generated
   */
  EReference getFormalParameters_FormalParameterList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.FormalParameterList <em>Formal Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameter List</em>'.
   * @see org.modelexecution.alf.FormalParameterList
   * @generated
   */
  EClass getFormalParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.FormalParameterList#getFormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Formal Parameter</em>'.
   * @see org.modelexecution.alf.FormalParameterList#getFormalParameter()
   * @see #getFormalParameterList()
   * @generated
   */
  EReference getFormalParameterList_FormalParameter();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.FormalParameter <em>Formal Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formal Parameter</em>'.
   * @see org.modelexecution.alf.FormalParameter
   * @generated
   */
  EClass getFormalParameter();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.FormalParameter#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.FormalParameter#getComment()
   * @see #getFormalParameter()
   * @generated
   */
  EAttribute getFormalParameter_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.FormalParameter#getStereotypeAnnotations <em>Stereotype Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stereotype Annotations</em>'.
   * @see org.modelexecution.alf.FormalParameter#getStereotypeAnnotations()
   * @see #getFormalParameter()
   * @generated
   */
  EReference getFormalParameter_StereotypeAnnotations();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.FormalParameter#getParameterDirection <em>Parameter Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Direction</em>'.
   * @see org.modelexecution.alf.FormalParameter#getParameterDirection()
   * @see #getFormalParameter()
   * @generated
   */
  EAttribute getFormalParameter_ParameterDirection();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.FormalParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.FormalParameter#getName()
   * @see #getFormalParameter()
   * @generated
   */
  EReference getFormalParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.FormalParameter#getTypePart <em>Type Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Part</em>'.
   * @see org.modelexecution.alf.FormalParameter#getTypePart()
   * @see #getFormalParameter()
   * @generated
   */
  EReference getFormalParameter_TypePart();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.FeatureDefinitionOrStub <em>Feature Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Definition Or Stub</em>'.
   * @see org.modelexecution.alf.FeatureDefinitionOrStub
   * @generated
   */
  EClass getFeatureDefinitionOrStub();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ActiveFeatureDefinitionOrStub <em>Active Feature Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Active Feature Definition Or Stub</em>'.
   * @see org.modelexecution.alf.ActiveFeatureDefinitionOrStub
   * @generated
   */
  EClass getActiveFeatureDefinitionOrStub();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Definition</em>'.
   * @see org.modelexecution.alf.PropertyDefinition
   * @generated
   */
  EClass getPropertyDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PropertyDefinition#getPropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Declaration</em>'.
   * @see org.modelexecution.alf.PropertyDefinition#getPropertyDeclaration()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_PropertyDeclaration();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AttributeDefinition <em>Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Definition</em>'.
   * @see org.modelexecution.alf.AttributeDefinition
   * @generated
   */
  EClass getAttributeDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AttributeDefinition#getPropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property Declaration</em>'.
   * @see org.modelexecution.alf.AttributeDefinition#getPropertyDeclaration()
   * @see #getAttributeDefinition()
   * @generated
   */
  EReference getAttributeDefinition_PropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AttributeDefinition#getAttributeInitializer <em>Attribute Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Initializer</em>'.
   * @see org.modelexecution.alf.AttributeDefinition#getAttributeInitializer()
   * @see #getAttributeDefinition()
   * @generated
   */
  EReference getAttributeDefinition_AttributeInitializer();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AttributeInitializer <em>Attribute Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Initializer</em>'.
   * @see org.modelexecution.alf.AttributeInitializer
   * @generated
   */
  EClass getAttributeInitializer();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AttributeInitializer#getInitializationExpression <em>Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization Expression</em>'.
   * @see org.modelexecution.alf.AttributeInitializer#getInitializationExpression()
   * @see #getAttributeInitializer()
   * @generated
   */
  EReference getAttributeInitializer_InitializationExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PropertyDeclaration <em>Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Declaration</em>'.
   * @see org.modelexecution.alf.PropertyDeclaration
   * @generated
   */
  EClass getPropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PropertyDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.PropertyDeclaration#getName()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EReference getPropertyDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.PropertyDeclaration#isIsComposite <em>Is Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Composite</em>'.
   * @see org.modelexecution.alf.PropertyDeclaration#isIsComposite()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EAttribute getPropertyDeclaration_IsComposite();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PropertyDeclaration#getTypePart <em>Type Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Part</em>'.
   * @see org.modelexecution.alf.PropertyDeclaration#getTypePart()
   * @see #getPropertyDeclaration()
   * @generated
   */
  EReference getPropertyDeclaration_TypePart();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TypePart <em>Type Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Part</em>'.
   * @see org.modelexecution.alf.TypePart
   * @generated
   */
  EClass getTypePart();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.TypePart#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.modelexecution.alf.TypePart#getTypeName()
   * @see #getTypePart()
   * @generated
   */
  EReference getTypePart_TypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.TypePart#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity</em>'.
   * @see org.modelexecution.alf.TypePart#getMultiplicity()
   * @see #getTypePart()
   * @generated
   */
  EReference getTypePart_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Name</em>'.
   * @see org.modelexecution.alf.TypeName
   * @generated
   */
  EClass getTypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.TypeName#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.TypeName#getQualifiedName()
   * @see #getTypeName()
   * @generated
   */
  EReference getTypeName_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.TypeName#isAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any</em>'.
   * @see org.modelexecution.alf.TypeName#isAny()
   * @see #getTypeName()
   * @generated
   */
  EAttribute getTypeName_Any();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see org.modelexecution.alf.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Multiplicity#getMultiplicityRange <em>Multiplicity Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity Range</em>'.
   * @see org.modelexecution.alf.Multiplicity#getMultiplicityRange()
   * @see #getMultiplicity()
   * @generated
   */
  EReference getMultiplicity_MultiplicityRange();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.Multiplicity#isIsOrdered <em>Is Ordered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Ordered</em>'.
   * @see org.modelexecution.alf.Multiplicity#isIsOrdered()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_IsOrdered();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.Multiplicity#isIsNonUnique <em>Is Non Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Non Unique</em>'.
   * @see org.modelexecution.alf.Multiplicity#isIsNonUnique()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_IsNonUnique();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.Multiplicity#isIsSequence <em>Is Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Sequence</em>'.
   * @see org.modelexecution.alf.Multiplicity#isIsSequence()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_IsSequence();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.MultiplicityRange <em>Multiplicity Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity Range</em>'.
   * @see org.modelexecution.alf.MultiplicityRange
   * @generated
   */
  EClass getMultiplicityRange();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.MultiplicityRange#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lower</em>'.
   * @see org.modelexecution.alf.MultiplicityRange#getLower()
   * @see #getMultiplicityRange()
   * @generated
   */
  EReference getMultiplicityRange_Lower();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.MultiplicityRange#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper</em>'.
   * @see org.modelexecution.alf.MultiplicityRange#getUpper()
   * @see #getMultiplicityRange()
   * @generated
   */
  EReference getMultiplicityRange_Upper();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.UnlimitedNaturalLiteral <em>Unlimited Natural Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unlimited Natural Literal</em>'.
   * @see org.modelexecution.alf.UnlimitedNaturalLiteral
   * @generated
   */
  EClass getUnlimitedNaturalLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.UnlimitedNaturalLiteral#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Integer</em>'.
   * @see org.modelexecution.alf.UnlimitedNaturalLiteral#getInteger()
   * @see #getUnlimitedNaturalLiteral()
   * @generated
   */
  EReference getUnlimitedNaturalLiteral_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.UnlimitedNaturalLiteral#isStar <em>Star</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Star</em>'.
   * @see org.modelexecution.alf.UnlimitedNaturalLiteral#isStar()
   * @see #getUnlimitedNaturalLiteral()
   * @generated
   */
  EAttribute getUnlimitedNaturalLiteral_Star();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.OperationDeclaration <em>Operation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Declaration</em>'.
   * @see org.modelexecution.alf.OperationDeclaration
   * @generated
   */
  EClass getOperationDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.OperationDeclaration#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see org.modelexecution.alf.OperationDeclaration#isIsAbstract()
   * @see #getOperationDeclaration()
   * @generated
   */
  EAttribute getOperationDeclaration_IsAbstract();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.OperationDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.OperationDeclaration#getName()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.OperationDeclaration#getFormalParameters <em>Formal Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Parameters</em>'.
   * @see org.modelexecution.alf.OperationDeclaration#getFormalParameters()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_FormalParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.OperationDeclaration#getTypePart <em>Type Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Part</em>'.
   * @see org.modelexecution.alf.OperationDeclaration#getTypePart()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_TypePart();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.OperationDeclaration#getRedefinitionClause <em>Redefinition Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Redefinition Clause</em>'.
   * @see org.modelexecution.alf.OperationDeclaration#getRedefinitionClause()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_RedefinitionClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.OperationDeclaration#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.OperationDeclaration#getBlock()
   * @see #getOperationDeclaration()
   * @generated
   */
  EReference getOperationDeclaration_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.OperationDefinitionOrStub <em>Operation Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Definition Or Stub</em>'.
   * @see org.modelexecution.alf.OperationDefinitionOrStub
   * @generated
   */
  EClass getOperationDefinitionOrStub();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.RedefinitionClause <em>Redefinition Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Redefinition Clause</em>'.
   * @see org.modelexecution.alf.RedefinitionClause
   * @generated
   */
  EClass getRedefinitionClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.RedefinitionClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.modelexecution.alf.RedefinitionClause#getQualifiedNameList()
   * @see #getRedefinitionClause()
   * @generated
   */
  EReference getRedefinitionClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ReceptionDefinition <em>Reception Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reception Definition</em>'.
   * @see org.modelexecution.alf.ReceptionDefinition
   * @generated
   */
  EClass getReceptionDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ReceptionDefinition#getReceptionName <em>Reception Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reception Name</em>'.
   * @see org.modelexecution.alf.ReceptionDefinition#getReceptionName()
   * @see #getReceptionDefinition()
   * @generated
   */
  EReference getReceptionDefinition_ReceptionName();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SignalReceptionDeclaration <em>Signal Reception Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Reception Declaration</em>'.
   * @see org.modelexecution.alf.SignalReceptionDeclaration
   * @generated
   */
  EClass getSignalReceptionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalReceptionDeclaration#getSignalName <em>Signal Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal Name</em>'.
   * @see org.modelexecution.alf.SignalReceptionDeclaration#getSignalName()
   * @see #getSignalReceptionDeclaration()
   * @generated
   */
  EReference getSignalReceptionDeclaration_SignalName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalReceptionDeclaration#getSpecializationClause <em>Specialization Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specialization Clause</em>'.
   * @see org.modelexecution.alf.SignalReceptionDeclaration#getSpecializationClause()
   * @see #getSignalReceptionDeclaration()
   * @generated
   */
  EReference getSignalReceptionDeclaration_SpecializationClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SignalReceptionDefinitionOrStub <em>Signal Reception Definition Or Stub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Reception Definition Or Stub</em>'.
   * @see org.modelexecution.alf.SignalReceptionDefinitionOrStub
   * @generated
   */
  EClass getSignalReceptionDefinitionOrStub();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalReceptionDefinitionOrStub#getSignalReceptionOrDeclaration <em>Signal Reception Or Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal Reception Or Declaration</em>'.
   * @see org.modelexecution.alf.SignalReceptionDefinitionOrStub#getSignalReceptionOrDeclaration()
   * @see #getSignalReceptionDefinitionOrStub()
   * @generated
   */
  EReference getSignalReceptionDefinitionOrStub_SignalReceptionOrDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SignalReceptionDefinitionOrStub#getStructuredBody <em>Structured Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured Body</em>'.
   * @see org.modelexecution.alf.SignalReceptionDefinitionOrStub#getStructuredBody()
   * @see #getSignalReceptionDefinitionOrStub()
   * @generated
   */
  EReference getSignalReceptionDefinitionOrStub_StructuredBody();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see org.modelexecution.alf.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.Name#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.modelexecution.alf.Name#getId()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_Id();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.QualifiedName#getUnqualified <em>Unqualified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unqualified</em>'.
   * @see org.modelexecution.alf.QualifiedName#getUnqualified()
   * @see #getQualifiedName()
   * @generated
   */
  EReference getQualifiedName_Unqualified();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.QualifiedName#getNameCompletion <em>Name Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Completion</em>'.
   * @see org.modelexecution.alf.QualifiedName#getNameCompletion()
   * @see #getQualifiedName()
   * @generated
   */
  EReference getQualifiedName_NameCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ColonQualifiedNameCompletion <em>Colon Qualified Name Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colon Qualified Name Completion</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletion
   * @generated
   */
  EClass getColonQualifiedNameCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ColonQualifiedNameCompletion#getNamedBindings <em>Named Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Bindings</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletion#getNamedBindings()
   * @see #getColonQualifiedNameCompletion()
   * @generated
   */
  EReference getColonQualifiedNameCompletion_NamedBindings();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.UnqualifiedName <em>Unqualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unqualified Name</em>'.
   * @see org.modelexecution.alf.UnqualifiedName
   * @generated
   */
  EClass getUnqualifiedName();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NameBinding <em>Name Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Binding</em>'.
   * @see org.modelexecution.alf.NameBinding
   * @generated
   */
  EClass getNameBinding();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameBinding#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.NameBinding#getName()
   * @see #getNameBinding()
   * @generated
   */
  EReference getNameBinding_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameBinding#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Binding</em>'.
   * @see org.modelexecution.alf.NameBinding#getTemplateBinding()
   * @see #getNameBinding()
   * @generated
   */
  EReference getNameBinding_TemplateBinding();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.QualifiedNameWithoutBinding <em>Qualified Name Without Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name Without Binding</em>'.
   * @see org.modelexecution.alf.QualifiedNameWithoutBinding
   * @generated
   */
  EClass getQualifiedNameWithoutBinding();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.QualifiedNameWithoutBinding#getUnqualified <em>Unqualified</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unqualified</em>'.
   * @see org.modelexecution.alf.QualifiedNameWithoutBinding#getUnqualified()
   * @see #getQualifiedNameWithoutBinding()
   * @generated
   */
  EReference getQualifiedNameWithoutBinding_Unqualified();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.QualifiedNameWithoutBinding#getNameCompletion <em>Name Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Completion</em>'.
   * @see org.modelexecution.alf.QualifiedNameWithoutBinding#getNameCompletion()
   * @see #getQualifiedNameWithoutBinding()
   * @generated
   */
  EReference getQualifiedNameWithoutBinding_NameCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ColonQualifiedNameCompletionWithoutBinding <em>Colon Qualified Name Completion Without Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colon Qualified Name Completion Without Binding</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionWithoutBinding
   * @generated
   */
  EClass getColonQualifiedNameCompletionWithoutBinding();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ColonQualifiedNameCompletionWithoutBinding#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see org.modelexecution.alf.ColonQualifiedNameCompletionWithoutBinding#getNames()
   * @see #getColonQualifiedNameCompletionWithoutBinding()
   * @generated
   */
  EReference getColonQualifiedNameCompletionWithoutBinding_Names();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Binding</em>'.
   * @see org.modelexecution.alf.TemplateBinding
   * @generated
   */
  EClass getTemplateBinding();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PositionalTemplateBinding <em>Positional Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positional Template Binding</em>'.
   * @see org.modelexecution.alf.PositionalTemplateBinding
   * @generated
   */
  EClass getPositionalTemplateBinding();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.PositionalTemplateBinding#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.PositionalTemplateBinding#getQualifiedName()
   * @see #getPositionalTemplateBinding()
   * @generated
   */
  EReference getPositionalTemplateBinding_QualifiedName();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NamedTemplateBinding <em>Named Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Template Binding</em>'.
   * @see org.modelexecution.alf.NamedTemplateBinding
   * @generated
   */
  EClass getNamedTemplateBinding();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.NamedTemplateBinding#getTemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Parameter Substitution</em>'.
   * @see org.modelexecution.alf.NamedTemplateBinding#getTemplateParameterSubstitution()
   * @see #getNamedTemplateBinding()
   * @generated
   */
  EReference getNamedTemplateBinding_TemplateParameterSubstitution();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter Substitution</em>'.
   * @see org.modelexecution.alf.TemplateParameterSubstitution
   * @generated
   */
  EClass getTemplateParameterSubstitution();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.TemplateParameterSubstitution#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.TemplateParameterSubstitution#getName()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.TemplateParameterSubstitution#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.TemplateParameterSubstitution#getQualifiedName()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_QualifiedName();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.modelexecution.alf.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Expression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.Expression#getUnaryExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Expression#getExpressionCompletion <em>Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression Completion</em>'.
   * @see org.modelexecution.alf.Expression#getExpressionCompletion()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_ExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NonNameExpression <em>Non Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Name Expression</em>'.
   * @see org.modelexecution.alf.NonNameExpression
   * @generated
   */
  EClass getNonNameExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNameExpression#getNonNameUnaryExpression <em>Non Name Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Non Name Unary Expression</em>'.
   * @see org.modelexecution.alf.NonNameExpression#getNonNameUnaryExpression()
   * @see #getNonNameExpression()
   * @generated
   */
  EReference getNonNameExpression_NonNameUnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNameExpression#getExpressionCompletion <em>Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression Completion</em>'.
   * @see org.modelexecution.alf.NonNameExpression#getExpressionCompletion()
   * @see #getNonNameExpression()
   * @generated
   */
  EReference getNonNameExpression_ExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NameToExpressionCompletion <em>Name To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name To Expression Completion</em>'.
   * @see org.modelexecution.alf.NameToExpressionCompletion
   * @generated
   */
  EClass getNameToExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameToExpressionCompletion#getNameToPrimary <em>Name To Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name To Primary</em>'.
   * @see org.modelexecution.alf.NameToExpressionCompletion#getNameToPrimary()
   * @see #getNameToExpressionCompletion()
   * @generated
   */
  EReference getNameToExpressionCompletion_NameToPrimary();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameToExpressionCompletion#getPrimaryToExpressionCompletion <em>Primary To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary To Expression Completion</em>'.
   * @see org.modelexecution.alf.NameToExpressionCompletion#getPrimaryToExpressionCompletion()
   * @see #getNameToExpressionCompletion()
   * @generated
   */
  EReference getNameToExpressionCompletion_PrimaryToExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PrimaryToExpressionCompletion <em>Primary To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary To Expression Completion</em>'.
   * @see org.modelexecution.alf.PrimaryToExpressionCompletion
   * @generated
   */
  EClass getPrimaryToExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PrimaryToExpressionCompletion#getPostFixExpressionCompletion <em>Post Fix Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Fix Expression Completion</em>'.
   * @see org.modelexecution.alf.PrimaryToExpressionCompletion#getPostFixExpressionCompletion()
   * @see #getPrimaryToExpressionCompletion()
   * @generated
   */
  EReference getPrimaryToExpressionCompletion_PostFixExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PrimaryToExpressionCompletion#getExpressionCompletion <em>Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression Completion</em>'.
   * @see org.modelexecution.alf.PrimaryToExpressionCompletion#getExpressionCompletion()
   * @see #getPrimaryToExpressionCompletion()
   * @generated
   */
  EReference getPrimaryToExpressionCompletion_ExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ExpressionCompletion <em>Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Completion</em>'.
   * @see org.modelexecution.alf.ExpressionCompletion
   * @generated
   */
  EClass getExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ExpressionCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.ExpressionCompletion#getExpression()
   * @see #getExpressionCompletion()
   * @generated
   */
  EReference getExpressionCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.modelexecution.alf.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PrimaryExpression#getNameOrPrimaryExpression <em>Name Or Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Or Primary Expression</em>'.
   * @see org.modelexecution.alf.PrimaryExpression#getNameOrPrimaryExpression()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_NameOrPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PrimaryExpression#getBaseExpression <em>Base Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Expression</em>'.
   * @see org.modelexecution.alf.PrimaryExpression#getBaseExpression()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_BaseExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PrimaryExpression#getParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parenthesized Expression</em>'.
   * @see org.modelexecution.alf.PrimaryExpression#getParenthesizedExpression()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_ParenthesizedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PrimaryExpression#getPrimaryExpressionCompletion <em>Primary Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Expression Completion</em>'.
   * @see org.modelexecution.alf.PrimaryExpression#getPrimaryExpressionCompletion()
   * @see #getPrimaryExpression()
   * @generated
   */
  EReference getPrimaryExpression_PrimaryExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BaseExpression <em>Base Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Expression</em>'.
   * @see org.modelexecution.alf.BaseExpression
   * @generated
   */
  EClass getBaseExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NameToPrimaryExpression <em>Name To Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name To Primary Expression</em>'.
   * @see org.modelexecution.alf.NameToPrimaryExpression
   * @generated
   */
  EClass getNameToPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameToPrimaryExpression#getLinkOperationCompletion <em>Link Operation Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link Operation Completion</em>'.
   * @see org.modelexecution.alf.NameToPrimaryExpression#getLinkOperationCompletion()
   * @see #getNameToPrimaryExpression()
   * @generated
   */
  EReference getNameToPrimaryExpression_LinkOperationCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameToPrimaryExpression#getClassExtentExpressionCompletion <em>Class Extent Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Extent Expression Completion</em>'.
   * @see org.modelexecution.alf.NameToPrimaryExpression#getClassExtentExpressionCompletion()
   * @see #getNameToPrimaryExpression()
   * @generated
   */
  EReference getNameToPrimaryExpression_ClassExtentExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameToPrimaryExpression#getSequenceConstructionCompletion <em>Sequence Construction Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Construction Completion</em>'.
   * @see org.modelexecution.alf.NameToPrimaryExpression#getSequenceConstructionCompletion()
   * @see #getNameToPrimaryExpression()
   * @generated
   */
  EReference getNameToPrimaryExpression_SequenceConstructionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameToPrimaryExpression#getBehaviorInvocation <em>Behavior Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behavior Invocation</em>'.
   * @see org.modelexecution.alf.NameToPrimaryExpression#getBehaviorInvocation()
   * @see #getNameToPrimaryExpression()
   * @generated
   */
  EReference getNameToPrimaryExpression_BehaviorInvocation();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PrimaryExpressionCompletion <em>Primary Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression Completion</em>'.
   * @see org.modelexecution.alf.PrimaryExpressionCompletion
   * @generated
   */
  EClass getPrimaryExpressionCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.PrimaryExpressionCompletion#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.modelexecution.alf.PrimaryExpressionCompletion#getContent()
   * @see #getPrimaryExpressionCompletion()
   * @generated
   */
  EReference getPrimaryExpressionCompletion_Content();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index <em>Feature Or Sequence Operation Or Reduction Or Expansion Or Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Or Sequence Operation Or Reduction Or Expansion Or Index</em>'.
   * @see org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index
   * @generated
   */
  EClass getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature</em>'.
   * @see org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getFeature()
   * @see #getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index()
   * @generated
   */
  EReference getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getFeatureInvocation <em>Feature Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature Invocation</em>'.
   * @see org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getFeatureInvocation()
   * @see #getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index()
   * @generated
   */
  EReference getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index_FeatureInvocation();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getSequenceOperationOrReductionOrExpansion <em>Sequence Operation Or Reduction Or Expansion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Operation Or Reduction Or Expansion</em>'.
   * @see org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getSequenceOperationOrReductionOrExpansion()
   * @see #getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index()
   * @generated
   */
  EReference getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index_SequenceOperationOrReductionOrExpansion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.modelexecution.alf.Feature_Or_SequenceOperationOrReductionOrExpansion_Or_Index#getIndex()
   * @see #getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index()
   * @generated
   */
  EReference getFeature_Or_SequenceOperationOrReductionOrExpansion_Or_Index_Index();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Expression</em>'.
   * @see org.modelexecution.alf.LiteralExpression
   * @generated
   */
  EClass getLiteralExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LiteralExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.LiteralExpression#getExpression()
   * @see #getLiteralExpression()
   * @generated
   */
  EReference getLiteralExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NameOrPrimaryExpression <em>Name Or Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Or Primary Expression</em>'.
   * @see org.modelexecution.alf.NameOrPrimaryExpression
   * @generated
   */
  EClass getNameOrPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameOrPrimaryExpression#getPotentiallyAmbiguousQualifiedName <em>Potentially Ambiguous Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Potentially Ambiguous Qualified Name</em>'.
   * @see org.modelexecution.alf.NameOrPrimaryExpression#getPotentiallyAmbiguousQualifiedName()
   * @see #getNameOrPrimaryExpression()
   * @generated
   */
  EReference getNameOrPrimaryExpression_PotentiallyAmbiguousQualifiedName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NameOrPrimaryExpression#getNameToPrimaryExpression <em>Name To Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name To Primary Expression</em>'.
   * @see org.modelexecution.alf.NameOrPrimaryExpression#getNameToPrimaryExpression()
   * @see #getNameOrPrimaryExpression()
   * @generated
   */
  EReference getNameOrPrimaryExpression_NameToPrimaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ThisExpression <em>This Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Expression</em>'.
   * @see org.modelexecution.alf.ThisExpression
   * @generated
   */
  EClass getThisExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ThisExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.modelexecution.alf.ThisExpression#getTuple()
   * @see #getThisExpression()
   * @generated
   */
  EReference getThisExpression_Tuple();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ParenthesizedExpression <em>Parenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesized Expression</em>'.
   * @see org.modelexecution.alf.ParenthesizedExpression
   * @generated
   */
  EClass getParenthesizedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ParenthesizedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.ParenthesizedExpression#getExpression()
   * @see #getParenthesizedExpression()
   * @generated
   */
  EReference getParenthesizedExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.modelexecution.alf.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Name();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple</em>'.
   * @see org.modelexecution.alf.Tuple
   * @generated
   */
  EClass getTuple();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Tuple#getNamedTupleExpressionList <em>Named Tuple Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Named Tuple Expression List</em>'.
   * @see org.modelexecution.alf.Tuple#getNamedTupleExpressionList()
   * @see #getTuple()
   * @generated
   */
  EReference getTuple_NamedTupleExpressionList();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Tuple#getPositionalTupleExpressionList <em>Positional Tuple Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Positional Tuple Expression List</em>'.
   * @see org.modelexecution.alf.Tuple#getPositionalTupleExpressionList()
   * @see #getTuple()
   * @generated
   */
  EReference getTuple_PositionalTupleExpressionList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PositionalTupleExpressionList <em>Positional Tuple Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positional Tuple Expression List</em>'.
   * @see org.modelexecution.alf.PositionalTupleExpressionList
   * @generated
   */
  EClass getPositionalTupleExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.PositionalTupleExpressionList#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.modelexecution.alf.PositionalTupleExpressionList#getExpression()
   * @see #getPositionalTupleExpressionList()
   * @generated
   */
  EReference getPositionalTupleExpressionList_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PositionalTupleExpressionListCompletion <em>Positional Tuple Expression List Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Positional Tuple Expression List Completion</em>'.
   * @see org.modelexecution.alf.PositionalTupleExpressionListCompletion
   * @generated
   */
  EClass getPositionalTupleExpressionListCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.PositionalTupleExpressionListCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.modelexecution.alf.PositionalTupleExpressionListCompletion#getExpression()
   * @see #getPositionalTupleExpressionListCompletion()
   * @generated
   */
  EReference getPositionalTupleExpressionListCompletion_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NamedTupleExpressionList <em>Named Tuple Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Tuple Expression List</em>'.
   * @see org.modelexecution.alf.NamedTupleExpressionList
   * @generated
   */
  EClass getNamedTupleExpressionList();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.NamedTupleExpressionList#getNamedExpression <em>Named Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Expression</em>'.
   * @see org.modelexecution.alf.NamedTupleExpressionList#getNamedExpression()
   * @see #getNamedTupleExpressionList()
   * @generated
   */
  EReference getNamedTupleExpressionList_NamedExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NamedExpression <em>Named Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Expression</em>'.
   * @see org.modelexecution.alf.NamedExpression
   * @generated
   */
  EClass getNamedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NamedExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.NamedExpression#getName()
   * @see #getNamedExpression()
   * @generated
   */
  EReference getNamedExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NamedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.NamedExpression#getExpression()
   * @see #getNamedExpression()
   * @generated
   */
  EReference getNamedExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BehaviorInvocation <em>Behavior Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior Invocation</em>'.
   * @see org.modelexecution.alf.BehaviorInvocation
   * @generated
   */
  EClass getBehaviorInvocation();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.BehaviorInvocation#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.modelexecution.alf.BehaviorInvocation#getTuple()
   * @see #getBehaviorInvocation()
   * @generated
   */
  EReference getBehaviorInvocation_Tuple();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.FeatureInvocation <em>Feature Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Invocation</em>'.
   * @see org.modelexecution.alf.FeatureInvocation
   * @generated
   */
  EClass getFeatureInvocation();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.FeatureInvocation#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.modelexecution.alf.FeatureInvocation#getTuple()
   * @see #getFeatureInvocation()
   * @generated
   */
  EReference getFeatureInvocation_Tuple();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SuperInvocationExpression <em>Super Invocation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Invocation Expression</em>'.
   * @see org.modelexecution.alf.SuperInvocationExpression
   * @generated
   */
  EClass getSuperInvocationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SuperInvocationExpression#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.SuperInvocationExpression#getQualifiedName()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EReference getSuperInvocationExpression_QualifiedName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SuperInvocationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.modelexecution.alf.SuperInvocationExpression#getTuple()
   * @see #getSuperInvocationExpression()
   * @generated
   */
  EReference getSuperInvocationExpression_Tuple();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression <em>Instance Creation Or Sequence Construction Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Creation Or Sequence Construction Expression</em>'.
   * @see org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression
   * @generated
   */
  EClass getInstanceCreationOrSequenceConstructionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression#getQualifiedName()
   * @see #getInstanceCreationOrSequenceConstructionExpression()
   * @generated
   */
  EReference getInstanceCreationOrSequenceConstructionExpression_QualifiedName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression#getSequenceConstructionExpressionCompletion <em>Sequence Construction Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Construction Expression Completion</em>'.
   * @see org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression#getSequenceConstructionExpressionCompletion()
   * @see #getInstanceCreationOrSequenceConstructionExpression()
   * @generated
   */
  EReference getInstanceCreationOrSequenceConstructionExpression_SequenceConstructionExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.modelexecution.alf.InstanceCreationOrSequenceConstructionExpression#getTuple()
   * @see #getInstanceCreationOrSequenceConstructionExpression()
   * @generated
   */
  EReference getInstanceCreationOrSequenceConstructionExpression_Tuple();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.LinkOperationCompletion <em>Link Operation Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Completion</em>'.
   * @see org.modelexecution.alf.LinkOperationCompletion
   * @generated
   */
  EClass getLinkOperationCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.LinkOperationCompletion#getLinkOperation <em>Link Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link Operation</em>'.
   * @see org.modelexecution.alf.LinkOperationCompletion#getLinkOperation()
   * @see #getLinkOperationCompletion()
   * @generated
   */
  EAttribute getLinkOperationCompletion_LinkOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationCompletion#getLinkOperationTuple <em>Link Operation Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link Operation Tuple</em>'.
   * @see org.modelexecution.alf.LinkOperationCompletion#getLinkOperationTuple()
   * @see #getLinkOperationCompletion()
   * @generated
   */
  EReference getLinkOperationCompletion_LinkOperationTuple();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.LinkOperationTuple <em>Link Operation Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Operation Tuple</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple
   * @generated
   */
  EClass getLinkOperationTuple();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getName()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getIndex()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getIndexNamedExpressionListCompletion <em>Index Named Expression List Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index Named Expression List Completion</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getIndexNamedExpressionListCompletion()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_IndexNamedExpressionListCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getPrimaryToExpressionCompletion <em>Primary To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary To Expression Completion</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getPrimaryToExpressionCompletion()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_PrimaryToExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getPositionalTupleExpressionListCompletion <em>Positional Tuple Expression List Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Positional Tuple Expression List Completion</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getPositionalTupleExpressionListCompletion()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_PositionalTupleExpressionListCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getIndexedNamedExpressionListCompletion <em>Indexed Named Expression List Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Indexed Named Expression List Completion</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getIndexedNamedExpressionListCompletion()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_IndexedNamedExpressionListCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getNameToExpressionCompletion <em>Name To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name To Expression Completion</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getNameToExpressionCompletion()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_NameToExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LinkOperationTuple#getPositionalTupleExpressionList <em>Positional Tuple Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Positional Tuple Expression List</em>'.
   * @see org.modelexecution.alf.LinkOperationTuple#getPositionalTupleExpressionList()
   * @see #getLinkOperationTuple()
   * @generated
   */
  EReference getLinkOperationTuple_PositionalTupleExpressionList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.IndexedNamedExpressionListCompletion <em>Indexed Named Expression List Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Named Expression List Completion</em>'.
   * @see org.modelexecution.alf.IndexedNamedExpressionListCompletion
   * @generated
   */
  EClass getIndexedNamedExpressionListCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.IndexedNamedExpressionListCompletion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.IndexedNamedExpressionListCompletion#getExpression()
   * @see #getIndexedNamedExpressionListCompletion()
   * @generated
   */
  EReference getIndexedNamedExpressionListCompletion_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.IndexedNamedExpressionListCompletion#getIndexedNamedExpression <em>Indexed Named Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indexed Named Expression</em>'.
   * @see org.modelexecution.alf.IndexedNamedExpressionListCompletion#getIndexedNamedExpression()
   * @see #getIndexedNamedExpressionListCompletion()
   * @generated
   */
  EReference getIndexedNamedExpressionListCompletion_IndexedNamedExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.IndexedNamedExpression <em>Indexed Named Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indexed Named Expression</em>'.
   * @see org.modelexecution.alf.IndexedNamedExpression
   * @generated
   */
  EClass getIndexedNamedExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.IndexedNamedExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.IndexedNamedExpression#getName()
   * @see #getIndexedNamedExpression()
   * @generated
   */
  EReference getIndexedNamedExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.IndexedNamedExpression#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.modelexecution.alf.IndexedNamedExpression#getIndex()
   * @see #getIndexedNamedExpression()
   * @generated
   */
  EReference getIndexedNamedExpression_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.IndexedNamedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.IndexedNamedExpression#getExpression()
   * @see #getIndexedNamedExpression()
   * @generated
   */
  EReference getIndexedNamedExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassExtentExpressionCompletion <em>Class Extent Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Extent Expression Completion</em>'.
   * @see org.modelexecution.alf.ClassExtentExpressionCompletion
   * @generated
   */
  EClass getClassExtentExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequenceAnyExpression <em>Sequence Any Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Any Expression</em>'.
   * @see org.modelexecution.alf.SequenceAnyExpression
   * @generated
   */
  EClass getSequenceAnyExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceAnyExpression#getSequenceConstructionExpressionCompletion <em>Sequence Construction Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Construction Expression Completion</em>'.
   * @see org.modelexecution.alf.SequenceAnyExpression#getSequenceConstructionExpressionCompletion()
   * @see #getSequenceAnyExpression()
   * @generated
   */
  EReference getSequenceAnyExpression_SequenceConstructionExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequenceConstructionExpressionCompletion <em>Sequence Construction Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Construction Expression Completion</em>'.
   * @see org.modelexecution.alf.SequenceConstructionExpressionCompletion
   * @generated
   */
  EClass getSequenceConstructionExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceConstructionExpressionCompletion#getMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity Indicator</em>'.
   * @see org.modelexecution.alf.SequenceConstructionExpressionCompletion#getMultiplicityIndicator()
   * @see #getSequenceConstructionExpressionCompletion()
   * @generated
   */
  EReference getSequenceConstructionExpressionCompletion_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceConstructionExpressionCompletion#getSequenceElements <em>Sequence Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Elements</em>'.
   * @see org.modelexecution.alf.SequenceConstructionExpressionCompletion#getSequenceElements()
   * @see #getSequenceConstructionExpressionCompletion()
   * @generated
   */
  EReference getSequenceConstructionExpressionCompletion_SequenceElements();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.MultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity Indicator</em>'.
   * @see org.modelexecution.alf.MultiplicityIndicator
   * @generated
   */
  EClass getMultiplicityIndicator();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequenceElements <em>Sequence Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Elements</em>'.
   * @see org.modelexecution.alf.SequenceElements
   * @generated
   */
  EClass getSequenceElements();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceElements#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.modelexecution.alf.SequenceElements#getExpression1()
   * @see #getSequenceElements()
   * @generated
   */
  EReference getSequenceElements_Expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceElements#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.modelexecution.alf.SequenceElements#getExpression2()
   * @see #getSequenceElements()
   * @generated
   */
  EReference getSequenceElements_Expression2();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceElements#getSequenceElementListCompletion <em>Sequence Element List Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Element List Completion</em>'.
   * @see org.modelexecution.alf.SequenceElements#getSequenceElementListCompletion()
   * @see #getSequenceElements()
   * @generated
   */
  EReference getSequenceElements_SequenceElementListCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceElements#getSequenceInitializationExpression <em>Sequence Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Initialization Expression</em>'.
   * @see org.modelexecution.alf.SequenceElements#getSequenceInitializationExpression()
   * @see #getSequenceElements()
   * @generated
   */
  EReference getSequenceElements_SequenceInitializationExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequenceElementListCompletion <em>Sequence Element List Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Element List Completion</em>'.
   * @see org.modelexecution.alf.SequenceElementListCompletion
   * @generated
   */
  EClass getSequenceElementListCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.SequenceElementListCompletion#getSequenceElement <em>Sequence Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence Element</em>'.
   * @see org.modelexecution.alf.SequenceElementListCompletion#getSequenceElement()
   * @see #getSequenceElementListCompletion()
   * @generated
   */
  EReference getSequenceElementListCompletion_SequenceElement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequenceElement <em>Sequence Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Element</em>'.
   * @see org.modelexecution.alf.SequenceElement
   * @generated
   */
  EClass getSequenceElement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceElement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.SequenceElement#getExpression()
   * @see #getSequenceElement()
   * @generated
   */
  EReference getSequenceElement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceElement#getSequenceInitializationExpression <em>Sequence Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Initialization Expression</em>'.
   * @see org.modelexecution.alf.SequenceElement#getSequenceInitializationExpression()
   * @see #getSequenceElement()
   * @generated
   */
  EReference getSequenceElement_SequenceInitializationExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequenceInitializationExpression <em>Sequence Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Initialization Expression</em>'.
   * @see org.modelexecution.alf.SequenceInitializationExpression
   * @generated
   */
  EClass getSequenceInitializationExpression();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.SequenceInitializationExpression#isIsNew <em>Is New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is New</em>'.
   * @see org.modelexecution.alf.SequenceInitializationExpression#isIsNew()
   * @see #getSequenceInitializationExpression()
   * @generated
   */
  EAttribute getSequenceInitializationExpression_IsNew();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceInitializationExpression#getSequenceElements <em>Sequence Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Elements</em>'.
   * @see org.modelexecution.alf.SequenceInitializationExpression#getSequenceElements()
   * @see #getSequenceInitializationExpression()
   * @generated
   */
  EReference getSequenceInitializationExpression_SequenceElements();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Index <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Index</em>'.
   * @see org.modelexecution.alf.Index
   * @generated
   */
  EClass getIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Index#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.Index#getExpression()
   * @see #getIndex()
   * @generated
   */
  EReference getIndex_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion <em>Sequence Operation Or Reduction Or Expansion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Operation Or Reduction Or Expansion</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion
   * @generated
   */
  EClass getSequenceOperationOrReductionOrExpansion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getQualifiedName()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EReference getSequenceOperationOrReductionOrExpansion_QualifiedName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getTuple()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EReference getSequenceOperationOrReductionOrExpansion_Tuple();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#isIsReduce <em>Is Reduce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Reduce</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#isIsReduce()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EAttribute getSequenceOperationOrReductionOrExpansion_IsReduce();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#isIsOrdered <em>Is Ordered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Ordered</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#isIsOrdered()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EAttribute getSequenceOperationOrReductionOrExpansion_IsOrdered();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Template Binding</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getTemplateBinding()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EReference getSequenceOperationOrReductionOrExpansion_TemplateBinding();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getId()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EAttribute getSequenceOperationOrReductionOrExpansion_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getName()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EReference getSequenceOperationOrReductionOrExpansion_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.SequenceOperationOrReductionOrExpansion#getExpression()
   * @see #getSequenceOperationOrReductionOrExpansion()
   * @generated
   */
  EReference getSequenceOperationOrReductionOrExpansion_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PostfixExpressionCompletion <em>Postfix Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix Expression Completion</em>'.
   * @see org.modelexecution.alf.PostfixExpressionCompletion
   * @generated
   */
  EClass getPostfixExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PostfixExpressionCompletion#getPrimaryExpressionCompletion <em>Primary Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Expression Completion</em>'.
   * @see org.modelexecution.alf.PostfixExpressionCompletion#getPrimaryExpressionCompletion()
   * @see #getPostfixExpressionCompletion()
   * @generated
   */
  EReference getPostfixExpressionCompletion_PrimaryExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PostfixExpressionCompletion#getPostfixOperation <em>Postfix Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postfix Operation</em>'.
   * @see org.modelexecution.alf.PostfixExpressionCompletion#getPostfixOperation()
   * @see #getPostfixExpressionCompletion()
   * @generated
   */
  EReference getPostfixExpressionCompletion_PostfixOperation();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PostfixOperation <em>Postfix Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix Operation</em>'.
   * @see org.modelexecution.alf.PostfixOperation
   * @generated
   */
  EClass getPostfixOperation();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.PostfixOperation#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.modelexecution.alf.PostfixOperation#getOperator()
   * @see #getPostfixOperation()
   * @generated
   */
  EAttribute getPostfixOperation_Operator();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PrefixExpression <em>Prefix Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Expression</em>'.
   * @see org.modelexecution.alf.PrefixExpression
   * @generated
   */
  EClass getPrefixExpression();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.PrefixExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.modelexecution.alf.PrefixExpression#getOperator()
   * @see #getPrefixExpression()
   * @generated
   */
  EAttribute getPrefixExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PrefixExpression#getPrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Primary Expression</em>'.
   * @see org.modelexecution.alf.PrefixExpression#getPrimaryExpression()
   * @see #getPrefixExpression()
   * @generated
   */
  EReference getPrefixExpression_PrimaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.PostfixOrCastExpression <em>Postfix Or Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Postfix Or Cast Expression</em>'.
   * @see org.modelexecution.alf.PostfixOrCastExpression
   * @generated
   */
  EClass getPostfixOrCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PostfixOrCastExpression#getNonNamePostfixOrCastExpression <em>Non Name Postfix Or Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Non Name Postfix Or Cast Expression</em>'.
   * @see org.modelexecution.alf.PostfixOrCastExpression#getNonNamePostfixOrCastExpression()
   * @see #getPostfixOrCastExpression()
   * @generated
   */
  EReference getPostfixOrCastExpression_NonNamePostfixOrCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PostfixOrCastExpression#getNameOrPrimaryExpression <em>Name Or Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Or Primary Expression</em>'.
   * @see org.modelexecution.alf.PostfixOrCastExpression#getNameOrPrimaryExpression()
   * @see #getPostfixOrCastExpression()
   * @generated
   */
  EReference getPostfixOrCastExpression_NameOrPrimaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.PostfixOrCastExpression#getPostFixExpressionCompletion <em>Post Fix Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Fix Expression Completion</em>'.
   * @see org.modelexecution.alf.PostfixOrCastExpression#getPostFixExpressionCompletion()
   * @see #getPostfixOrCastExpression()
   * @generated
   */
  EReference getPostfixOrCastExpression_PostFixExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NonNameUnaryExpression <em>Non Name Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Name Unary Expression</em>'.
   * @see org.modelexecution.alf.NonNameUnaryExpression
   * @generated
   */
  EClass getNonNameUnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression <em>Non Name Postfix Or Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Name Postfix Or Cast Expression</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression
   * @generated
   */
  EClass getNonNamePostfixOrCastExpression();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#isAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#isAny()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EAttribute getNonNamePostfixOrCastExpression_Any();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#getCastCompletion <em>Cast Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cast Completion</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#getCastCompletion()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EReference getNonNamePostfixOrCastExpression_CastCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#getPotentiallyAmbiguousQualifiedName <em>Potentially Ambiguous Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Potentially Ambiguous Qualified Name</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#getPotentiallyAmbiguousQualifiedName()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EReference getNonNamePostfixOrCastExpression_PotentiallyAmbiguousQualifiedName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#getPostifixExpressionCompletion <em>Postifix Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postifix Expression Completion</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#getPostifixExpressionCompletion()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EReference getNonNamePostfixOrCastExpression_PostifixExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#getNameToExpressionCompletion <em>Name To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name To Expression Completion</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#getNameToExpressionCompletion()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EReference getNonNamePostfixOrCastExpression_NameToExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#getPostfixExpressionCompletion <em>Postfix Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Postfix Expression Completion</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#getPostfixExpressionCompletion()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EReference getNonNamePostfixOrCastExpression_PostfixExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#getNonNameExpression <em>Non Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Non Name Expression</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#getNonNameExpression()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EReference getNonNamePostfixOrCastExpression_NonNameExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonNamePostfixOrCastExpression#getBaseExpression <em>Base Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Expression</em>'.
   * @see org.modelexecution.alf.NonNamePostfixOrCastExpression#getBaseExpression()
   * @see #getNonNamePostfixOrCastExpression()
   * @generated
   */
  EReference getNonNamePostfixOrCastExpression_BaseExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NonPostfixNonCastUnaryExpression <em>Non Postfix Non Cast Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Postfix Non Cast Unary Expression</em>'.
   * @see org.modelexecution.alf.NonPostfixNonCastUnaryExpression
   * @generated
   */
  EClass getNonPostfixNonCastUnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BooleanNegationExpression <em>Boolean Negation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Negation Expression</em>'.
   * @see org.modelexecution.alf.BooleanNegationExpression
   * @generated
   */
  EClass getBooleanNegationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.BooleanNegationExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.BooleanNegationExpression#getUnaryExpression()
   * @see #getBooleanNegationExpression()
   * @generated
   */
  EReference getBooleanNegationExpression_UnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BitStringComplementExpression <em>Bit String Complement Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit String Complement Expression</em>'.
   * @see org.modelexecution.alf.BitStringComplementExpression
   * @generated
   */
  EClass getBitStringComplementExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.BitStringComplementExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.BitStringComplementExpression#getUnaryExpression()
   * @see #getBitStringComplementExpression()
   * @generated
   */
  EReference getBitStringComplementExpression_UnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NumericUnaryExpression <em>Numeric Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Unary Expression</em>'.
   * @see org.modelexecution.alf.NumericUnaryExpression
   * @generated
   */
  EClass getNumericUnaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.NumericUnaryExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.modelexecution.alf.NumericUnaryExpression#getOperator()
   * @see #getNumericUnaryExpression()
   * @generated
   */
  EAttribute getNumericUnaryExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NumericUnaryExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.NumericUnaryExpression#getUnaryExpression()
   * @see #getNumericUnaryExpression()
   * @generated
   */
  EReference getNumericUnaryExpression_UnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.IsolationExpression <em>Isolation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Isolation Expression</em>'.
   * @see org.modelexecution.alf.IsolationExpression
   * @generated
   */
  EClass getIsolationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.IsolationExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.IsolationExpression#getUnaryExpression()
   * @see #getIsolationExpression()
   * @generated
   */
  EReference getIsolationExpression_UnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.CastCompletion <em>Cast Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Completion</em>'.
   * @see org.modelexecution.alf.CastCompletion
   * @generated
   */
  EClass getCastCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.MultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression</em>'.
   * @see org.modelexecution.alf.MultiplicativeExpression
   * @generated
   */
  EClass getMultiplicativeExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.MultiplicativeExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.MultiplicativeExpression#getUnaryExpression()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.MultiplicativeExpression#getMultiplicativeExpressionCompletion <em>Multiplicative Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicative Expression Completion</em>'.
   * @see org.modelexecution.alf.MultiplicativeExpression#getMultiplicativeExpressionCompletion()
   * @see #getMultiplicativeExpression()
   * @generated
   */
  EReference getMultiplicativeExpression_MultiplicativeExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.MultiplicativeExpressionCompletion <em>Multiplicative Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expression Completion</em>'.
   * @see org.modelexecution.alf.MultiplicativeExpressionCompletion
   * @generated
   */
  EClass getMultiplicativeExpressionCompletion();

  /**
   * Returns the meta object for the attribute list '{@link org.modelexecution.alf.MultiplicativeExpressionCompletion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.modelexecution.alf.MultiplicativeExpressionCompletion#getOperator()
   * @see #getMultiplicativeExpressionCompletion()
   * @generated
   */
  EAttribute getMultiplicativeExpressionCompletion_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.MultiplicativeExpressionCompletion#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.MultiplicativeExpressionCompletion#getUnaryExpression()
   * @see #getMultiplicativeExpressionCompletion()
   * @generated
   */
  EReference getMultiplicativeExpressionCompletion_UnaryExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression</em>'.
   * @see org.modelexecution.alf.AdditiveExpression
   * @generated
   */
  EClass getAdditiveExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AdditiveExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.AdditiveExpression#getUnaryExpression()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AdditiveExpression#getAdditiveExpressionCompletion <em>Additive Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Additive Expression Completion</em>'.
   * @see org.modelexecution.alf.AdditiveExpression#getAdditiveExpressionCompletion()
   * @see #getAdditiveExpression()
   * @generated
   */
  EReference getAdditiveExpression_AdditiveExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AdditiveExpressionCompletion <em>Additive Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expression Completion</em>'.
   * @see org.modelexecution.alf.AdditiveExpressionCompletion
   * @generated
   */
  EClass getAdditiveExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AdditiveExpressionCompletion#getMultiplicativeExpressionCompletion <em>Multiplicative Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicative Expression Completion</em>'.
   * @see org.modelexecution.alf.AdditiveExpressionCompletion#getMultiplicativeExpressionCompletion()
   * @see #getAdditiveExpressionCompletion()
   * @generated
   */
  EReference getAdditiveExpressionCompletion_MultiplicativeExpressionCompletion();

  /**
   * Returns the meta object for the attribute list '{@link org.modelexecution.alf.AdditiveExpressionCompletion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.modelexecution.alf.AdditiveExpressionCompletion#getOperator()
   * @see #getAdditiveExpressionCompletion()
   * @generated
   */
  EAttribute getAdditiveExpressionCompletion_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.AdditiveExpressionCompletion#getMultiplicativeExpression <em>Multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multiplicative Expression</em>'.
   * @see org.modelexecution.alf.AdditiveExpressionCompletion#getMultiplicativeExpression()
   * @see #getAdditiveExpressionCompletion()
   * @generated
   */
  EReference getAdditiveExpressionCompletion_MultiplicativeExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expression</em>'.
   * @see org.modelexecution.alf.ShiftExpression
   * @generated
   */
  EClass getShiftExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ShiftExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.ShiftExpression#getUnaryExpression()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ShiftExpression#getShiftExpressionCompletion <em>Shift Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shift Expression Completion</em>'.
   * @see org.modelexecution.alf.ShiftExpression#getShiftExpressionCompletion()
   * @see #getShiftExpression()
   * @generated
   */
  EReference getShiftExpression_ShiftExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ShiftExpressionCompletion <em>Shift Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shift Expression Completion</em>'.
   * @see org.modelexecution.alf.ShiftExpressionCompletion
   * @generated
   */
  EClass getShiftExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ShiftExpressionCompletion#getAdditiveExpressionCompletion <em>Additive Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Additive Expression Completion</em>'.
   * @see org.modelexecution.alf.ShiftExpressionCompletion#getAdditiveExpressionCompletion()
   * @see #getShiftExpressionCompletion()
   * @generated
   */
  EReference getShiftExpressionCompletion_AdditiveExpressionCompletion();

  /**
   * Returns the meta object for the attribute list '{@link org.modelexecution.alf.ShiftExpressionCompletion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.modelexecution.alf.ShiftExpressionCompletion#getOperator()
   * @see #getShiftExpressionCompletion()
   * @generated
   */
  EAttribute getShiftExpressionCompletion_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ShiftExpressionCompletion#getAdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Additive Expression</em>'.
   * @see org.modelexecution.alf.ShiftExpressionCompletion#getAdditiveExpression()
   * @see #getShiftExpressionCompletion()
   * @generated
   */
  EReference getShiftExpressionCompletion_AdditiveExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.RelationalExpression <em>Relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression</em>'.
   * @see org.modelexecution.alf.RelationalExpression
   * @generated
   */
  EClass getRelationalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.RelationalExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.RelationalExpression#getUnaryExpression()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.RelationalExpression#getRelationalExpressionCompletion <em>Relational Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relational Expression Completion</em>'.
   * @see org.modelexecution.alf.RelationalExpression#getRelationalExpressionCompletion()
   * @see #getRelationalExpression()
   * @generated
   */
  EReference getRelationalExpression_RelationalExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.RelationalExpressionCompletion <em>Relational Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Expression Completion</em>'.
   * @see org.modelexecution.alf.RelationalExpressionCompletion
   * @generated
   */
  EClass getRelationalExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpressionCompletion <em>Shift Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shift Expression Completion</em>'.
   * @see org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpressionCompletion()
   * @see #getRelationalExpressionCompletion()
   * @generated
   */
  EReference getRelationalExpressionCompletion_ShiftExpressionCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.RelationalExpressionCompletion#getRelationalOperator <em>Relational Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relational Operator</em>'.
   * @see org.modelexecution.alf.RelationalExpressionCompletion#getRelationalOperator()
   * @see #getRelationalExpressionCompletion()
   * @generated
   */
  EAttribute getRelationalExpressionCompletion_RelationalOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shift Expression</em>'.
   * @see org.modelexecution.alf.RelationalExpressionCompletion#getShiftExpression()
   * @see #getRelationalExpressionCompletion()
   * @generated
   */
  EReference getRelationalExpressionCompletion_ShiftExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassificationExpression <em>Classification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification Expression</em>'.
   * @see org.modelexecution.alf.ClassificationExpression
   * @generated
   */
  EClass getClassificationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.ClassificationExpression#getUnaryExpression()
   * @see #getClassificationExpression()
   * @generated
   */
  EReference getClassificationExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationExpression#getClassificationExpressionCompletion <em>Classification Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classification Expression Completion</em>'.
   * @see org.modelexecution.alf.ClassificationExpression#getClassificationExpressionCompletion()
   * @see #getClassificationExpression()
   * @generated
   */
  EReference getClassificationExpression_ClassificationExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassificationExpressionCompletion <em>Classification Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification Expression Completion</em>'.
   * @see org.modelexecution.alf.ClassificationExpressionCompletion
   * @generated
   */
  EClass getClassificationExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationExpressionCompletion#getRelationalExpressionCompletion <em>Relational Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relational Expression Completion</em>'.
   * @see org.modelexecution.alf.ClassificationExpressionCompletion#getRelationalExpressionCompletion()
   * @see #getClassificationExpressionCompletion()
   * @generated
   */
  EReference getClassificationExpressionCompletion_RelationalExpressionCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.ClassificationExpressionCompletion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.modelexecution.alf.ClassificationExpressionCompletion#getOperator()
   * @see #getClassificationExpressionCompletion()
   * @generated
   */
  EAttribute getClassificationExpressionCompletion_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationExpressionCompletion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.ClassificationExpressionCompletion#getName()
   * @see #getClassificationExpressionCompletion()
   * @generated
   */
  EReference getClassificationExpressionCompletion_Name();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see org.modelexecution.alf.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EqualityExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.EqualityExpression#getUnaryExpression()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EqualityExpression#getClassificationExpressionCompletion <em>Classification Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classification Expression Completion</em>'.
   * @see org.modelexecution.alf.EqualityExpression#getClassificationExpressionCompletion()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_ClassificationExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EqualityExpressionCompletion <em>Equality Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression Completion</em>'.
   * @see org.modelexecution.alf.EqualityExpressionCompletion
   * @generated
   */
  EClass getEqualityExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.EqualityExpressionCompletion#getClassificationExpressionCompletion <em>Classification Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classification Expression Completion</em>'.
   * @see org.modelexecution.alf.EqualityExpressionCompletion#getClassificationExpressionCompletion()
   * @see #getEqualityExpressionCompletion()
   * @generated
   */
  EReference getEqualityExpressionCompletion_ClassificationExpressionCompletion();

  /**
   * Returns the meta object for the attribute list '{@link org.modelexecution.alf.EqualityExpressionCompletion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see org.modelexecution.alf.EqualityExpressionCompletion#getOperator()
   * @see #getEqualityExpressionCompletion()
   * @generated
   */
  EAttribute getEqualityExpressionCompletion_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.EqualityExpressionCompletion#getClassificationExpression <em>Classification Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classification Expression</em>'.
   * @see org.modelexecution.alf.EqualityExpressionCompletion#getClassificationExpression()
   * @see #getEqualityExpressionCompletion()
   * @generated
   */
  EReference getEqualityExpressionCompletion_ClassificationExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.modelexecution.alf.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AndExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.AndExpression#getUnaryExpression()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AndExpression#getAndExpressionCompletion <em>And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>And Expression Completion</em>'.
   * @see org.modelexecution.alf.AndExpression#getAndExpressionCompletion()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_AndExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AndExpressionCompletion <em>And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression Completion</em>'.
   * @see org.modelexecution.alf.AndExpressionCompletion
   * @generated
   */
  EClass getAndExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AndExpressionCompletion#getEqualityExpressionCompletion <em>Equality Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Equality Expression Completion</em>'.
   * @see org.modelexecution.alf.AndExpressionCompletion#getEqualityExpressionCompletion()
   * @see #getAndExpressionCompletion()
   * @generated
   */
  EReference getAndExpressionCompletion_EqualityExpressionCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.AndExpressionCompletion#getEqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equality Expression</em>'.
   * @see org.modelexecution.alf.AndExpressionCompletion#getEqualityExpression()
   * @see #getAndExpressionCompletion()
   * @generated
   */
  EReference getAndExpressionCompletion_EqualityExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive Or Expression</em>'.
   * @see org.modelexecution.alf.ExclusiveOrExpression
   * @generated
   */
  EClass getExclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ExclusiveOrExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.ExclusiveOrExpression#getUnaryExpression()
   * @see #getExclusiveOrExpression()
   * @generated
   */
  EReference getExclusiveOrExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ExclusiveOrExpression#getExclusiveOrExpressionCompletion <em>Exclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclusive Or Expression Completion</em>'.
   * @see org.modelexecution.alf.ExclusiveOrExpression#getExclusiveOrExpressionCompletion()
   * @see #getExclusiveOrExpression()
   * @generated
   */
  EReference getExclusiveOrExpression_ExclusiveOrExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ExclusiveOrExpressionCompletion <em>Exclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusive Or Expression Completion</em>'.
   * @see org.modelexecution.alf.ExclusiveOrExpressionCompletion
   * @generated
   */
  EClass getExclusiveOrExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ExclusiveOrExpressionCompletion#getAndExpressionCompletion <em>And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>And Expression Completion</em>'.
   * @see org.modelexecution.alf.ExclusiveOrExpressionCompletion#getAndExpressionCompletion()
   * @see #getExclusiveOrExpressionCompletion()
   * @generated
   */
  EReference getExclusiveOrExpressionCompletion_AndExpressionCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ExclusiveOrExpressionCompletion#getAndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And Expression</em>'.
   * @see org.modelexecution.alf.ExclusiveOrExpressionCompletion#getAndExpression()
   * @see #getExclusiveOrExpressionCompletion()
   * @generated
   */
  EReference getExclusiveOrExpressionCompletion_AndExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.InclusiveOrExpression <em>Inclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusive Or Expression</em>'.
   * @see org.modelexecution.alf.InclusiveOrExpression
   * @generated
   */
  EClass getInclusiveOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InclusiveOrExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.InclusiveOrExpression#getUnaryExpression()
   * @see #getInclusiveOrExpression()
   * @generated
   */
  EReference getInclusiveOrExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InclusiveOrExpression#getInclusiveOrExpressionCompletion <em>Inclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inclusive Or Expression Completion</em>'.
   * @see org.modelexecution.alf.InclusiveOrExpression#getInclusiveOrExpressionCompletion()
   * @see #getInclusiveOrExpression()
   * @generated
   */
  EReference getInclusiveOrExpression_InclusiveOrExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.InclusiveOrExpressionCompletion <em>Inclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inclusive Or Expression Completion</em>'.
   * @see org.modelexecution.alf.InclusiveOrExpressionCompletion
   * @generated
   */
  EClass getInclusiveOrExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InclusiveOrExpressionCompletion#getExclusiveOrExpressionCompletion <em>Exclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclusive Or Expression Completion</em>'.
   * @see org.modelexecution.alf.InclusiveOrExpressionCompletion#getExclusiveOrExpressionCompletion()
   * @see #getInclusiveOrExpressionCompletion()
   * @generated
   */
  EReference getInclusiveOrExpressionCompletion_ExclusiveOrExpressionCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.InclusiveOrExpressionCompletion#getExclusiveOrExpression <em>Exclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exclusive Or Expression</em>'.
   * @see org.modelexecution.alf.InclusiveOrExpressionCompletion#getExclusiveOrExpression()
   * @see #getInclusiveOrExpressionCompletion()
   * @generated
   */
  EReference getInclusiveOrExpressionCompletion_ExclusiveOrExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression</em>'.
   * @see org.modelexecution.alf.ConditionalAndExpression
   * @generated
   */
  EClass getConditionalAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalAndExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.ConditionalAndExpression#getUnaryExpression()
   * @see #getConditionalAndExpression()
   * @generated
   */
  EReference getConditionalAndExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalAndExpression#getConditionalAndExpressionCompletion <em>Conditional And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional And Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalAndExpression#getConditionalAndExpressionCompletion()
   * @see #getConditionalAndExpression()
   * @generated
   */
  EReference getConditionalAndExpression_ConditionalAndExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ConditionalAndExpressionCompletion <em>Conditional And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional And Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalAndExpressionCompletion
   * @generated
   */
  EClass getConditionalAndExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalAndExpressionCompletion#getInclusiveOrExpressionCompletion <em>Inclusive Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Inclusive Or Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalAndExpressionCompletion#getInclusiveOrExpressionCompletion()
   * @see #getConditionalAndExpressionCompletion()
   * @generated
   */
  EReference getConditionalAndExpressionCompletion_InclusiveOrExpressionCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ConditionalAndExpressionCompletion#getInclusiveOrExpression <em>Inclusive Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inclusive Or Expression</em>'.
   * @see org.modelexecution.alf.ConditionalAndExpressionCompletion#getInclusiveOrExpression()
   * @see #getConditionalAndExpressionCompletion()
   * @generated
   */
  EReference getConditionalAndExpressionCompletion_InclusiveOrExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression</em>'.
   * @see org.modelexecution.alf.ConditionalOrExpression
   * @generated
   */
  EClass getConditionalOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalOrExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.ConditionalOrExpression#getUnaryExpression()
   * @see #getConditionalOrExpression()
   * @generated
   */
  EReference getConditionalOrExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalOrExpression#getConditionalOrExpressionCompletion <em>Conditional Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional Or Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalOrExpression#getConditionalOrExpressionCompletion()
   * @see #getConditionalOrExpression()
   * @generated
   */
  EReference getConditionalOrExpression_ConditionalOrExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ConditionalOrExpressionCompletion <em>Conditional Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Or Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalOrExpressionCompletion
   * @generated
   */
  EClass getConditionalOrExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalOrExpressionCompletion#getConditionalAndExpressionCompletion <em>Conditional And Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional And Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalOrExpressionCompletion#getConditionalAndExpressionCompletion()
   * @see #getConditionalOrExpressionCompletion()
   * @generated
   */
  EReference getConditionalOrExpressionCompletion_ConditionalAndExpressionCompletion();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ConditionalOrExpressionCompletion#getConditionalAndExpression <em>Conditional And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditional And Expression</em>'.
   * @see org.modelexecution.alf.ConditionalOrExpressionCompletion#getConditionalAndExpression()
   * @see #getConditionalOrExpressionCompletion()
   * @generated
   */
  EReference getConditionalOrExpressionCompletion_ConditionalAndExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expression</em>'.
   * @see org.modelexecution.alf.ConditionalExpression
   * @generated
   */
  EClass getConditionalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalExpression#getUnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unary Expression</em>'.
   * @see org.modelexecution.alf.ConditionalExpression#getUnaryExpression()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_UnaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalExpression#getConditionalExpressionCompletion <em>Conditional Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalExpression#getConditionalExpressionCompletion()
   * @see #getConditionalExpression()
   * @generated
   */
  EReference getConditionalExpression_ConditionalExpressionCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ConditionalExpressionCompletion <em>Conditional Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalExpressionCompletion
   * @generated
   */
  EClass getConditionalExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalExpressionCompletion#getConditionalOrExpressionCompletion <em>Conditional Or Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional Or Expression Completion</em>'.
   * @see org.modelexecution.alf.ConditionalExpressionCompletion#getConditionalOrExpressionCompletion()
   * @see #getConditionalExpressionCompletion()
   * @generated
   */
  EReference getConditionalExpressionCompletion_ConditionalOrExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ConditionalExpressionCompletion#getConditionalExpression <em>Conditional Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Conditional Expression</em>'.
   * @see org.modelexecution.alf.ConditionalExpressionCompletion#getConditionalExpression()
   * @see #getConditionalExpressionCompletion()
   * @generated
   */
  EReference getConditionalExpressionCompletion_ConditionalExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AssignmentExpressionCompletion <em>Assignment Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Expression Completion</em>'.
   * @see org.modelexecution.alf.AssignmentExpressionCompletion
   * @generated
   */
  EClass getAssignmentExpressionCompletion();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.AssignmentExpressionCompletion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.modelexecution.alf.AssignmentExpressionCompletion#getOperator()
   * @see #getAssignmentExpressionCompletion()
   * @generated
   */
  EAttribute getAssignmentExpressionCompletion_Operator();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.StatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Sequence</em>'.
   * @see org.modelexecution.alf.StatementSequence
   * @generated
   */
  EClass getStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.StatementSequence#getDocumentStatement <em>Document Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Document Statement</em>'.
   * @see org.modelexecution.alf.StatementSequence#getDocumentStatement()
   * @see #getStatementSequence()
   * @generated
   */
  EReference getStatementSequence_DocumentStatement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.DocumentedStatement <em>Documented Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documented Statement</em>'.
   * @see org.modelexecution.alf.DocumentedStatement
   * @generated
   */
  EClass getDocumentedStatement();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.DocumentedStatement#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.modelexecution.alf.DocumentedStatement#getComment()
   * @see #getDocumentedStatement()
   * @generated
   */
  EAttribute getDocumentedStatement_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DocumentedStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.modelexecution.alf.DocumentedStatement#getStatement()
   * @see #getDocumentedStatement()
   * @generated
   */
  EReference getDocumentedStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.modelexecution.alf.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.modelexecution.alf.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Block#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.modelexecution.alf.Block#getStatementSequence()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AnnotatedStatement <em>Annotated Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Statement</em>'.
   * @see org.modelexecution.alf.AnnotatedStatement
   * @generated
   */
  EClass getAnnotatedStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AnnotatedStatement#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotations</em>'.
   * @see org.modelexecution.alf.AnnotatedStatement#getAnnotations()
   * @see #getAnnotatedStatement()
   * @generated
   */
  EReference getAnnotatedStatement_Annotations();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AnnotatedStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.modelexecution.alf.AnnotatedStatement#getStatement()
   * @see #getAnnotatedStatement()
   * @generated
   */
  EReference getAnnotatedStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Annotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotations</em>'.
   * @see org.modelexecution.alf.Annotations
   * @generated
   */
  EClass getAnnotations();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.Annotations#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see org.modelexecution.alf.Annotations#getAnnotation()
   * @see #getAnnotations()
   * @generated
   */
  EReference getAnnotations_Annotation();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.modelexecution.alf.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.Annotation#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.modelexecution.alf.Annotation#getId()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.Annotation#getNameList <em>Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name List</em>'.
   * @see org.modelexecution.alf.Annotation#getNameList()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_NameList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NameList <em>Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name List</em>'.
   * @see org.modelexecution.alf.NameList
   * @generated
   */
  EClass getNameList();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.NameList#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Name</em>'.
   * @see org.modelexecution.alf.NameList#getName()
   * @see #getNameList()
   * @generated
   */
  EReference getNameList_Name();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.InLineStatement <em>In Line Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Line Statement</em>'.
   * @see org.modelexecution.alf.InLineStatement
   * @generated
   */
  EClass getInLineStatement();

  /**
   * Returns the meta object for the attribute '{@link org.modelexecution.alf.InLineStatement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.modelexecution.alf.InLineStatement#getId()
   * @see #getInLineStatement()
   * @generated
   */
  EAttribute getInLineStatement_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InLineStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.InLineStatement#getName()
   * @see #getInLineStatement()
   * @generated
   */
  EReference getInLineStatement_Name();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see org.modelexecution.alf.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.BlockStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.BlockStatement#getBlock()
   * @see #getBlockStatement()
   * @generated
   */
  EReference getBlockStatement_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.EmptyStatement <em>Empty Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Statement</em>'.
   * @see org.modelexecution.alf.EmptyStatement
   * @generated
   */
  EClass getEmptyStatement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement <em>Local Name Declaration Or Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Name Declaration Or Expression Statement</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement
   * @generated
   */
  EClass getLocalNameDeclarationOrExpressionStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getPotentiallyAmbiguousName <em>Potentially Ambiguous Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Potentially Ambiguous Name</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getPotentiallyAmbiguousName()
   * @see #getLocalNameDeclarationOrExpressionStatement()
   * @generated
   */
  EReference getLocalNameDeclarationOrExpressionStatement_PotentiallyAmbiguousName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getMultiplicaityIndicator <em>Multiplicaity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicaity Indicator</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getMultiplicaityIndicator()
   * @see #getLocalNameDeclarationOrExpressionStatement()
   * @generated
   */
  EReference getLocalNameDeclarationOrExpressionStatement_MultiplicaityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getName()
   * @see #getLocalNameDeclarationOrExpressionStatement()
   * @generated
   */
  EReference getLocalNameDeclarationOrExpressionStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getLocalNameDeclarationCompletion <em>Local Name Declaration Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Name Declaration Completion</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getLocalNameDeclarationCompletion()
   * @see #getLocalNameDeclarationOrExpressionStatement()
   * @generated
   */
  EReference getLocalNameDeclarationOrExpressionStatement_LocalNameDeclarationCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getNameToExpressionCompletion <em>Name To Expression Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name To Expression Completion</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getNameToExpressionCompletion()
   * @see #getLocalNameDeclarationOrExpressionStatement()
   * @generated
   */
  EReference getLocalNameDeclarationOrExpressionStatement_NameToExpressionCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getNonNameExpression <em>Non Name Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Non Name Expression</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationOrExpressionStatement#getNonNameExpression()
   * @see #getLocalNameDeclarationOrExpressionStatement()
   * @generated
   */
  EReference getLocalNameDeclarationOrExpressionStatement_NonNameExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.LocalNameDeclarationStatement <em>Local Name Declaration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Name Declaration Statement</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationStatement
   * @generated
   */
  EClass getLocalNameDeclarationStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationStatement#getName()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationStatement#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationStatement#getTypeName()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_TypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationStatement#getMultiplicityIndicator <em>Multiplicity Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiplicity Indicator</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationStatement#getMultiplicityIndicator()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_MultiplicityIndicator();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationStatement#getLocalNameDeclarationCompletion <em>Local Name Declaration Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Local Name Declaration Completion</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationStatement#getLocalNameDeclarationCompletion()
   * @see #getLocalNameDeclarationStatement()
   * @generated
   */
  EReference getLocalNameDeclarationStatement_LocalNameDeclarationCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.LocalNameDeclarationStatementCompletion <em>Local Name Declaration Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Name Declaration Statement Completion</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationStatementCompletion
   * @generated
   */
  EClass getLocalNameDeclarationStatementCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LocalNameDeclarationStatementCompletion#getInitializationExpression <em>Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initialization Expression</em>'.
   * @see org.modelexecution.alf.LocalNameDeclarationStatementCompletion#getInitializationExpression()
   * @see #getLocalNameDeclarationStatementCompletion()
   * @generated
   */
  EReference getLocalNameDeclarationStatementCompletion_InitializationExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.InitializationExpression <em>Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialization Expression</em>'.
   * @see org.modelexecution.alf.InitializationExpression
   * @generated
   */
  EClass getInitializationExpression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.InstanceInitializationExpression <em>Instance Initialization Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Initialization Expression</em>'.
   * @see org.modelexecution.alf.InstanceInitializationExpression
   * @generated
   */
  EClass getInstanceInitializationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.InstanceInitializationExpression#getTuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tuple</em>'.
   * @see org.modelexecution.alf.InstanceInitializationExpression#getTuple()
   * @see #getInstanceInitializationExpression()
   * @generated
   */
  EReference getInstanceInitializationExpression_Tuple();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.modelexecution.alf.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.IfStatement#getSequentialClauses <em>Sequential Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequential Clauses</em>'.
   * @see org.modelexecution.alf.IfStatement#getSequentialClauses()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_SequentialClauses();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.IfStatement#getFinalClause <em>Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Final Clause</em>'.
   * @see org.modelexecution.alf.IfStatement#getFinalClause()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_FinalClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SequentialClauses <em>Sequential Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequential Clauses</em>'.
   * @see org.modelexecution.alf.SequentialClauses
   * @generated
   */
  EClass getSequentialClauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.SequentialClauses#getConcurrentClauses <em>Concurrent Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concurrent Clauses</em>'.
   * @see org.modelexecution.alf.SequentialClauses#getConcurrentClauses()
   * @see #getSequentialClauses()
   * @generated
   */
  EReference getSequentialClauses_ConcurrentClauses();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ConcurrentClauses <em>Concurrent Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concurrent Clauses</em>'.
   * @see org.modelexecution.alf.ConcurrentClauses
   * @generated
   */
  EClass getConcurrentClauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ConcurrentClauses#getNonFinalClause <em>Non Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Non Final Clause</em>'.
   * @see org.modelexecution.alf.ConcurrentClauses#getNonFinalClause()
   * @see #getConcurrentClauses()
   * @generated
   */
  EReference getConcurrentClauses_NonFinalClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NonFinalClause <em>Non Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Final Clause</em>'.
   * @see org.modelexecution.alf.NonFinalClause
   * @generated
   */
  EClass getNonFinalClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonFinalClause#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.NonFinalClause#getExpression()
   * @see #getNonFinalClause()
   * @generated
   */
  EReference getNonFinalClause_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.NonFinalClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.NonFinalClause#getBlock()
   * @see #getNonFinalClause()
   * @generated
   */
  EReference getNonFinalClause_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.FinalClause <em>Final Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final Clause</em>'.
   * @see org.modelexecution.alf.FinalClause
   * @generated
   */
  EClass getFinalClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.FinalClause#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.FinalClause#getBlock()
   * @see #getFinalClause()
   * @generated
   */
  EReference getFinalClause_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see org.modelexecution.alf.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SwitchStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.SwitchStatement#getExpression()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.SwitchStatement#getSwitchClause <em>Switch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Clause</em>'.
   * @see org.modelexecution.alf.SwitchStatement#getSwitchClause()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_SwitchClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SwitchStatement#getDefaultClause <em>Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Clause</em>'.
   * @see org.modelexecution.alf.SwitchStatement#getDefaultClause()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_DefaultClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SwitchClause <em>Switch Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Clause</em>'.
   * @see org.modelexecution.alf.SwitchClause
   * @generated
   */
  EClass getSwitchClause();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.SwitchClause#getSwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Case</em>'.
   * @see org.modelexecution.alf.SwitchClause#getSwitchCase()
   * @see #getSwitchClause()
   * @generated
   */
  EReference getSwitchClause_SwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SwitchClause#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.modelexecution.alf.SwitchClause#getStatementSequence()
   * @see #getSwitchClause()
   * @generated
   */
  EReference getSwitchClause_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see org.modelexecution.alf.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SwitchCase#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.SwitchCase#getExpression()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SwitchDefaultClause <em>Switch Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Default Clause</em>'.
   * @see org.modelexecution.alf.SwitchDefaultClause
   * @generated
   */
  EClass getSwitchDefaultClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.SwitchDefaultClause#getStatementSequence <em>Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Sequence</em>'.
   * @see org.modelexecution.alf.SwitchDefaultClause#getStatementSequence()
   * @see #getSwitchDefaultClause()
   * @generated
   */
  EReference getSwitchDefaultClause_StatementSequence();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.NonEmptyStatementSequence <em>Non Empty Statement Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Non Empty Statement Sequence</em>'.
   * @see org.modelexecution.alf.NonEmptyStatementSequence
   * @generated
   */
  EClass getNonEmptyStatementSequence();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.NonEmptyStatementSequence#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see org.modelexecution.alf.NonEmptyStatementSequence#getStatement()
   * @see #getNonEmptyStatementSequence()
   * @generated
   */
  EReference getNonEmptyStatementSequence_Statement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.modelexecution.alf.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.WhileStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.WhileStatement#getExpression()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.WhileStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.WhileStatement#getBlock()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.DoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.modelexecution.alf.DoStatement
   * @generated
   */
  EClass getDoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DoStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.DoStatement#getBlock()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Block();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.DoStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.DoStatement#getExpression()
   * @see #getDoStatement()
   * @generated
   */
  EReference getDoStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.modelexecution.alf.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ForStatement#getForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Control</em>'.
   * @see org.modelexecution.alf.ForStatement#getForControl()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_ForControl();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ForStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.ForStatement#getBlock()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ForControl <em>For Control</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Control</em>'.
   * @see org.modelexecution.alf.ForControl
   * @generated
   */
  EClass getForControl();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.ForControl#getLoopVariableDefinition <em>Loop Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Loop Variable Definition</em>'.
   * @see org.modelexecution.alf.ForControl#getLoopVariableDefinition()
   * @see #getForControl()
   * @generated
   */
  EReference getForControl_LoopVariableDefinition();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.LoopVariableDefinition <em>Loop Variable Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Variable Definition</em>'.
   * @see org.modelexecution.alf.LoopVariableDefinition
   * @generated
   */
  EClass getLoopVariableDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LoopVariableDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.LoopVariableDefinition#getName()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LoopVariableDefinition#getExpression1 <em>Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression1</em>'.
   * @see org.modelexecution.alf.LoopVariableDefinition#getExpression1()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression1();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LoopVariableDefinition#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.modelexecution.alf.LoopVariableDefinition#getExpression2()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression2();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LoopVariableDefinition#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Name</em>'.
   * @see org.modelexecution.alf.LoopVariableDefinition#getTypeName()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_TypeName();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.LoopVariableDefinition#getExpression3 <em>Expression3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression3</em>'.
   * @see org.modelexecution.alf.LoopVariableDefinition#getExpression3()
   * @see #getLoopVariableDefinition()
   * @generated
   */
  EReference getLoopVariableDefinition_Expression3();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Statement</em>'.
   * @see org.modelexecution.alf.BreakStatement
   * @generated
   */
  EClass getBreakStatement();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.modelexecution.alf.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ReturnStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.ReturnStatement#getExpression()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AcceptStatement <em>Accept Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Statement</em>'.
   * @see org.modelexecution.alf.AcceptStatement
   * @generated
   */
  EClass getAcceptStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AcceptStatement#getAcceptClause <em>Accept Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accept Clause</em>'.
   * @see org.modelexecution.alf.AcceptStatement#getAcceptClause()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_AcceptClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AcceptStatement#getSimpleCompletion <em>Simple Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simple Completion</em>'.
   * @see org.modelexecution.alf.AcceptStatement#getSimpleCompletion()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_SimpleCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AcceptStatement#getCompoundCompletion <em>Compound Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compound Completion</em>'.
   * @see org.modelexecution.alf.AcceptStatement#getCompoundCompletion()
   * @see #getAcceptStatement()
   * @generated
   */
  EReference getAcceptStatement_CompoundCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.SimpleAcceptStatementCompletion <em>Simple Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Accept Statement Completion</em>'.
   * @see org.modelexecution.alf.SimpleAcceptStatementCompletion
   * @generated
   */
  EClass getSimpleAcceptStatementCompletion();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.CompoundAcceptStatementCompletion <em>Compound Accept Statement Completion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound Accept Statement Completion</em>'.
   * @see org.modelexecution.alf.CompoundAcceptStatementCompletion
   * @generated
   */
  EClass getCompoundAcceptStatementCompletion();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.CompoundAcceptStatementCompletion#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.CompoundAcceptStatementCompletion#getBlock()
   * @see #getCompoundAcceptStatementCompletion()
   * @generated
   */
  EReference getCompoundAcceptStatementCompletion_Block();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.CompoundAcceptStatementCompletion#getAcceptBlock <em>Accept Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Accept Block</em>'.
   * @see org.modelexecution.alf.CompoundAcceptStatementCompletion#getAcceptBlock()
   * @see #getCompoundAcceptStatementCompletion()
   * @generated
   */
  EReference getCompoundAcceptStatementCompletion_AcceptBlock();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AcceptBlock <em>Accept Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Block</em>'.
   * @see org.modelexecution.alf.AcceptBlock
   * @generated
   */
  EClass getAcceptBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AcceptBlock#getAcceptClause <em>Accept Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Accept Clause</em>'.
   * @see org.modelexecution.alf.AcceptBlock#getAcceptClause()
   * @see #getAcceptBlock()
   * @generated
   */
  EReference getAcceptBlock_AcceptClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AcceptBlock#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.modelexecution.alf.AcceptBlock#getBlock()
   * @see #getAcceptBlock()
   * @generated
   */
  EReference getAcceptBlock_Block();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.AcceptClause <em>Accept Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accept Clause</em>'.
   * @see org.modelexecution.alf.AcceptClause
   * @generated
   */
  EClass getAcceptClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AcceptClause#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.modelexecution.alf.AcceptClause#getName()
   * @see #getAcceptClause()
   * @generated
   */
  EReference getAcceptClause_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.AcceptClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.modelexecution.alf.AcceptClause#getQualifiedNameList()
   * @see #getAcceptClause()
   * @generated
   */
  EReference getAcceptClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassifyStatement <em>Classify Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classify Statement</em>'.
   * @see org.modelexecution.alf.ClassifyStatement
   * @generated
   */
  EClass getClassifyStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassifyStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.modelexecution.alf.ClassifyStatement#getExpression()
   * @see #getClassifyStatement()
   * @generated
   */
  EReference getClassifyStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassifyStatement#getClassificationClause <em>Classification Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classification Clause</em>'.
   * @see org.modelexecution.alf.ClassifyStatement#getClassificationClause()
   * @see #getClassifyStatement()
   * @generated
   */
  EReference getClassifyStatement_ClassificationClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassificationClause <em>Classification Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification Clause</em>'.
   * @see org.modelexecution.alf.ClassificationClause
   * @generated
   */
  EClass getClassificationClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationClause#getClassificationFromClause <em>Classification From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classification From Clause</em>'.
   * @see org.modelexecution.alf.ClassificationClause#getClassificationFromClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ClassificationFromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationClause#getClassificationToClause <em>Classification To Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Classification To Clause</em>'.
   * @see org.modelexecution.alf.ClassificationClause#getClassificationToClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ClassificationToClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationClause#getReclassifyAllClause <em>Reclassify All Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reclassify All Clause</em>'.
   * @see org.modelexecution.alf.ClassificationClause#getReclassifyAllClause()
   * @see #getClassificationClause()
   * @generated
   */
  EReference getClassificationClause_ReclassifyAllClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassificationFromClause <em>Classification From Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification From Clause</em>'.
   * @see org.modelexecution.alf.ClassificationFromClause
   * @generated
   */
  EClass getClassificationFromClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationFromClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.modelexecution.alf.ClassificationFromClause#getQualifiedNameList()
   * @see #getClassificationFromClause()
   * @generated
   */
  EReference getClassificationFromClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ClassificationToClause <em>Classification To Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification To Clause</em>'.
   * @see org.modelexecution.alf.ClassificationToClause
   * @generated
   */
  EClass getClassificationToClause();

  /**
   * Returns the meta object for the containment reference '{@link org.modelexecution.alf.ClassificationToClause#getQualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Name List</em>'.
   * @see org.modelexecution.alf.ClassificationToClause#getQualifiedNameList()
   * @see #getClassificationToClause()
   * @generated
   */
  EReference getClassificationToClause_QualifiedNameList();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.ReclassifyAllClause <em>Reclassify All Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reclassify All Clause</em>'.
   * @see org.modelexecution.alf.ReclassifyAllClause
   * @generated
   */
  EClass getReclassifyAllClause();

  /**
   * Returns the meta object for class '{@link org.modelexecution.alf.QualifiedNameList <em>Qualified Name List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name List</em>'.
   * @see org.modelexecution.alf.QualifiedNameList
   * @generated
   */
  EClass getQualifiedNameList();

  /**
   * Returns the meta object for the containment reference list '{@link org.modelexecution.alf.QualifiedNameList#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualified Name</em>'.
   * @see org.modelexecution.alf.QualifiedNameList#getQualifiedName()
   * @see #getQualifiedNameList()
   * @generated
   */
  EReference getQualifiedNameList_QualifiedName();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.ImportVisibilityIndicator <em>Import Visibility Indicator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Import Visibility Indicator</em>'.
   * @see org.modelexecution.alf.ImportVisibilityIndicator
   * @generated
   */
  EEnum getImportVisibilityIndicator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.ParameterDirection <em>Parameter Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Direction</em>'.
   * @see org.modelexecution.alf.ParameterDirection
   * @generated
   */
  EEnum getParameterDirection();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.LinkOperation <em>Link Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Link Operation</em>'.
   * @see org.modelexecution.alf.LinkOperation
   * @generated
   */
  EEnum getLinkOperation();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.AffixOperator <em>Affix Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Affix Operator</em>'.
   * @see org.modelexecution.alf.AffixOperator
   * @generated
   */
  EEnum getAffixOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.NumericUnaryOperator <em>Numeric Unary Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Numeric Unary Operator</em>'.
   * @see org.modelexecution.alf.NumericUnaryOperator
   * @generated
   */
  EEnum getNumericUnaryOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicative Operator</em>'.
   * @see org.modelexecution.alf.MultiplicativeOperator
   * @generated
   */
  EEnum getMultiplicativeOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.AdditiveOperator <em>Additive Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Additive Operator</em>'.
   * @see org.modelexecution.alf.AdditiveOperator
   * @generated
   */
  EEnum getAdditiveOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.ShiftOperator <em>Shift Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Shift Operator</em>'.
   * @see org.modelexecution.alf.ShiftOperator
   * @generated
   */
  EEnum getShiftOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.RelationalOperator <em>Relational Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relational Operator</em>'.
   * @see org.modelexecution.alf.RelationalOperator
   * @generated
   */
  EEnum getRelationalOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.ClassificationOperator <em>Classification Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Classification Operator</em>'.
   * @see org.modelexecution.alf.ClassificationOperator
   * @generated
   */
  EEnum getClassificationOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.EqualityOperator <em>Equality Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Equality Operator</em>'.
   * @see org.modelexecution.alf.EqualityOperator
   * @generated
   */
  EEnum getEqualityOperator();

  /**
   * Returns the meta object for enum '{@link org.modelexecution.alf.AssignmentOperator <em>Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Assignment Operator</em>'.
   * @see org.modelexecution.alf.AssignmentOperator
   * @generated
   */
  EEnum getAssignmentOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlfFactory getAlfFactory();

} //AlfPackage
