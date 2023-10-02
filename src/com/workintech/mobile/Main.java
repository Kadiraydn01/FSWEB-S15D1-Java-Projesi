package com.workintech.mobile;

public class Main {
    public static void main(String[] args) {

                MobilePhone mobilePhone = new MobilePhone("1234567890");

                Contact bob = Contact.createContact("Bob", "31415926");
                Contact alice = Contact.createContact("Alice", "16180339");
                Contact tom = Contact.createContact("Tom", "11235813");

                mobilePhone.addNewContact(bob);
                mobilePhone.addNewContact(alice);
                mobilePhone.addNewContact(tom);

                mobilePhone.printContacts();

                Contact jane = Contact.createContact("Jane", "23571113");
                mobilePhone.updateContact(alice, jane);

                mobilePhone.printContacts();

                mobilePhone.removeContact(bob);

                mobilePhone.printContacts();

                System.out.println("Querying for Jane: " + mobilePhone.queryContact("Jane"));
                System.out.println("Querying for Bob: " + mobilePhone.queryContact("Bob"));
            }
        }

