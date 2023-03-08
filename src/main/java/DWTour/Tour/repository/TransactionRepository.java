package DWTour.Tour.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import DWTour.Tour.entity.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
              Transaction findById(long id);
}