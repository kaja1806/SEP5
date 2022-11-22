package sep5Project.Server;

import java.util.List;

public interface IDatabaseCalls {

    public List <ExpensesModel> getExpenses();
    public List <IncomeModel> getIncomeByCategory (String Category);
}
