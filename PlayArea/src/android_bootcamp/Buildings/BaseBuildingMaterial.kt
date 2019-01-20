package android_bootcamp.Buildings


open class BaseBuildingMaterial(var numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4) {

}

class Brick : BaseBuildingMaterial(8) {

}

class Building<T : BaseBuildingMaterial>(val buildingMaterial: T) {

    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build(){
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun main(args: Array<String>) {
    Building(Wood()).build()
}