package core.basesyntax.service.operation;

import core.basesyntax.model.Fruit;
import core.basesyntax.model.TransactionDto;
import java.util.Map;

public interface OperationHandler {
    int changeAmount(TransactionDto transactionDto, Map<Fruit, Integer> storage);
}
