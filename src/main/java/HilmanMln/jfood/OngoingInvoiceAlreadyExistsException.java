package HilmanMln.jfood;

public class OngoingInvoiceAlreadyExistsException extends Exception {
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input) {
        super("\nOngoing Invoice : \n");
        this.invoice_error=invoice_input;
    }

    @Override
    public String getMessage()
    {
        return super.getMessage() + invoice_error.getFoods() + " already ordered by"+ invoice_error.getCustomer().getName()+"\n";
    };
}
