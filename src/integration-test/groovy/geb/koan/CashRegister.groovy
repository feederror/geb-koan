package geb.koan

class CashRegister {
    static Integer numberOfItemsSold = 0
    static Integer sellItemsAndReturnTotal(List<Apple> apples) {
        numberOfItemsSold = numberOfItemsSold + apples.size()
        apples.collect{it.priceInCents}.sum()
    }
}
