package main

class Character {
  var attack_power: Int = 5
  var defense: Int = 0
  var magic_attack: Int = 5
  var magic_defense: Int = 0
  var maxHP: Int = 10
  var currentHP :Int = maxHP
  var magicHP: Int = 10
  var currentMP: Int = magicHP

  def takeDamage(x:Int): Boolean ={
    var DOA: Boolean  = true
    currentHP = currentHP -x
    if(currentHP <= 0){
      false
    }
    true
  }
  def dealPhysicalAttack(C1: Character) ={
    val damageThatGotPast= this.attack_power- C1.defense
    C1.takeDamage(damageThatGotPast)

  }
  def dealMagicAttack(C2: Character)={
    var damageMA = this.magic_attack - C2.magic_defense
    C2.takeDamage(damageMA)
    this.currentMP-5
    if(this.currentMP <=0){
      C2.takeDamage(0)
    }
  }



}
