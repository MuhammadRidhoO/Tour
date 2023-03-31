// package DWTour.Tour.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// import DWTour.Tour.entity.Transaction;
// import DWTour.Tour.repository.TransactionRepository;
// import DWTour.Tour.service.TransactionService;

// @CrossOrigin("*")
// @RestController
// @RequestMapping("/api/v1")
// public class TransactionController {

//     @Autowired
//     private TransactionRepository transactionRepository;

//     @Autowired
//     private TransactionService transactionService;

//     @RequestMapping(value = "/transactions", method = RequestMethod.GET)
//     public Iterable<Transaction> findAll(){
//         return transactionService.findAll();
//     }

//     @RequestMapping(value = "/transaction/{id}", method = RequestMethod.GET)
//     public Transaction findOne(@PathVariable("id")long id){
//         return transactionService.findOne(id);
//     }

//     @RequestMapping(value = "/transaction", method = RequestMethod.POST)
//     public Transaction save(@RequestBody Transaction transaction){
//         return transactionService.save(transaction);
//     }
// }
