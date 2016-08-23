/**
 * <copyright>
 * </copyright>
 *
 * $Id: WebsitePackageImpl.java,v 1.171 2014/08/22 14:32:52 andy Exp $
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.man.cs.mdsd.criteria.CriteriaPackage;
import uk.ac.man.cs.mdsd.webgen.website.ActionMenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.ActionUnit;
import uk.ac.man.cs.mdsd.webgen.website.AjaxTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.AssociationKey;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.website.AssociationWithoutContainment;
import uk.ac.man.cs.mdsd.webgen.website.Attribute;
import uk.ac.man.cs.mdsd.webgen.website.Authentication;
import uk.ac.man.cs.mdsd.webgen.website.AuthenticationKeyTypes;
import uk.ac.man.cs.mdsd.webgen.website.AuthenticationUnit;
import uk.ac.man.cs.mdsd.webgen.website.BusinessOperation;
import uk.ac.man.cs.mdsd.webgen.website.CaptchaField;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.CasAuthentication;
import uk.ac.man.cs.mdsd.webgen.website.ChildAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ChildAttribute;
import uk.ac.man.cs.mdsd.webgen.website.ChildFeature;
import uk.ac.man.cs.mdsd.webgen.website.ChildPathReference;
import uk.ac.man.cs.mdsd.webgen.website.Classifier;
import uk.ac.man.cs.mdsd.webgen.website.CollectionDisplayOptions;
import uk.ac.man.cs.mdsd.webgen.website.ContentUnit;
import uk.ac.man.cs.mdsd.webgen.website.ControlUnit;
import uk.ac.man.cs.mdsd.webgen.website.CreateSitemapUnit;
import uk.ac.man.cs.mdsd.webgen.website.CreateUnit;
import uk.ac.man.cs.mdsd.webgen.website.CreateUpdateUnit;
import uk.ac.man.cs.mdsd.webgen.website.CurrentUserReference;
import uk.ac.man.cs.mdsd.webgen.website.DataType;
import uk.ac.man.cs.mdsd.webgen.website.DataTypeAttribute;
import uk.ac.man.cs.mdsd.webgen.website.DataTypeField;
import uk.ac.man.cs.mdsd.webgen.website.DataUnit;
import uk.ac.man.cs.mdsd.webgen.website.DatabaseTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.DateAttribute;
import uk.ac.man.cs.mdsd.webgen.website.DateDetails;
import uk.ac.man.cs.mdsd.webgen.website.DateField;
import uk.ac.man.cs.mdsd.webgen.website.DatePathElement;
import uk.ac.man.cs.mdsd.webgen.website.DeleteAction;
import uk.ac.man.cs.mdsd.webgen.website.DetailsUnit;
import uk.ac.man.cs.mdsd.webgen.website.DynamicMenu;
import uk.ac.man.cs.mdsd.webgen.website.DynamicUnit;
import uk.ac.man.cs.mdsd.webgen.website.EditStaticTextMenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.EditUnit;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedAttribute;
import uk.ac.man.cs.mdsd.webgen.website.EncapsulatedFeature;
import uk.ac.man.cs.mdsd.webgen.website.Entity;
import uk.ac.man.cs.mdsd.webgen.website.EntityAssociation;
import uk.ac.man.cs.mdsd.webgen.website.EntityAttribute;
import uk.ac.man.cs.mdsd.webgen.website.EntityFeature;
import uk.ac.man.cs.mdsd.webgen.website.EntityOrView;
import uk.ac.man.cs.mdsd.webgen.website.EnumerationLiteral;
import uk.ac.man.cs.mdsd.webgen.website.EnumerationType;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.FeatureReference;
import uk.ac.man.cs.mdsd.webgen.website.FeatureSupportAction;
import uk.ac.man.cs.mdsd.webgen.website.FileAttribute;
import uk.ac.man.cs.mdsd.webgen.website.Filter;
import uk.ac.man.cs.mdsd.webgen.website.FilterParameter;
import uk.ac.man.cs.mdsd.webgen.website.ForgottenPasswordUnit;
import uk.ac.man.cs.mdsd.webgen.website.FrameworkTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.GridUnit;
import uk.ac.man.cs.mdsd.webgen.website.ImageAttribute;
import uk.ac.man.cs.mdsd.webgen.website.ImageUnit;
import uk.ac.man.cs.mdsd.webgen.website.IndexDisplayOption;
import uk.ac.man.cs.mdsd.webgen.website.IndexUnit;
import uk.ac.man.cs.mdsd.webgen.website.InlineAction;
import uk.ac.man.cs.mdsd.webgen.website.InlineActionContainer;
import uk.ac.man.cs.mdsd.webgen.website.InputTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.InterfaceField;
import uk.ac.man.cs.mdsd.webgen.website.KeyActual;
import uk.ac.man.cs.mdsd.webgen.website.Label;
import uk.ac.man.cs.mdsd.webgen.website.LocalAuthenticationSystem;
import uk.ac.man.cs.mdsd.webgen.website.LocationAttribute;
import uk.ac.man.cs.mdsd.webgen.website.LoginUnit;
import uk.ac.man.cs.mdsd.webgen.website.MapUnit;
import uk.ac.man.cs.mdsd.webgen.website.Menu;
import uk.ac.man.cs.mdsd.webgen.website.MenuEntry;
import uk.ac.man.cs.mdsd.webgen.website.MenuFeature;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabel;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelAttribute;
import uk.ac.man.cs.mdsd.webgen.website.ModelLabelFeature;
import uk.ac.man.cs.mdsd.webgen.website.ModelReference;
import uk.ac.man.cs.mdsd.webgen.website.NamedDisplayElement;
import uk.ac.man.cs.mdsd.webgen.website.NamedElement;
import uk.ac.man.cs.mdsd.webgen.website.OperationResultTypes;
import uk.ac.man.cs.mdsd.webgen.website.OrmTechnologies;
import uk.ac.man.cs.mdsd.webgen.website.Page;
import uk.ac.man.cs.mdsd.webgen.website.PageLink;
import uk.ac.man.cs.mdsd.webgen.website.PageTopMenuOptions;
import uk.ac.man.cs.mdsd.webgen.website.ParameterReference;
import uk.ac.man.cs.mdsd.webgen.website.PathAssociationElement;
import uk.ac.man.cs.mdsd.webgen.website.PathElement;
import uk.ac.man.cs.mdsd.webgen.website.PathReferenceElement;
import uk.ac.man.cs.mdsd.webgen.website.Query;
import uk.ac.man.cs.mdsd.webgen.website.QueryParameter;
import uk.ac.man.cs.mdsd.webgen.website.RegistrationUnit;
import uk.ac.man.cs.mdsd.webgen.website.ResourceAttribute;
import uk.ac.man.cs.mdsd.webgen.website.RouteParameterReference;
import uk.ac.man.cs.mdsd.webgen.website.SearchUnit;
import uk.ac.man.cs.mdsd.webgen.website.SelectAction;
import uk.ac.man.cs.mdsd.webgen.website.Selectable;
import uk.ac.man.cs.mdsd.webgen.website.Selection;
import uk.ac.man.cs.mdsd.webgen.website.SelectionField;
import uk.ac.man.cs.mdsd.webgen.website.SelectionParameter;
import uk.ac.man.cs.mdsd.webgen.website.Service;
import uk.ac.man.cs.mdsd.webgen.website.SliderUnit;
import uk.ac.man.cs.mdsd.webgen.website.StaticMenu;
import uk.ac.man.cs.mdsd.webgen.website.StaticPathElement;
import uk.ac.man.cs.mdsd.webgen.website.StaticUnit;
import uk.ac.man.cs.mdsd.webgen.website.UnitAssociation;
import uk.ac.man.cs.mdsd.webgen.website.UnitContainer;
import uk.ac.man.cs.mdsd.webgen.website.UnitElement;
import uk.ac.man.cs.mdsd.webgen.website.UnitFeature;
import uk.ac.man.cs.mdsd.webgen.website.UnitField;
import uk.ac.man.cs.mdsd.webgen.website.UnitSupportAction;
import uk.ac.man.cs.mdsd.webgen.website.UpdateUnit;
import uk.ac.man.cs.mdsd.webgen.website.UrlAttribute;
import uk.ac.man.cs.mdsd.webgen.website.UserCommand;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebGenModel;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteFactory;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;
import uk.ac.man.cs.mdsd.webgen.website.WebsiteProperties;

import uk.ac.man.cs.mdsd.webgen.website.isHasChoices;
import uk.ac.man.cs.mdsd.webgen.website.util.WebsiteValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsitePackageImpl extends EPackageImpl implements WebsitePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webGenModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass websitePropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localAuthenticationSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casAuthenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedDisplayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityOrViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticPathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datePathElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelLabelAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationWithoutContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationWithContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editStaticTextMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathAssociationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass captchaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitSupportActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathReferenceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyActualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childPathReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createUpdateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createSitemapUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliderUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registrationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forgottenPasswordUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineActionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSupportActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeParameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentUserReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ormTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ajaxTechnologiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationKeyTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum isHasChoicesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateDetailsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationResultTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pageTopMenuOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionDisplayOptionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indexDisplayOptionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.man.cs.mdsd.webgen.website.WebsitePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WebsitePackageImpl() {
		super(eNS_URI, WebsiteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WebsitePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WebsitePackage init() {
		if (isInited) return (WebsitePackage)EPackage.Registry.INSTANCE.getEPackage(WebsitePackage.eNS_URI);

		// Obtain or create and register package
		WebsitePackageImpl theWebsitePackage = (WebsitePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WebsitePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WebsitePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CriteriaPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWebsitePackage.createPackageContents();

		// Initialize created meta-data
		theWebsitePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWebsitePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WebsiteValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWebsitePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WebsitePackage.eNS_URI, theWebsitePackage);
		return theWebsitePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebGenModel() {
		return webGenModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_WebsiteProperties() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Classifiers() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Services() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Pages() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_Menus() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebGenModel_AllowTypeCustomisation() {
		return (EReference)webGenModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebsiteProperties() {
		return websitePropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_SiteTitle() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DevelopmentVersion() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_BaseURL() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_RewriteURLs() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_WebmasterEmail() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CopyrightText() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_MetaDescription() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_ProjectName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsiteProperties_Authentication() {
		return (EReference)websitePropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TestProjectName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultDateFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultTimeFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultDateTimeFormat() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DefaultMaximumUploadSize() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabasePrefix() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseHost() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseName() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabasePort() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabaseUsername() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_DatabasePassword() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_OrmTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TimestampCreation() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TimestampUpdates() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_FrameworkTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_InputTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_AjaxTechnology() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CaptchaSiteKey() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_CaptchaSecretKey() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TextEditorURL() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_ResponsiveTopMenu() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_TopNavigationId() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebsiteProperties_SideMenu() {
		return (EReference)websitePropertiesEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_SiteTemplate() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebsiteProperties_StaticUnitsEditable() {
		return (EAttribute)websitePropertiesEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedDisplayElement() {
		return namedDisplayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedDisplayElement_DisplayLabel() {
		return (EAttribute)namedDisplayElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_PersistentType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_OrmType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_InterfaceType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Placeholder() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_ValidationPattern() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationType_Enumerations() {
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityOrView() {
		return entityOrViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_SingletonName() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_PluralisedName() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_TableName() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_AutoKeyName() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_AutoKeyPersistentType() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_AutoKeyGenerationStrategy() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_ServedBy() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_Labels() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_Features() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_AllFeatures() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_Attributes() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_Associations() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_AllAssociations() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_SerializationExcludeAll() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityOrView_ImplementsUserInterface() {
		return (EAttribute)entityOrViewEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOrView_Keys() {
		return (EReference)entityOrViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Title() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_CollectionAllowAdd() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_CollectionAllowRemove() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_NullDisplayValue() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_HeaderClass() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_DisplayClass() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_FooterClass() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_SerializationGroups() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_SerializationExpose() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_EncodeUriKey() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_EntityFeatures() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityFeature() {
		return entityFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityFeature_PartOf() {
		return (EReference)entityFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityFeature_Cardinality() {
		return (EAttribute)entityFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityFeature_Unique() {
		return (EAttribute)entityFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityFeature_Ordered() {
		return (EAttribute)entityFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityFeature_BooleanIsHasChoice() {
		return (EAttribute)entityFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityFeature_SingletonName() {
		return (EAttribute)entityFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityFeature_PluralisedName() {
		return (EAttribute)entityFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityFeature_ColumnName() {
		return (EAttribute)entityFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityAttribute() {
		return entityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAttribute_PrimaryKey() {
		return (EAttribute)entityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAttribute_ContainerUnique() {
		return (EAttribute)entityAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAttribute_PersistentType() {
		return (EAttribute)entityAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAttribute_OrmType() {
		return (EAttribute)entityAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAttribute_InterfaceType() {
		return (EAttribute)entityAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_Encapsulates() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_ViewFeatures() {
		return (EReference)viewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewFeature() {
		return viewFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewFeature_PartOf() {
		return (EReference)viewFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedFeature() {
		return encapsulatedFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedFeature_DisplayLabel() {
		return (EAttribute)encapsulatedFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedFeature_Alias() {
		return (EAttribute)encapsulatedFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedFeature_ColumnName() {
		return (EAttribute)encapsulatedFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedAttribute() {
		return encapsulatedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedAttribute_Name() {
		return (EAttribute)encapsulatedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedAttribute_Attribute() {
		return (EReference)encapsulatedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedAttribute_Cardinality() {
		return (EAttribute)encapsulatedAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedAssociation() {
		return encapsulatedAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedAssociation_Name() {
		return (EAttribute)encapsulatedAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedAssociation_Association() {
		return (EReference)encapsulatedAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedAssociation_Cardinality() {
		return (EAttribute)encapsulatedAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedAssociation_EncapsulatedTarget() {
		return (EReference)encapsulatedAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncapsulatedAssociation_IsSourceAssociation() {
		return (EAttribute)encapsulatedAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedAssociation_SourceEntity() {
		return (EReference)encapsulatedAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedAssociation_TargetEntity() {
		return (EReference)encapsulatedAssociationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewAssociation() {
		return viewAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewAssociation_Opposite() {
		return (EReference)viewAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewAssociation_Cardinality() {
		return (EAttribute)viewAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_AssociationEnds() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_DefaultValue() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Placeholder() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_ValidationPattern() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_InputClass() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeAttribute() {
		return dataTypeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeAttribute_DataType() {
		return (EReference)dataTypeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeAttribute_ObfuscateFormFields() {
		return (EAttribute)dataTypeAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeAttribute_CaseInsensitive() {
		return (EAttribute)dataTypeAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeAttribute_Encrypt() {
		return (EAttribute)dataTypeAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateAttribute() {
		return dateAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateAttribute_Details() {
		return (EAttribute)dateAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateAttribute_Format() {
		return (EAttribute)dateAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlAttribute() {
		return urlAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlAttribute_DisplayValue() {
		return (EAttribute)urlAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAttribute() {
		return resourceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAttribute_MaximumUploadSize() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAttribute_ValidUploadMimeTypes() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAttribute_ValidUploadExtensions() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAttribute_UploadsWithinWebsite() {
		return (EAttribute)resourceAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAttribute_UploadPath() {
		return (EReference)resourceAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathElement() {
		return pathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticPathElement() {
		return staticPathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticPathElement_Element() {
		return (EAttribute)staticPathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatePathElement() {
		return datePathElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatePathElement_Format() {
		return (EAttribute)datePathElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileAttribute() {
		return fileAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageAttribute() {
		return imageAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationAttribute() {
		return locationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityAssociation() {
		return entityAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAssociation_Keys() {
		return (EReference)entityAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityAssociation_TargetEntity() {
		return (EReference)entityAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_Bidirectional() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_PivotTableName() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_TargetFeatureName() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_TargetPrimaryKey() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_TargetDisplayLabel() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_TargetHeaderClass() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_TargetInputClass() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_TargetDisplayClass() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityAssociation_TargetFooterClass() {
		return (EAttribute)entityAssociationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_Pseudo() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_ChildFeature() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EncapsulatedBy() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_InputClass() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_SourceEntityX() {
		return (EReference)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_TargetEntityX() {
		return (EReference)associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_SerializationMaxDepth() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationKey() {
		return associationKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationKey_KeyFor() {
		return (EReference)associationKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationKey_SourceFeature() {
		return (EReference)associationKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationKey_TargetFeature() {
		return (EReference)associationKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelLabel() {
		return modelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelLabel_LabelFor() {
		return (EReference)modelLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelLabel_Format() {
		return (EAttribute)modelLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelLabel_Features() {
		return (EReference)modelLabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelLabelFeature() {
		return modelLabelFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelLabelFeature_PartOf() {
		return (EReference)modelLabelFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelLabelAttribute() {
		return modelLabelAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelLabelAttribute_Attribute() {
		return (EReference)modelLabelAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelLabelAttribute_DateFormat() {
		return (EAttribute)modelLabelAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelLabelAssociation() {
		return modelLabelAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelLabelAssociation_Association() {
		return (EReference)modelLabelAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelLabelAssociation_DynamicLabel() {
		return (EReference)modelLabelAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelLabelAssociation_IsSourceAssociation() {
		return (EAttribute)modelLabelAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationWithoutContainment() {
		return associationWithoutContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationWithoutContainment_TargetCardinality() {
		return (EAttribute)associationWithoutContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationWithoutContainment_TargetUnique() {
		return (EAttribute)associationWithoutContainmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationWithContainment() {
		return associationWithContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationWithContainment_SourceVisible() {
		return (EAttribute)associationWithContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ParentPage() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ChildPages() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_NavigationLabel() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_SideMenu() {
		return (EReference)pageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_StyleClass() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Entries() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_OmitCaption() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_StyleClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_LayoutClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenu_CaptionClass() {
		return (EAttribute)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuEntry() {
		return menuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuEntry_PartOf() {
		return (EReference)menuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMenuEntry_RequiresRole() {
		return (EAttribute)menuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Filter() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuery_Parameters() {
		return (EReference)queryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameter() {
		return queryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameter_Formal() {
		return (EReference)queryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameter_Value() {
		return (EAttribute)queryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectable() {
		return selectableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticMenu() {
		return staticMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionMenuEntry() {
		return actionMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionMenuEntry_Destination() {
		return (EReference)actionMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionMenuEntry_Query() {
		return (EReference)actionMenuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditStaticTextMenuEntry() {
		return editStaticTextMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicMenu() {
		return dynamicMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_EntityOrView() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_Selection() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicMenu_Title() {
		return (EReference)dynamicMenuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuFeature() {
		return menuFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Parameters() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Selection() {
		return (EReference)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterParameter() {
		return filterParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterParameter_Formal() {
		return (EReference)filterParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterParameter_DataType() {
		return (EReference)filterParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterParameter_DefaultValue() {
		return (EAttribute)filterParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterParameter_Placeholder() {
		return (EAttribute)filterParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Authenticated() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_UriElement() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TopMenuOption() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_TopMenuRank() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageLink() {
		return pageLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageLink_TargetPage() {
		return (EReference)pageLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitContainer() {
		return unitContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitContainer_Units() {
		return (EReference)unitContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitField() {
		return unitFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitField_DisplayedOn() {
		return (EReference)unitFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_Title() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_CollectionDisplayOption() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_CollectionAllowAdd() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_CollectionAllowRemove() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_MaximumDisplaySize() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitField_DateFormat() {
		return (EAttribute)unitFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitFeature() {
		return unitFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_OnlyDisplayWhenNotEmpty() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_DisplayLabel() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Required() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitFeature_ForcedValue() {
		return (EReference)unitFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_NullDisplayValue() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Footer() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_Autofocus() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_HeaderClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_InputClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_DisplayClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitFeature_FooterClass() {
		return (EAttribute)unitFeatureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitElement() {
		return unitElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitElement_Attribute() {
		return (EReference)unitElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_Name() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitElement_DefaultValue() {
		return (EReference)unitElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_ObfuscateFormFields() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_Placeholder() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitElement_ValidationPattern() {
		return (EAttribute)unitElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathAssociationElement() {
		return pathAssociationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathAssociationElement_Association() {
		return (EReference)pathAssociationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathAssociationElement_ChildFeature() {
		return (EReference)pathAssociationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathAssociationElement_IsSourceAssociation() {
		return (EAttribute)pathAssociationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathAssociationElement_SourceEntity() {
		return (EReference)pathAssociationElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathAssociationElement_TargetEntity() {
		return (EReference)pathAssociationElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitAssociation() {
		return unitAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitAssociation_Name() {
		return (EAttribute)unitAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_ValueDisplay() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_Selection() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitAssociation_Filters() {
		return (EReference)unitAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildFeature() {
		return childFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildFeature_PartOf() {
		return (EReference)childFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildAttribute() {
		return childAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildAttribute_Name() {
		return (EAttribute)childAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildAttribute_Attribute() {
		return (EReference)childAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildAssociation() {
		return childAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildAssociation_Name() {
		return (EAttribute)childAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Serves() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Selections() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Operations() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelection() {
		return selectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_UsedBy() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelection_Distinct() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Fields() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Parameters() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Joins() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Filter() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelection_Ordering() {
		return (EReference)selectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelection_Limit() {
		return (EAttribute)selectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionField() {
		return selectionFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionParameter() {
		return selectionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionParameter_Optional() {
		return (EAttribute)selectionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionParameter_DefaultValue() {
		return (EAttribute)selectionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessOperation() {
		return businessOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessOperation_Uses() {
		return (EReference)businessOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessOperation_ResultType() {
		return (EAttribute)businessOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessOperation_ResultMimeType() {
		return (EAttribute)businessOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentUnit() {
		return contentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentUnit_DisplayedOn() {
		return (EReference)contentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_CreateDefaultUriElement() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_RequiresRole() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_PurposeSummary() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_UriElement() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_Alternative() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_OmitCaption() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentUnit_CaptionClass() {
		return (EAttribute)contentUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceField() {
		return interfaceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_Required() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_DefaultValue() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceField_MustMatch() {
		return (EReference)interfaceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_InputClass() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_Placeholder() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceField_ValidationPattern() {
		return (EAttribute)interfaceFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeField() {
		return dataTypeFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeField_DataType() {
		return (EReference)dataTypeFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_ObfuscateFormFields() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_Encrypt() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeField_InterfaceType() {
		return (EAttribute)dataTypeFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateField() {
		return dateFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_Details() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateField_Format() {
		return (EAttribute)dateFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaptchaField() {
		return captchaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitSupportAction() {
		return unitSupportActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitSupportAction_Disable() {
		return (EAttribute)unitSupportActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitSupportAction_ConfirmMessage() {
		return (EAttribute)unitSupportActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathReferenceElement() {
		return pathReferenceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathReferenceElement_Actual() {
		return (EReference)pathReferenceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathReferenceElement_ChildReference() {
		return (EReference)pathReferenceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathReferenceElement_EntityType() {
		return (EReference)pathReferenceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyActual() {
		return keyActualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyActual_Container() {
		return (EReference)keyActualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyActual_Key() {
		return (EReference)keyActualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildPathReference() {
		return childPathReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildPathReference_Parent() {
		return (EReference)childPathReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditUnit() {
		return editUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_DefaultSelection() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_Title() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_EnableWhen() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_ConfirmDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_ConfirmLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditUnit_CancelDestination() {
		return (EReference)editUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_CancelLabel() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_ContentClass() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditUnit_CustomiseValues() {
		return (EAttribute)editUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateUnit() {
		return createUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUnit_StyleClass() {
		return (EAttribute)createUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateUpdateUnit() {
		return createUpdateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_CreateUriElement() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_ClearLabel() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUpdateUnit_StyleClass() {
		return (EAttribute)createUpdateUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataUnit() {
		return dataUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_DefaultSelection() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataUnit_Title() {
		return (EReference)dataUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticUnit() {
		return staticUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticUnit_Content() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticUnit_StyleClass() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticUnit_ContentClass() {
		return (EAttribute)staticUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserCommand() {
		return userCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateSitemapUnit() {
		return createSitemapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_DeployedURL() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_Filename() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_StyleClass() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateSitemapUnit_ContentClass() {
		return (EAttribute)createSitemapUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicUnit() {
		return dynamicUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_Entities() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_DisplayFields() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_SupportActions() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDynamicUnit_KeyActuals() {
		return (EReference)dynamicUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_Header() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_Footer() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_HeaderClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_ControlClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_FooterClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicUnit_ErrorClass() {
		return (EAttribute)dynamicUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailsUnit() {
		return detailsUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsUnit_OnlyDisplayWhenNotEmpty() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsUnit_OmitFieldLabels() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsUnit_StyleClass() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsUnit_ContentClass() {
		return (EAttribute)detailsUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexUnit() {
		return indexUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_DisplayOption() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_OmitColumnLabels() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexUnit_Filters() {
		return (EReference)indexUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexUnit_Pagination() {
		return (EReference)indexUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_DefaultPaginationSize() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_EmptyMessage() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_NextNpages() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_PreviousNpages() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_NextPageLabel() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_PreviousPageLabel() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_UseDisabledPageLinks() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_UseFirstLastPageLinks() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_FirstPageLabel() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_LastPageLabel() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_StyleClass() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_ContentClass() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexUnit_RowClasses() {
		return (EAttribute)indexUnitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlUnit() {
		return controlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlUnit_SubmitLabel() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlUnit_CancelDestination() {
		return (EReference)controlUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlUnit_CancelLabel() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlUnit_ContentClass() {
		return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchUnit() {
		return searchUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchUnit_ResultsDestination() {
		return (EReference)searchUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchUnit_StyleClass() {
		return (EAttribute)searchUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionUnit() {
		return actionUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionUnit_StyleClass() {
		return (EAttribute)actionUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageUnit() {
		return imageUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageUnit_DefaultSelection() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageUnit_ImageProperty() {
		return (EReference)imageUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUnit_ShowTime() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageUnit_TransitionTime() {
		return (EAttribute)imageUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSliderUnit() {
		return sliderUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSliderUnit_StyleClass() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSliderUnit_ContentClass() {
		return (EAttribute)sliderUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridUnit() {
		return gridUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridUnit_StyleClass() {
		return (EAttribute)gridUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGridUnit_ContentClass() {
		return (EAttribute)gridUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationUnit() {
		return authenticationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegistrationUnit() {
		return registrationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegistrationUnit_StyleClass() {
		return (EAttribute)registrationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginUnit() {
		return loginUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginUnit_LogoutUriElement() {
		return (EAttribute)loginUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoginUnit_StyleClass() {
		return (EAttribute)loginUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForgottenPasswordUnit() {
		return forgottenPasswordUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForgottenPasswordUnit_StyleClass() {
		return (EAttribute)forgottenPasswordUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineActionContainer() {
		return inlineActionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineActionContainer_Actions() {
		return (EReference)inlineActionContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineAction() {
		return inlineActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_UsedBy() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Disable() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_EnableWhen() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineAction_DisplayWhen() {
		return (EReference)inlineActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Header() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_Footer() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_HeaderClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineAction_FooterClass() {
		return (EAttribute)inlineActionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateUnit() {
		return updateUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateUnit_StyleClass() {
		return (EAttribute)updateUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapUnit() {
		return mapUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapUnit_ReadOnly() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapUnit_DefaultZoomLevel() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapUnit_StyleClass() {
		return (EAttribute)mapUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapUnit_Location() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapUnit_PlaceName() {
		return (EReference)mapUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectAction() {
		return selectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectAction_Target() {
		return (EReference)selectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteAction() {
		return deleteActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteAction_Destination() {
		return (EReference)deleteActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteAction_ConfirmMessage() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteAction_UriElement() {
		return (EAttribute)deleteActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSupportAction() {
		return featureSupportActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSupportAction_Operation() {
		return (EReference)featureSupportActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_ConfirmMessage() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_UriElement() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSupportAction_FileExtension() {
		return (EAttribute)featureSupportActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReference() {
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_Unit() {
		return (EReference)modelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureReference() {
		return featureReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureReference_Name() {
		return (EAttribute)featureReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureReference_Feature() {
		return (EReference)featureReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRouteParameterReference() {
		return routeParameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRouteParameterReference_Name() {
		return (EAttribute)routeParameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRouteParameterReference_Parameter() {
		return (EReference)routeParameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterReference() {
		return parameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterReference_Name() {
		return (EAttribute)parameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterReference_Parameter() {
		return (EReference)parameterReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentUserReference() {
		return currentUserReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCurrentUserReference_UserModel() {
		return (EReference)currentUserReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseTechnologies() {
		return databaseTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrmTechnologies() {
		return ormTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrameworkTechnologies() {
		return frameworkTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInputTechnologies() {
		return inputTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAjaxTechnologies() {
		return ajaxTechnologiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthenticationKeyTypes() {
		return authenticationKeyTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_Authenticates() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_User() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthentication_UserKey() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_LoginLabel() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthentication_LogoutLabel() {
		return (EAttribute)authenticationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalAuthenticationSystem() {
		return localAuthenticationSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_Authentication() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AuthenticationKey() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseCaptcha() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowRememberMe() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_AllowSelfRegistration() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_TrackLoginAttempts() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_UseEmailActivation() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalAuthenticationSystem_SendWelcomeEmail() {
		return (EAttribute)localAuthenticationSystemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_RegistrationUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_LoginUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocalAuthenticationSystem_ForgottenPasswordUnit() {
		return (EReference)localAuthenticationSystemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCasAuthentication() {
		return casAuthenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getisHasChoices() {
		return isHasChoicesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDateDetails() {
		return dateDetailsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationResultTypes() {
		return operationResultTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPageTopMenuOptions() {
		return pageTopMenuOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollectionDisplayOptions() {
		return collectionDisplayOptionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndexDisplayOption() {
		return indexDisplayOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteFactory getWebsiteFactory() {
		return (WebsiteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		webGenModelEClass = createEClass(WEB_GEN_MODEL);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__WEBSITE_PROPERTIES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__CLASSIFIERS);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__SERVICES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__PAGES);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__MENUS);
		createEReference(webGenModelEClass, WEB_GEN_MODEL__ALLOW_TYPE_CUSTOMISATION);

		websitePropertiesEClass = createEClass(WEBSITE_PROPERTIES);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SITE_TITLE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEVELOPMENT_VERSION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__BASE_URL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__REWRITE_UR_LS);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__WEBMASTER_EMAIL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__COPYRIGHT_TEXT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__META_DESCRIPTION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__PROJECT_NAME);
		createEReference(websitePropertiesEClass, WEBSITE_PROPERTIES__AUTHENTICATION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TEST_PROJECT_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_DATE_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_TIME_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_DATE_TIME_FORMAT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DEFAULT_MAXIMUM_UPLOAD_SIZE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_PREFIX);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_HOST);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_NAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_PORT);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_USERNAME);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__DATABASE_PASSWORD);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__ORM_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TIMESTAMP_CREATION);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TIMESTAMP_UPDATES);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__FRAMEWORK_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__INPUT_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__AJAX_TECHNOLOGY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__CAPTCHA_SITE_KEY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__CAPTCHA_SECRET_KEY);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TEXT_EDITOR_URL);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__RESPONSIVE_TOP_MENU);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__TOP_NAVIGATION_ID);
		createEReference(websitePropertiesEClass, WEBSITE_PROPERTIES__SIDE_MENU);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__SITE_TEMPLATE);
		createEAttribute(websitePropertiesEClass, WEBSITE_PROPERTIES__STATIC_UNITS_EDITABLE);

		authenticationEClass = createEClass(AUTHENTICATION);
		createEReference(authenticationEClass, AUTHENTICATION__AUTHENTICATES);
		createEReference(authenticationEClass, AUTHENTICATION__USER);
		createEReference(authenticationEClass, AUTHENTICATION__USER_KEY);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGIN_LABEL);
		createEAttribute(authenticationEClass, AUTHENTICATION__LOGOUT_LABEL);

		localAuthenticationSystemEClass = createEClass(LOCAL_AUTHENTICATION_SYSTEM);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__AUTHENTICATION_KEY);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_CAPTCHA);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_REMEMBER_ME);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__ALLOW_SELF_REGISTRATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__TRACK_LOGIN_ATTEMPTS);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__USE_EMAIL_ACTIVATION);
		createEAttribute(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__SEND_WELCOME_EMAIL);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__REGISTRATION_UNIT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__LOGIN_UNIT);
		createEReference(localAuthenticationSystemEClass, LOCAL_AUTHENTICATION_SYSTEM__FORGOTTEN_PASSWORD_UNIT);

		casAuthenticationEClass = createEClass(CAS_AUTHENTICATION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		namedDisplayElementEClass = createEClass(NAMED_DISPLAY_ELEMENT);
		createEAttribute(namedDisplayElementEClass, NAMED_DISPLAY_ELEMENT__DISPLAY_LABEL);

		classifierEClass = createEClass(CLASSIFIER);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__PERSISTENT_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__ORM_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__INTERFACE_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__PLACEHOLDER);
		createEAttribute(dataTypeEClass, DATA_TYPE__VALIDATION_PATTERN);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__ENUMERATIONS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

		entityOrViewEClass = createEClass(ENTITY_OR_VIEW);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__SINGLETON_NAME);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__PLURALISED_NAME);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__KEYS);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__TABLE_NAME);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__AUTO_KEY_NAME);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__AUTO_KEY_PERSISTENT_TYPE);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__AUTO_KEY_GENERATION_STRATEGY);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__SERVED_BY);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__LABELS);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__FEATURES);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__ALL_FEATURES);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__ATTRIBUTES);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__ASSOCIATIONS);
		createEReference(entityOrViewEClass, ENTITY_OR_VIEW__ALL_ASSOCIATIONS);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__SERIALIZATION_EXCLUDE_ALL);
		createEAttribute(entityOrViewEClass, ENTITY_OR_VIEW__IMPLEMENTS_USER_INTERFACE);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__TITLE);
		createEAttribute(featureEClass, FEATURE__COLLECTION_ALLOW_ADD);
		createEAttribute(featureEClass, FEATURE__COLLECTION_ALLOW_REMOVE);
		createEAttribute(featureEClass, FEATURE__NULL_DISPLAY_VALUE);
		createEAttribute(featureEClass, FEATURE__ENCODE_URI_KEY);
		createEAttribute(featureEClass, FEATURE__SERIALIZATION_GROUPS);
		createEAttribute(featureEClass, FEATURE__SERIALIZATION_EXPOSE);
		createEAttribute(featureEClass, FEATURE__HEADER_CLASS);
		createEAttribute(featureEClass, FEATURE__DISPLAY_CLASS);
		createEAttribute(featureEClass, FEATURE__FOOTER_CLASS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__PLACEHOLDER);
		createEAttribute(attributeEClass, ATTRIBUTE__VALIDATION_PATTERN);
		createEAttribute(attributeEClass, ATTRIBUTE__INPUT_CLASS);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__PSEUDO);
		createEReference(associationEClass, ASSOCIATION__CHILD_FEATURE);
		createEReference(associationEClass, ASSOCIATION__ENCAPSULATED_BY);
		createEAttribute(associationEClass, ASSOCIATION__INPUT_CLASS);
		createEReference(associationEClass, ASSOCIATION__SOURCE_ENTITY_X);
		createEReference(associationEClass, ASSOCIATION__TARGET_ENTITY_X);
		createEAttribute(associationEClass, ASSOCIATION__SERIALIZATION_MAX_DEPTH);

		labelEClass = createEClass(LABEL);

		modelLabelEClass = createEClass(MODEL_LABEL);
		createEReference(modelLabelEClass, MODEL_LABEL__LABEL_FOR);
		createEAttribute(modelLabelEClass, MODEL_LABEL__FORMAT);
		createEReference(modelLabelEClass, MODEL_LABEL__FEATURES);

		modelLabelFeatureEClass = createEClass(MODEL_LABEL_FEATURE);
		createEReference(modelLabelFeatureEClass, MODEL_LABEL_FEATURE__PART_OF);

		modelLabelAttributeEClass = createEClass(MODEL_LABEL_ATTRIBUTE);
		createEReference(modelLabelAttributeEClass, MODEL_LABEL_ATTRIBUTE__ATTRIBUTE);
		createEAttribute(modelLabelAttributeEClass, MODEL_LABEL_ATTRIBUTE__DATE_FORMAT);

		modelLabelAssociationEClass = createEClass(MODEL_LABEL_ASSOCIATION);
		createEReference(modelLabelAssociationEClass, MODEL_LABEL_ASSOCIATION__ASSOCIATION);
		createEReference(modelLabelAssociationEClass, MODEL_LABEL_ASSOCIATION__DYNAMIC_LABEL);
		createEAttribute(modelLabelAssociationEClass, MODEL_LABEL_ASSOCIATION__IS_SOURCE_ASSOCIATION);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ENTITY_FEATURES);
		createEReference(entityEClass, ENTITY__ASSOCIATION_ENDS);

		entityFeatureEClass = createEClass(ENTITY_FEATURE);
		createEReference(entityFeatureEClass, ENTITY_FEATURE__PART_OF);
		createEAttribute(entityFeatureEClass, ENTITY_FEATURE__CARDINALITY);
		createEAttribute(entityFeatureEClass, ENTITY_FEATURE__UNIQUE);
		createEAttribute(entityFeatureEClass, ENTITY_FEATURE__ORDERED);
		createEAttribute(entityFeatureEClass, ENTITY_FEATURE__BOOLEAN_IS_HAS_CHOICE);
		createEAttribute(entityFeatureEClass, ENTITY_FEATURE__SINGLETON_NAME);
		createEAttribute(entityFeatureEClass, ENTITY_FEATURE__PLURALISED_NAME);
		createEAttribute(entityFeatureEClass, ENTITY_FEATURE__COLUMN_NAME);

		entityAttributeEClass = createEClass(ENTITY_ATTRIBUTE);
		createEAttribute(entityAttributeEClass, ENTITY_ATTRIBUTE__PRIMARY_KEY);
		createEAttribute(entityAttributeEClass, ENTITY_ATTRIBUTE__CONTAINER_UNIQUE);
		createEAttribute(entityAttributeEClass, ENTITY_ATTRIBUTE__PERSISTENT_TYPE);
		createEAttribute(entityAttributeEClass, ENTITY_ATTRIBUTE__ORM_TYPE);
		createEAttribute(entityAttributeEClass, ENTITY_ATTRIBUTE__INTERFACE_TYPE);

		dataTypeAttributeEClass = createEClass(DATA_TYPE_ATTRIBUTE);
		createEReference(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__DATA_TYPE);
		createEAttribute(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__OBFUSCATE_FORM_FIELDS);
		createEAttribute(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__CASE_INSENSITIVE);
		createEAttribute(dataTypeAttributeEClass, DATA_TYPE_ATTRIBUTE__ENCRYPT);

		dateAttributeEClass = createEClass(DATE_ATTRIBUTE);
		createEAttribute(dateAttributeEClass, DATE_ATTRIBUTE__DETAILS);
		createEAttribute(dateAttributeEClass, DATE_ATTRIBUTE__FORMAT);

		urlAttributeEClass = createEClass(URL_ATTRIBUTE);
		createEAttribute(urlAttributeEClass, URL_ATTRIBUTE__DISPLAY_VALUE);

		resourceAttributeEClass = createEClass(RESOURCE_ATTRIBUTE);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__MAXIMUM_UPLOAD_SIZE);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__VALID_UPLOAD_MIME_TYPES);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__VALID_UPLOAD_EXTENSIONS);
		createEAttribute(resourceAttributeEClass, RESOURCE_ATTRIBUTE__UPLOADS_WITHIN_WEBSITE);
		createEReference(resourceAttributeEClass, RESOURCE_ATTRIBUTE__UPLOAD_PATH);

		pathElementEClass = createEClass(PATH_ELEMENT);

		staticPathElementEClass = createEClass(STATIC_PATH_ELEMENT);
		createEAttribute(staticPathElementEClass, STATIC_PATH_ELEMENT__ELEMENT);

		datePathElementEClass = createEClass(DATE_PATH_ELEMENT);
		createEAttribute(datePathElementEClass, DATE_PATH_ELEMENT__FORMAT);

		fileAttributeEClass = createEClass(FILE_ATTRIBUTE);

		imageAttributeEClass = createEClass(IMAGE_ATTRIBUTE);

		locationAttributeEClass = createEClass(LOCATION_ATTRIBUTE);

		entityAssociationEClass = createEClass(ENTITY_ASSOCIATION);
		createEReference(entityAssociationEClass, ENTITY_ASSOCIATION__KEYS);
		createEReference(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_ENTITY);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__BIDIRECTIONAL);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__PIVOT_TABLE_NAME);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_FEATURE_NAME);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_PRIMARY_KEY);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_DISPLAY_LABEL);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_HEADER_CLASS);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_INPUT_CLASS);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_DISPLAY_CLASS);
		createEAttribute(entityAssociationEClass, ENTITY_ASSOCIATION__TARGET_FOOTER_CLASS);

		associationWithoutContainmentEClass = createEClass(ASSOCIATION_WITHOUT_CONTAINMENT);
		createEAttribute(associationWithoutContainmentEClass, ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_CARDINALITY);
		createEAttribute(associationWithoutContainmentEClass, ASSOCIATION_WITHOUT_CONTAINMENT__TARGET_UNIQUE);

		associationWithContainmentEClass = createEClass(ASSOCIATION_WITH_CONTAINMENT);
		createEAttribute(associationWithContainmentEClass, ASSOCIATION_WITH_CONTAINMENT__SOURCE_VISIBLE);

		associationKeyEClass = createEClass(ASSOCIATION_KEY);
		createEReference(associationKeyEClass, ASSOCIATION_KEY__KEY_FOR);
		createEReference(associationKeyEClass, ASSOCIATION_KEY__SOURCE_FEATURE);
		createEReference(associationKeyEClass, ASSOCIATION_KEY__TARGET_FEATURE);

		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__ENCAPSULATES);
		createEReference(viewEClass, VIEW__VIEW_FEATURES);

		viewFeatureEClass = createEClass(VIEW_FEATURE);
		createEReference(viewFeatureEClass, VIEW_FEATURE__PART_OF);

		encapsulatedFeatureEClass = createEClass(ENCAPSULATED_FEATURE);
		createEAttribute(encapsulatedFeatureEClass, ENCAPSULATED_FEATURE__DISPLAY_LABEL);
		createEAttribute(encapsulatedFeatureEClass, ENCAPSULATED_FEATURE__ALIAS);
		createEAttribute(encapsulatedFeatureEClass, ENCAPSULATED_FEATURE__COLUMN_NAME);

		encapsulatedAttributeEClass = createEClass(ENCAPSULATED_ATTRIBUTE);
		createEAttribute(encapsulatedAttributeEClass, ENCAPSULATED_ATTRIBUTE__NAME);
		createEReference(encapsulatedAttributeEClass, ENCAPSULATED_ATTRIBUTE__ATTRIBUTE);
		createEAttribute(encapsulatedAttributeEClass, ENCAPSULATED_ATTRIBUTE__CARDINALITY);

		encapsulatedAssociationEClass = createEClass(ENCAPSULATED_ASSOCIATION);
		createEAttribute(encapsulatedAssociationEClass, ENCAPSULATED_ASSOCIATION__NAME);
		createEReference(encapsulatedAssociationEClass, ENCAPSULATED_ASSOCIATION__ASSOCIATION);
		createEReference(encapsulatedAssociationEClass, ENCAPSULATED_ASSOCIATION__ENCAPSULATED_TARGET);
		createEAttribute(encapsulatedAssociationEClass, ENCAPSULATED_ASSOCIATION__IS_SOURCE_ASSOCIATION);
		createEAttribute(encapsulatedAssociationEClass, ENCAPSULATED_ASSOCIATION__CARDINALITY);
		createEReference(encapsulatedAssociationEClass, ENCAPSULATED_ASSOCIATION__SOURCE_ENTITY);
		createEReference(encapsulatedAssociationEClass, ENCAPSULATED_ASSOCIATION__TARGET_ENTITY);

		viewAssociationEClass = createEClass(VIEW_ASSOCIATION);
		createEReference(viewAssociationEClass, VIEW_ASSOCIATION__OPPOSITE);
		createEAttribute(viewAssociationEClass, VIEW_ASSOCIATION__CARDINALITY);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SERVES);
		createEReference(serviceEClass, SERVICE__SELECTIONS);
		createEReference(serviceEClass, SERVICE__OPERATIONS);

		selectionEClass = createEClass(SELECTION);
		createEReference(selectionEClass, SELECTION__USED_BY);
		createEAttribute(selectionEClass, SELECTION__DISTINCT);
		createEReference(selectionEClass, SELECTION__FIELDS);
		createEReference(selectionEClass, SELECTION__PARAMETERS);
		createEReference(selectionEClass, SELECTION__JOINS);
		createEReference(selectionEClass, SELECTION__FILTER);
		createEReference(selectionEClass, SELECTION__ORDERING);
		createEAttribute(selectionEClass, SELECTION__LIMIT);

		selectionFieldEClass = createEClass(SELECTION_FIELD);

		selectionParameterEClass = createEClass(SELECTION_PARAMETER);
		createEAttribute(selectionParameterEClass, SELECTION_PARAMETER__OPTIONAL);
		createEAttribute(selectionParameterEClass, SELECTION_PARAMETER__DEFAULT_VALUE);

		businessOperationEClass = createEClass(BUSINESS_OPERATION);
		createEReference(businessOperationEClass, BUSINESS_OPERATION__USES);
		createEAttribute(businessOperationEClass, BUSINESS_OPERATION__RESULT_TYPE);
		createEAttribute(businessOperationEClass, BUSINESS_OPERATION__RESULT_MIME_TYPE);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PARENT_PAGE);
		createEReference(pageEClass, PAGE__CHILD_PAGES);
		createEAttribute(pageEClass, PAGE__AUTHENTICATED);
		createEAttribute(pageEClass, PAGE__URI_ELEMENT);
		createEAttribute(pageEClass, PAGE__TOP_MENU_OPTION);
		createEAttribute(pageEClass, PAGE__TOP_MENU_RANK);
		createEAttribute(pageEClass, PAGE__NAVIGATION_LABEL);
		createEReference(pageEClass, PAGE__SIDE_MENU);
		createEAttribute(pageEClass, PAGE__STYLE_CLASS);

		pageLinkEClass = createEClass(PAGE_LINK);
		createEReference(pageLinkEClass, PAGE_LINK__TARGET_PAGE);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ENTRIES);
		createEAttribute(menuEClass, MENU__OMIT_CAPTION);
		createEAttribute(menuEClass, MENU__CAPTION_CLASS);
		createEAttribute(menuEClass, MENU__STYLE_CLASS);
		createEAttribute(menuEClass, MENU__LAYOUT_CLASS);

		menuEntryEClass = createEClass(MENU_ENTRY);
		createEReference(menuEntryEClass, MENU_ENTRY__PART_OF);
		createEAttribute(menuEntryEClass, MENU_ENTRY__REQUIRES_ROLE);

		staticMenuEClass = createEClass(STATIC_MENU);

		actionMenuEntryEClass = createEClass(ACTION_MENU_ENTRY);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__DESTINATION);
		createEReference(actionMenuEntryEClass, ACTION_MENU_ENTRY__QUERY);

		editStaticTextMenuEntryEClass = createEClass(EDIT_STATIC_TEXT_MENU_ENTRY);

		dynamicMenuEClass = createEClass(DYNAMIC_MENU);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__ENTITY_OR_VIEW);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__SELECTION);
		createEReference(dynamicMenuEClass, DYNAMIC_MENU__TITLE);

		menuFeatureEClass = createEClass(MENU_FEATURE);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__PARAMETERS);
		createEReference(filterEClass, FILTER__SELECTION);

		filterParameterEClass = createEClass(FILTER_PARAMETER);
		createEReference(filterParameterEClass, FILTER_PARAMETER__FORMAL);
		createEReference(filterParameterEClass, FILTER_PARAMETER__DATA_TYPE);
		createEAttribute(filterParameterEClass, FILTER_PARAMETER__DEFAULT_VALUE);
		createEAttribute(filterParameterEClass, FILTER_PARAMETER__PLACEHOLDER);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__FILTER);
		createEReference(queryEClass, QUERY__PARAMETERS);

		queryParameterEClass = createEClass(QUERY_PARAMETER);
		createEReference(queryParameterEClass, QUERY_PARAMETER__FORMAL);
		createEAttribute(queryParameterEClass, QUERY_PARAMETER__VALUE);

		selectableEClass = createEClass(SELECTABLE);

		unitContainerEClass = createEClass(UNIT_CONTAINER);
		createEReference(unitContainerEClass, UNIT_CONTAINER__UNITS);

		contentUnitEClass = createEClass(CONTENT_UNIT);
		createEReference(contentUnitEClass, CONTENT_UNIT__DISPLAYED_ON);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CREATE_DEFAULT_URI_ELEMENT);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__REQUIRES_ROLE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__PURPOSE_SUMMARY);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__URI_ELEMENT);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__ALTERNATIVE);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__OMIT_CAPTION);
		createEAttribute(contentUnitEClass, CONTENT_UNIT__CAPTION_CLASS);

		staticUnitEClass = createEClass(STATIC_UNIT);
		createEAttribute(staticUnitEClass, STATIC_UNIT__CONTENT);
		createEAttribute(staticUnitEClass, STATIC_UNIT__STYLE_CLASS);
		createEAttribute(staticUnitEClass, STATIC_UNIT__CONTENT_CLASS);

		userCommandEClass = createEClass(USER_COMMAND);

		createSitemapUnitEClass = createEClass(CREATE_SITEMAP_UNIT);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__DEPLOYED_URL);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__FILENAME);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__STYLE_CLASS);
		createEAttribute(createSitemapUnitEClass, CREATE_SITEMAP_UNIT__CONTENT_CLASS);

		dynamicUnitEClass = createEClass(DYNAMIC_UNIT);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__ENTITIES);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__DISPLAY_FIELDS);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__SUPPORT_ACTIONS);
		createEReference(dynamicUnitEClass, DYNAMIC_UNIT__KEY_ACTUALS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__HEADER_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__CONTROL_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__FOOTER_CLASS);
		createEAttribute(dynamicUnitEClass, DYNAMIC_UNIT__ERROR_CLASS);

		unitFieldEClass = createEClass(UNIT_FIELD);
		createEReference(unitFieldEClass, UNIT_FIELD__DISPLAYED_ON);
		createEAttribute(unitFieldEClass, UNIT_FIELD__TITLE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_DISPLAY_OPTION);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_ALLOW_ADD);
		createEAttribute(unitFieldEClass, UNIT_FIELD__COLLECTION_ALLOW_REMOVE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__MAXIMUM_DISPLAY_SIZE);
		createEAttribute(unitFieldEClass, UNIT_FIELD__DATE_FORMAT);

		unitFeatureEClass = createEClass(UNIT_FEATURE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__ONLY_DISPLAY_WHEN_NOT_EMPTY);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DISPLAY_LABEL);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__REQUIRED);
		createEReference(unitFeatureEClass, UNIT_FEATURE__FORCED_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__NULL_DISPLAY_VALUE);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__AUTOFOCUS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__HEADER_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__INPUT_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__DISPLAY_CLASS);
		createEAttribute(unitFeatureEClass, UNIT_FEATURE__FOOTER_CLASS);

		unitElementEClass = createEClass(UNIT_ELEMENT);
		createEReference(unitElementEClass, UNIT_ELEMENT__ATTRIBUTE);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__NAME);
		createEReference(unitElementEClass, UNIT_ELEMENT__DEFAULT_VALUE);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__OBFUSCATE_FORM_FIELDS);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__PLACEHOLDER);
		createEAttribute(unitElementEClass, UNIT_ELEMENT__VALIDATION_PATTERN);

		pathAssociationElementEClass = createEClass(PATH_ASSOCIATION_ELEMENT);
		createEReference(pathAssociationElementEClass, PATH_ASSOCIATION_ELEMENT__ASSOCIATION);
		createEReference(pathAssociationElementEClass, PATH_ASSOCIATION_ELEMENT__CHILD_FEATURE);
		createEAttribute(pathAssociationElementEClass, PATH_ASSOCIATION_ELEMENT__IS_SOURCE_ASSOCIATION);
		createEReference(pathAssociationElementEClass, PATH_ASSOCIATION_ELEMENT__SOURCE_ENTITY);
		createEReference(pathAssociationElementEClass, PATH_ASSOCIATION_ELEMENT__TARGET_ENTITY);

		unitAssociationEClass = createEClass(UNIT_ASSOCIATION);
		createEAttribute(unitAssociationEClass, UNIT_ASSOCIATION__NAME);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__VALUE_DISPLAY);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__SELECTION);
		createEReference(unitAssociationEClass, UNIT_ASSOCIATION__FILTERS);

		childFeatureEClass = createEClass(CHILD_FEATURE);
		createEReference(childFeatureEClass, CHILD_FEATURE__PART_OF);

		childAttributeEClass = createEClass(CHILD_ATTRIBUTE);
		createEAttribute(childAttributeEClass, CHILD_ATTRIBUTE__NAME);
		createEReference(childAttributeEClass, CHILD_ATTRIBUTE__ATTRIBUTE);

		childAssociationEClass = createEClass(CHILD_ASSOCIATION);
		createEAttribute(childAssociationEClass, CHILD_ASSOCIATION__NAME);

		interfaceFieldEClass = createEClass(INTERFACE_FIELD);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__REQUIRED);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__DEFAULT_VALUE);
		createEReference(interfaceFieldEClass, INTERFACE_FIELD__MUST_MATCH);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__INPUT_CLASS);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__PLACEHOLDER);
		createEAttribute(interfaceFieldEClass, INTERFACE_FIELD__VALIDATION_PATTERN);

		dataTypeFieldEClass = createEClass(DATA_TYPE_FIELD);
		createEReference(dataTypeFieldEClass, DATA_TYPE_FIELD__DATA_TYPE);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__OBFUSCATE_FORM_FIELDS);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__ENCRYPT);
		createEAttribute(dataTypeFieldEClass, DATA_TYPE_FIELD__INTERFACE_TYPE);

		dateFieldEClass = createEClass(DATE_FIELD);
		createEAttribute(dateFieldEClass, DATE_FIELD__DETAILS);
		createEAttribute(dateFieldEClass, DATE_FIELD__FORMAT);

		captchaFieldEClass = createEClass(CAPTCHA_FIELD);

		unitSupportActionEClass = createEClass(UNIT_SUPPORT_ACTION);
		createEAttribute(unitSupportActionEClass, UNIT_SUPPORT_ACTION__DISABLE);
		createEAttribute(unitSupportActionEClass, UNIT_SUPPORT_ACTION__CONFIRM_MESSAGE);

		pathReferenceElementEClass = createEClass(PATH_REFERENCE_ELEMENT);
		createEReference(pathReferenceElementEClass, PATH_REFERENCE_ELEMENT__ACTUAL);
		createEReference(pathReferenceElementEClass, PATH_REFERENCE_ELEMENT__CHILD_REFERENCE);
		createEReference(pathReferenceElementEClass, PATH_REFERENCE_ELEMENT__ENTITY_TYPE);

		keyActualEClass = createEClass(KEY_ACTUAL);
		createEReference(keyActualEClass, KEY_ACTUAL__CONTAINER);
		createEReference(keyActualEClass, KEY_ACTUAL__KEY);

		childPathReferenceEClass = createEClass(CHILD_PATH_REFERENCE);
		createEReference(childPathReferenceEClass, CHILD_PATH_REFERENCE__PARENT);

		editUnitEClass = createEClass(EDIT_UNIT);
		createEReference(editUnitEClass, EDIT_UNIT__DEFAULT_SELECTION);
		createEReference(editUnitEClass, EDIT_UNIT__TITLE);
		createEReference(editUnitEClass, EDIT_UNIT__ENABLE_WHEN);
		createEReference(editUnitEClass, EDIT_UNIT__CONFIRM_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONFIRM_LABEL);
		createEReference(editUnitEClass, EDIT_UNIT__CANCEL_DESTINATION);
		createEAttribute(editUnitEClass, EDIT_UNIT__CANCEL_LABEL);
		createEAttribute(editUnitEClass, EDIT_UNIT__CONTENT_CLASS);
		createEAttribute(editUnitEClass, EDIT_UNIT__CUSTOMISE_VALUES);

		createUnitEClass = createEClass(CREATE_UNIT);
		createEAttribute(createUnitEClass, CREATE_UNIT__STYLE_CLASS);

		createUpdateUnitEClass = createEClass(CREATE_UPDATE_UNIT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CREATE_URI_ELEMENT);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__CLEAR_LABEL);
		createEAttribute(createUpdateUnitEClass, CREATE_UPDATE_UNIT__STYLE_CLASS);

		updateUnitEClass = createEClass(UPDATE_UNIT);
		createEAttribute(updateUnitEClass, UPDATE_UNIT__STYLE_CLASS);

		mapUnitEClass = createEClass(MAP_UNIT);
		createEAttribute(mapUnitEClass, MAP_UNIT__READ_ONLY);
		createEAttribute(mapUnitEClass, MAP_UNIT__DEFAULT_ZOOM_LEVEL);
		createEAttribute(mapUnitEClass, MAP_UNIT__STYLE_CLASS);
		createEReference(mapUnitEClass, MAP_UNIT__LOCATION);
		createEReference(mapUnitEClass, MAP_UNIT__PLACE_NAME);

		dataUnitEClass = createEClass(DATA_UNIT);
		createEReference(dataUnitEClass, DATA_UNIT__DEFAULT_SELECTION);
		createEReference(dataUnitEClass, DATA_UNIT__TITLE);

		detailsUnitEClass = createEClass(DETAILS_UNIT);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__ONLY_DISPLAY_WHEN_NOT_EMPTY);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__OMIT_FIELD_LABELS);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__STYLE_CLASS);
		createEAttribute(detailsUnitEClass, DETAILS_UNIT__CONTENT_CLASS);

		indexUnitEClass = createEClass(INDEX_UNIT);
		createEAttribute(indexUnitEClass, INDEX_UNIT__DISPLAY_OPTION);
		createEAttribute(indexUnitEClass, INDEX_UNIT__OMIT_COLUMN_LABELS);
		createEReference(indexUnitEClass, INDEX_UNIT__FILTERS);
		createEReference(indexUnitEClass, INDEX_UNIT__PAGINATION);
		createEAttribute(indexUnitEClass, INDEX_UNIT__DEFAULT_PAGINATION_SIZE);
		createEAttribute(indexUnitEClass, INDEX_UNIT__EMPTY_MESSAGE);
		createEAttribute(indexUnitEClass, INDEX_UNIT__NEXT_NPAGES);
		createEAttribute(indexUnitEClass, INDEX_UNIT__PREVIOUS_NPAGES);
		createEAttribute(indexUnitEClass, INDEX_UNIT__NEXT_PAGE_LABEL);
		createEAttribute(indexUnitEClass, INDEX_UNIT__PREVIOUS_PAGE_LABEL);
		createEAttribute(indexUnitEClass, INDEX_UNIT__USE_DISABLED_PAGE_LINKS);
		createEAttribute(indexUnitEClass, INDEX_UNIT__USE_FIRST_LAST_PAGE_LINKS);
		createEAttribute(indexUnitEClass, INDEX_UNIT__FIRST_PAGE_LABEL);
		createEAttribute(indexUnitEClass, INDEX_UNIT__LAST_PAGE_LABEL);
		createEAttribute(indexUnitEClass, INDEX_UNIT__STYLE_CLASS);
		createEAttribute(indexUnitEClass, INDEX_UNIT__CONTENT_CLASS);
		createEAttribute(indexUnitEClass, INDEX_UNIT__ROW_CLASSES);

		controlUnitEClass = createEClass(CONTROL_UNIT);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__SUBMIT_LABEL);
		createEReference(controlUnitEClass, CONTROL_UNIT__CANCEL_DESTINATION);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__CANCEL_LABEL);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__CONTENT_CLASS);

		searchUnitEClass = createEClass(SEARCH_UNIT);
		createEReference(searchUnitEClass, SEARCH_UNIT__RESULTS_DESTINATION);
		createEAttribute(searchUnitEClass, SEARCH_UNIT__STYLE_CLASS);

		actionUnitEClass = createEClass(ACTION_UNIT);
		createEAttribute(actionUnitEClass, ACTION_UNIT__STYLE_CLASS);

		imageUnitEClass = createEClass(IMAGE_UNIT);
		createEReference(imageUnitEClass, IMAGE_UNIT__DEFAULT_SELECTION);
		createEReference(imageUnitEClass, IMAGE_UNIT__IMAGE_PROPERTY);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__SHOW_TIME);
		createEAttribute(imageUnitEClass, IMAGE_UNIT__TRANSITION_TIME);

		sliderUnitEClass = createEClass(SLIDER_UNIT);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__STYLE_CLASS);
		createEAttribute(sliderUnitEClass, SLIDER_UNIT__CONTENT_CLASS);

		gridUnitEClass = createEClass(GRID_UNIT);
		createEAttribute(gridUnitEClass, GRID_UNIT__STYLE_CLASS);
		createEAttribute(gridUnitEClass, GRID_UNIT__CONTENT_CLASS);

		authenticationUnitEClass = createEClass(AUTHENTICATION_UNIT);

		registrationUnitEClass = createEClass(REGISTRATION_UNIT);
		createEAttribute(registrationUnitEClass, REGISTRATION_UNIT__STYLE_CLASS);

		loginUnitEClass = createEClass(LOGIN_UNIT);
		createEAttribute(loginUnitEClass, LOGIN_UNIT__LOGOUT_URI_ELEMENT);
		createEAttribute(loginUnitEClass, LOGIN_UNIT__STYLE_CLASS);

		forgottenPasswordUnitEClass = createEClass(FORGOTTEN_PASSWORD_UNIT);
		createEAttribute(forgottenPasswordUnitEClass, FORGOTTEN_PASSWORD_UNIT__STYLE_CLASS);

		inlineActionContainerEClass = createEClass(INLINE_ACTION_CONTAINER);
		createEReference(inlineActionContainerEClass, INLINE_ACTION_CONTAINER__ACTIONS);

		inlineActionEClass = createEClass(INLINE_ACTION);
		createEReference(inlineActionEClass, INLINE_ACTION__USED_BY);
		createEAttribute(inlineActionEClass, INLINE_ACTION__DISABLE);
		createEReference(inlineActionEClass, INLINE_ACTION__ENABLE_WHEN);
		createEReference(inlineActionEClass, INLINE_ACTION__DISPLAY_WHEN);
		createEAttribute(inlineActionEClass, INLINE_ACTION__HEADER);
		createEAttribute(inlineActionEClass, INLINE_ACTION__FOOTER);
		createEAttribute(inlineActionEClass, INLINE_ACTION__HEADER_CLASS);
		createEAttribute(inlineActionEClass, INLINE_ACTION__FOOTER_CLASS);

		selectActionEClass = createEClass(SELECT_ACTION);
		createEReference(selectActionEClass, SELECT_ACTION__TARGET);

		deleteActionEClass = createEClass(DELETE_ACTION);
		createEReference(deleteActionEClass, DELETE_ACTION__DESTINATION);
		createEAttribute(deleteActionEClass, DELETE_ACTION__CONFIRM_MESSAGE);
		createEAttribute(deleteActionEClass, DELETE_ACTION__URI_ELEMENT);

		featureSupportActionEClass = createEClass(FEATURE_SUPPORT_ACTION);
		createEReference(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__OPERATION);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__CONFIRM_MESSAGE);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__URI_ELEMENT);
		createEAttribute(featureSupportActionEClass, FEATURE_SUPPORT_ACTION__FILE_EXTENSION);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__UNIT);

		featureReferenceEClass = createEClass(FEATURE_REFERENCE);
		createEAttribute(featureReferenceEClass, FEATURE_REFERENCE__NAME);
		createEReference(featureReferenceEClass, FEATURE_REFERENCE__FEATURE);

		routeParameterReferenceEClass = createEClass(ROUTE_PARAMETER_REFERENCE);
		createEAttribute(routeParameterReferenceEClass, ROUTE_PARAMETER_REFERENCE__NAME);
		createEReference(routeParameterReferenceEClass, ROUTE_PARAMETER_REFERENCE__PARAMETER);

		parameterReferenceEClass = createEClass(PARAMETER_REFERENCE);
		createEAttribute(parameterReferenceEClass, PARAMETER_REFERENCE__NAME);
		createEReference(parameterReferenceEClass, PARAMETER_REFERENCE__PARAMETER);

		currentUserReferenceEClass = createEClass(CURRENT_USER_REFERENCE);
		createEReference(currentUserReferenceEClass, CURRENT_USER_REFERENCE__USER_MODEL);

		// Create enums
		databaseTechnologiesEEnum = createEEnum(DATABASE_TECHNOLOGIES);
		ormTechnologiesEEnum = createEEnum(ORM_TECHNOLOGIES);
		frameworkTechnologiesEEnum = createEEnum(FRAMEWORK_TECHNOLOGIES);
		inputTechnologiesEEnum = createEEnum(INPUT_TECHNOLOGIES);
		ajaxTechnologiesEEnum = createEEnum(AJAX_TECHNOLOGIES);
		authenticationKeyTypesEEnum = createEEnum(AUTHENTICATION_KEY_TYPES);
		cardinalityEEnum = createEEnum(CARDINALITY);
		isHasChoicesEEnum = createEEnum(IS_HAS_CHOICES);
		dateDetailsEEnum = createEEnum(DATE_DETAILS);
		operationResultTypesEEnum = createEEnum(OPERATION_RESULT_TYPES);
		pageTopMenuOptionsEEnum = createEEnum(PAGE_TOP_MENU_OPTIONS);
		collectionDisplayOptionsEEnum = createEEnum(COLLECTION_DISPLAY_OPTIONS);
		indexDisplayOptionEEnum = createEEnum(INDEX_DISPLAY_OPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CriteriaPackage theCriteriaPackage = (CriteriaPackage)EPackage.Registry.INSTANCE.getEPackage(CriteriaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		localAuthenticationSystemEClass.getESuperTypes().add(this.getAuthentication());
		casAuthenticationEClass.getESuperTypes().add(this.getAuthentication());
		namedDisplayElementEClass.getESuperTypes().add(this.getNamedElement());
		classifierEClass.getESuperTypes().add(this.getNamedDisplayElement());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		enumerationTypeEClass.getESuperTypes().add(this.getDataType());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedDisplayElement());
		entityOrViewEClass.getESuperTypes().add(this.getClassifier());
		entityOrViewEClass.getESuperTypes().add(this.getSelectionField());
		attributeEClass.getESuperTypes().add(this.getFeature());
		attributeEClass.getESuperTypes().add(this.getLabel());
		attributeEClass.getESuperTypes().add(this.getSelectionField());
		associationEClass.getESuperTypes().add(this.getFeature());
		modelLabelEClass.getESuperTypes().add(this.getNamedElement());
		modelLabelEClass.getESuperTypes().add(this.getLabel());
		modelLabelAttributeEClass.getESuperTypes().add(this.getModelLabelFeature());
		modelLabelAssociationEClass.getESuperTypes().add(this.getModelLabelFeature());
		entityEClass.getESuperTypes().add(this.getEntityOrView());
		entityFeatureEClass.getESuperTypes().add(this.getNamedDisplayElement());
		entityFeatureEClass.getESuperTypes().add(this.getFeature());
		entityAttributeEClass.getESuperTypes().add(this.getEntityFeature());
		entityAttributeEClass.getESuperTypes().add(this.getAttribute());
		dataTypeAttributeEClass.getESuperTypes().add(this.getEntityAttribute());
		dateAttributeEClass.getESuperTypes().add(this.getEntityAttribute());
		urlAttributeEClass.getESuperTypes().add(this.getEntityAttribute());
		resourceAttributeEClass.getESuperTypes().add(this.getEntityAttribute());
		staticPathElementEClass.getESuperTypes().add(this.getPathElement());
		datePathElementEClass.getESuperTypes().add(this.getPathElement());
		fileAttributeEClass.getESuperTypes().add(this.getResourceAttribute());
		imageAttributeEClass.getESuperTypes().add(this.getResourceAttribute());
		locationAttributeEClass.getESuperTypes().add(this.getEntityAttribute());
		entityAssociationEClass.getESuperTypes().add(this.getEntityFeature());
		entityAssociationEClass.getESuperTypes().add(this.getAssociation());
		associationWithoutContainmentEClass.getESuperTypes().add(this.getEntityAssociation());
		associationWithContainmentEClass.getESuperTypes().add(this.getEntityAssociation());
		viewEClass.getESuperTypes().add(this.getEntityOrView());
		viewFeatureEClass.getESuperTypes().add(this.getFeature());
		encapsulatedFeatureEClass.getESuperTypes().add(this.getViewFeature());
		encapsulatedAttributeEClass.getESuperTypes().add(this.getEncapsulatedFeature());
		encapsulatedAttributeEClass.getESuperTypes().add(this.getAttribute());
		encapsulatedAssociationEClass.getESuperTypes().add(this.getEncapsulatedFeature());
		encapsulatedAssociationEClass.getESuperTypes().add(this.getAssociation());
		viewAssociationEClass.getESuperTypes().add(this.getNamedDisplayElement());
		viewAssociationEClass.getESuperTypes().add(this.getViewFeature());
		viewAssociationEClass.getESuperTypes().add(this.getAssociation());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		selectionEClass.getESuperTypes().add(this.getNamedElement());
		selectionParameterEClass.getESuperTypes().add(this.getNamedElement());
		businessOperationEClass.getESuperTypes().add(this.getNamedElement());
		pageEClass.getESuperTypes().add(this.getNamedDisplayElement());
		pageEClass.getESuperTypes().add(this.getUnitContainer());
		menuEClass.getESuperTypes().add(this.getNamedDisplayElement());
		staticMenuEClass.getESuperTypes().add(this.getMenu());
		actionMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		actionMenuEntryEClass.getESuperTypes().add(this.getNamedDisplayElement());
		editStaticTextMenuEntryEClass.getESuperTypes().add(this.getMenuEntry());
		editStaticTextMenuEntryEClass.getESuperTypes().add(this.getNamedDisplayElement());
		dynamicMenuEClass.getESuperTypes().add(this.getMenu());
		menuFeatureEClass.getESuperTypes().add(this.getMenuEntry());
		filterEClass.getESuperTypes().add(this.getNamedDisplayElement());
		filterParameterEClass.getESuperTypes().add(this.getNamedElement());
		contentUnitEClass.getESuperTypes().add(this.getNamedDisplayElement());
		staticUnitEClass.getESuperTypes().add(this.getContentUnit());
		createSitemapUnitEClass.getESuperTypes().add(this.getContentUnit());
		dynamicUnitEClass.getESuperTypes().add(this.getContentUnit());
		unitFeatureEClass.getESuperTypes().add(this.getUnitField());
		unitFeatureEClass.getESuperTypes().add(this.getInlineActionContainer());
		unitElementEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(this.getUnitFeature());
		unitAssociationEClass.getESuperTypes().add(this.getUnitContainer());
		unitAssociationEClass.getESuperTypes().add(this.getPathAssociationElement());
		childAttributeEClass.getESuperTypes().add(this.getChildFeature());
		childAssociationEClass.getESuperTypes().add(this.getChildFeature());
		childAssociationEClass.getESuperTypes().add(this.getPathAssociationElement());
		interfaceFieldEClass.getESuperTypes().add(this.getNamedDisplayElement());
		interfaceFieldEClass.getESuperTypes().add(this.getUnitField());
		dataTypeFieldEClass.getESuperTypes().add(this.getInterfaceField());
		dateFieldEClass.getESuperTypes().add(this.getInterfaceField());
		captchaFieldEClass.getESuperTypes().add(this.getInterfaceField());
		unitSupportActionEClass.getESuperTypes().add(this.getNamedDisplayElement());
		keyActualEClass.getESuperTypes().add(this.getPathReferenceElement());
		childPathReferenceEClass.getESuperTypes().add(this.getPathReferenceElement());
		editUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		createUnitEClass.getESuperTypes().add(this.getEditUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getEditUnit());
		createUpdateUnitEClass.getESuperTypes().add(this.getSelectable());
		updateUnitEClass.getESuperTypes().add(this.getEditUnit());
		updateUnitEClass.getESuperTypes().add(this.getSelectable());
		mapUnitEClass.getESuperTypes().add(this.getEditUnit());
		mapUnitEClass.getESuperTypes().add(this.getSelectable());
		dataUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		detailsUnitEClass.getESuperTypes().add(this.getDataUnit());
		detailsUnitEClass.getESuperTypes().add(this.getSelectable());
		indexUnitEClass.getESuperTypes().add(this.getDataUnit());
		indexUnitEClass.getESuperTypes().add(this.getInlineActionContainer());
		controlUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		searchUnitEClass.getESuperTypes().add(this.getControlUnit());
		actionUnitEClass.getESuperTypes().add(this.getControlUnit());
		imageUnitEClass.getESuperTypes().add(this.getDynamicUnit());
		sliderUnitEClass.getESuperTypes().add(this.getImageUnit());
		gridUnitEClass.getESuperTypes().add(this.getImageUnit());
		registrationUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		registrationUnitEClass.getESuperTypes().add(this.getControlUnit());
		loginUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		loginUnitEClass.getESuperTypes().add(this.getControlUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(this.getAuthenticationUnit());
		forgottenPasswordUnitEClass.getESuperTypes().add(this.getControlUnit());
		inlineActionEClass.getESuperTypes().add(this.getNamedDisplayElement());
		selectActionEClass.getESuperTypes().add(this.getInlineAction());
		deleteActionEClass.getESuperTypes().add(this.getInlineAction());
		featureSupportActionEClass.getESuperTypes().add(this.getInlineAction());
		modelReferenceEClass.getESuperTypes().add(theCriteriaPackage.getPath());
		featureReferenceEClass.getESuperTypes().add(theCriteriaPackage.getPath());
		routeParameterReferenceEClass.getESuperTypes().add(theCriteriaPackage.getPath());
		parameterReferenceEClass.getESuperTypes().add(theCriteriaPackage.getPath());
		currentUserReferenceEClass.getESuperTypes().add(theCriteriaPackage.getPath());

		// Initialize classes and features; add operations and parameters
		initEClass(webGenModelEClass, WebGenModel.class, "WebGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebGenModel_WebsiteProperties(), this.getWebsiteProperties(), null, "websiteProperties", null, 1, 1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebGenModel_Classifiers(), this.getClassifier(), null, "classifiers", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Services(), this.getService(), null, "services", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Pages(), this.getPage(), null, "pages", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_Menus(), this.getMenu(), null, "menus", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebGenModel_AllowTypeCustomisation(), this.getEntityOrView(), null, "allowTypeCustomisation", null, 0, -1, WebGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(websitePropertiesEClass, WebsiteProperties.class, "WebsiteProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebsiteProperties_SiteTitle(), ecorePackage.getEString(), "siteTitle", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DevelopmentVersion(), ecorePackage.getEBoolean(), "developmentVersion", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_BaseURL(), ecorePackage.getEString(), "baseURL", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_RewriteURLs(), ecorePackage.getEBoolean(), "rewriteURLs", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_WebmasterEmail(), ecorePackage.getEString(), "webmasterEmail", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_CopyrightText(), ecorePackage.getEString(), "copyrightText", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_MetaDescription(), ecorePackage.getEString(), "metaDescription", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_ProjectName(), ecorePackage.getEString(), "projectName", null, 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWebsiteProperties_Authentication(), this.getAuthentication(), this.getAuthentication_Authenticates(), "authentication", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TestProjectName(), ecorePackage.getEString(), "testProjectName", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultDateFormat(), ecorePackage.getEString(), "defaultDateFormat", "jS F Y", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultTimeFormat(), ecorePackage.getEString(), "defaultTimeFormat", "G.i", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultDateTimeFormat(), ecorePackage.getEString(), "defaultDateTimeFormat", "jS F Y G.i", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DefaultMaximumUploadSize(), ecorePackage.getEInt(), "defaultMaximumUploadSize", "2000000", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseTechnology(), this.getDatabaseTechnologies(), "databaseTechnology", "MySql", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabasePrefix(), ecorePackage.getEString(), "databasePrefix", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseHost(), ecorePackage.getEString(), "databaseHost", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseName(), ecorePackage.getEString(), "databaseName", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabasePort(), ecorePackage.getEString(), "databasePort", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabaseUsername(), ecorePackage.getEString(), "databaseUsername", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_DatabasePassword(), ecorePackage.getEString(), "databasePassword", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_OrmTechnology(), this.getOrmTechnologies(), "ormTechnology", "Kohana", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TimestampCreation(), ecorePackage.getEBoolean(), "timestampCreation", "true", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TimestampUpdates(), ecorePackage.getEBoolean(), "timestampUpdates", "true", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_FrameworkTechnology(), this.getFrameworkTechnologies(), "frameworkTechnology", "Kohana", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_InputTechnology(), this.getInputTechnologies(), "inputTechnology", "Html", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_AjaxTechnology(), this.getAjaxTechnologies(), "ajaxTechnology", "None", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_CaptchaSiteKey(), ecorePackage.getEString(), "captchaSiteKey", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_CaptchaSecretKey(), ecorePackage.getEString(), "captchaSecretKey", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_TextEditorURL(), ecorePackage.getEString(), "textEditorURL", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_ResponsiveTopMenu(), ecorePackage.getEBoolean(), "responsiveTopMenu", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_TopNavigationId(), ecorePackage.getEString(), "topNavigationId", "topnav", 1, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWebsiteProperties_SideMenu(), this.getMenu(), null, "sideMenu", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWebsiteProperties_SiteTemplate(), ecorePackage.getEString(), "siteTemplate", null, 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebsiteProperties_StaticUnitsEditable(), ecorePackage.getEBoolean(), "staticUnitsEditable", "false", 0, 1, WebsiteProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthentication_Authenticates(), this.getWebsiteProperties(), this.getWebsiteProperties_Authentication(), "authenticates", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthentication_User(), this.getEntityOrView(), null, "user", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAuthentication_UserKey(), this.getAttribute(), null, "userKey", null, 1, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthentication_LoginLabel(), ecorePackage.getEString(), "loginLabel", "Login", 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthentication_LogoutLabel(), ecorePackage.getEString(), "logoutLabel", "Logout", 0, 1, Authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(localAuthenticationSystemEClass, LocalAuthenticationSystem.class, "LocalAuthenticationSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalAuthenticationSystem_Authentication(), this.getEntityOrView(), null, "authentication", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AuthenticationKey(), this.getAuthenticationKeyTypes(), "authenticationKey", null, 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseCaptcha(), ecorePackage.getEBoolean(), "useCaptcha", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowRememberMe(), ecorePackage.getEBoolean(), "allowRememberMe", "false", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_AllowSelfRegistration(), ecorePackage.getEBoolean(), "allowSelfRegistration", "false", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_TrackLoginAttempts(), ecorePackage.getEBoolean(), "trackLoginAttempts", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_UseEmailActivation(), ecorePackage.getEBoolean(), "useEmailActivation", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocalAuthenticationSystem_SendWelcomeEmail(), ecorePackage.getEBoolean(), "sendWelcomeEmail", "true", 1, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_RegistrationUnit(), this.getRegistrationUnit(), null, "registrationUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_LoginUnit(), this.getLoginUnit(), null, "loginUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLocalAuthenticationSystem_ForgottenPasswordUnit(), this.getForgottenPasswordUnit(), null, "forgottenPasswordUnit", null, 0, 1, LocalAuthenticationSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(casAuthenticationEClass, CasAuthentication.class, "CasAuthentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedDisplayElementEClass, NamedDisplayElement.class, "NamedDisplayElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedDisplayElement_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, NamedDisplayElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_PersistentType(), ecorePackage.getEString(), "persistentType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_OrmType(), ecorePackage.getEString(), "ormType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_InterfaceType(), ecorePackage.getEString(), "interfaceType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataType_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationType_Enumerations(), this.getEnumerationLiteral(), null, "enumerations", null, 0, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityOrViewEClass, EntityOrView.class, "EntityOrView", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityOrView_SingletonName(), ecorePackage.getEString(), "singletonName", null, 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityOrView_PluralisedName(), ecorePackage.getEString(), "pluralisedName", null, 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_Keys(), this.getFeature(), null, "keys", null, 0, -1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityOrView_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityOrView_AutoKeyName(), ecorePackage.getEString(), "autoKeyName", "id", 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityOrView_AutoKeyPersistentType(), ecorePackage.getEString(), "autoKeyPersistentType", "integer", 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityOrView_AutoKeyGenerationStrategy(), ecorePackage.getEString(), "autoKeyGenerationStrategy", null, 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_ServedBy(), this.getService(), this.getService_Serves(), "servedBy", null, 0, -1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_Labels(), this.getModelLabel(), this.getModelLabel_LabelFor(), "labels", null, 0, -1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_Features(), this.getFeature(), null, "features", null, 0, -1, EntityOrView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_AllFeatures(), this.getFeature(), null, "allFeatures", null, 0, -1, EntityOrView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, EntityOrView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_Associations(), this.getAssociation(), null, "associations", null, 0, -1, EntityOrView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOrView_AllAssociations(), this.getAssociation(), null, "allAssociations", null, 0, -1, EntityOrView.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityOrView_SerializationExcludeAll(), ecorePackage.getEBoolean(), "serializationExcludeAll", "false", 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityOrView_ImplementsUserInterface(), ecorePackage.getEBoolean(), "implementsUserInterface", "false", 0, 1, EntityOrView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Title(), ecorePackage.getEString(), "title", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_CollectionAllowAdd(), ecorePackage.getEBoolean(), "collectionAllowAdd", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_CollectionAllowRemove(), ecorePackage.getEBoolean(), "collectionAllowRemove", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_NullDisplayValue(), ecorePackage.getEString(), "nullDisplayValue", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_EncodeUriKey(), ecorePackage.getEBoolean(), "encodeUriKey", "false", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_SerializationGroups(), ecorePackage.getEString(), "serializationGroups", "", 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_SerializationExpose(), ecorePackage.getEBoolean(), "serializationExpose", "true", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_DisplayClass(), ecorePackage.getEString(), "displayClass", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_DefaultValue(), theCriteriaPackage.getExpression(), null, "defaultValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttribute_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttribute_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAttribute_InputClass(), ecorePackage.getEString(), "inputClass", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_Pseudo(), ecorePackage.getEBoolean(), "pseudo", "false", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_ChildFeature(), this.getChildFeature(), null, "childFeature", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_EncapsulatedBy(), this.getEncapsulatedAssociation(), this.getEncapsulatedAssociation_Association(), "encapsulatedBy", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_InputClass(), ecorePackage.getEString(), "inputClass", null, 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_SourceEntityX(), this.getEntityOrView(), null, "sourceEntityX", null, 1, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_TargetEntityX(), this.getEntityOrView(), null, "targetEntityX", null, 1, 1, Association.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SerializationMaxDepth(), ecorePackage.getEInt(), "serializationMaxDepth", "1", 0, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelLabelEClass, ModelLabel.class, "ModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabel_LabelFor(), this.getEntityOrView(), this.getEntityOrView_Labels(), "labelFor", null, 1, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabel_Format(), ecorePackage.getEString(), "format", null, 1, 1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelLabel_Features(), this.getModelLabelFeature(), this.getModelLabelFeature_PartOf(), "features", null, 0, -1, ModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelLabelFeatureEClass, ModelLabelFeature.class, "ModelLabelFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabelFeature_PartOf(), this.getModelLabel(), this.getModelLabel_Features(), "partOf", null, 1, 1, ModelLabelFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelLabelAttributeEClass, ModelLabelAttribute.class, "ModelLabelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabelAttribute_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, ModelLabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabelAttribute_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, ModelLabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelLabelAssociationEClass, ModelLabelAssociation.class, "ModelLabelAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelLabelAssociation_Association(), this.getEntityAssociation(), null, "association", null, 1, 1, ModelLabelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelLabelAssociation_DynamicLabel(), this.getModelLabel(), null, "dynamicLabel", null, 0, 1, ModelLabelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelLabelAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, ModelLabelAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_EntityFeatures(), this.getEntityFeature(), this.getEntityFeature_PartOf(), "entityFeatures", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AssociationEnds(), this.getEntityAssociation(), this.getEntityAssociation_TargetEntity(), "associationEnds", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityFeatureEClass, EntityFeature.class, "EntityFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityFeature_PartOf(), this.getEntity(), this.getEntity_EntityFeatures(), "partOf", null, 1, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityFeature_Cardinality(), this.getCardinality(), "cardinality", "Optional", 1, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityFeature_Unique(), ecorePackage.getEBoolean(), "unique", "true", 1, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityFeature_Ordered(), ecorePackage.getEBoolean(), "ordered", "false", 1, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityFeature_BooleanIsHasChoice(), this.getisHasChoices(), "booleanIsHasChoice", null, 0, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityFeature_SingletonName(), ecorePackage.getEString(), "singletonName", null, 0, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityFeature_PluralisedName(), ecorePackage.getEString(), "pluralisedName", null, 0, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityFeature_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, EntityFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(entityAttributeEClass, EntityAttribute.class, "EntityAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityAttribute_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, EntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAttribute_ContainerUnique(), ecorePackage.getEBoolean(), "containerUnique", null, 0, 1, EntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAttribute_PersistentType(), ecorePackage.getEString(), "persistentType", null, 0, 1, EntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAttribute_OrmType(), ecorePackage.getEString(), "ormType", null, 0, 1, EntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAttribute_InterfaceType(), ecorePackage.getEString(), "interfaceType", null, 0, 1, EntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeAttributeEClass, DataTypeAttribute.class, "DataTypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeAttribute_DataType(), this.getDataType(), null, "dataType", null, 1, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeAttribute_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeAttribute_CaseInsensitive(), ecorePackage.getEBoolean(), "caseInsensitive", "false", 0, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeAttribute_Encrypt(), ecorePackage.getEBoolean(), "encrypt", "false", 0, 1, DataTypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dateAttributeEClass, DateAttribute.class, "DateAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateAttribute_Details(), this.getDateDetails(), "details", "DateOnly", 1, 1, DateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateAttribute_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(urlAttributeEClass, UrlAttribute.class, "UrlAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlAttribute_DisplayValue(), ecorePackage.getEString(), "displayValue", null, 0, 1, UrlAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAttributeEClass, ResourceAttribute.class, "ResourceAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAttribute_MaximumUploadSize(), ecorePackage.getEInt(), "maximumUploadSize", "-1", 0, 1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceAttribute_ValidUploadMimeTypes(), ecorePackage.getEString(), "validUploadMimeTypes", null, 0, -1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceAttribute_ValidUploadExtensions(), ecorePackage.getEString(), "validUploadExtensions", null, 0, -1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResourceAttribute_UploadsWithinWebsite(), ecorePackage.getEBoolean(), "uploadsWithinWebsite", null, 0, 1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResourceAttribute_UploadPath(), this.getPathElement(), null, "uploadPath", null, 0, -1, ResourceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathElementEClass, PathElement.class, "PathElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticPathElementEClass, StaticPathElement.class, "StaticPathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticPathElement_Element(), ecorePackage.getEString(), "element", null, 1, 1, StaticPathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datePathElementEClass, DatePathElement.class, "DatePathElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatePathElement_Format(), ecorePackage.getEString(), "format", null, 1, 1, DatePathElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileAttributeEClass, FileAttribute.class, "FileAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageAttributeEClass, ImageAttribute.class, "ImageAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(locationAttributeEClass, LocationAttribute.class, "LocationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityAssociationEClass, EntityAssociation.class, "EntityAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityAssociation_Keys(), this.getAssociationKey(), this.getAssociationKey_KeyFor(), "keys", null, 0, -1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityAssociation_TargetEntity(), this.getEntity(), this.getEntity_AssociationEnds(), "targetEntity", null, 1, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", "false", 1, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_PivotTableName(), ecorePackage.getEString(), "pivotTableName", null, 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_TargetFeatureName(), ecorePackage.getEString(), "targetFeatureName", null, 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_TargetPrimaryKey(), ecorePackage.getEBoolean(), "targetPrimaryKey", null, 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_TargetDisplayLabel(), ecorePackage.getEString(), "targetDisplayLabel", null, 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_TargetHeaderClass(), ecorePackage.getEString(), "targetHeaderClass", null, 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_TargetInputClass(), ecorePackage.getEString(), "targetInputClass", "input_association", 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_TargetDisplayClass(), ecorePackage.getEString(), "targetDisplayClass", null, 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityAssociation_TargetFooterClass(), ecorePackage.getEString(), "targetFooterClass", null, 0, 1, EntityAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationWithoutContainmentEClass, AssociationWithoutContainment.class, "AssociationWithoutContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationWithoutContainment_TargetCardinality(), this.getCardinality(), "targetCardinality", "Required", 1, 1, AssociationWithoutContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationWithoutContainment_TargetUnique(), ecorePackage.getEBoolean(), "targetUnique", "true", 1, 1, AssociationWithoutContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationWithContainmentEClass, AssociationWithContainment.class, "AssociationWithContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationWithContainment_SourceVisible(), ecorePackage.getEBoolean(), "sourceVisible", "true", 0, 1, AssociationWithContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationKeyEClass, AssociationKey.class, "AssociationKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationKey_KeyFor(), this.getEntityAssociation(), this.getEntityAssociation_Keys(), "keyFor", null, 1, 1, AssociationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationKey_SourceFeature(), this.getEntityFeature(), null, "sourceFeature", null, 1, 1, AssociationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationKey_TargetFeature(), this.getEntityFeature(), null, "targetFeature", null, 1, 1, AssociationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Encapsulates(), this.getEntityOrView(), null, "encapsulates", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getView_ViewFeatures(), this.getViewFeature(), this.getViewFeature_PartOf(), "viewFeatures", null, 0, -1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewFeatureEClass, ViewFeature.class, "ViewFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewFeature_PartOf(), this.getView(), this.getView_ViewFeatures(), "partOf", null, 1, 1, ViewFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encapsulatedFeatureEClass, EncapsulatedFeature.class, "EncapsulatedFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncapsulatedFeature_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, EncapsulatedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulatedFeature_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, EncapsulatedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulatedFeature_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, EncapsulatedFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(encapsulatedAttributeEClass, EncapsulatedAttribute.class, "EncapsulatedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncapsulatedAttribute_Name(), ecorePackage.getEString(), "name", "", 1, 1, EncapsulatedAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEncapsulatedAttribute_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, EncapsulatedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulatedAttribute_Cardinality(), this.getCardinality(), "cardinality", null, 1, 1, EncapsulatedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encapsulatedAssociationEClass, EncapsulatedAssociation.class, "EncapsulatedAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncapsulatedAssociation_Name(), ecorePackage.getEString(), "name", null, 1, 1, EncapsulatedAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEncapsulatedAssociation_Association(), this.getAssociation(), this.getAssociation_EncapsulatedBy(), "association", null, 1, 1, EncapsulatedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncapsulatedAssociation_EncapsulatedTarget(), this.getEncapsulatedAssociation(), null, "encapsulatedTarget", null, 0, 1, EncapsulatedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulatedAssociation_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, EncapsulatedAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncapsulatedAssociation_Cardinality(), this.getCardinality(), "cardinality", null, 1, 1, EncapsulatedAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEncapsulatedAssociation_SourceEntity(), this.getEntity(), null, "sourceEntity", null, 1, 1, EncapsulatedAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEncapsulatedAssociation_TargetEntity(), this.getEntity(), null, "targetEntity", null, 1, 1, EncapsulatedAssociation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(viewAssociationEClass, ViewAssociation.class, "ViewAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewAssociation_Opposite(), this.getEncapsulatedAssociation(), null, "opposite", null, 1, 1, ViewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewAssociation_Cardinality(), this.getCardinality(), "cardinality", "Optional", 1, 1, ViewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Serves(), this.getEntityOrView(), this.getEntityOrView_ServedBy(), "serves", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Selections(), this.getSelection(), this.getSelection_UsedBy(), "selections", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Operations(), this.getBusinessOperation(), null, "operations", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionEClass, Selection.class, "Selection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelection_UsedBy(), this.getService(), this.getService_Selections(), "usedBy", null, 1, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Fields(), this.getSelectionField(), null, "fields", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Parameters(), this.getSelectionParameter(), null, "parameters", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Joins(), this.getAssociation(), null, "joins", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelection_Filter(), theCriteriaPackage.getPredicate(), null, "filter", null, 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSelection_Ordering(), theCriteriaPackage.getOrder(), null, "ordering", null, 0, -1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelection_Limit(), ecorePackage.getEInt(), "limit", "0", 0, 1, Selection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectionFieldEClass, SelectionField.class, "SelectionField", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionParameterEClass, SelectionParameter.class, "SelectionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectionParameter_Optional(), ecorePackage.getEBoolean(), "optional", "false", 0, 1, SelectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectionParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, SelectionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(businessOperationEClass, BusinessOperation.class, "BusinessOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessOperation_Uses(), this.getService(), null, "uses", null, 0, -1, BusinessOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessOperation_ResultType(), this.getOperationResultTypes(), "resultType", null, 1, 1, BusinessOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessOperation_ResultMimeType(), ecorePackage.getEString(), "resultMimeType", null, 0, 1, BusinessOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_ParentPage(), this.getPageLink(), null, "parentPage", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_ChildPages(), this.getPageLink(), this.getPageLink_TargetPage(), "childPages", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_Authenticated(), ecorePackage.getEBoolean(), "authenticated", "true", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_TopMenuOption(), this.getPageTopMenuOptions(), "topMenuOption", "NeverInclude", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_TopMenuRank(), ecorePackage.getEInt(), "topMenuRank", "0", 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_NavigationLabel(), ecorePackage.getEString(), "navigationLabel", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_SideMenu(), this.getMenu(), null, "sideMenu", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPage_StyleClass(), ecorePackage.getEString(), "styleClass", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageLinkEClass, PageLink.class, "PageLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageLink_TargetPage(), this.getPage(), this.getPage_ChildPages(), "targetPage", null, 1, 1, PageLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Entries(), this.getMenuEntry(), this.getMenuEntry_PartOf(), "entries", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_CaptionClass(), ecorePackage.getEString(), "captionClass", "menu_caption", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMenu_StyleClass(), ecorePackage.getEString(), "styleClass", "menu", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMenu_LayoutClass(), ecorePackage.getEString(), "layoutClass", "menu_content", 0, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuEntryEClass, MenuEntry.class, "MenuEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuEntry_PartOf(), this.getMenu(), this.getMenu_Entries(), "partOf", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMenuEntry_RequiresRole(), ecorePackage.getEString(), "requiresRole", null, 0, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticMenuEClass, StaticMenu.class, "StaticMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionMenuEntryEClass, ActionMenuEntry.class, "ActionMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionMenuEntry_Destination(), this.getContentUnit(), null, "destination", null, 1, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActionMenuEntry_Query(), this.getQuery(), null, "query", null, 0, 1, ActionMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editStaticTextMenuEntryEClass, EditStaticTextMenuEntry.class, "EditStaticTextMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dynamicMenuEClass, DynamicMenu.class, "DynamicMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicMenu_EntityOrView(), this.getEntityOrView(), null, "entityOrView", null, 1, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicMenu_Selection(), this.getSelection(), null, "selection", null, 1, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicMenu_Title(), this.getLabel(), null, "title", null, 0, 1, DynamicMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuFeatureEClass, MenuFeature.class, "MenuFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Parameters(), this.getFilterParameter(), null, "parameters", null, 0, -1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_Selection(), this.getSelection(), null, "selection", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterParameterEClass, FilterParameter.class, "FilterParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterParameter_Formal(), this.getSelectionParameter(), null, "formal", null, 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilterParameter_DataType(), this.getDataType(), null, "dataType", null, 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterParameter_DefaultValue(), ecorePackage.getEString(), "defaultValue", "", 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterParameter_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, FilterParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Filter(), this.getFilter(), null, "filter", null, 1, 1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuery_Parameters(), this.getQueryParameter(), null, "parameters", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParameterEClass, QueryParameter.class, "QueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryParameter_Formal(), this.getFilterParameter(), null, "formal", null, 1, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, QueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectableEClass, Selectable.class, "Selectable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitContainerEClass, UnitContainer.class, "UnitContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitContainer_Units(), this.getContentUnit(), this.getContentUnit_DisplayedOn(), "units", null, 0, -1, UnitContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentUnitEClass, ContentUnit.class, "ContentUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentUnit_DisplayedOn(), this.getUnitContainer(), this.getUnitContainer_Units(), "displayedOn", null, 1, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContentUnit_CreateDefaultUriElement(), ecorePackage.getEBoolean(), "createDefaultUriElement", "true", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_RequiresRole(), ecorePackage.getEString(), "requiresRole", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_PurposeSummary(), ecorePackage.getEString(), "purposeSummary", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_Alternative(), ecorePackage.getEString(), "alternative", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_OmitCaption(), ecorePackage.getEBoolean(), "omitCaption", null, 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentUnit_CaptionClass(), ecorePackage.getEString(), "captionClass", "unit_caption", 0, 1, ContentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticUnitEClass, StaticUnit.class, "StaticUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticUnit_Content(), ecorePackage.getEString(), "content", null, 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaticUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,static_unit,framed", 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaticUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "static_content", 0, 1, StaticUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userCommandEClass, UserCommand.class, "UserCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createSitemapUnitEClass, CreateSitemapUnit.class, "CreateSitemapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateSitemapUnit_DeployedURL(), ecorePackage.getEString(), "deployedURL", null, 1, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateSitemapUnit_Filename(), ecorePackage.getEString(), "filename", "sitemap.xml", 1, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateSitemapUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_sitemap_unit,framed", 0, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateSitemapUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "create_sitemap_content", 0, 1, CreateSitemapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dynamicUnitEClass, DynamicUnit.class, "DynamicUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicUnit_Entities(), this.getEntityOrView(), null, "entities", null, 1, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_DisplayFields(), this.getUnitField(), this.getUnitField_DisplayedOn(), "displayFields", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_SupportActions(), this.getUnitSupportAction(), null, "supportActions", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicUnit_KeyActuals(), this.getKeyActual(), this.getKeyActual_Container(), "keyActuals", null, 0, -1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Header(), ecorePackage.getEString(), "header", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_HeaderClass(), ecorePackage.getEString(), "headerClass", "unit_header", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ControlClass(), ecorePackage.getEString(), "controlClass", "unit_control", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_FooterClass(), ecorePackage.getEString(), "footerClass", "unit_footer", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamicUnit_ErrorClass(), ecorePackage.getEString(), "errorClass", "error", 0, 1, DynamicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitFieldEClass, UnitField.class, "UnitField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitField_DisplayedOn(), this.getDynamicUnit(), this.getDynamicUnit_DisplayFields(), "displayedOn", null, 1, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_Title(), ecorePackage.getEString(), "title", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_CollectionDisplayOption(), this.getCollectionDisplayOptions(), "collectionDisplayOption", "LineDirection", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_CollectionAllowAdd(), ecorePackage.getEBoolean(), "collectionAllowAdd", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_CollectionAllowRemove(), ecorePackage.getEBoolean(), "collectionAllowRemove", "false", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitField_MaximumDisplaySize(), ecorePackage.getEInt(), "maximumDisplaySize", "-1", 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitField_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, UnitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitFeatureEClass, UnitFeature.class, "UnitFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitFeature_OnlyDisplayWhenNotEmpty(), ecorePackage.getEBoolean(), "onlyDisplayWhenNotEmpty", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitFeature_ForcedValue(), theCriteriaPackage.getExpression(), null, "forcedValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_NullDisplayValue(), ecorePackage.getEString(), "nullDisplayValue", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitFeature_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_Autofocus(), ecorePackage.getEBoolean(), "autofocus", "false", 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_InputClass(), ecorePackage.getEString(), "inputClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_DisplayClass(), ecorePackage.getEString(), "displayClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitFeature_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, UnitFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unitElementEClass, UnitElement.class, "UnitElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitElement_Attribute(), this.getAttribute(), null, "attribute", null, 1, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitElement_DefaultValue(), theCriteriaPackage.getExpression(), null, "defaultValue", null, 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnitElement_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, UnitElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pathAssociationElementEClass, PathAssociationElement.class, "PathAssociationElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathAssociationElement_Association(), this.getAssociation(), null, "association", null, 1, 1, PathAssociationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPathAssociationElement_ChildFeature(), this.getChildFeature(), this.getChildFeature_PartOf(), "childFeature", null, 0, 1, PathAssociationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathAssociationElement_IsSourceAssociation(), ecorePackage.getEBoolean(), "isSourceAssociation", null, 1, 1, PathAssociationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPathAssociationElement_SourceEntity(), this.getEntityOrView(), null, "sourceEntity", null, 0, 1, PathAssociationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPathAssociationElement_TargetEntity(), this.getEntityOrView(), null, "targetEntity", null, 0, 1, PathAssociationElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(unitAssociationEClass, UnitAssociation.class, "UnitAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitAssociation_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUnitAssociation_ValueDisplay(), this.getLabel(), null, "valueDisplay", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_Selection(), this.getSelection(), null, "selection", null, 0, 1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitAssociation_Filters(), this.getLabel(), null, "filters", null, 0, -1, UnitAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childFeatureEClass, ChildFeature.class, "ChildFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildFeature_PartOf(), this.getPathAssociationElement(), this.getPathAssociationElement_ChildFeature(), "partOf", null, 0, 1, ChildFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childAttributeEClass, ChildAttribute.class, "ChildAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChildAttribute.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getChildAttribute_Attribute(), this.getAttribute(), null, "attribute", null, 0, 1, ChildAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(childAssociationEClass, ChildAssociation.class, "ChildAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChildAssociation_Name(), ecorePackage.getEString(), "name", null, 0, 1, ChildAssociation.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceFieldEClass, InterfaceField.class, "InterfaceField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceField_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfaceField_MustMatch(), this.getUnitField(), null, "mustMatch", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_InputClass(), ecorePackage.getEString(), "inputClass", "input_attribute", 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceField_ValidationPattern(), ecorePackage.getEString(), "validationPattern", null, 0, 1, InterfaceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataTypeFieldEClass, DataTypeField.class, "DataTypeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeField_DataType(), this.getDataType(), null, "dataType", null, 1, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_ObfuscateFormFields(), ecorePackage.getEBoolean(), "obfuscateFormFields", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_Encrypt(), ecorePackage.getEBoolean(), "encrypt", "false", 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDataTypeField_InterfaceType(), ecorePackage.getEString(), "interfaceType", null, 0, 1, DataTypeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateFieldEClass, DateField.class, "DateField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateField_Details(), this.getDateDetails(), "details", "DateOnly", 1, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDateField_Format(), ecorePackage.getEString(), "format", null, 0, 1, DateField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(captchaFieldEClass, CaptchaField.class, "CaptchaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitSupportActionEClass, UnitSupportAction.class, "UnitSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitSupportAction_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitSupportAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, UnitSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pathReferenceElementEClass, PathReferenceElement.class, "PathReferenceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathReferenceElement_Actual(), theCriteriaPackage.getExpression(), null, "actual", null, 1, 1, PathReferenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathReferenceElement_ChildReference(), this.getChildPathReference(), this.getChildPathReference_Parent(), "childReference", null, 0, 1, PathReferenceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathReferenceElement_EntityType(), this.getEntityOrView(), null, "entityType", null, 0, 1, PathReferenceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(keyActualEClass, KeyActual.class, "KeyActual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyActual_Container(), this.getDynamicUnit(), this.getDynamicUnit_KeyActuals(), "container", null, 1, 1, KeyActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyActual_Key(), this.getAttribute(), null, "key", null, 0, 1, KeyActual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childPathReferenceEClass, ChildPathReference.class, "ChildPathReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildPathReference_Parent(), this.getPathReferenceElement(), this.getPathReferenceElement_ChildReference(), "parent", null, 1, 1, ChildPathReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editUnitEClass, EditUnit.class, "EditUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditUnit_DefaultSelection(), this.getSelection(), null, "defaultSelection", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_Title(), this.getLabel(), null, "title", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEditUnit_EnableWhen(), theCriteriaPackage.getPredicate(), null, "enableWhen", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEditUnit_ConfirmDestination(), this.getPage(), null, "confirmDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_ConfirmLabel(), ecorePackage.getEString(), "confirmLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEditUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_CancelLabel(), ecorePackage.getEString(), "cancelLabel", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "edit_content,framed", 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEditUnit_CustomiseValues(), ecorePackage.getEBoolean(), "customiseValues", null, 0, 1, EditUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createUnitEClass, CreateUnit.class, "CreateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_unit", 0, 1, CreateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(createUpdateUnitEClass, CreateUpdateUnit.class, "CreateUpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUpdateUnit_CreateUriElement(), ecorePackage.getEString(), "createUriElement", "", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_ClearLabel(), ecorePackage.getEString(), "clearLabel", null, 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreateUpdateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,create_unit,update_unit", 0, 1, CreateUpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(updateUnitEClass, UpdateUnit.class, "UpdateUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,update_unit", 0, 1, UpdateUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mapUnitEClass, MapUnit.class, "MapUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapUnit_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", "true", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_DefaultZoomLevel(), ecorePackage.getEInt(), "defaultZoomLevel", "12", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,map_unit", 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMapUnit_Location(), this.getLocationAttribute(), null, "location", null, 1, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapUnit_PlaceName(), this.getAttribute(), null, "placeName", null, 0, 1, MapUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataUnitEClass, DataUnit.class, "DataUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataUnit_DefaultSelection(), this.getSelection(), null, "defaultSelection", null, 0, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataUnit_Title(), this.getLabel(), null, "title", null, 0, 1, DataUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(detailsUnitEClass, DetailsUnit.class, "DetailsUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailsUnit_OnlyDisplayWhenNotEmpty(), ecorePackage.getEBoolean(), "onlyDisplayWhenNotEmpty", "false", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_OmitFieldLabels(), ecorePackage.getEBoolean(), "omitFieldLabels", "false", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,details_unit", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDetailsUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "details_content", 0, 1, DetailsUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(indexUnitEClass, IndexUnit.class, "IndexUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexUnit_DisplayOption(), this.getIndexDisplayOption(), "displayOption", "Grid", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_OmitColumnLabels(), ecorePackage.getEBoolean(), "omitColumnLabels", "false", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIndexUnit_Filters(), this.getFilter(), null, "filters", null, 0, -1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexUnit_Pagination(), this.getFilter(), null, "pagination", null, 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexUnit_DefaultPaginationSize(), ecorePackage.getEInt(), "defaultPaginationSize", "10", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_EmptyMessage(), ecorePackage.getEString(), "emptyMessage", null, 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexUnit_NextNpages(), ecorePackage.getEInt(), "nextNpages", "2", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexUnit_PreviousNpages(), ecorePackage.getEInt(), "previousNpages", "2", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexUnit_NextPageLabel(), ecorePackage.getEString(), "nextPageLabel", "&gt;", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_PreviousPageLabel(), ecorePackage.getEString(), "previousPageLabel", "&lt;", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_UseDisabledPageLinks(), ecorePackage.getEBoolean(), "useDisabledPageLinks", "true", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexUnit_UseFirstLastPageLinks(), ecorePackage.getEBoolean(), "useFirstLastPageLinks", "false", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_FirstPageLabel(), ecorePackage.getEString(), "firstPageLabel", "<<", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_LastPageLabel(), ecorePackage.getEString(), "lastPageLabel", ">>", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,index_unit", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "index_content,framed", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIndexUnit_RowClasses(), ecorePackage.getEString(), "rowClasses", "odd_row,even_row", 0, 1, IndexUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controlUnitEClass, ControlUnit.class, "ControlUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlUnit_SubmitLabel(), ecorePackage.getEString(), "submitLabel", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getControlUnit_CancelDestination(), this.getPage(), null, "cancelDestination", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControlUnit_CancelLabel(), ecorePackage.getEString(), "cancelLabel", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getControlUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "control_form", 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(searchUnitEClass, SearchUnit.class, "SearchUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchUnit_ResultsDestination(), this.getIndexUnit(), null, "resultsDestination", null, 1, 1, SearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSearchUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,search_unit", 0, 1, SearchUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionUnitEClass, ActionUnit.class, "ActionUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,action_unit", 0, 1, ActionUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(imageUnitEClass, ImageUnit.class, "ImageUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageUnit_DefaultSelection(), this.getSelection(), null, "defaultSelection", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageUnit_ImageProperty(), this.getImageAttribute(), null, "imageProperty", null, 1, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_ShowTime(), ecorePackage.getEBoolean(), "showTime", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageUnit_TransitionTime(), ecorePackage.getEBoolean(), "transitionTime", null, 0, 1, ImageUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliderUnitEClass, SliderUnit.class, "SliderUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSliderUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,slider_unit", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSliderUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "slider_content", 0, 1, SliderUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(gridUnitEClass, GridUnit.class, "GridUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,gallery_unit", 0, 1, GridUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGridUnit_ContentClass(), ecorePackage.getEString(), "contentClass", "gallery_content", 0, 1, GridUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(authenticationUnitEClass, AuthenticationUnit.class, "AuthenticationUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registrationUnitEClass, RegistrationUnit.class, "RegistrationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegistrationUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,register_unit", 0, 1, RegistrationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loginUnitEClass, LoginUnit.class, "LoginUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoginUnit_LogoutUriElement(), ecorePackage.getEString(), "logoutUriElement", "\"logout\"", 0, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,login_unit", 0, 1, LoginUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(forgottenPasswordUnitEClass, ForgottenPasswordUnit.class, "ForgottenPasswordUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForgottenPasswordUnit_StyleClass(), ecorePackage.getEString(), "styleClass", "unit,forgotten_password_unit", 0, 1, ForgottenPasswordUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(inlineActionContainerEClass, InlineActionContainer.class, "InlineActionContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineActionContainer_Actions(), this.getInlineAction(), this.getInlineAction_UsedBy(), "actions", null, 0, -1, InlineActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineActionEClass, InlineAction.class, "InlineAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineAction_UsedBy(), this.getInlineActionContainer(), this.getInlineActionContainer_Actions(), "usedBy", null, 1, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInlineAction_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineAction_EnableWhen(), theCriteriaPackage.getPredicate(), null, "enableWhen", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInlineAction_DisplayWhen(), theCriteriaPackage.getPredicate(), null, "displayWhen", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Header(), ecorePackage.getEString(), "header", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_Footer(), ecorePackage.getEString(), "footer", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_HeaderClass(), ecorePackage.getEString(), "headerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineAction_FooterClass(), ecorePackage.getEString(), "footerClass", null, 0, 1, InlineAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectActionEClass, SelectAction.class, "SelectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectAction_Target(), this.getSelectable(), null, "target", null, 1, 1, SelectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteActionEClass, DeleteAction.class, "DeleteAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleteAction_Destination(), this.getPage(), null, "destination", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeleteAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, DeleteAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSupportActionEClass, FeatureSupportAction.class, "FeatureSupportAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSupportAction_Operation(), this.getBusinessOperation(), null, "operation", null, 1, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_ConfirmMessage(), ecorePackage.getEString(), "confirmMessage", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_UriElement(), ecorePackage.getEString(), "uriElement", "", 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureSupportAction_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 0, 1, FeatureSupportAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelReference_Unit(), this.getDynamicUnit(), null, "unit", null, 1, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureReferenceEClass, FeatureReference.class, "FeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureReference_Feature(), this.getFeature(), null, "feature", null, 1, 1, FeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeParameterReferenceEClass, RouteParameterReference.class, "RouteParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRouteParameterReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, RouteParameterReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRouteParameterReference_Parameter(), this.getAttribute(), null, "parameter", null, 1, 1, RouteParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterReferenceEClass, ParameterReference.class, "ParameterReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterReference.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterReference_Parameter(), this.getSelectionParameter(), null, "parameter", null, 1, 1, ParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentUserReferenceEClass, CurrentUserReference.class, "CurrentUserReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCurrentUserReference_UserModel(), this.getEntityOrView(), null, "userModel", null, 1, 1, CurrentUserReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(databaseTechnologiesEEnum, DatabaseTechnologies.class, "DatabaseTechnologies");
		addEEnumLiteral(databaseTechnologiesEEnum, DatabaseTechnologies.MY_SQL);
		addEEnumLiteral(databaseTechnologiesEEnum, DatabaseTechnologies.ORACLE);

		initEEnum(ormTechnologiesEEnum, OrmTechnologies.class, "OrmTechnologies");
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.JPA);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DATA_MAPPER);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.IDIORM);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.KOHANA);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DOCTRINE_ORM);
		addEEnumLiteral(ormTechnologiesEEnum, OrmTechnologies.DOCTRINE_ODM);

		initEEnum(frameworkTechnologiesEEnum, FrameworkTechnologies.class, "FrameworkTechnologies");
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.JSF);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CAKE_PHP);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.CODE_IGNITER);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.KOHANA);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.LARAVEL);
		addEEnumLiteral(frameworkTechnologiesEEnum, FrameworkTechnologies.SYMFONY);

		initEEnum(inputTechnologiesEEnum, InputTechnologies.class, "InputTechnologies");
		addEEnumLiteral(inputTechnologiesEEnum, InputTechnologies.HTML);
		addEEnumLiteral(inputTechnologiesEEnum, InputTechnologies.JQUERY_UI);

		initEEnum(ajaxTechnologiesEEnum, AjaxTechnologies.class, "AjaxTechnologies");
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.NONE);
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.JQUERY);
		addEEnumLiteral(ajaxTechnologiesEEnum, AjaxTechnologies.ANGULAR_JS);

		initEEnum(authenticationKeyTypesEEnum, AuthenticationKeyTypes.class, "AuthenticationKeyTypes");
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.EMAIL);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.SCREEN_NAME);
		addEEnumLiteral(authenticationKeyTypesEEnum, AuthenticationKeyTypes.USERNAME);

		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.OPTIONAL);
		addEEnumLiteral(cardinalityEEnum, Cardinality.REQUIRED);
		addEEnumLiteral(cardinalityEEnum, Cardinality.MANY);

		initEEnum(isHasChoicesEEnum, isHasChoices.class, "isHasChoices");
		addEEnumLiteral(isHasChoicesEEnum, isHasChoices.IS_A);
		addEEnumLiteral(isHasChoicesEEnum, isHasChoices.HAS_A);

		initEEnum(dateDetailsEEnum, DateDetails.class, "DateDetails");
		addEEnumLiteral(dateDetailsEEnum, DateDetails.DATE_ONLY);
		addEEnumLiteral(dateDetailsEEnum, DateDetails.TIME_ONLY);
		addEEnumLiteral(dateDetailsEEnum, DateDetails.DATE_AND_TIME);

		initEEnum(operationResultTypesEEnum, OperationResultTypes.class, "OperationResultTypes");
		addEEnumLiteral(operationResultTypesEEnum, OperationResultTypes.NONE);
		addEEnumLiteral(operationResultTypesEEnum, OperationResultTypes.FILE);

		initEEnum(pageTopMenuOptionsEEnum, PageTopMenuOptions.class, "PageTopMenuOptions");
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.NEVER_INCLUDE);
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.ALWAYS_INCLUDE);
		addEEnumLiteral(pageTopMenuOptionsEEnum, PageTopMenuOptions.INCLUDE_WHEN_AUTHENTICATED);

		initEEnum(collectionDisplayOptionsEEnum, CollectionDisplayOptions.class, "CollectionDisplayOptions");
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.LINE_DIRECTION);
		addEEnumLiteral(collectionDisplayOptionsEEnum, CollectionDisplayOptions.PAGE_DIRECTION);

		initEEnum(indexDisplayOptionEEnum, IndexDisplayOption.class, "IndexDisplayOption");
		addEEnumLiteral(indexDisplayOptionEEnum, IndexDisplayOption.GRID);
		addEEnumLiteral(indexDisplayOptionEEnum, IndexDisplayOption.PAGE_DIRECTION);
		addEEnumLiteral(indexDisplayOptionEEnum, IndexDisplayOption.LINE_DIRECTION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (webGenModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "classifierNameUnique pageNameUnique menuNameUnique "
		   });	
		addAnnotation
		  (authenticationEClass, 
		   source, 
		   new String[] {
			 "constraints", "userKeyFromUser userKeyRequiredAttribute"
		   });	
		addAnnotation
		  (localAuthenticationSystemEClass, 
		   source, 
		   new String[] {
			 "constraints", "captchaRequiresKeys"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "nameNeedsAtLeastOneCharacter"
		   });	
		addAnnotation
		  (entityOrViewEClass, 
		   source, 
		   new String[] {
			 "constraints", "keysFromLocalFeatures"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "constraints", "featureNameUniqueWithinEntity"
		   });	
		addAnnotation
		  (entityAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "primaryKeyRequired"
		   });	
		addAnnotation
		  (associationWithoutContainmentEClass, 
		   source, 
		   new String[] {
			 "constraints", "oneToManyAssociationsMustBeBidirectional"
		   });	
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "constraints", "contentUnitNameUniqueWithinPage"
		   });	
		addAnnotation
		  (staticMenuEClass, 
		   source, 
		   new String[] {
			 "constraints", "onlyStaticEntries"
		   });	
		addAnnotation
		  (dynamicMenuEClass, 
		   source, 
		   new String[] {
			 "constraints", "entriesMustBeFromSource onlyIncludeFeaturesOnce mustSelectSingleton titleFromEntityOrView canOnlyTitleWithSingletons"
		   });	
		addAnnotation
		  (dynamicUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "featuresMustBeFromEntities"
		   });	
		addAnnotation
		  (unitFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "atMostOneSelectAction noDeleteActions"
		   });	
		addAnnotation
		  (unitAssociationEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionValidChoice"
		   });	
		addAnnotation
		  (dataUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "canOnlyTitleWithSingletons selectionValidChoice"
		   });	
		addAnnotation
		  (detailsUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionMustBeSingleton"
		   });	
		addAnnotation
		  (indexUnitEClass, 
		   source, 
		   new String[] {
			 "constraints", "selectionMustNotBeSingleton"
		   });	
		addAnnotation
		  (inlineActionContainerEClass, 
		   source, 
		   new String[] {
			 "constraints", "atMostOneDeleteAction"
		   });	
		addAnnotation
		  (deleteActionEClass, 
		   source, 
		   new String[] {
			 "constraints", "canOnlyDeleteSingletons"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (webGenModelEClass, 
		   source, 
		   new String[] {
			 "classifierNameUnique", "classifiers->isUnique(name)",
			 "pageNameUnique", "pages->isUnique(name)",
			 "menuNameUnique", "menus->isUnique(name)"
		   });	
		addAnnotation
		  (authenticationEClass, 
		   source, 
		   new String[] {
			 "userKeyFromUser", "not user.oclIsUndefined() and not userKey.oclIsUndefined() implies\r\n\tuser.features->includes(userKey)",
			 "userKeyRequiredAttribute", "not userKey.oclIsUndefined() implies\r\n\tif userKey.oclIsTypeOf(EncapsulatedAttribute) then\r\n\t\tuserKey.oclAsType(EncapsulatedAttribute).cardinality = Cardinality::Required\r\n\telse\r\n\t\tuserKey.oclAsType(EntityAttribute).cardinality = Cardinality::Required\r\n\tendif"
		   });	
		addAnnotation
		  (localAuthenticationSystemEClass, 
		   source, 
		   new String[] {
			 "captchaRequiresKeys", "useCaptcha implies not authenticates.captchaSiteKey.oclIsUndefined() and not authenticates.captchaSecretKey.oclIsUndefined()"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "nameNeedsAtLeastOneCharacter", "not name.oclIsUndefined() implies name.size() > 0"
		   });	
		addAnnotation
		  (entityOrViewEClass, 
		   source, 
		   new String[] {
			 "keysFromLocalFeatures", "allFeatures->includesAll(keys)"
		   });	
		addAnnotation
		  (getEntityOrView_Features(), 
		   source, 
		   new String[] {
			 "derivation", "if self.oclIsTypeOf(Entity) then\r\n\tself.oclAsType(Entity).entityFeatures\r\nelse\r\n\tself.oclAsType(View).viewFeatures\r\nendif"
		   });	
		addAnnotation
		  (getEntityOrView_AllFeatures(), 
		   source, 
		   new String[] {
			 "derivation", "if self.oclIsTypeOf(Entity) then\r\n\tself.oclAsType(Entity).entityFeatures->union(self.oclAsType(Entity).associationEnds->select(e | e.bidirectional))->asOrderedSet()\r\nelse\r\n\tself.oclAsType(View).viewFeatures\r\nendif"
		   });	
		addAnnotation
		  (getEntityOrView_Attributes(), 
		   source, 
		   new String[] {
			 "derivation", "features->select(f | f.oclIsKindOf(Attribute)).oclAsType(Attribute)->asOrderedSet()"
		   });	
		addAnnotation
		  (getEntityOrView_Associations(), 
		   source, 
		   new String[] {
			 "derivation", "features->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()"
		   });	
		addAnnotation
		  (getEntityOrView_AllAssociations(), 
		   source, 
		   new String[] {
			 "derivation", "allFeatures->select(f | f.oclIsKindOf(Association)).oclAsType(Association)->asOrderedSet()"
		   });	
		addAnnotation
		  (getAssociation_SourceEntityX(), 
		   source, 
		   new String[] {
			 "derivation", "if self.oclIsKindOf(EntityAssociation) then\r\n\tself.oclAsType(EntityAssociation).partOf\r\nelse if self.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tself.oclAsType(EncapsulatedAssociation).sourceEntity\r\nelse\r\n\tself.oclAsType(ViewAssociation).partOf\r\nendif endif"
		   });	
		addAnnotation
		  (getAssociation_TargetEntityX(), 
		   source, 
		   new String[] {
			 "derivation", "if self.oclIsKindOf(EntityAssociation) then\r\n\tself.oclAsType(EntityAssociation).targetEntity\r\nelse if self.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tself.oclAsType(EncapsulatedAssociation).targetEntity\r\nelse\r\n\t-- TODO get other end\r\n\tself.oclAsType(ViewAssociation).partOf\r\nendif endif"
		   });	
		addAnnotation
		  (getModelLabelAssociation_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "not association.oclIsUndefined() implies\r\n\tpartOf.labelFor.features->includes(association)"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "featureNameUniqueWithinEntity", "entityFeatures->isUnique(f | f.name)"
		   });	
		addAnnotation
		  (entityAttributeEClass, 
		   source, 
		   new String[] {
			 "primaryKeyRequired", "primaryKey implies cardinality <> Cardinality::Optional"
		   });	
		addAnnotation
		  (associationWithoutContainmentEClass, 
		   source, 
		   new String[] {
			 "oneToManyAssociationsMustBeBidirectional", "cardinality = Cardinality::Optional and targetCardinality = Cardinality::Required implies bidirectional"
		   });	
		addAnnotation
		  (getEncapsulatedAttribute_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if not self.alias.oclIsUndefined() then\r\n\tif self.alias <> \'\' then\r\n\t\tself.alias\r\n\telse\r\n\t\t\'empty alias\'\r\n\tendif\r\nelse if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse \r\n\tif attribute.oclIsKindOf(EntityAttribute) then\r\n\t\tattribute.oclAsType(EntityAttribute).name\r\n\telse\r\n\t\tattribute.oclAsType(EncapsulatedAttribute).name\r\n\tendif\r\nendif endif"
		   });	
		addAnnotation
		  (getEncapsulatedAttribute_Cardinality(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\tCardinality::Optional\r\nelse \r\n\tif attribute.oclIsKindOf(EntityAttribute) then\r\n\t\tattribute.oclAsType(EntityAttribute).cardinality\r\n\telse\r\n\t\tattribute.oclAsType(EncapsulatedAttribute).cardinality\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getEncapsulatedAssociation_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if not alias.oclIsUndefined() then\r\n\tif alias <> \'\' then\r\n\t\talias\r\n\telse\r\n\t\t\'empty alias\'\r\n\tendif\r\nelse if association.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).name\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).name\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).targetFeatureName\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).opposite.name\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif endif"
		   });	
		addAnnotation
		  (getEncapsulatedAssociation_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "not association.oclIsUndefined() implies\r\n\tpartOf.encapsulates->collect(eov | eov.features)->includes(association)"
		   });	
		addAnnotation
		  (getEncapsulatedAssociation_Cardinality(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tCardinality::Optional\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).cardinality\r\n\telse if association.oclIsTypeOf(ViewAssociation) then\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(ViewAssociation).cardinality\r\n\t\telse\r\n\t\t\tassociation.oclAsType(ViewAssociation).opposite.cardinality\r\n\t\tendif\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(EntityAssociation).cardinality\r\n\t\telse if association.oclIsTypeOf(AssociationWithContainment) then\r\n\t\t\tCardinality::Required\r\n\t\telse\r\n\t\t\tassociation.oclAsType(AssociationWithoutContainment).targetCardinality \r\n\t\tendif endif\r\n\tendif endif\r\nendif"
		   });	
		addAnnotation
		  (getEncapsulatedAssociation_SourceEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity \r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getEncapsulatedAssociation_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity \r\n\t\telse\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (pageEClass, 
		   source, 
		   new String[] {
			 "contentUnitNameUniqueWithinPage", "units->isUnique(name)"
		   });	
		addAnnotation
		  (staticMenuEClass, 
		   source, 
		   new String[] {
			 "onlyStaticEntries", "entries->select(e | e.oclIsKindOf(MenuFeature))->isEmpty()"
		   });	
		addAnnotation
		  (dynamicMenuEClass, 
		   source, 
		   new String[] {
			 "entriesMustBeFromSource", "true",
			 "onlyIncludeFeaturesOnce", "true",
			 "mustSelectSingleton", "not selection.oclIsUndefined() implies selection.limit = 1",
			 "titleFromEntityOrView", "not title.oclIsUndefined() and not entityOrView.oclIsUndefined() implies\r\n\tentityOrView.features->includes(title)",
			 "canOnlyTitleWithSingletons", "not title.oclIsUndefined() implies\r\n\tif title.oclIsKindOf(EntityFeature) then\r\n\t\ttitle.oclAsType(EntityFeature).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\ttitle.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n\telse\r\n\t\tfalse\r\n\tendif endif endif"
		   });	
		addAnnotation
		  (dynamicUnitEClass, 
		   source, 
		   new String[] {
			 "featuresMustBeFromEntities", "let eovFeatures : Collection(Feature)\r\n\t= self.entities->collect(eov | eov.allFeatures)\r\n\tin displayFields\r\n\t\t->select(f | f.oclIsKindOf(UnitFeature)).oclAsType(UnitFeature)\r\n\t\t->select(f | \r\n\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\tnot f.oclAsType(UnitElement).attribute.oclIsUndefined()\r\n\t\t\telse\r\n\t\t\t\tnot f.oclAsType(UnitAssociation).association.oclIsUndefined()\r\n\t\t\tendif)\r\n\t\t->forAll(f | \r\n\t\t\tif f.oclIsTypeOf(UnitElement) then\r\n\t\t\t\teovFeatures->includes(f.oclAsType(UnitElement).attribute)\r\n\t\t\telse\r\n\t\t\t\teovFeatures->includes(f.oclAsType(UnitAssociation).association)\r\n\t\t\tendif)"
		   });	
		addAnnotation
		  (unitFeatureEClass, 
		   source, 
		   new String[] {
			 "atMostOneSelectAction", "actions->select(a | a.oclIsKindOf(SelectAction))->size() < 2",
			 "noDeleteActions", "actions->select(a | a.oclIsKindOf(DeleteAction))->isEmpty()"
		   });	
		addAnnotation
		  (getUnitElement_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(EncapsulatedAttribute) then\r\n\tattribute.oclAsType(EncapsulatedAttribute).name\r\nelse\r\n\tattribute.oclAsType(EntityAttribute).name\r\nendif endif"
		   });	
		addAnnotation
		  (getPathAssociationElement_IsSourceAssociation(), 
		   source, 
		   new String[] {
			 "derivation", "not association.oclIsUndefined() implies\r\n\tif self.oclIsKindOf(UnitAssociation) then\r\n\t\tself.oclAsType(UnitAssociation).displayedOn.entities->collect(eov | eov.associations)->includes(association)\r\n\telse\r\n\t\tlet partOf : PathAssociationElement\r\n\t\t\t= self.oclAsType(ChildAssociation).partOf\r\n\t\t\tin partOf.targetEntity.associations->includes(association)\r\n\tendif"
		   });	
		addAnnotation
		  (getPathAssociationElement_SourceEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getPathAssociationElement_TargetEntity(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\tnull\r\nelse\r\n\tif isSourceAssociation then\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).targetEntity\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).targetEntity\r\n\t\tendif\r\n\telse\r\n\t\tif association.oclIsKindOf(EntityAssociation) then\r\n\t\t\tassociation.oclAsType(EntityAssociation).partOf\r\n\t\telse\r\n\t\t\tassociation.oclAsType(EncapsulatedAssociation).sourceEntity\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (unitAssociationEClass, 
		   source, 
		   new String[] {
			 "selectionValidChoice", "not selection.oclIsUndefined() implies\r\n\ttargetEntity->collect(eov | eov.servedBy)->collect(s | s.selections)->includes(selection)"
		   });	
		addAnnotation
		  (getUnitAssociation_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\t\tassociation.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tif isSourceAssociation then\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).name\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).name\r\n\t\t\tendif\r\n\t\telse\r\n\t\t\tif self.association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tself.association.oclAsType(EntityAssociation).targetFeatureName\r\n\t\t\telse\r\n\t\t\t\tassociation.oclAsType(ViewAssociation).opposite.name\r\n\t\t\tendif\r\n\t\tendif\r\n\tendif\r\nendif"
		   });	
		addAnnotation
		  (getChildAttribute_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if attribute.oclIsUndefined() then\r\n\t\'\'\r\nelse if attribute.oclIsKindOf(EntityAttribute) then\r\n\tattribute.oclAsType(EntityAttribute).name\r\nelse\r\n\tattribute.oclAsType(EncapsulatedAttribute).name\r\nendif endif\r\n"
		   });	
		addAnnotation
		  (getChildAssociation_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if association.oclIsUndefined() then\r\n\t\'\'\r\nelse if association.oclIsKindOf(EntityAssociation) then\r\n\tassociation.oclAsType(EntityAssociation).name\r\nelse if association.oclIsTypeOf(EncapsulatedAssociation) then\r\n\tassociation.oclAsType(EncapsulatedAssociation).name\r\nelse\r\n\tassociation.oclAsType(ViewAssociation).name \r\nendif endif endif\r\n"
		   });	
		addAnnotation
		  (getPathReferenceElement_EntityType(), 
		   source, 
		   new String[] {
			 "derivation", "if actual.oclIsUndefined() then\r\n\tnull\r\nelse if actual.oclIsKindOf(CurrentUserReference) then\r\n\tactual.oclAsType(CurrentUserReference).userModel\r\nelse if actual.oclIsTypeOf(FeatureReference) then\r\n\tlet ref : FeatureReference = actual.oclAsType(FeatureReference)\r\n\t\tin if ref.feature.oclIsUndefined() or ref.feature.oclIsKindOf(Attribute) then\r\n\t\t\t\tnull\r\n\t\t\telse\r\n\t\t\t\tlet parent : PathReferenceElement\r\n\t\t\t\t\t= self.oclAsType((ChildPathReference) ).parent\r\n\t\t\t\t\tin if parent.entityType.oclIsUndefined() then\r\n\t\t\t\t\t\t\tnull\r\n\t\t\t\t\t\telse if parent.entityType.features->includes(ref.feature) then\r\n\t\t\t\t\t\t\tref.feature.oclAsType(Association).targetEntityX\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tref.feature.oclAsType(Association).sourceEntityX\r\n\t\t\t\t\t\tendif endif\r\n\t\t\tendif\r\nelse\r\n\tnull\r\nendif endif endif\r\n"
		   });	
		addAnnotation
		  (dataUnitEClass, 
		   source, 
		   new String[] {
			 "canOnlyTitleWithSingletons", "not title.oclIsUndefined() implies \r\n\tif title.oclIsKindOf(EntityAttribute) then\r\n\t\ttitle.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n\telse if title.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\ttitle.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\telse\r\n\t\ttrue\r\n\tendif endif",
			 "selectionValidChoice", "not defaultSelection.oclIsUndefined() implies\r\n\tentities->collect(eov | eov.servedBy)->collect(s | s.selections)->includes(defaultSelection)"
		   });	
		addAnnotation
		  (detailsUnitEClass, 
		   source, 
		   new String[] {
			 "selectionMustBeSingleton", "not defaultSelection.oclIsUndefined() implies\r\n\tdefaultSelection.limit = 1"
		   });	
		addAnnotation
		  (indexUnitEClass, 
		   source, 
		   new String[] {
			 "selectionMustNotBeSingleton", "not defaultSelection.oclIsUndefined() implies\r\n\tdefaultSelection.limit <> 1"
		   });	
		addAnnotation
		  (inlineActionContainerEClass, 
		   source, 
		   new String[] {
			 "atMostOneDeleteAction", "actions->select(a | a.oclIsKindOf(DeleteAction))->size() < 2"
		   });	
		addAnnotation
		  (deleteActionEClass, 
		   source, 
		   new String[] {
			 "canOnlyDeleteSingletons", "if usedBy.oclIsKindOf(UnitElement) then\r\n\tlet attribute : Attribute\r\n\t\t= usedBy.oclAsType(UnitElement).attribute\r\n\t\tin if attribute.oclIsKindOf(EntityAttribute) then\r\n\t\t\t\tattribute.oclAsType(EntityAttribute).cardinality <> Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tattribute.oclAsType(EncapsulatedAttribute).cardinality <> Cardinality::Many\r\n\t\t\tendif\r\nelse if usedBy.oclIsKindOf(UnitAssociation) then\r\n\tlet association : Association\r\n\t\t= usedBy.oclAsType(UnitAssociation).association\r\n\t\tin if association.oclIsKindOf(EntityAssociation) then\r\n\t\t\t\tassociation.oclAsType(EntityAssociation).cardinality <> Cardinality::Many\r\n\t\t\telse if association.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\t\t\tassociation.oclAsType(EncapsulatedAssociation).cardinality <> Cardinality::Many\r\n\t\t\telse\r\n\t\t\t\tfalse -- association.oclAsType(ViewAssociation)\r\n\t\t\tendif endif\r\nelse\r\n\tusedBy.oclIsTypeOf(IndexUnit)\r\nendif endif\r\n"
		   });	
		addAnnotation
		  (getFeatureReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if feature.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tif feature.oclIsKindOf(EntityFeature) then\r\n\t\tfeature.oclAsType(EntityFeature).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAttribute) then\r\n\t\tfeature.oclAsType(EncapsulatedAttribute).name\r\n\telse if feature.oclIsKindOf(EncapsulatedAssociation) then\r\n\t\tfeature.oclAsType(EncapsulatedAssociation).name\r\n\telse\r\n\t\tfeature.oclAsType(ViewAssociation).name\r\n\tendif endif endif\r\nendif"
		   });	
		addAnnotation
		  (getRouteParameterReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if parameter.oclIsUndefined() then\r\n\t\'\'\r\nelse if parameter.oclIsKindOf(EntityAttribute) then\r\n\tparameter.oclAsType(EntityAttribute).name\r\nelse\r\n\tparameter.oclAsType(EncapsulatedAttribute).name\r\nendif endif"
		   });	
		addAnnotation
		  (getParameterReference_Name(), 
		   source, 
		   new String[] {
			 "derivation", "if parameter.oclIsUndefined() then\r\n\t\'\'\r\nelse\r\n\tparameter.name\r\nendif"
		   });
	}

} //WebsitePackageImpl
