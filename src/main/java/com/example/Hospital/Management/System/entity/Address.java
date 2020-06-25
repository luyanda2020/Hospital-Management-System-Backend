package com.example.Hospital.Management.System.entity;

public class Address {
    private String address;
    private String postcode;
    private Person details;

    public Address(Builder builder) {
        this.address = address;
        this.postcode = postcode;
        this.details = details;
    }
    private Address(){

    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public Person getDetails() {
        return details;
    }



    @Override
    public String
    toString() {
        return "Address{" +
                "Address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", details=" + details +
                '}';
    }

    public static class Builder{
        private String address;
        private String postcode;
        private Person details;

        public Builder(String address){
            this.address = address;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPostcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        public Builder setDetails(Person details) {
            this.details = details;
            return this;
        }

        public Builder copy(Person person){
            this.address = address;
            this.postcode = postcode;
            this.details = details;
            return this;
        }

        public Address build(){
            Address address1 = new Address();

            address1.address = address;
            address1.postcode = postcode;
            address1.details = details;
            return address1;

        }
    }
}
