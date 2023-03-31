package DWTour.Tour.repository;

import org.springframework.stereotype.Repository;
import DWTour.Tour.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
              Transaction findById(long id);
}