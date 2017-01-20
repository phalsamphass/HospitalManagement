
package hospitalmanagement.Class;


public class ClassInvoice {
    public int IvoiceID,PattientID,EmployeeID,BookingCode;
    public String InvoiceDate,DiscountType,Remark;
    public float DiscountValue,DiscountAmt,Amount;

    public int getIvoiceID() {
        return IvoiceID;
    }

    public void setIvoiceID(int IvoiceID) {
        this.IvoiceID = IvoiceID;
    }

    public int getPattientID() {
        return PattientID;
    }

    public void setPattientID(int PattientID) {
        this.PattientID = PattientID;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getBookingCode() {
        return BookingCode;
    }

    public void setBookingCode(int BookingCode) {
        this.BookingCode = BookingCode;
    }

    public String getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(String InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    public String getDiscountType() {
        return DiscountType;
    }

    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public float getDiscountValue() {
        return DiscountValue;
    }

    public void setDiscountValue(float DiscountValue) {
        this.DiscountValue = DiscountValue;
    }

    public float getDiscountAmt() {
        return DiscountAmt;
    }

    public void setDiscountAmt(float DiscountAmt) {
        this.DiscountAmt = DiscountAmt;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }
}
