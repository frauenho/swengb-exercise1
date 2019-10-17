package fh.joanneum.sweng.lab1

open class Shape(val color:String = "black") {
    open fun getArea():Double {
        return 0.0
    }

    override fun toString(): String {
        return "Shape(color='$color')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shape) return false

        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        return color.hashCode()
    }

}

