/**
 */
package webApplications.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webApplications.Database;
import webApplications.Page;
import webApplications.WebApplication;
import webApplications.WebApplicationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webApplications.impl.WebApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link webApplications.impl.WebApplicationImpl#getPage <em>Page</em>}</li>
 *   <li>{@link webApplications.impl.WebApplicationImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link webApplications.impl.WebApplicationImpl#getURL <em>URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationImpl extends MinimalEObjectImpl.Container implements WebApplication {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> page;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> database;

	/**
	 * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationsPackage.Literals.WEB_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.WEB_APPLICATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, WebApplicationsPackage.WEB_APPLICATION__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Database> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<Database>(Database.class, this,
					WebApplicationsPackage.WEB_APPLICATION__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURL() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setURL(String newURL) {
		String oldURL = url;
		url = newURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.WEB_APPLICATION__URL, oldURL,
					url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebApplicationsPackage.WEB_APPLICATION__PAGE:
			return ((InternalEList<?>) getPage()).basicRemove(otherEnd, msgs);
		case WebApplicationsPackage.WEB_APPLICATION__DATABASE:
			return ((InternalEList<?>) getDatabase()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebApplicationsPackage.WEB_APPLICATION__NAME:
			return getName();
		case WebApplicationsPackage.WEB_APPLICATION__PAGE:
			return getPage();
		case WebApplicationsPackage.WEB_APPLICATION__DATABASE:
			return getDatabase();
		case WebApplicationsPackage.WEB_APPLICATION__URL:
			return getURL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WebApplicationsPackage.WEB_APPLICATION__NAME:
			setName((String) newValue);
			return;
		case WebApplicationsPackage.WEB_APPLICATION__PAGE:
			getPage().clear();
			getPage().addAll((Collection<? extends Page>) newValue);
			return;
		case WebApplicationsPackage.WEB_APPLICATION__DATABASE:
			getDatabase().clear();
			getDatabase().addAll((Collection<? extends Database>) newValue);
			return;
		case WebApplicationsPackage.WEB_APPLICATION__URL:
			setURL((String) newValue);
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
		case WebApplicationsPackage.WEB_APPLICATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WebApplicationsPackage.WEB_APPLICATION__PAGE:
			getPage().clear();
			return;
		case WebApplicationsPackage.WEB_APPLICATION__DATABASE:
			getDatabase().clear();
			return;
		case WebApplicationsPackage.WEB_APPLICATION__URL:
			setURL(URL_EDEFAULT);
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
		case WebApplicationsPackage.WEB_APPLICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WebApplicationsPackage.WEB_APPLICATION__PAGE:
			return page != null && !page.isEmpty();
		case WebApplicationsPackage.WEB_APPLICATION__DATABASE:
			return database != null && !database.isEmpty();
		case WebApplicationsPackage.WEB_APPLICATION__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", URL: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //WebApplicationImpl
