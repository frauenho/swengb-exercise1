package fh.joanneum.sweng.lab1

class Canvas(){
    private var shapes = mutableListOf<Shape>()

    fun addShape(shape: Shape){
        shapes.add(shape)
    }
    fun getTotalArea(): Double{
        return shapes.sumByDouble { it.getArea() }

    }

    fun shapesCntPerType():Map<String, Int> {
        var rect: Int=0
        var circ: Int=0
        shapes.groupBy { it.javaClass.simpleName }
        if(==Rectangle){
            rect+1

        }
        else {
            circ+1
        }
        return

    }
}