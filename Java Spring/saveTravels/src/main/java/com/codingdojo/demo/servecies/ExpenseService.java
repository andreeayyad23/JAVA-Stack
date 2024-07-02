package com.codingdojo.demo.servecies;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.models.Expense;
import com.codingdojo.demo.reposotories.ExpensesRepo;

@Service
public class ExpenseService {
private final ExpensesRepo expensesRepo;
    
    public ExpenseService(ExpensesRepo expensesRepo) {
        this.expensesRepo = expensesRepo;
    }
    // returns all the books
    public List<Expense> allExpenses() {
        return expensesRepo.findAll();
    }
    // creates a book
    public Expense createExpense(Expense b) {
        return expensesRepo.save(b);
    }
    
    public Expense editExpense(Expense b) {
        return expensesRepo.save(b);
    }
    
    public void deleteExpense(Long id) {
    	expensesRepo.deleteById(id);
    }
    // retrieves a book
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expensesRepo.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
}
