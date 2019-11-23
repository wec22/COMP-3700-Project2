import java.util.List;

public interface IDataAdapter {

    public static final int CONNECTION_OPEN_OK = 0;
    public static final int CONNECTION_OPEN_FAILED = 1;

    public static final int CONNECTION_CLOSE_OK = 100;
    public static final int CONNECTION_CLOSE_FAILED = 101;

    public static final int PRODUCT_SAVE_OK = 200;
    public static final int PRODUCT_DUPLICATE_ERROR = 201;
    public static final int PRODUCT_SAVE_FAILED = 202;

    public static final int CUSTOMER_SAVE_OK = 300;
    public static final int CUSTOMER_DUPLICATE_ERROR = 301;
    public static final int CUSTOMER_SAVE_FAILED = 302;

    public static final int PURCHASE_SAVE_OK = 400;
    public static final int PURCHASE_DUPLICATE_ERROR = 401;
    public static final int PURCHASE_SAVE_FAILED = 402;

    public int connect(String dbfile);
    public int disconnect();

    public ProductModel loadProduct(int id);
    public int saveProduct(ProductModel model);

    public CustomerModel loadCustomer(int id);
    public int saveCustomer(CustomerModel model);
//
    public PurchaseModel loadPurchase(int id);
    public int savePurchase(PurchaseModel model);

    //public PurchaseListModel loadPurchaseHistory(int customerID);

    //public ProductListModel searchProduct(String name, double minPrice, double maxPrice);

    //public UserModel loadUser(String username);
    //public int saveUser(UserModel user);
}
