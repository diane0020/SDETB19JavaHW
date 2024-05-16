package org.example.e181;

class Account {
    private String accNo;
    private String name;
    private String email;
    private double amount;

    void setAccNo(String accNo){
        this.accNo = accNo;
    }
    void setName(String name) {
        this.name = name;
    }
    void setEmail(String email) {
        this.email = email;
    }
    void setAmount(double amount) {
        this.amount = amount;
    }

    String getAccNo() {
        return accNo;
    }
    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    double getAmount(){
        return amount;
    }
}
public class E181Encapsulation {
    public static void main(String[] args){

        Account account = new Account();
        account.setAccNo("7560504000");
        account.setName("Sumair");
        account.setEmail("sumair@syntax.com");
        account.setAmount(50000.0);

        System.out.println(account.getAccNo()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount());

    }

}




