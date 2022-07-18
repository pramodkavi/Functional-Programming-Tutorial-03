object Q3{
    def sphereVolume(radius:Double):Double={
        (4.0/3)*(22.0/7)*(radius*radius*radius)
    }

    def main(args: Array[String]) = {
        println(sphereVolume(5))
    }

}