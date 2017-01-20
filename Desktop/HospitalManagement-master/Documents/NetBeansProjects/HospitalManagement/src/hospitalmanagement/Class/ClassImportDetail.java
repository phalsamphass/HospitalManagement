
package hospitalmanagement.Class;


public class ClassImportDetail {
    public int ImportID,MatterialID,Quantity;
    public float Price,Amount;

    public int getImportID() {
        return ImportID;
    }

    public void setImportID(int ImportID) {
        this.ImportID = ImportID;
    }

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

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }
}
