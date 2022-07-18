object Q5{

    def tempo(a:Double):Double={
        a*7;
    }

    def easyPace(a:Double):Double={
        a*8
    }

    def totalTime():Double={
        easyPace(2)+tempo(3)+easyPace(2)
    }

    def main(args: Array[String]) = {
        println(totalTime())
    }

}