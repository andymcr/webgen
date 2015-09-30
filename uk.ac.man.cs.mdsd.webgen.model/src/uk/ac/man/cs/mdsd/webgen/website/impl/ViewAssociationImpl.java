/**
 */
package uk.ac.man.cs.mdsd.webgen.website.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import uk.ac.man.cs.mdsd.webgen.website.Association;
import uk.ac.man.cs.mdsd.webgen.website.Cardinality;
import uk.ac.man.cs.mdsd.webgen.website.Feature;
import uk.ac.man.cs.mdsd.webgen.website.View;
import uk.ac.man.cs.mdsd.webgen.website.ViewAssociation;
import uk.ac.man.cs.mdsd.webgen.website.ViewFeature;
import uk.ac.man.cs.mdsd.webgen.website.WebsitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getHeaderClass <em>Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getDisplayClass <em>Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getFooterClass <em>Footer Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getInputClass <em>Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetView <em>Target View</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getPivotTableName <em>Pivot Table Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetFeatureName <em>Target Feature Name</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetDisplayLabel <em>Target Display Label</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetCardinality <em>Target Cardinality</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetUnique <em>Target Unique</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetHeaderClass <em>Target Header Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetInputClass <em>Target Input Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetDisplayClass <em>Target Display Class</em>}</li>
 *   <li>{@link uk.ac.man.cs.mdsd.webgen.website.impl.ViewAssociationImpl#getTargetFooterClass <em>Target Footer Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewAssociationImpl extends NamedDisplayElementImpl implements ViewAssociation {
	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected String columnName = COLUMN_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHeaderClass() <em>Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String headerClass = HEADER_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDisplayClass() <em>Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String displayClass = DISPLAY_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FOOTER_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFooterClass() <em>Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String footerClass = FOOTER_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_CLASS_EDEFAULT = "input_association";
	/**
	 * The cached value of the '{@link #getInputClass() <em>Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputClass()
	 * @generated
	 * @ordered
	 */
	protected String inputClass = INPUT_CLASS_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTargetView() <em>Target View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetView()
	 * @generated
	 * @ordered
	 */
	protected View targetView;
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.OPTIONAL;
	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BIDIRECTIONAL_EDEFAULT = Boolean.FALSE;
	/**
	 * The cached value of the '{@link #getBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidirectional()
	 * @generated
	 * @ordered
	 */
	protected Boolean bidirectional = BIDIRECTIONAL_EDEFAULT;
	/**
	 * The default value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PIVOT_TABLE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPivotTableName() <em>Pivot Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPivotTableName()
	 * @generated
	 * @ordered
	 */
	protected String pivotTableName = PIVOT_TABLE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetFeatureName() <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FEATURE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTargetFeatureName() <em>Target Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String targetFeatureName = TARGET_FEATURE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetDisplayLabel() <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DISPLAY_LABEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTargetDisplayLabel() <em>Target Display Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayLabel()
	 * @generated
	 * @ordered
	 */
	protected String targetDisplayLabel = TARGET_DISPLAY_LABEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality TARGET_CARDINALITY_EDEFAULT = Cardinality.REQUIRED;
	/**
	 * The cached value of the '{@link #getTargetCardinality() <em>Target Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality targetCardinality = TARGET_CARDINALITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetUnique() <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TARGET_UNIQUE_EDEFAULT = Boolean.TRUE;
	/**
	 * The cached value of the '{@link #getTargetUnique() <em>Target Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean targetUnique = TARGET_UNIQUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetHeaderClass() <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HEADER_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTargetHeaderClass() <em>Target Header Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHeaderClass()
	 * @generated
	 * @ordered
	 */
	protected String targetHeaderClass = TARGET_HEADER_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetInputClass() <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_INPUT_CLASS_EDEFAULT = "input_association";
	/**
	 * The cached value of the '{@link #getTargetInputClass() <em>Target Input Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInputClass()
	 * @generated
	 * @ordered
	 */
	protected String targetInputClass = TARGET_INPUT_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetDisplayClass() <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DISPLAY_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTargetDisplayClass() <em>Target Display Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDisplayClass()
	 * @generated
	 * @ordered
	 */
	protected String targetDisplayClass = TARGET_DISPLAY_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTargetFooterClass() <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFooterClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_FOOTER_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTargetFooterClass() <em>Target Footer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFooterClass()
	 * @generated
	 * @ordered
	 */
	protected String targetFooterClass = TARGET_FOOTER_CLASS_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.VIEW_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnName() {
		return columnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnName(String newColumnName) {
		String oldColumnName = columnName;
		columnName = newColumnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__COLUMN_NAME, oldColumnName, columnName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeaderClass() {
		return headerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderClass(String newHeaderClass) {
		String oldHeaderClass = headerClass;
		headerClass = newHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS, oldHeaderClass, headerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayClass() {
		return displayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayClass(String newDisplayClass) {
		String oldDisplayClass = displayClass;
		displayClass = newDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS, oldDisplayClass, displayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFooterClass() {
		return footerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFooterClass(String newFooterClass) {
		String oldFooterClass = footerClass;
		footerClass = newFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS, oldFooterClass, footerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getPartOf() {
		if (eContainerFeatureID() != WebsitePackage.VIEW_ASSOCIATION__PART_OF) return null;
		return (View)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(View newPartOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPartOf, WebsitePackage.VIEW_ASSOCIATION__PART_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(View newPartOf) {
		if (newPartOf != eInternalContainer() || (eContainerFeatureID() != WebsitePackage.VIEW_ASSOCIATION__PART_OF && newPartOf != null)) {
			if (EcoreUtil.isAncestor(this, newPartOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, WebsitePackage.VIEW__FEATURES, View.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputClass() {
		return inputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputClass(String newInputClass) {
		String oldInputClass = inputClass;
		inputClass = newInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS, oldInputClass, inputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getTargetView() {
		if (targetView != null && targetView.eIsProxy()) {
			InternalEObject oldTargetView = (InternalEObject)targetView;
			targetView = (View)eResolveProxy(oldTargetView);
			if (targetView != oldTargetView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.VIEW_ASSOCIATION__TARGET_VIEW, oldTargetView, targetView));
			}
		}
		return targetView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View basicGetTargetView() {
		return targetView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetView(View newTargetView) {
		View oldTargetView = targetView;
		targetView = newTargetView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_VIEW, oldTargetView, targetView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(Boolean newBidirectional) {
		Boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPivotTableName() {
		return pivotTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPivotTableName(String newPivotTableName) {
		String oldPivotTableName = pivotTableName;
		pivotTableName = newPivotTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__PIVOT_TABLE_NAME, oldPivotTableName, pivotTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFeatureName() {
		return targetFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFeatureName(String newTargetFeatureName) {
		String oldTargetFeatureName = targetFeatureName;
		targetFeatureName = newTargetFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_FEATURE_NAME, oldTargetFeatureName, targetFeatureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDisplayLabel() {
		return targetDisplayLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisplayLabel(String newTargetDisplayLabel) {
		String oldTargetDisplayLabel = targetDisplayLabel;
		targetDisplayLabel = newTargetDisplayLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_LABEL, oldTargetDisplayLabel, targetDisplayLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getTargetCardinality() {
		return targetCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCardinality(Cardinality newTargetCardinality) {
		Cardinality oldTargetCardinality = targetCardinality;
		targetCardinality = newTargetCardinality == null ? TARGET_CARDINALITY_EDEFAULT : newTargetCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_CARDINALITY, oldTargetCardinality, targetCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTargetUnique() {
		return targetUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUnique(Boolean newTargetUnique) {
		Boolean oldTargetUnique = targetUnique;
		targetUnique = newTargetUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_UNIQUE, oldTargetUnique, targetUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHeaderClass() {
		return targetHeaderClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHeaderClass(String newTargetHeaderClass) {
		String oldTargetHeaderClass = targetHeaderClass;
		targetHeaderClass = newTargetHeaderClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_HEADER_CLASS, oldTargetHeaderClass, targetHeaderClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetInputClass() {
		return targetInputClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInputClass(String newTargetInputClass) {
		String oldTargetInputClass = targetInputClass;
		targetInputClass = newTargetInputClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_INPUT_CLASS, oldTargetInputClass, targetInputClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDisplayClass() {
		return targetDisplayClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDisplayClass(String newTargetDisplayClass) {
		String oldTargetDisplayClass = targetDisplayClass;
		targetDisplayClass = newTargetDisplayClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_CLASS, oldTargetDisplayClass, targetDisplayClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetFooterClass() {
		return targetFooterClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFooterClass(String newTargetFooterClass) {
		String oldTargetFooterClass = targetFooterClass;
		targetFooterClass = newTargetFooterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.VIEW_ASSOCIATION__TARGET_FOOTER_CLASS, oldTargetFooterClass, targetFooterClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPartOf((View)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return basicSetPartOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return eInternalContainer().eInverseRemove(this, WebsitePackage.VIEW__FEATURES, View.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.VIEW_ASSOCIATION__COLUMN_NAME:
				return getColumnName();
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return getHeaderClass();
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return getDisplayClass();
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return getFooterClass();
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf();
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return getInputClass();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_VIEW:
				if (resolve) return getTargetView();
				return basicGetTargetView();
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				return getCardinality();
			case WebsitePackage.VIEW_ASSOCIATION__BIDIRECTIONAL:
				return getBidirectional();
			case WebsitePackage.VIEW_ASSOCIATION__PIVOT_TABLE_NAME:
				return getPivotTableName();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FEATURE_NAME:
				return getTargetFeatureName();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_LABEL:
				return getTargetDisplayLabel();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_CARDINALITY:
				return getTargetCardinality();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_UNIQUE:
				return getTargetUnique();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_HEADER_CLASS:
				return getTargetHeaderClass();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_INPUT_CLASS:
				return getTargetInputClass();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_CLASS:
				return getTargetDisplayClass();
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FOOTER_CLASS:
				return getTargetFooterClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.VIEW_ASSOCIATION__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_VIEW:
				setTargetView((View)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FEATURE_NAME:
				setTargetFeatureName((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_LABEL:
				setTargetDisplayLabel((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_CARDINALITY:
				setTargetCardinality((Cardinality)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_UNIQUE:
				setTargetUnique((Boolean)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_HEADER_CLASS:
				setTargetHeaderClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_INPUT_CLASS:
				setTargetInputClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_CLASS:
				setTargetDisplayClass((String)newValue);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FOOTER_CLASS:
				setTargetFooterClass((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebsitePackage.VIEW_ASSOCIATION__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				setHeaderClass(HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				setDisplayClass(DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				setFooterClass(FOOTER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				setPartOf((View)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				setInputClass(INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_VIEW:
				setTargetView((View)null);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__PIVOT_TABLE_NAME:
				setPivotTableName(PIVOT_TABLE_NAME_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FEATURE_NAME:
				setTargetFeatureName(TARGET_FEATURE_NAME_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_LABEL:
				setTargetDisplayLabel(TARGET_DISPLAY_LABEL_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_CARDINALITY:
				setTargetCardinality(TARGET_CARDINALITY_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_UNIQUE:
				setTargetUnique(TARGET_UNIQUE_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_HEADER_CLASS:
				setTargetHeaderClass(TARGET_HEADER_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_INPUT_CLASS:
				setTargetInputClass(TARGET_INPUT_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_CLASS:
				setTargetDisplayClass(TARGET_DISPLAY_CLASS_EDEFAULT);
				return;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FOOTER_CLASS:
				setTargetFooterClass(TARGET_FOOTER_CLASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebsitePackage.VIEW_ASSOCIATION__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? columnName != null : !COLUMN_NAME_EDEFAULT.equals(columnName);
			case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS:
				return HEADER_CLASS_EDEFAULT == null ? headerClass != null : !HEADER_CLASS_EDEFAULT.equals(headerClass);
			case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS:
				return DISPLAY_CLASS_EDEFAULT == null ? displayClass != null : !DISPLAY_CLASS_EDEFAULT.equals(displayClass);
			case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS:
				return FOOTER_CLASS_EDEFAULT == null ? footerClass != null : !FOOTER_CLASS_EDEFAULT.equals(footerClass);
			case WebsitePackage.VIEW_ASSOCIATION__PART_OF:
				return getPartOf() != null;
			case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS:
				return INPUT_CLASS_EDEFAULT == null ? inputClass != null : !INPUT_CLASS_EDEFAULT.equals(inputClass);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_VIEW:
				return targetView != null;
			case WebsitePackage.VIEW_ASSOCIATION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__BIDIRECTIONAL:
				return BIDIRECTIONAL_EDEFAULT == null ? bidirectional != null : !BIDIRECTIONAL_EDEFAULT.equals(bidirectional);
			case WebsitePackage.VIEW_ASSOCIATION__PIVOT_TABLE_NAME:
				return PIVOT_TABLE_NAME_EDEFAULT == null ? pivotTableName != null : !PIVOT_TABLE_NAME_EDEFAULT.equals(pivotTableName);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FEATURE_NAME:
				return TARGET_FEATURE_NAME_EDEFAULT == null ? targetFeatureName != null : !TARGET_FEATURE_NAME_EDEFAULT.equals(targetFeatureName);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_LABEL:
				return TARGET_DISPLAY_LABEL_EDEFAULT == null ? targetDisplayLabel != null : !TARGET_DISPLAY_LABEL_EDEFAULT.equals(targetDisplayLabel);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_CARDINALITY:
				return targetCardinality != TARGET_CARDINALITY_EDEFAULT;
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_UNIQUE:
				return TARGET_UNIQUE_EDEFAULT == null ? targetUnique != null : !TARGET_UNIQUE_EDEFAULT.equals(targetUnique);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_HEADER_CLASS:
				return TARGET_HEADER_CLASS_EDEFAULT == null ? targetHeaderClass != null : !TARGET_HEADER_CLASS_EDEFAULT.equals(targetHeaderClass);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_INPUT_CLASS:
				return TARGET_INPUT_CLASS_EDEFAULT == null ? targetInputClass != null : !TARGET_INPUT_CLASS_EDEFAULT.equals(targetInputClass);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_DISPLAY_CLASS:
				return TARGET_DISPLAY_CLASS_EDEFAULT == null ? targetDisplayClass != null : !TARGET_DISPLAY_CLASS_EDEFAULT.equals(targetDisplayClass);
			case WebsitePackage.VIEW_ASSOCIATION__TARGET_FOOTER_CLASS:
				return TARGET_FOOTER_CLASS_EDEFAULT == null ? targetFooterClass != null : !TARGET_FOOTER_CLASS_EDEFAULT.equals(targetFooterClass);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__COLUMN_NAME: return WebsitePackage.FEATURE__COLUMN_NAME;
				case WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS: return WebsitePackage.FEATURE__HEADER_CLASS;
				case WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS: return WebsitePackage.FEATURE__DISPLAY_CLASS;
				case WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS: return WebsitePackage.FEATURE__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__PART_OF: return WebsitePackage.VIEW_FEATURE__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS: return WebsitePackage.ASSOCIATION__INPUT_CLASS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.FEATURE__COLUMN_NAME: return WebsitePackage.VIEW_ASSOCIATION__COLUMN_NAME;
				case WebsitePackage.FEATURE__HEADER_CLASS: return WebsitePackage.VIEW_ASSOCIATION__HEADER_CLASS;
				case WebsitePackage.FEATURE__DISPLAY_CLASS: return WebsitePackage.VIEW_ASSOCIATION__DISPLAY_CLASS;
				case WebsitePackage.FEATURE__FOOTER_CLASS: return WebsitePackage.VIEW_ASSOCIATION__FOOTER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == ViewFeature.class) {
			switch (baseFeatureID) {
				case WebsitePackage.VIEW_FEATURE__PART_OF: return WebsitePackage.VIEW_ASSOCIATION__PART_OF;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case WebsitePackage.ASSOCIATION__INPUT_CLASS: return WebsitePackage.VIEW_ASSOCIATION__INPUT_CLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (columnName: ");
		result.append(columnName);
		result.append(", headerClass: ");
		result.append(headerClass);
		result.append(", displayClass: ");
		result.append(displayClass);
		result.append(", footerClass: ");
		result.append(footerClass);
		result.append(", inputClass: ");
		result.append(inputClass);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(", pivotTableName: ");
		result.append(pivotTableName);
		result.append(", targetFeatureName: ");
		result.append(targetFeatureName);
		result.append(", targetDisplayLabel: ");
		result.append(targetDisplayLabel);
		result.append(", targetCardinality: ");
		result.append(targetCardinality);
		result.append(", targetUnique: ");
		result.append(targetUnique);
		result.append(", targetHeaderClass: ");
		result.append(targetHeaderClass);
		result.append(", targetInputClass: ");
		result.append(targetInputClass);
		result.append(", targetDisplayClass: ");
		result.append(targetDisplayClass);
		result.append(", targetFooterClass: ");
		result.append(targetFooterClass);
		result.append(')');
		return result.toString();
	}

} //ViewAssociationImpl
