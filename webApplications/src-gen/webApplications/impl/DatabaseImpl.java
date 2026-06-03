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
import webApplications.Order;
import webApplications.Product;
import webApplications.User;
import webApplications.WebApplicationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webApplications.impl.DatabaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link webApplications.impl.DatabaseImpl#getType <em>Type</em>}</li>
 *   <li>{@link webApplications.impl.DatabaseImpl#getConnURL <em>Conn URL</em>}</li>
 *   <li>{@link webApplications.impl.DatabaseImpl#getUser <em>User</em>}</li>
 *   <li>{@link webApplications.impl.DatabaseImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link webApplications.impl.DatabaseImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnURL() <em>Conn URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnURL()
	 * @generated
	 * @ordered
	 */
	protected static final String CONN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnURL() <em>Conn URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnURL()
	 * @generated
	 * @ordered
	 */
	protected String connURL = CONN_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> product;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> order;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationsPackage.Literals.DATABASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.DATABASE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.DATABASE__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnURL() {
		return connURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnURL(String newConnURL) {
		String oldConnURL = connURL;
		connURL = newConnURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationsPackage.DATABASE__CONN_URL, oldConnURL,
					connURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, WebApplicationsPackage.DATABASE__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<Product>(Product.class, this,
					WebApplicationsPackage.DATABASE__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrder() {
		if (order == null) {
			order = new EObjectContainmentEList<Order>(Order.class, this, WebApplicationsPackage.DATABASE__ORDER);
		}
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebApplicationsPackage.DATABASE__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
		case WebApplicationsPackage.DATABASE__PRODUCT:
			return ((InternalEList<?>) getProduct()).basicRemove(otherEnd, msgs);
		case WebApplicationsPackage.DATABASE__ORDER:
			return ((InternalEList<?>) getOrder()).basicRemove(otherEnd, msgs);
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
		case WebApplicationsPackage.DATABASE__NAME:
			return getName();
		case WebApplicationsPackage.DATABASE__TYPE:
			return getType();
		case WebApplicationsPackage.DATABASE__CONN_URL:
			return getConnURL();
		case WebApplicationsPackage.DATABASE__USER:
			return getUser();
		case WebApplicationsPackage.DATABASE__PRODUCT:
			return getProduct();
		case WebApplicationsPackage.DATABASE__ORDER:
			return getOrder();
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
		case WebApplicationsPackage.DATABASE__NAME:
			setName((String) newValue);
			return;
		case WebApplicationsPackage.DATABASE__TYPE:
			setType((String) newValue);
			return;
		case WebApplicationsPackage.DATABASE__CONN_URL:
			setConnURL((String) newValue);
			return;
		case WebApplicationsPackage.DATABASE__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
			return;
		case WebApplicationsPackage.DATABASE__PRODUCT:
			getProduct().clear();
			getProduct().addAll((Collection<? extends Product>) newValue);
			return;
		case WebApplicationsPackage.DATABASE__ORDER:
			getOrder().clear();
			getOrder().addAll((Collection<? extends Order>) newValue);
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
		case WebApplicationsPackage.DATABASE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WebApplicationsPackage.DATABASE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case WebApplicationsPackage.DATABASE__CONN_URL:
			setConnURL(CONN_URL_EDEFAULT);
			return;
		case WebApplicationsPackage.DATABASE__USER:
			getUser().clear();
			return;
		case WebApplicationsPackage.DATABASE__PRODUCT:
			getProduct().clear();
			return;
		case WebApplicationsPackage.DATABASE__ORDER:
			getOrder().clear();
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
		case WebApplicationsPackage.DATABASE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WebApplicationsPackage.DATABASE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case WebApplicationsPackage.DATABASE__CONN_URL:
			return CONN_URL_EDEFAULT == null ? connURL != null : !CONN_URL_EDEFAULT.equals(connURL);
		case WebApplicationsPackage.DATABASE__USER:
			return user != null && !user.isEmpty();
		case WebApplicationsPackage.DATABASE__PRODUCT:
			return product != null && !product.isEmpty();
		case WebApplicationsPackage.DATABASE__ORDER:
			return order != null && !order.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(", connURL: ");
		result.append(connURL);
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
