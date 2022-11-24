
const val RIFLE_DAMAGE = 3L
const val REGULAR_SPEED: Meters = 1

interface Weapon {
    fun attack(x: Long, y: Long): PointsOfDamage
}

class Rifle: Weapon {
    override fun attack(x: Long, y: Long) = RIFLE_DAMAGE
}

class Flamethrower: Weapon {
    override fun attack(x: Long, y: Long): PointsOfDamage = RIFLE_DAMAGE * 2
}

class Batton : Weapon {
    override fun attack(x: Long, y: Long)= RIFLE_DAMAGE * 3
}