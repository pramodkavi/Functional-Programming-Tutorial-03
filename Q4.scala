object Q3{

    def bookPrice(books:Int):Double={
        books*24.95;
    }
    def discount(price:Double):Double={
        price*0.4;
    }

    def shippingCost(books:Int):Double={
        if(books<=50){
            books*3
        }else{
            (50*3)+(books-50)*0.75
        }
    }

    def wholesaleCost(books:Int):Double={
        bookPrice(books)+shippingCost(books)-discount(bookPrice(books))
    } 

    def main(args: Array[String]) = {
        println(wholesaleCost(40))
    }

}