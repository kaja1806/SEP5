package sep5Project.Model;

public class TransactionTypeModel {

    //ExpensesModel ("EXPENSE"),
       // INCOME ("INCOME"),
         //   TRANSFER ("TRANSFER");

    private final String type;

    IT IS NOT 100% CORRECT !!

    TransactionTypeModel(String type) {
        this.type = type;
    }
    public String getType(){
        return this.type;
    }


    //here I messed up something
    public static TransactionTypeModel fromString (String type) {
        if (type.equals(ExpensesModel.toString())){
            return expenses;
        }
        else if (type.equals(IncomeModel.toString())) {
            return income;
        }
        else {
            return transfer;
        }
    }

    @NonNull
    @Override
    public String toString () {
        return getType();
    }
}
