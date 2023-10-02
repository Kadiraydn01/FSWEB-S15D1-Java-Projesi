package com.workintech.mobile;

import java.util.ArrayList;
class Contact{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name , String phoneNumber){
        return new Contact(name , phoneNumber);
    }
}
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    public boolean addNewContact(Contact contact){
        if(findContact(contact) == -1){
            myContacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean updateContact(Contact oldContact , Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set(position ,newContact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            myContacts.remove(position);
            return true;
        }
        return false;
    }
    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}


