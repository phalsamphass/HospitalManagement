
package hospitalmanagement.Class;

public class ClassInvoiceDetail {
    public int InvoiceID,PattientID;
    public String Diseasestatus;
    public float Amount;

    public int getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(int InvoiceID) {
        this.InvoiceID = InvoiceID;
    }

    public int getPattientID() {
        return PattientID;
    }

    public void setPattientID(int PattientID) {
        this.PattientID = PattientID;
    }

    public String getDiseasestatus() {
        return Diseasestatus;
    }

    public void setDiseasestatus(String Diseasestatus) {
        this.Diseasestatus = Diseasestatus;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }
}
