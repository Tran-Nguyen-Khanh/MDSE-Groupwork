/**
 */
package webApplications;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see webApplications.WebApplicationsFactory
 * @model kind="package"
 * @generated
 */
public interface WebApplicationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webApplications";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/webApplications";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webApplications";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebApplicationsPackage eINSTANCE = webApplications.impl.WebApplicationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link webApplications.impl.WebApplicationImpl <em>Web Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.WebApplicationImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getWebApplication()
	 * @generated
	 */
	int WEB_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__PAGE = 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__DATABASE = 2;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__URL = 3;

	/**
	 * The number of structural features of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApplications.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.PageImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Page ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApplications.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.DatabaseImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Conn URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CONN_URL = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__USER = 3;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__PRODUCT = 4;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__ORDER = 5;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApplications.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.UserImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_ADMIN = 2;

	/**
	 * The feature id for the '<em><b>Passwort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORT = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApplications.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.CustomerImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Is Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__IS_ADMIN = USER__IS_ADMIN;

	/**
	 * The feature id for the '<em><b>Passwort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PASSWORT = USER__PASSWORT;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADRESS = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shoppingcart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SHOPPINGCART = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ORDER = USER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link webApplications.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.AdminImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 5;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Is Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__IS_ADMIN = USER__IS_ADMIN;

	/**
	 * The feature id for the '<em><b>Passwort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PASSWORT = USER__PASSWORT;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Overview Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___OVERVIEW_ORDERS = USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Ban Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___BAN_CUSTOMER__CUSTOMER = USER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = USER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link webApplications.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.ProductImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_ID = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApplications.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.OrderImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 7;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DATE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Total Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOTAL_PRICE = 4;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link webApplications.impl.ShoppingcartImpl <em>Shoppingcart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.ShoppingcartImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getShoppingcart()
	 * @generated
	 */
	int SHOPPINGCART = 8;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPINGCART__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Cart ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPINGCART__CART_ID = 1;

	/**
	 * The number of structural features of the '<em>Shoppingcart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPINGCART_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Order Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPINGCART___ORDER_PRODUCT__PRODUCT = 0;

	/**
	 * The operation id for the '<em>Sum Up Pries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPINGCART___SUM_UP_PRIES = 1;

	/**
	 * The number of operations of the '<em>Shoppingcart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOPPINGCART_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link webApplications.impl.WelcomePageImpl <em>Welcome Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.WelcomePageImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getWelcomePage()
	 * @generated
	 */
	int WELCOME_PAGE = 9;

	/**
	 * The feature id for the '<em><b>Page ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_PAGE__PAGE_ID = PAGE__PAGE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_PAGE__DESCRIPTION = PAGE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Welcome Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_PAGE___LOGIN__STRING_STRING = PAGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Welcome Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WELCOME_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link webApplications.impl.ProductPageImpl <em>Product Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.ProductPageImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getProductPage()
	 * @generated
	 */
	int PRODUCT_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Page ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__PAGE_ID = PAGE__PAGE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__DESCRIPTION = PAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE__PRODUCT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Customize Product</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE___CUSTOMIZE_PRODUCT__PRODUCT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add To Cart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE___ADD_TO_CART__PRODUCT = PAGE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Product Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link webApplications.impl.CheckoutPageImpl <em>Checkout Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see webApplications.impl.CheckoutPageImpl
	 * @see webApplications.impl.WebApplicationsPackageImpl#getCheckoutPage()
	 * @generated
	 */
	int CHECKOUT_PAGE = 11;

	/**
	 * The number of structural features of the '<em>Checkout Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_PAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Checkout Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_PAGE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link webApplications.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application</em>'.
	 * @see webApplications.WebApplication
	 * @generated
	 */
	EClass getWebApplication();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.WebApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webApplications.WebApplication#getName()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link webApplications.WebApplication#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see webApplications.WebApplication#getPage()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Page();

	/**
	 * Returns the meta object for the containment reference list '{@link webApplications.WebApplication#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database</em>'.
	 * @see webApplications.WebApplication#getDatabase()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Database();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.WebApplication#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see webApplications.WebApplication#getURL()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_URL();

	/**
	 * Returns the meta object for class '{@link webApplications.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see webApplications.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Page#getPageID <em>Page ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page ID</em>'.
	 * @see webApplications.Page#getPageID()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_PageID();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webApplications.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Page#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see webApplications.Page#getDescription()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Description();

	/**
	 * Returns the meta object for class '{@link webApplications.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see webApplications.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Database#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webApplications.Database#getName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Name();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Database#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see webApplications.Database#getType()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_Type();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Database#getConnURL <em>Conn URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conn URL</em>'.
	 * @see webApplications.Database#getConnURL()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_ConnURL();

	/**
	 * Returns the meta object for the containment reference list '{@link webApplications.Database#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see webApplications.Database#getUser()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_User();

	/**
	 * Returns the meta object for the containment reference list '{@link webApplications.Database#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see webApplications.Database#getProduct()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Product();

	/**
	 * Returns the meta object for the containment reference list '{@link webApplications.Database#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order</em>'.
	 * @see webApplications.Database#getOrder()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Order();

	/**
	 * Returns the meta object for class '{@link webApplications.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see webApplications.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see webApplications.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see webApplications.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.User#isIsAdmin <em>Is Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Admin</em>'.
	 * @see webApplications.User#isIsAdmin()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IsAdmin();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.User#getPasswort <em>Passwort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passwort</em>'.
	 * @see webApplications.User#getPasswort()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Passwort();

	/**
	 * Returns the meta object for class '{@link webApplications.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see webApplications.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Customer#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see webApplications.Customer#getEMail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_EMail();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Customer#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see webApplications.Customer#getAdress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Adress();

	/**
	 * Returns the meta object for the reference '{@link webApplications.Customer#getShoppingcart <em>Shoppingcart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shoppingcart</em>'.
	 * @see webApplications.Customer#getShoppingcart()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Shoppingcart();

	/**
	 * Returns the meta object for the reference list '{@link webApplications.Customer#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order</em>'.
	 * @see webApplications.Customer#getOrder()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Order();

	/**
	 * Returns the meta object for class '{@link webApplications.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see webApplications.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the '{@link webApplications.Admin#overviewOrders() <em>Overview Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Overview Orders</em>' operation.
	 * @see webApplications.Admin#overviewOrders()
	 * @generated
	 */
	EOperation getAdmin__OverviewOrders();

	/**
	 * Returns the meta object for the '{@link webApplications.Admin#banCustomer(webApplications.Customer) <em>Ban Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ban Customer</em>' operation.
	 * @see webApplications.Admin#banCustomer(webApplications.Customer)
	 * @generated
	 */
	EOperation getAdmin__BanCustomer__Customer();

	/**
	 * Returns the meta object for class '{@link webApplications.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see webApplications.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Product#getProductID <em>Product ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product ID</em>'.
	 * @see webApplications.Product#getProductID()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductID();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Product#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see webApplications.Product#getQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see webApplications.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Product#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see webApplications.Product#getCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Category();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see webApplications.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see webApplications.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for class '{@link webApplications.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see webApplications.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Order#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see webApplications.Order#getOrderID()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderID();

	/**
	 * Returns the meta object for the reference list '{@link webApplications.Order#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product</em>'.
	 * @see webApplications.Order#getProduct()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Product();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Order#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see webApplications.Order#getDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Date();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Order#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see webApplications.Order#getStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Status();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Order#getTotalPrice <em>Total Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Price</em>'.
	 * @see webApplications.Order#getTotalPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TotalPrice();

	/**
	 * Returns the meta object for class '{@link webApplications.Shoppingcart <em>Shoppingcart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shoppingcart</em>'.
	 * @see webApplications.Shoppingcart
	 * @generated
	 */
	EClass getShoppingcart();

	/**
	 * Returns the meta object for the reference list '{@link webApplications.Shoppingcart#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product</em>'.
	 * @see webApplications.Shoppingcart#getProduct()
	 * @see #getShoppingcart()
	 * @generated
	 */
	EReference getShoppingcart_Product();

	/**
	 * Returns the meta object for the attribute '{@link webApplications.Shoppingcart#getCartID <em>Cart ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cart ID</em>'.
	 * @see webApplications.Shoppingcart#getCartID()
	 * @see #getShoppingcart()
	 * @generated
	 */
	EAttribute getShoppingcart_CartID();

	/**
	 * Returns the meta object for the '{@link webApplications.Shoppingcart#orderProduct(webApplications.Product) <em>Order Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Product</em>' operation.
	 * @see webApplications.Shoppingcart#orderProduct(webApplications.Product)
	 * @generated
	 */
	EOperation getShoppingcart__OrderProduct__Product();

	/**
	 * Returns the meta object for the '{@link webApplications.Shoppingcart#sumUpPries() <em>Sum Up Pries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sum Up Pries</em>' operation.
	 * @see webApplications.Shoppingcart#sumUpPries()
	 * @generated
	 */
	EOperation getShoppingcart__SumUpPries();

	/**
	 * Returns the meta object for class '{@link webApplications.WelcomePage <em>Welcome Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Welcome Page</em>'.
	 * @see webApplications.WelcomePage
	 * @generated
	 */
	EClass getWelcomePage();

	/**
	 * Returns the meta object for the '{@link webApplications.WelcomePage#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see webApplications.WelcomePage#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getWelcomePage__Login__String_String();

	/**
	 * Returns the meta object for class '{@link webApplications.ProductPage <em>Product Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Page</em>'.
	 * @see webApplications.ProductPage
	 * @generated
	 */
	EClass getProductPage();

	/**
	 * Returns the meta object for the reference list '{@link webApplications.ProductPage#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product</em>'.
	 * @see webApplications.ProductPage#getProduct()
	 * @see #getProductPage()
	 * @generated
	 */
	EReference getProductPage_Product();

	/**
	 * Returns the meta object for the '{@link webApplications.ProductPage#customizeProduct(webApplications.Product) <em>Customize Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Customize Product</em>' operation.
	 * @see webApplications.ProductPage#customizeProduct(webApplications.Product)
	 * @generated
	 */
	EOperation getProductPage__CustomizeProduct__Product();

	/**
	 * Returns the meta object for the '{@link webApplications.ProductPage#addToCart(webApplications.Product) <em>Add To Cart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add To Cart</em>' operation.
	 * @see webApplications.ProductPage#addToCart(webApplications.Product)
	 * @generated
	 */
	EOperation getProductPage__AddToCart__Product();

	/**
	 * Returns the meta object for class '{@link webApplications.CheckoutPage <em>Checkout Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkout Page</em>'.
	 * @see webApplications.CheckoutPage
	 * @generated
	 */
	EClass getCheckoutPage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebApplicationsFactory getWebApplicationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link webApplications.impl.WebApplicationImpl <em>Web Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.WebApplicationImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getWebApplication()
		 * @generated
		 */
		EClass WEB_APPLICATION = eINSTANCE.getWebApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__NAME = eINSTANCE.getWebApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__PAGE = eINSTANCE.getWebApplication_Page();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__DATABASE = eINSTANCE.getWebApplication_Database();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__URL = eINSTANCE.getWebApplication_URL();

		/**
		 * The meta object literal for the '{@link webApplications.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.PageImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Page ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__PAGE_ID = eINSTANCE.getPage_PageID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__DESCRIPTION = eINSTANCE.getPage_Description();

		/**
		 * The meta object literal for the '{@link webApplications.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.DatabaseImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__TYPE = eINSTANCE.getDatabase_Type();

		/**
		 * The meta object literal for the '<em><b>Conn URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__CONN_URL = eINSTANCE.getDatabase_ConnURL();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__USER = eINSTANCE.getDatabase_User();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__PRODUCT = eINSTANCE.getDatabase_Product();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__ORDER = eINSTANCE.getDatabase_Order();

		/**
		 * The meta object literal for the '{@link webApplications.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.UserImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>Is Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__IS_ADMIN = eINSTANCE.getUser_IsAdmin();

		/**
		 * The meta object literal for the '<em><b>Passwort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORT = eINSTANCE.getUser_Passwort();

		/**
		 * The meta object literal for the '{@link webApplications.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.CustomerImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_EMail();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADRESS = eINSTANCE.getCustomer_Adress();

		/**
		 * The meta object literal for the '<em><b>Shoppingcart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__SHOPPINGCART = eINSTANCE.getCustomer_Shoppingcart();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ORDER = eINSTANCE.getCustomer_Order();

		/**
		 * The meta object literal for the '{@link webApplications.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.AdminImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Overview Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___OVERVIEW_ORDERS = eINSTANCE.getAdmin__OverviewOrders();

		/**
		 * The meta object literal for the '<em><b>Ban Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___BAN_CUSTOMER__CUSTOMER = eINSTANCE.getAdmin__BanCustomer__Customer();

		/**
		 * The meta object literal for the '{@link webApplications.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.ProductImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Product ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_ID = eINSTANCE.getProduct_ProductID();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__QUANTITY = eINSTANCE.getProduct_Quantity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CATEGORY = eINSTANCE.getProduct_Category();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '{@link webApplications.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.OrderImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_ID = eINSTANCE.getOrder_OrderID();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PRODUCT = eINSTANCE.getOrder_Product();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DATE = eINSTANCE.getOrder_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__STATUS = eINSTANCE.getOrder_Status();

		/**
		 * The meta object literal for the '<em><b>Total Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TOTAL_PRICE = eINSTANCE.getOrder_TotalPrice();

		/**
		 * The meta object literal for the '{@link webApplications.impl.ShoppingcartImpl <em>Shoppingcart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.ShoppingcartImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getShoppingcart()
		 * @generated
		 */
		EClass SHOPPINGCART = eINSTANCE.getShoppingcart();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOPPINGCART__PRODUCT = eINSTANCE.getShoppingcart_Product();

		/**
		 * The meta object literal for the '<em><b>Cart ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOPPINGCART__CART_ID = eINSTANCE.getShoppingcart_CartID();

		/**
		 * The meta object literal for the '<em><b>Order Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHOPPINGCART___ORDER_PRODUCT__PRODUCT = eINSTANCE.getShoppingcart__OrderProduct__Product();

		/**
		 * The meta object literal for the '<em><b>Sum Up Pries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SHOPPINGCART___SUM_UP_PRIES = eINSTANCE.getShoppingcart__SumUpPries();

		/**
		 * The meta object literal for the '{@link webApplications.impl.WelcomePageImpl <em>Welcome Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.WelcomePageImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getWelcomePage()
		 * @generated
		 */
		EClass WELCOME_PAGE = eINSTANCE.getWelcomePage();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WELCOME_PAGE___LOGIN__STRING_STRING = eINSTANCE.getWelcomePage__Login__String_String();

		/**
		 * The meta object literal for the '{@link webApplications.impl.ProductPageImpl <em>Product Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.ProductPageImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getProductPage()
		 * @generated
		 */
		EClass PRODUCT_PAGE = eINSTANCE.getProductPage();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PAGE__PRODUCT = eINSTANCE.getProductPage_Product();

		/**
		 * The meta object literal for the '<em><b>Customize Product</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_PAGE___CUSTOMIZE_PRODUCT__PRODUCT = eINSTANCE.getProductPage__CustomizeProduct__Product();

		/**
		 * The meta object literal for the '<em><b>Add To Cart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT_PAGE___ADD_TO_CART__PRODUCT = eINSTANCE.getProductPage__AddToCart__Product();

		/**
		 * The meta object literal for the '{@link webApplications.impl.CheckoutPageImpl <em>Checkout Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see webApplications.impl.CheckoutPageImpl
		 * @see webApplications.impl.WebApplicationsPackageImpl#getCheckoutPage()
		 * @generated
		 */
		EClass CHECKOUT_PAGE = eINSTANCE.getCheckoutPage();

	}

} //WebApplicationsPackage
