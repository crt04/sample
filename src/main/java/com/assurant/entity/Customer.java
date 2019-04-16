// Generated with g9.

package com.assurant.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="customer")
public class Customer implements Serializable {


    @Id
    @Column(name="loan_number", unique=true, nullable=false, precision=10)
    private int loanNumber;
    @Column(length=100)
    private String address;
    @Column(name="customer_name", length=100)
    private String customerName;

    /** Default constructor. */
    public Customer() {
        super();
    }

    /**
     * Access method for loanNumber.
     *
     * @return the current value of loanNumber
     */
    public int getLoanNumber() {
        return loanNumber;
    }

    /**
     * Setter method for loanNumber.
     *
     * @param aLoanNumber the new value for loanNumber
     */
    public void setLoanNumber(int aLoanNumber) {
        loanNumber = aLoanNumber;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(String aAddress) {
        address = aAddress;
    }

    /**
     * Access method for customerName.
     *
     * @return the current value of customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Setter method for customerName.
     *
     * @param aCustomerName the new value for customerName
     */
    public void setCustomerName(String aCustomerName) {
        customerName = aCustomerName;
    }

    /**
     * Compares the key for this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Customer and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer that = (Customer) other;
        if (this.getLoanNumber() != that.getLoanNumber()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Customer.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Customer)) return false;
        return this.equalKeys(other) && ((Customer)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getLoanNumber();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Customer |");
        sb.append(" loanNumber=").append(getLoanNumber());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("loanNumber", Integer.valueOf(getLoanNumber()));
        return ret;
    }

}
