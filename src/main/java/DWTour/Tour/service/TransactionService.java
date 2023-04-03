// package DWTour.Tour.service;

// import DWTour.Tour.entity.Transaction;
// import DWTour.Tour.repository.TransactionRepository;
// import jakarta.transaction.Transactional;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// @Transactional
// public class TransactionService {
        
//     @Autowired
//     private TransactionRepository transactionRepository;

//     @Autowired(required=true)
//     public TransactionService(TransactionRepository transactionRepository){
//         this.transactionRepository = transactionRepository;
//     }

//     @Autowired(required=true)
//     public Transaction save(Transaction transaction){
//         return transactionRepository.save(transaction);
//     }

//     public Iterable<Transaction> findAll(){
//         return transactionRepository.findAll();
//     }

//     public Transaction findOne(long id){
//         return transactionRepository.findById(id);
//     }

//     public void removeOne(long id){
//         transactionRepository.deleteById(id);
        
//     }

// }
