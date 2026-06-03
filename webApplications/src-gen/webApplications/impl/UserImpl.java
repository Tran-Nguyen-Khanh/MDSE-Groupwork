/**
 */
package webApplications.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import webApplications.User;
import webApplications.WebApplicationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webApplications.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link webApplications.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link webApplications.impl.UserImpl#isIsAdmin <em>Is Admin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected int userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAdmin() <em>Is Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ADMIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAdmin() <em>Is Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAdmin()
	 * @generated
	 * @ordered
	 */
	protected boolean isAdmin = IS_ADMIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationsPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(int newUserID) {
		int oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.USER__USER_ID, oldUserID,
					userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.USER__USER_NAME, oldUserName,
					userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAdmin() {
		return isAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAdmin(boolean newIsAdmin) {
		boolean oldIsAdmin = isAdmin;
		isAdmin = newIsAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.USER__IS_ADMIN, oldIsAdmin,
					isAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebApplicationsPackage.USER__USER_ID:
			return getUserID();
		case WebApplicationsPackage.USER__USER_NAME:
			return getUserName();
		case WebApplicationsPackage.USER__IS_ADMIN:
			return isIsAdmin();
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
		case WebApplicationsPackage.USER__USER_ID:
			setUserID((Integer) newValue);
			return;
		case WebApplicationsPackage.USER__USER_NAME:
			setUserName((String) newValue);
			return;
		case WebApplicationsPackage.USER__IS_ADMIN:
			setIsAdmin((Boolean) newValue);
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
		case WebApplicationsPackage.USER__USER_ID:
			setUserID(USER_ID_EDEFAULT);
			return;
		case WebApplicationsPackage.USER__USER_NAME:
			setUserName(USER_NAME_EDEFAULT);
			return;
		case WebApplicationsPackage.USER__IS_ADMIN:
			setIsAdmin(IS_ADMIN_EDEFAULT);
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
		case WebApplicationsPackage.USER__USER_ID:
			return userID != USER_ID_EDEFAULT;
		case WebApplicationsPackage.USER__USER_NAME:
			return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
		case WebApplicationsPackage.USER__IS_ADMIN:
			return isAdmin != IS_ADMIN_EDEFAULT;
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
		result.append(" (userID: ");
		result.append(userID);
		result.append(", userName: ");
		result.append(userName);
		result.append(", isAdmin: ");
		result.append(isAdmin);
		result.append(')');
		return result.toString();
	}

} //UserImpl
