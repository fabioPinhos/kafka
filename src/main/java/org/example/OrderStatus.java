package org.example;

public enum OrderStatus {

    NEW {
        @Override
        public void handle() {
            System.out.println("Processing new order.");
        }
    },
    SHIPPED {
        @Override
        public void handle() {
            System.out.println("Processing shipped.");
        }
    },
    DELIVERED{
        @Override
        public void handle() {
            System.out.println("Processing delivered.");
        }
    };


    public abstract void handle();

}


