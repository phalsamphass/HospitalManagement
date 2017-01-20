
package hospitalmanagement.Class;


public class ClassMatterial {
    public int MatterialID,Quantity,CategoryID;
    public String MatterialName,Remark;
    public float Price;

    public int getMatterialID() {
        return MatterialID;
    }

    public void setMatterialID(int MatterialID) {
        this.MatterialID = MatterialID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getMatterialName() {
        return MatterialName;
    }

    public void setMatterialName(String MatterialName) {
        this.MatterialName = MatterialName;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
}
